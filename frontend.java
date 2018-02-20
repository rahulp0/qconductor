/*
- Monday February 12 2018, 02:50:41  IST -
opps: 1. Open mysql instance
mysql –u root –p
Enter password:root123
It will start your mysql instance.
2. Create database
create database student;
3. Switch into student database
use student;
4. Create table
Create table users(username varchar(30),password varchar(20),
primary key(username));
5. Insert values
Insert into table users (username,password) values(“raj@sit.ac.in”,”rajise”);
6. Verify your column names of the table
desc users;
7. Verify table values
Select * from users;
Now create loginDemo.java program and write this code*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
    JButton SUBMIT;
    JPanel panel;
    JLabel usrLabel,pwdLabel;
    JTextField usrText,pwdText;
    static final String dbClass = "com.mysql.jdbc.Driver";
    static final String dbURL = "jdbc:mysql://localhost/qconductor";
    static final String dbUsr = "root";
    static final String dbPwd = "root123";
    login()
    {
        usrLabel = new JLabel();
        usrLabel.setText("USN:");
        usrText = new JTextField(15);
        pwdLabel = new JLabel();
        pwdLabel.setText("PASSWORD");
        pwdText = new JPasswordField(15);
        SUBMIT = new JButton("SUBMIT");
        panel = new JPanel(new GridLayout(3,1));
        panel.add(usrLabel);
        panel.add(usrText);
        panel.add(pwdLabel);
        panel.add(pwdText);
        panel.add(SUBMIT);
        add(panel,BorderLayout.CENTER);
        SUBMIT.addActionListener(this);
        setTitle("login form");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String usn = usrText.getText();
        String password = pwdText.getText();
        java.sql.Connection conn = null;

        try
        {
        Class.forName(dbClass).newInstance();
        conn =java.sql.DriverManager.getConnection("jdbc:mysql://localhost/qconductor?user=root&password=root123");
        //conn =

        //java.sql.DriverManager.getConnection(dbUrl,dbUsr,dbPwd);

        }catch(ClassNotFoundException e){
            System.out.println("error in loading driver"+e);
            System.exit(1);
        }
        catch(Exception e)
        {
        System.out.println("error in connection"+e);
        System.exit(0);

        }
         System.out.println("connection established");
        try{
            java.sql.Statement s = conn.createStatement();
            String query = "SELECT * FROM `student` WHERE `USN` ='"+usn+"'and `password` = '"+password+"'";

            java.sql.ResultSet r = s.executeQuery(query);
            r.next();
            int x = r.getRow();
            if (x>0){
            JOptionPane.showMessageDialog(null,"WELCOME " +usn);
            }
            else{
            JOptionPane.showMessageDialog(this,"incorrect login or password","error",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }
}
class frontend{
public static void main(String args[])
{
try{
login frame = new login();
frame.setSize(300,100);
frame.setVisible(true);
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getMessage());

}
}
}

//Execution Procedure
/*
Execution Procedure
javac LoginDemo.java
java LoginDemo





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
JButton SUBMIT;
JPanel panel;
JLabel usrLabel,pwdLabel;
JTextField usrText,pwdText;
static final String dbClass = "com.mysql.jdbc.Driver";
static final String dbURL = "jdbc:mysql://localhost/student";
static final String dbUsr = "root";
static final String dbPwd = "root123";
login()
{
usrLabel = new JLabel();
usrLabel.setText("username");
usrText = new JTextField(15);
pwdLabel = new JLabel();
pwdLabel.setText("password");
pwdText = new JPasswordField(15);
SUBMIT = new JButton("SUBMIT");
panel = new JPanel(new GridLayout(3,1));
panel.add(usrLabel);
panel.add(usrText);
panel.add(pwdLabel);
panel.add(pwdText);
panel.add(SUBMIT);
add(panel,BorderLayout.CENTER);
SUBMIT.addActionListener(this);
setTitle("login form");
}
public void actionPerformed(ActionEvent ae)
{
String username = usrText.getText();
String password = pwdText.getText();
java.sql.Connection conn = null;

try
{
Class.forName(dbClass).newInstance();
conn =

java.sql.DriverManager.getConnection("jdbc:mysql://localhost/java?user
=root&password=root123");
//conn =

java.sql.DriverManager.getConnection(dbUrl,dbUsr,dbPwd);

}catch(ClassNotFoundException e){
System.out.println("error in loading driver"+e);
System.exit(1);
}
catch(Exception e)
{
System.out.println("error in connection"+e);
System.exit(0);

}
System.out.println("connection established");
try{
java.sql.Statement s = conn.createStatement();
String query = "SELECT * FROM users WHERE username =

'"+username+"'and password = '"+password+"'";

java.sql.ResultSet r = s.executeQuery(query);
r.next();
int x = r.getRow();
if (x>0){
JOptionPane.showMessageDialog(null,"WELCOME " +

username);
}
else{
JOptionPane.showMessageDialog(this,"incorrect

login or password","error",JOptionPane.ERROR_MESSAGE);

}
}
catch(Exception e)
{
System.out.println(e);
System.exit(0);
}
}
}
class LoginDemo{
public static void main(String args[])
{
try{
login frame = new login();
frame.setSize(300,100);
frame.setVisible(true);
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getMessage());

}
}
}

Execution Procedure*/
