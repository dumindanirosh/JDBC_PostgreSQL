/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbconn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duminda
 */
public class DBTestDemo {

    public static void main(String[] args) {

        getData();

    }

    public static void getData() {

        CRUD c = new CRUD();

        String sql = "select * from \"T_User\"";
        ResultSet rs = c.getResultSet(sql);

        try {
            while (rs.next()) {

                    int id = rs.getInt("user_id");
                    
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBTestDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
