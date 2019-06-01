<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<link href="<%=path %>/css/dtree.css" rel="stylesheet" type="text/css">
		<script language="JavaScript" src="<%=path %>/js/dtree.js" type="text/javascript"></script>
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		<style type="text/css">
			.login_txt {
				font-family: Arial, Helvetica, sans-serif;
				font-size: 12px;
				line-height: 25px;
				color: #bc7565;
			}
		</style>
		<title></title>
		<script type="text/javascript">
		    var orgId=null;
		    function onClickTreeNode(nodeId) {
		        orgId=nodeId;
		    }
		    function addXiaJiOrg() {
				if(orgId==null) {
				     alert("请选择部门");
				} else {
				     var url="<%=path %>/admin/org/addOrg.jsp?orgId="+orgId;
	                 window.location.href = url;
				}
		    }

		    function delOrg() {
				if(orgId==null) {
				     alert("请选择部门");
				}
				else {
				     var s="<%=path %>/delDepart.action?depart_id="+orgId;
				     window.location.href=s;
				}
		    }
		    
		    function fresh()
		    {
				var s="<%=path %>/getDepartInfoList.action";
		        window.location.href = s;
		    }
		    
		</script>
	</head>

	<BODY>
	<div class="body-box">
		<div class="dtree">
			<script type="text/javascript">
				d = new dTree('d');
		        d.add(0,-1,'部门组织结构图');//必须有这句
				<c:forEach items="${requestScope.departList}" var="depart">
		            d.add(${depart.depart_id},${depart.depart_parent},'${depart.depart_name}','javaScript:onClickTreeNode(${depart.depart_id});',null,null,null,null,'yes');
		        </c:forEach>
				document.write(d);
			</script>
		</div>
		<br>
		<%--<input type="button" class="ButtonCss" value="添加部门" onclick="addDingJiOrg()">--%>
		<%--<input type="button" class="ButtonCss" value="添加子部门" onclick="addXiaJiOrg()">--%>
		<%--<input type="button" class="ButtonCss" value="删除部门" onclick="delOrg()">--%>
		<%--<input type="button" class="ButtonCss" value="刷新页面" onclick="fresh()">--%>

		<a href="<%=path %>/admin/org/addOrg.jsp" >添加部门</a>
		<a href="#" onclick="addXiaJiOrg()">添加子部门</a>
		<a href="#" onclick="delOrg()" >删除部门</a>
		<a href="#" onclick="fresh()" >刷新部门</a>
		<br><br>
		<span class="login_txt">${msg}</span>
	</div>
	</body>
</html>
