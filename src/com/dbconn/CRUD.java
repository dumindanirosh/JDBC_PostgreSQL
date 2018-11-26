/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duminda
 */
public class CRUD {

    public ResultSet getResultSet(String sql) {

        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                return rs;
            } catch (SQLException ex) {
                Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return null;

    }
}
