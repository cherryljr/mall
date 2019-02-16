<html>
<body>
<h2>Hello World!</h2>

springMVC Upload Test
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="upload" />
</form>


Rich Text Upload Test
<form name="form2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="upload" />
</form>

</body>
</html>
