<#import "../common.ftl" as c />
<@c.html>
<div class="breadcrumb">
    <ul>
        <li><a href="#">系统</a></li>
        <li><a href="#">消息</a></li>
        <li><a href="#">发送消息</a></li>
    </ul>
</div>
<div class="content clear">
    <div class="user_title">
        <h1>发送消息</h1>
    </div>
    <div class="item_list clear">
        <ul>
            <li><span class="labelSpan">标题：</span>
                <div class="text"><input name="" type="text" class="xll"></div></li>
            <li class="overflow"><span class="labelSpan">接收人：</span>
                <div class="text">
                    <div class="supportArea">
                        <div class="sa_list">
                            <span class="checkboxRadio_span"><input name="" type="radio" value=""> 个人</span>
                            <input id="input_customer" name="" type="text" class="xls">
                        </div>
                        <div class="sa_list">
                            <span class="checkboxRadio_span"><input name="" type="radio" value=""> 多人</span>
                            <select name="" class="select_l">
                                <option>POS机</option>
                            </select>
                            <select name="" class="select_l">
                                <option>支付通道</option>
                            </select>
                            <select name="" class="select_l">
                                <option>用户身份</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="suggest suggest_l" id="customer_result_id">
                </div>
            </li>
            <li><span class="labelSpan">内容：</span>
                <div class="text"><textarea name="" cols="" rows="" class="xxl"></textarea></div>
            </li>
        </ul>
    </div>
    <div class="btnBottom"><button class="blueBtn">发送</button></div>
</div>
<script>
    $(function(){
    <#--用户搜索-->
        var customerClose = true ;
        $("#customer_result_id").hide();
        $("#input_customer").keyup(function(){
            var name = $.trim($(this).val()) ;
            if("" == name || null == name){
                $("#customer_result_id").hide();
            }
            else {
                $.get('<@spring.url "/system/message/searchCustomer" />',
                        {"name": name},
                        function (data) {
                            $("#customer_result_id").show();
                            $("#customer_result_id").html(data);
                            $("#customer_result_id a").click(function(){
                                var name = $(this).html();
                                var id = $(this).attr("value");
                                $("#input_customer").val(name);
                                $("#customer_result_id").hide();
                                alert($(this).attr("value"));
                            }).hover(function () {customerClose = false ;}
                                    ,function () {customerClose = true ;});
                        });
            }
        }).blur(function(){
            if(customerClose) {
                $("#customer_result_id").hide();
            }
        }).focus(function(){
            $("#customer_result_id").show();
        });

    });
</script>
</@c.html>