<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	    <style type="text/css">
		body {
			margin-left: 0px;
			margin-top: 0px;
			margin-right: 0px;
			margin-bottom: 0px;
			background-color: rgba(43, 188, 183, 0.04);
		}
		.login_txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #bc7565;
		}

		.login_txt_bt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 25px;
			line-height: 25px;
			color: #666666;
			font-weight: bold;
		}
		
		.left_txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #666666;
		}

		.MM a {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 26px;
			color: #666666;
			list-style-type: none;
			list-style-image: none;
		}
		a:link {
			font-size: 12px;
			line-height: 25px;
			color: #333333;
			text-decoration: none;
		}
		a:hover {
			font-size: 12px;
			line-height: 25px;
			color: #666666;
			text-decoration: none;
		}
		a:visited {
			font-size: 12px;
			line-height: 25px;
			color: #333333;
			text-decoration: none;
		}
		.MM a:link {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 26px;
			color: #666666;
			list-style-type: none;
			list-style-image: none;
		}
		</style>
		<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
        
		<script language="javascript">
		function check1()
		{                                                                                         
		     if(document.ThisForm.user_num.value=="")
			 {
			 	alert("请输入用户名");
				document.ThisForm.user_num.focus();
				return false;
			 }
			 if(document.ThisForm.user_pass.value=="")
			 {
			 	alert("请输入密码");
				document.ThisForm.user_pass.focus();
				return false;
			 }
			 if(document.ThisForm.userType.value=="-1")
			 {
			 	alert("请选择登陆身份");
				document.ThisForm.userType.focus();
				return false;
			 }
			 document.getElementById("indicator").style.display="block";
			 //loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,document.ThisForm.userType.value,callback);
            document.getElementById("fm").action="${pageContext.request.contextPath}/login.action";
            document.getElementById("fm").submit();
		}
		
		function callback(data)
		{
		    document.getElementById("indicator").style.display="none";
		    if(data=="no")
		    {
		        alert("用户名或密码错误");
		    }
		    if(data=="yes")
		    {
		        alert("通过验证,系统登录成功");
		        window.location.href="<%=path %>/loginSuccess.jsp";
		    }
		    
		}
	    </script>
</head>
<body>
<table width="100%" height="166" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="42" valign="top">
       <table width="100%" height="42" border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
	      <tr>
	        <td width="1%" height="21">&nbsp;</td>
	        <td height="42">&nbsp;</td>
	        <td width="17%">&nbsp;</td>
	      </tr>
       </table>
    </td>
  </tr>
  <tr>
    <td valign="top">
     <table width="100%" height="532" border="0" cellpadding="0" cellspacing="0" class="login_bg">
      <tr>
        <td width="49%" align="right"><table width="91%" height="532" border="0" cellpadding="0" cellspacing="0" class="login_bg2">
            <tr>
              <td height="138" valign="top">
                  <table width="89%" height="427" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td height="149">&nbsp;</td>
                </tr>
                <tr>
                  <td height="80" align="right" valign="top"></td>
                </tr>
                <tr>
                  <td height="198" align="right" valign="top">
                      <table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td width="35%">&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td width="30%" height="40"></td>
                      <td width="35%"></td>
                    </tr>
                  </table></td>
                </tr>
              </table></td>
            </tr>

        </table></td>
        <td width="1%" >&nbsp;</td>
        <td width="50%" valign="bottom"><table width="100%" height="59" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td width="4%">&nbsp;</td>
              <td width="96%" height="38"><span class="login_txt_bt">企业员工工资信息管理系统</span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td height="21">
                  <table cellSpacing="0" cellPadding="0" width="100%" border="0" id="table211" height="328">
                  <tr>
                    <td height="164" colspan="2" align="middle">
                        <FORM id="fm" name="ThisForm" action="<%=path %>/login.action" method=post>
                        <table cellSpacing="0" cellPadding="0" width="100%" border="0" height="143" id="table212">
                          <tr>
                            <td width="13%" height="38" class="top_hui_text"><span class="login_txt">用户名：&nbsp;&nbsp; </span></td>
                            <td height="38" colspan="2" class="top_hui_text"><input name="user_num" class="editbox4" value="" size="20">
                                <span class="login_txt">${msg}&nbsp;&nbsp; </span>
                            </td>
                          </tr>
                          <tr>
                            <td width="13%" height="35" class="top_hui_text"><span class="login_txt"> 密 码： &nbsp;&nbsp; </span></td>
                            <td height="35" colspan="2" class="top_hui_text"><input class="editbox4" type="password" size="20" name="user_pass">
                              <img src="<%=path %>/img/luck.gif" width="19" height="18"> </td>
                          </tr>
                          <tr>
                            <td width="13%" height="35" ><span class="login_txt">登录身份：</span></td>
                            <td height="35" colspan="2" class="top_hui_text">
                                 <select class="INPUT_text" name="userType">
                                     <option value="-1">请选择</option>
	                                 <option value="0">管理员</option>
	                                 <option value="1">员&nbsp;&nbsp;&nbsp;工</option>
								 </select>
                            </td>
                          </tr>
                          <tr>
                            <td height="35" >&nbsp;</td>
                            <td width="80%" height="35" >
                                <input name="button" type="button" id="Submit" value="登 陆" onClick="check1()"> 
                                <input name="cs" type="reset" class="button" id="cs" value="重 置">
                                <img id="indicator" src="<%=path %>/img/loading.gif" style="display:none"/>
                            </td>
                            <td width="20%"></td>
                          </tr>
                        </table>
                        <br>
                    </form></td>
                  </tr>
                  <tr>
                    <td width="433" height="164" align="right" valign="bottom"></td>
                    <td width="57" align="right" valign="bottom">&nbsp;</td>
                  </tr>
              </table></td>
            </tr>
          </table>
          </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>