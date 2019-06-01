<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		
		<script language="JavaScript" src="<%=path %>/js/popup_shuaxin.js" type="text/javascript"></script>
		
        <script language="javascript">
           function chuqinDel(id)
           {
                var url="<%=path %>/chuqin?type=chuqinDel&id="+id;
                var pop=new Popup({ contentType:1,isReloadOnClose:false,width:200,height:150});
	            pop.setContent("contentUrl",url);
	            pop.setContent("title","操作窗口");
	            pop.build();
	            pop.show();
           }
           
           function chuqinAdd()
           {
              var url="<%=path %>/admin/chuqin/chuqinAdd.jsp";
              window.location.href=url;
           }
        </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="4" background="<%=path %>/img/tbg.gif">&nbsp;出勤管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="25%">月份</td>
					<td width="25%">出勤天数</td>
					<td width="25%">员工</td>
					<td width="25%">操作</td>
		        </tr>	
				<c:forEach items="${requestScope.chuqinList}" var="chuqin">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						 ${chuqin.yuefen}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						 ${chuqin.tianshu}
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    ${chuqin.yuangong.name}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a class="pn-loperator" href="#" onclick="chuqinDel(${chuqin.id})">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="出勤录入" style="width: 80px;" onclick="chuqinAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
