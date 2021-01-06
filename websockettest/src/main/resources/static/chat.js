var stompClient = null;
/*连接成功后，订阅的地址为"／user/queue/chat"，该地址比服务端配直的地址多了"／user"前缀，
这是因为SimpMessagingTemplate类中自动添加了路径前缀。*/
function connect() {
    var socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({},function (frame) {
       stompClient.subscribe('/user/queue/chat',function (chat) {
           showGreeting(JSON.parse(chat.body));
       });
    });
}

function sendMsg() {
    stompClient.send("/app/chat",{},
        JSON.stringify({'content':$("#content").val(),
        'to':$("#to").val()}));
}

function showGreeting(message) {
    $("#chatsContent").append("<div>" + message.from+":"+message.content+"</div>");
}
$(function () {
    connect();
    $("#send").click(function () {
        sendMsg();
    });
});