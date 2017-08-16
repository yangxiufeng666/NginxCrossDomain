<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <script type="text/javascript" src="jquery-2.1.0.js"></script>
</head>
<body>
<input type="button" value="测试Nginx跨域请求本地" onclick="proxyMethod()"/>
<script type="text/javascript">
    var proxyurl='apis/api?method=1&para=2';
    function proxyMethod() {
        $.ajax({
            type: 'get',
            url: proxyurl,
            success: function (data) {
                alert(data);
            },
            error: function (err) {
                alert('出现错误了!!!');
            }
        });
    }
</script>
</body>
</html>
