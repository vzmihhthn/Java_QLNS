/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectSQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author MI
 */
public class connectsql {
    public static void main(String[] args)   {
        // TODO code application logic here
        var server = "MIHHTHN\\SQLEXPRESS" ;
        var  user = "sa";
        var pass = "1234567";
        var db = "QLNS_java";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(server);
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setDatabaseName(db);
        ds.setPortNumber(port);
        
        ds.setEncrypt(false);
        ds.setIntegratedSecurity(false);
        ds.setTrustServerCertificate(false);
        
        try(Connection conn = ds.getConnection())
        {
            System.out.println("Kết nối SQL Server thành công!");
            System.out.println(conn.getCatalog());
            
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            }
        
        
    
}
