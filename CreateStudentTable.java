import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLExeception;
import java.sql.Statement;
public class CreateStudentTable {
public static void main(String[] args) {
String url="jdbc:mySql://localhost:3306/nippani";//URL for the database
String username="root";//
String password="";
Connection connection=null;
Statement statement=null;
try {
Class ssforName=("com.mysql.cj.jdbc.Driver");
connection=DriverManager.getConnection(url,username,password);
statement=connection.createStatement();
String createTableSQL="CREATE TABLEStudent("
+"roll_number INT NOT NULL,"
+"name VARCHAR(100)NOT NULL,"
+"dept VARCHAR(50)NOT NULL,"
+"email VARCHAR(100),"
+"phone VARCHAR(15),"
+"PRIMARY KEY(ROLL_number))";
statement.executeUpdate(createTableSQL);
System.out.println("Table 'student' created successfully.");
}catch(ClassNotFoundException e) {
e.printStackTrace();
}catch(SQLException e) {
e.printStackTrace();
}finally{
try {
if(statement !=null)statment.close();
if(connection !=null)connection.close();
}catch(SQLException e) {
e.printStackTrace();
}
}
}
}