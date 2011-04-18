/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inf5180_jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCDriverInformation {
	static String userid= "", password = "";
	static String url = "jdbc:oracle:thin:@zeta.labunix.uqam.ca:1521:baclab";

	public static Connection con = null;
        public static java.sql.Statement unEnonceSQL;
        public static java.sql.PreparedStatement pstmt;

	public static Connection getOracleJDBCConnection(){

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
                    con = DriverManager.getConnection(url, userid, password);
		} catch(SQLException ex) {
                    System.err.println("SQLException: " + ex.getMessage());
		}

		return con;
	}
  

    public static void main(String[] args) throws Exception {
        Connection con = getOracleJDBCConnection();
        if(con!= null){
            System.out.println("");
	    DatabaseMetaData meta = con.getMetaData();
	    System.out.println("Driver Name : " + meta.getDriverName());
	    System.out.println("Driver Version :  " +meta.getDriverVersion());

            PreparerLivraison livraison = new PreparerLivraison ("Preparer Livraison") ;
            livraison.setVisible (true) ;
          
        }else{
            System.out.println("Could not Get Connection");
        }
    } // main


}

