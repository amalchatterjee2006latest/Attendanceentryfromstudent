

package attendanceentry;

import java.sql.*;
import javax.swing.*;

public class MySQLConnect {
    
Connection conn = null;
public static Connection ConnectDb()
{

    try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn = DriverManager.getConnection
        ("jdbc:derby://localhost:1527/sample","app","app");
    return conn;
    }catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    return null;

    }
}
}