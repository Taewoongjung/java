package chapter3.ch13.domain.userinfo.web.userinfo;

import chapter3.ch13.domain.userinfo.UserInfo;
import chapter3.ch13.domain.userinfo.dao.UserInfoDao;
import chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("chapter3/ch13/db.properties");

        Properties prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
