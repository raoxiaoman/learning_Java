<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
<br>
<form action="UploadServlet" enctype="multipart/form-data" method="post">
    选择文件<input type="file" name="file1" id="file1"/>
    上传文件<input type="submit" name="upload" value="上传"/>
</form>
</body>
</html>
