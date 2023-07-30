/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_apk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author MabidPC
 */
class DiamondMl extends Diamond{
    String jenisDM = "Diamond ML";
    String userId = "";
    String serverId = "";
    String varianDm = "";
    
}

class DiamondPubg extends Diamond{
    String jenisDM = "Diamond Pubg";
    String userId = "";
    String serverId = "";
    String varianDm = "";
}

public class Diamond {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void main(String[] args){
        DiamondMl Dm1 = new DiamondMl();
    }
    
}

   
    

