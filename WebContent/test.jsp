<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</h3>

<%!

public int add(int a, int b) {
	
	return a + b;
	
}

%>

<%
int i = 2;
int j = 3;

int k = i + j;
out.println("<h3> The value of k: " + k + "</h3>");

int m = add(7788, 9834);

%>

vs

<h3>The value of k: <%=k %></h3>
<h3>The value of m: <%=m %></h3>

</body>
</html>