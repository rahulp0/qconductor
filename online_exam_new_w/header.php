<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
      }
-->
</style>
<table border="0" width="100%" cellspacing="0" cellpadding="0" background="image/paathshala.jpg">
  <tr>
    <td width="90%" valign="top">

<div align="left"><object classid=clsid:D27CDB6E-AE6D-11cf-96B8-444553540000 codebase=http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,2,0 width=500 height=68>
<param name=movie value=image/fence.swf>
<param name=quality value=high>
<param name=BGCOLOR value=#000000>
<param name=SCALE value=showall>
<param name=wmode value=transparent> 
<embed img src="image/slid.jpg" src=image/fence.swf quality=high  width=1365 height=100 scale= showall>
</embed>
</object></div></td>
    <td width="100%">
     
  </tr>
</table>

  <Table width="100%">
  <tr>
  <td>
  <?php @$_SESSION['login']; 
  error_reporting(1);
  ?>
  </td>
    <td>
	<?php
	if(isset($_SESSION['login']))
	{
	 echo "<div align=\"right\"><strong><a href=\"index.php\"> Home </a>|<a href=\"signout.php\">Signout</a></strong></div>";
	 }
	 else
	 {
	 	echo "&nbsp;";
	 }
	?>
	</td>
	
  </tr>
  
</table>
