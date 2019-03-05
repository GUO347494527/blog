function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var remember = document.getElementById("remember").value;
    var obj = {
        username : username,
        password : password
    };
    $.ajax(
        {
            url : "/admin/login",
            type : "post",
            contentType : 'application/json;charset=UTF-8',
            dataType : 'json',
            data: JSON.stringify(obj)
        }
    )
}