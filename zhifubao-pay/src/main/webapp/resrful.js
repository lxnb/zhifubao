function del() {
    $.ajax({
        type : "delete",
        url : "http://localhost/restful/deleteUser/2/3",
        async : true,
        contentType : 'application/json;charset=utf-8',
        dataType : 'json'
    });
}

function upd() {
    $.ajax({
        type : "put",
        data:"id=1&name=王五&password=654321&city=中国",
        url : "http://localhost/restful/udateUser",
        async : true
    });
}