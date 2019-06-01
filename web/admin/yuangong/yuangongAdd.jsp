<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
        
        <script type="text/javascript">
		    <%--function orgAll() {--%>
		       	<%--var strUrl = "<%=path %>/getAllDeparts.action";--%>
                <%--window.location.href = strUrl;--%>
		    <%--}--%>
		    function check() {
		        if(document.getElementById("org_id").value=="")
		        {
		            alert("请选择部门");
		            return false;
		        }
		        if(document.getElementById("bianhao").value=="")
		        {
		            alert("请输入工号");
		            return false;
		        }
		        if(document.getElementById("name").value=="")
		        {
		            alert("请输入员工姓名");
		            return false;
		        }
		        if(document.formAdd.user_name.value=="")
		        {
		            alert("请输入账号");
		            return false;
		        }
		    }
		</script>
	</head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/images/allbg.gif'>
			<form action="<%=path %>/addEmployeeInfo.action" name="formAdd" method="post">
                <%--<input type="hidden" name="depart_id" value=<%=request.getParameter("depart_id")%>/>--%>
                <%--<input type="hidden" name="depart_id" value="">--%>
                    <%--<c:if test="<%=request.getParameter("depart_id") %> != null"><%=request.getParameter("depart_id") %></c:if>--%>
                <%--<input/>--%>
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" background="<%=path %>/images/wbg.gif" class='title'><span>员工管理</span></td>
					    </tr>
					    <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         部门：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <%--<input type="text" name="depart_name" id="org_id" readonly="readonly" value=""/>--%>
                                <%--<input type="hidden" name="depart_id" value=<%=request.getParameter("depart_id")%>/>--%>
						        <%--<input type="button" value="选择部门" onclick="orgAll()"/>--%>
                                <%--<a href="<%=path %>/getAllDeparts.action" >选择部门</a>--%>
                                <select style="width:144px" name="depart_id">
                                    <c:forEach items="${requestScope.departList}" var="depart">
                                        <option value="${depart.depart_id}">${depart.depart_name}</option>
                                    </c:forEach>
                                </select>
						    </td>
						</tr>
					    <%--<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">--%>
						    <%--<td width="25%" bgcolor="#FFFFFF" align="right">--%>
						               <%--工号：--%>
						    <%--</td>--%>
						    <%--<td width="75%" bgcolor="#FFFFFF" align="left">--%>
						        <%--<input type="text" name="work_id" id="bianhao" size="22"/>--%>
						    <%--</td>--%>
						<%--</tr>--%>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						               姓名：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="user_name" id="name" size="22"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        性别：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="radio" name="user_sex" value="男" checked="checked"/>男
						        &nbsp;&nbsp;&nbsp;&nbsp;
						        <input type="radio" name="user_sex" value="女"/>女
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         年龄：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="user_age" size="22"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         等级：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
                                <select style="width:144px" name="work_id">
                                    <c:forEach items="${requestScope.workList}" var="work" >
                                        <option value="${work.work_id}">${work.work_name}</option>
                                    </c:forEach>
                                </select>
						    </td>
						</tr>
						<%--<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">--%>
						    <%--<td width="25%" bgcolor="#FFFFFF" align="right">--%>
						         <%--是否部门领导：--%>
						    <%--</td>--%>
						    <%--<td width="75%" bgcolor="#FFFFFF" align="left">--%>
						        <%--<input type="radio" style="border: 0" name="shifoubumenlingdao" value="fou" checked="checked"/>否--%>
						        <%--&nbsp;&nbsp;--%>
						        <%--<input type="radio" style="border: 0" name="shifoubumenlingdao" value="shi"/>是--%>
						       <%----%>
						    <%--</td>--%>
						<%--</tr>--%>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						         账号：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="user_num" size="22" />
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        密码：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="user_pass" size="22" value="000000"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="25%" bgcolor="#FFFFFF" align="right">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						       <input type="submit" value="提交" onclick="return check()"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
