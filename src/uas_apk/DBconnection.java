/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_apk;
import java.sql.*;
/**
 *
 * @author MabidPC
 */
public class DBconnection {
    Connection con = null;
    
    public static Connection connectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:E:\\Kuliah\\Pemrogaman\\Semester 3\\UAS\\UAS_APK\\lib\\uas_APK_db.db");
            System.out.println("Connection Succes");
            return con;
        }catch (Exception e){
            System.out.println("Connection Failed " + e);
            return null;
        }
    }
    
}
