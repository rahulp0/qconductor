<?php
session_start();
?>
<!--DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"-->
<!DOCTYPE html>
<html>
<head>
<title>qzCndctr1.1</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="quiz.css" rel="stylesheet" type="text/css">
</head>


<body background = "image/martin.png">
<?php
include 'header.php';
include 'database.php';
extract($_POST);

if(isset($submit))
{




	$rs=mysqli_query("select * from mst_user where login='$loginid' and pass='$pass'");
	if(mysqli_num_rows($rs)<1)
	{
		$found="N";
	}
	else
	{
		$_SESSION[login]=$loginid;
	}
}
if (isset($_SESSION[login]))
{
echo "<h1 class='style8' align=center>Welcome to Online Exam</h1>";
		echo '<table width="28%"  border="0" align="center">
  <tr>
    <td width="7%" height="65" valign="bottom"><img src="image/HLPBUTT2.JPG" width="50" height="50" align="middle"></td>
    <td width="93%" valign="bottom" bordercolor="#0000FF"> <a href="sublist.php" class="style4">Subject for Quiz </a></td>
  </tr>
  <tr>
    <td height="58" valign="bottom"><img src="image/DEGREE.JPG" width="43" height="43" align="absmiddle"></td>
    <td valign="bottom"> <a href="result.php" class="style4">Result </a></td>
  </tr>
</table>';
   
		exit;
		

}





?>
<b></b><b></b>
<table width=100%" border="0">
  
  <tr>
    <td width="70%" height="25">&nbsp;</td>
    <td width="5%" height= "25" bgcolor="#1d91d0"><div align="center" class="style1">User Login </div></td>
  </tr>
  <tr>
    <td height="296" valign="top"><div align="center">
        <h1 class="style8">Quiz Conductor Version  1.1</h1>
      <span class="style5"><img src="image/paathshala.png" width="350" height="300"></span>        </span>
        <!--<param name="movie" value="english theams two brothers.dat">
        <param name="quality" value="high">
        <param name="movie" value="Drag to a file to choose it.">
        <param name="quality" value="high">
        <param name="BGCOLOR" value="#FFFFFF">-->
				<p align="left" class="style5">&nbsp;</p>
      <blockquote>
        
	  
      </blockquote>
    </div></td>
    <td valign="top"><form name="form1" method="post" action="">
      <table width="200" border="0">
        <tr>
          <td><span class="style2">Login ID </span></td>
          <td><input name="loginid" type="text" id="loginid2"></td>
        </tr>
        <tr>
          <td><span class="style2">Password</span></td>
          <td><input name="pass" type="password" id="pass2"></td>
        </tr>
        <tr>
          <td colspan="2"><span class="errors">
            <?php
		  if(isset($found))
		  {
		  	echo "Invalid Username or Password";
		  }
		  ?>
          </span></td>
          </tr>
        <tr>
          <td colspan=2 align=center class="errors">
		  <input name="submit" type="submit" id="submit" value="Login">		  </td>
        </tr>
        <tr>
          <td colspan="2" bgcolor="#1d91d0"><div align="center"><span class="style4">New User? <a href="signup.php">Signup Now</a></span></div></td>
	  <nsbp>
	  <td width="100%" colspan="1" bgcolor="#1d91d0"><div align="center"><span class="style4"><a href="admin/index.php">Admin_login</a></span></div></td> 
          </tr>
      </table>
      
    </form></td>
	  </tr>
</table>
	 <td width="100%" colspan="1" bgcolor="#640000"><div align="center"><span class="style4">Developed by: Raghav, Rahul, Sagar </span></div></td> 
</body>
</html>
