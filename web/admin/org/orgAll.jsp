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
	    <base target="_self">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<link href="<%=path %>/css/dtree.css" rel="stylesheet" type="text/css">
		<script language="JavaScript" src="<%=path %>/js/dtree.js" type="text/javascript"></script>
		<title></title>
		<script type="text/javascript">
		    var nodeId1 = ""; 
		    
		    function onClickTreeNode(nodeId)
		    {
		         nodeId1 = nodeId;
		    }
		    
		    function queding()
            {
                 if(nodeId1=="")
                 {
                    alert("请单击选择部门");
                    return false;
                 }
                 document.getElementsByName("confirm").href="<%=path %>/admin/yuangong/yuangongadd.jsp?depart_id=" + nodeId1+"&depart_name="+nodeId1.value;
                 <%--window.location.url = "<%=path %>/admin/yuangong/yuangongadd.jsp?depart_id=" + nodeId1+"&depart_name="+nodeId1.value;--%>
            }
		</script>
	</head>

	<BODY>
		<div class="dtree">
			<script type="text/javascript">
				d = new dTree('d');
		        d.add(0,-1,'请选择所属部门');//必须有这句
				<%--<c:forEach items="${requestScope.departList}" var="depart">--%>
		            <%--d.add(${org.id},${depart.depart_id},'${depart.depart_name}','javaScript:onClickTreeNode(${depart.depart_id});',null,null,null,null,'yes');--%>
		        <%--</c:forEach>--%>
				<c:forEach items="${requestScope.departList}" var="depart">
					d.add(${depart.depart_id},${depart.depart_parent},'${depart.depart_name}','javaScript:onClickTreeNode(${depart.depart_id});',null,null,null,null,'yes');
				</c:forEach>
				document.write(d);
			</script>
		</div>
		<br>
		&nbsp;&nbsp;&nbsp;
		<%--<input type="button" value="确定" style="width: 80px;" onclick="queding()">--%>
		<a name="confirm" href="#" onclick="queding()">确定</a>
	</body>
</html>
