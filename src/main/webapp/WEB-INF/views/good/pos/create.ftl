<#import "../../common.ftl" as c />
<@c.html>

	<div class="breadcrumb">
        <ul>
            <li><a href="#">商品</a></li>
            <li><a href="#">POS机管理</a></li>
            <#if good??>
            <li><a href="#">编辑POS机</a></li>
            <#else>
            <li><a href="#">创建POS机</a></li>
            </#if>
        </ul>
    </div>
    <div class="content clear">
		<div class="user_title">
		<h1>
			<#if good??>
			编辑POS机
            <#else>创建POS机
            </#if>
		</h1>
        </div>
        <div class="attributes_box">
        	<h2>基础信息</h2>
            <div class="item_list clear">
                <ul>
                    <li class="b"><span class="labelSpan">标题：</span>
                    	<div class="text"><input name="g_title" type="text" 
                    	<#if (good.title)??>value="${good.title}"</#if>
                    	></div></li>
                    <li class="b"><span class="labelSpan">副标题：</span>
                    	<div class="text"><input name="g_secondTitle" type="text"
                    	<#if (good.secondTitle)??>value="${good.secondTitle}"</#if>
                    	></div></li>
                    <li class="b"><span class="labelSpan">关键字：</span>
                    	<div class="text"><input name="g_keyWorlds" type="text"
                    	<#if (good.keyWorlds)??>value="${good.keyWorlds}"</#if>
                    	></div></li>
                    <li class="o"><span class="labelSpan">选择POS机分类：</span>
                    	<div class="text">
                        <select name="g_posCategory">
                        <#if posCategories??>
                          <#list posCategories as posCategory>
                    	  <option value="${posCategory.id}" 
                    	  		<#if ((good.posCategoryId)?? && good.posCategoryId=posCategory.id)
                    	  				||(!((good.posCategoryId)??) && posCategory_index=0)> selected="true"</#if>>
                    	  <#if posCategory.parentId??>&nbsp;&nbsp;L</#if>${posCategory.name}</option>
                    	  </#list>
                    	</#if>
                    	</select>
                        </div>
                    </li>
                    <li class="o"><span class="labelSpan">选择厂家：</span>
                    	<div class="text">
                        <select name="g_factory">
   						 <#if factories??>
                          <#list factories as factory>
                    	  <option value="${factory.id}"
                    	  	<#if ((good.factoryId)?? && good.factoryId=factory.id)
                    	  	     ||(!((good.factoryId)??) && factory_index=0) > selected="true"</#if>
                    	  >${factory.name}</option>
                    	  </#list>
                    	</#if>
                    	</select>
                        </div>
                    </li>
                    <li><span class="labelSpan">POS机品牌：</span>
                    	<div class="text"><input name="g_goodBrand" type="text"
                    	<#if (good.goodBrand)??>value="${good.goodBrand.name}"</#if>
                    	></div></li>
                    <li><span class="labelSpan">POS机型号：</span>
                    	<div class="text"><input name="g_modelNumber" type="text"
                    	<#if (good.modelNumber)??>value="${good.modelNumber}"</#if>
                    	></div></li>
                    <li class="o"><span class="labelSpan">加密卡方式：</span>
                    	<div class="text">
                        <select name="g_encryptCardWay">
                        <#if encryptCardWays??>
                          <#list encryptCardWays as encryptCardWay>
                    	  <option value="${encryptCardWay.id}" 
                    	  <#if ((good.encryptCardWayId)?? && good.encryptCardWayId=encryptCardWay.id)
                    	  	     ||(!((good.encryptCardWayId)??) && encryptCardWay_index=0) > selected="true"</#if>
                    	  >${encryptCardWay.encryptCardWay}</option>
                    	  </#list>
                    	</#if>
                    	</select>
                        </div>
                    </li>
                    <li class="o"><span class="labelSpan">签购单打印方式：</span>
                    	<div class="text">
                        <select name="g_signOrderWay">
                         <#if signOrderWays??>
                          <#list signOrderWays as signOrderWay>
                    	  <option value="${signOrderWay.id}" 
                    	  <#if ((good.signOrderWayId)?? && good.signOrderWayId=signOrderWay.id)
                    	  	     ||(!((good.signOrderWayId)??) && signOrderWay_index=0)> selected="true"</#if>
                    	  >${signOrderWay.signOrderWay}</option>
                    	  </#list>
                    	</#if>
                    	</select>
                        </div>
                    </li>
                    <li class="b"><span class="labelSpan">支持银行卡：</span>
                    	<div class="text">
                    	<#if cardTypes??>
                          <#list cardTypes as cardType>
                        	<span class="checkboxRadio_span"><input name="g_cardType" type="checkbox" value="${cardType.id}" 
                        	<#if (good.cardTypes)??>
	                          <#list good.cardTypes as gCard>
                        		<#if cardType.id=gCard.id> checked="checked"</#if>
	                    	  </#list>
                    		</#if>
                        	> ${cardType.cardType}</span>
                    	  </#list>
                    	</#if>
                        </div>
                    </li>
                    <li><span class="labelSpan">电池信息：</span>
                    	<div class="text"><input name="g_batteryInfo" type="text" 
                    	<#if (good.batteryInfo)??>value="${good.batteryInfo}"</#if>
                    	></div></li>
                    <li><span class="labelSpan">外壳材质：</span>
                    	<div class="text"><input name="g_shellMaterial" type="text"
                    	<#if (good.shellMaterial)??>value="${good.shellMaterial}"</#if>
                    	></div></li>
                </ul>
            </div> 
        </div>
        <div class="attributes_box">
        	<h2>价格信息</h2>
            <div class="item_list clear">
                <ul>
                    <li class=""><span class="labelSpan">原价：</span>
                    	<div class="text"><input name="g_price" type="text"
                    	<#if (good.price)??>value="${(good.price/100)?string("0.00")}"</#if>
                    	> 元<br>（保留小数点后两位）</div></li>
                    <li><span class="labelSpan">现价：</span>
                    	<div class="text"><input name="g_retailPrice" type="text"
                    	<#if (good.retailPrice)??>value="${(good.retailPrice/100)?string("0.00")}"</#if>
                    	> 元<br>（保留小数点后两位）</div></li>
                </ul>
            </div> 
        </div>
        
        <div class="attributes_box">
        	<h2>批购信息</h2>
            <div class="item_list clear">
                <ul>
                    <li class=""><span class="labelSpan">批购：</span>
                    	<div class="text"><input name="g_purchasePrice" type="text"
                    	<#if (good.purchasePrice)??>value="${(good.purchasePrice/100)?string("0.00")}"</#if>
                    	> 元<br>（保留小数点后两位）</div></li>
                    <li><span class="labelSpan">最低限价：</span>
                    	<div class="text"><input name="g_floorPrice" type="text"
                    	<#if (good.floorPrice)??>value="${(good.floorPrice/100)?string("0.00")}"</#if> > 元<br>（保留小数点后两位）</div></li>
                    <li><span class="labelSpan">最小批购量：</span>
                    	<div class="text"><input name="g_floorPurchaseQuantity" type="text"
                    	<#if (good.floorPurchaseQuantity)??>value="${good.floorPurchaseQuantity}"</#if>
                    	onkeyup="value=this.value.replace(/\D+/g,'')"> 个</div></li>
                </ul>
            </div> 
        </div>
        
        <div class="attributes_box">
        	<h2>租赁设置</h2>
            <div class="item_list clear">
                <ul>
                    <li class=""><span class="labelSpan">租赁押金：</span>
                    	<div class="text"><input name="g_leaseDeposit" type="text"
                    	<#if (good.leaseDeposit)??>value="${(((good.leaseDeposit)!0)/100)?string("0.00")}"</#if>
                    	> 元<br>（保留小数点后两位）</div></li>
                    <li class=""><span class="labelSpan">月租金：</span>
                    	<div class="text"><input name="g_leasePrice" type="text"
                    	<#if (good.leasePrice)??>value="${(((good.leasePrice)!0)/100)?string("0.00")}"</#if>
                    	> 元<br>（保留小数点后两位）</div></li>
                    <li><span class="labelSpan">最低租赁时间：</span>
                    	<div class="text"><input name="g_leaseTime" type="text"
                    	<#if (good.leaseTime)??>value="${good.leaseTime}"</#if> 
                    	onkeyup="value=this.value.replace(/\D+/g,'')"> 月</div></li>
                    <li><span class="labelSpan">最长租赁时间：</span>
                    	<div class="text"><input name="g_returnTime" type="text"
                    	<#if (good.returnTime)??>value="${good.returnTime}"</#if> 
                    	onkeyup="value=this.value.replace(/\D+/g,'')"> 月</div></li>
                    <li class="b"><span class="labelSpan">租赁说明：</span>
                    	<div class="text">
                    	<textarea name="g_leaseDescription" cols="" rows=""><#if (good.leaseDescription)??>${good.leaseDescription}</#if></textarea></div></li>
                    <li class="b"><span class="labelSpan">租赁协议：</span>
                    	<div class="text"><textarea name="g_leaseAgreement" cols="" rows=""><#if (good.leaseAgreement)??>${good.leaseAgreement}</#if></textarea></div></li>
                </ul>
            </div> 
        </div>
        
        <div class="attributes_box">
        	<h2>支付通道</h2>
            <div class="item_list clear">
                <ul>
					<li class="overflow"><span class="labelSpan">添加支付通道：</span>
                    	<div class="text" id="channel_search">
                    	<input name="" type="text" id="input_channel">
                    	 <#if (good.channels)??>
                          <#list good.channels as channel>
                          <div class="item_relevance_pro" value="${channel.id}">
                        	<span>${channel.name}</span> <a class="a_btn" onClick="del(this)">删除</a>
                         </div>
                    	  </#list>
                    	</#if>
                    	</div>
                        <div class="suggest" id="channel_result_id">
                        </div>
                    </li>
                </ul>
            </div> 
        </div>
        
        <div class="attributes_box">
        	<h2>其他</h2>
			<div class="item_list clear">
			    <ul>
			        <li class="b"><span class="labelSpan">详细说明：</span>
			        	<div class="text"><textarea name="g_description" cols="" rows=""><#if (good.description)??>${good.description}</#if></textarea></div></li>
			        <li class="b"><span class="labelSpan">POS机图片：</span>
			        	<div class="text" id="photos">
			        	<#list 0..2 as i>
							<form id="fileForm${i}" action="<@spring.url "/good/pos/uploadImg" />" method="post" enctype="multipart/form-data">
                            	<div class="item_photoBox">
                            	<#if (good.pictures[i])??>
                                	<img src="<@spring.url "/resources/images/zp.jpg" />" class="cover" value="<@spring.url good.pictures[i].urlPath />" dbValue="${good.pictures[i].urlPath}">
                                	<a href="javascript:void(0);" class="informImg_a">
                                    	<span>重新上传</span><input name="file" type="file" onChange="fileChange(this)" index="${i}"/>
                                	</a>
                                <#else>
                                	<a href="javascript:void(0);" class="informImg_a">
                                    	<span>上传照片</span><input name="file" type="file" onChange="fileChange(this)" index="${i}"/>
                                	</a>
                            	</#if>                            	
                            	</div>
                        	</form>
						</#list>
			            </div>
			        </li>
			        <li class="b overflow"><span class="labelSpan">关联商品：</span>
			        	<div class="text" id="rgood_search">
			        		<input name="" type="text" id="input_rgood">
	                    	<#if (good.relativeGoods)??>
	                        	<#list good.relativeGoods as relativeGood>
	                          	<div class="item_relevance_pro" value="${relativeGood.id}">
	                        		<span>${relativeGood.title}</span> <a class="a_btn" onClick="del(this)">删除</a>
	                         	</div>
	                    		</#list>
	                    	</#if>
			            </div>
			            <div class="suggest" id="rgood_result_id">
			            </div>
			        </li>
			    </ul>
			    <div class="img_info" style="display: none; top: 0px; left: 0px;"><img src=""></div>
			</div>
        </div>
        
        <div class="btnBottom"><button class="blueBtn" onClick="submitData()">
			<#if good??>
			确定
            <#else>创建
            </#if>
		</button></div>
    </div>
    
<script type="text/javascript">

$(function(){
   <#--通道搜索-->
   var channelClose = true ;
   $("#channel_result_id").hide();
   $("#input_channel").keyup(function(){
    var name = $.trim($(this).val()) ;
    if("" == name || null == name){
     $("#channel_result_id").hide();
    }
    else {
	$.get('<@spring.url "/good/pos/searchChannel" />',
		{"name": name},
        function (data) {
        	$("#channel_result_id").show();
     		$("#channel_result_id").html(data);
     		$("#channel_result_id a").click(function(){
	      		var name = $(this).html();
	      		var id = $(this).attr("value");
	      		$("#input_channel").val(name);
	      		$("#channel_result_id").hide();
	      		var hasSelectd = false;
	      		$("#channel_search .item_relevance_pro").each(function() {
		      		if($(this).attr("value") == id){
		      			hasSelectd = true;
		      		}
    			});
    			
    			if(!hasSelectd){
		      		var newDiv = '<div class="item_relevance_pro" value="'+id+'"><span>'+name+'</span> <a class="a_btn" onClick="del(this)">删除</a></div>';
		      		$("#channel_search").append(newDiv);
    			}
     		}).hover(function() {channelClose = false ;}
     				,function() {channelClose = true ;});
        });
    }
   }).blur(function(){
	    if(channelClose) {
	   		$("#channel_result_id").hide();
	   	}
   }).focus(function(){
  		$("#channel_result_id").show();
   });	
   
   <#--商品搜索-->
   var rgoodClose = true ;
   $("#rgood_result_id").hide();
   $("#input_rgood").keyup(function(){
    var name = $.trim($(this).val()) ;
    if("" == name || null == name){
     $("#rgood_result_id").hide();
    }
    else {
	$.get('<@spring.url "/good/pos/searchGood" />',
		{"name": name},
        function (data) {
        	$("#rgood_result_id").show();
     		$("#rgood_result_id").html(data);
     		$("#rgood_result_id a").click(function(){
	      		var name = $(this).html();
	      		var id = $(this).attr("value");
	      		$("#input_rgood").val(name);
	      		$("#rgood_result_id").hide();
	      		var hasSelectd = false;
	      		$("#rgood_search .item_relevance_pro").each(function() {
		      		if($(this).attr("value") == id){
		      			hasSelectd = true;
		      		}
    			});
    			
    			if($("#rgood_search .item_relevance_pro").size()>4){
    				hasSelectd = true;
    			}
    			
    			if(!hasSelectd){
		      		var newDiv = '<div class="item_relevance_pro" value="'+id+'"><span>'+name+'</span> <a class="a_btn" onClick="del(this)">删除</a></div>';
		      		$("#rgood_search").append(newDiv);
    			}
     		}).hover(function () {rgoodClose = false ;}
     				,function () {rgoodClose = true ;});
        });
    }
   }).blur(function(){
	    if(rgoodClose) {
	   		$("#rgood_result_id").hide();
	   	}
   }).focus(function(){
  		$("#rgood_result_id").show();
   });
   
});

function del(obj){
	$(obj).parent().remove();
};

function submitData(){
	var title=$("input[name='g_title']").val();
	if(isNull(title, "标题不能为空!")){return false;}
	var secondTitle=$("input[name='g_secondTitle']").val();
	if(isNull(secondTitle, "副标题不能为空!")){return false;}
	var keyWorlds=$("input[name='g_keyWorlds']").val();
	if(isNull(keyWorlds, "关键字不能为空!")){return false;}
	var posCategoryId=$("select[name='g_posCategory']").find("option:selected").val();
	if(isNull(posCategoryId, "POS机分类不能为空!")){return false;}
	var factoryId=$("select[name='g_factory']").find("option:selected").val();
	if(isNull(factoryId, "厂家不能为空!")){return false;}
	var goodBrandName=$("input[name='g_goodBrand']").val();
	if(isNull(goodBrandName, "品牌不能为空!")){return false;}
	var modelNumber=$("input[name='g_modelNumber']").val();
	if(isNull(modelNumber, "POS机型号不能为空!")){return false;}
	var encryptCardWayId=$("select[name='g_encryptCardWay']").find("option:selected").val();
	if(isNull(encryptCardWayId, "加密卡方式不能为空!")){return false;}
	var signOrderWayId=$("select[name='g_signOrderWay']").find("option:selected").val();
	if(isNull(signOrderWayId, "签购单打印方式不能为空!")){return false;}
	var cardTypes = new Array();
	$("input[name='g_cardType']").each(function(i) {
            if (this.checked) {
            	cardTypes[i]=$(this).attr("value");
            }
    });
    
    if(isNull(cardTypes, "支持银行卡不能为空!")){return false;}
    var batteryInfo=$("input[name='g_batteryInfo']").val();
    if(isNull(batteryInfo, "电池信息不能为空!")){return false;}
    var shellMaterial=$("input[name='g_shellMaterial']").val();
    if(isNull(shellMaterial, "外壳材质不能为空!")){return false;}
    var price=$("input[name='g_price']").val();
    if(isNull(price, "原价不能为空!") || isNotTwoDecimal(price, "原价必须为2位小数!")){return false;}
    var retailPrice=$("input[name='g_retailPrice']").val();
    if(isNull(retailPrice, "现价不能为空!") || isNotTwoDecimal(price, "现价必须为2位小数!")){return false;}
	var purchasePrice=$("input[name='g_purchasePrice']").val();
    if(isNull(purchasePrice, "批购价不能为空!") || isNotTwoDecimal(purchasePrice, "批购价必须为2位小数!")){return false;}
 	var floorPrice=$("input[name='g_floorPrice']").val();
    if(isNull(floorPrice, "最低限价不能为空!") || isNotTwoDecimal(purchasePrice, "最低限价必须为2位小数!")){return false;}
 	var floorPurchaseQuantity=$("input[name='g_floorPurchaseQuantity']").val();
    if(isNull(floorPurchaseQuantity, "最小批购量不能为空!")){return false;}
 	var leaseDeposit=$("input[name='g_leaseDeposit']").val();
    if(isNotTwoDecimal(leaseDeposit, "租赁押金必须为2位小数!")){return false;}
 	var leasePrice=$("input[name='g_leasePrice']").val();
    if(isNotTwoDecimal(leasePrice, "月租金必须为2位小数!")){return false;}
    
 	var leaseTime=$("input[name='g_leaseTime']").val();
 	var returnTime=$("input[name='g_returnTime']").val();
 	var leaseDescription=$("textarea[name='g_leaseDescription']").val();
 	var leaseAgreement=$("textarea[name='g_leaseAgreement']").val();
   	
   	var channels = new Array();
   	$("#channel_search .item_relevance_pro").each(function(i) {
            channels[i]=$(this).attr("value");
    });
 	if(isNull(channels, "支付通道不能为空!")){return false;}

    var description=$("textarea[name='g_description']").val();
 	if(isNull(description, "详细说明不能为空!")){return false;}

    var photoUrls = new Array();
   	$("#photos .item_photoBox img").each(function(i) {
            photoUrls[i]=$(this).attr("dbValue");
    });

    var goods = new Array();
   	$("#rgood_search .item_relevance_pro").each(function(i) {
            goods[i]=$(this).attr("value");
    });
    
    <#if good??>
    	var url="<@spring.url "/good/pos/${good.id}/edit" />";
    	<#else>
    	var url="<@spring.url "/good/pos/create" />";
    </#if>
    
    $.post(url, 
    	{ 'title': title,
			'secondTitle':secondTitle, 
			'keyWorlds':keyWorlds, 
			'posCategoryId': posCategoryId, 
			'factoryId': factoryId,
			'goodBrandName': goodBrandName, 
			'modelNumber': modelNumber, 
			'encryptCardWayId': encryptCardWayId,
			'signOrderWayId': signOrderWayId, 
			'cardTypes': cardTypes,
			'batteryInfo': batteryInfo, 
			'shellMaterial': shellMaterial,
			'price': price,
			'retailPrice': retailPrice, 
			'purchasePrice': purchasePrice, 
			'floorPrice': floorPrice,
			'floorPurchaseQuantity': floorPurchaseQuantity, 
			'leaseDeposit': leaseDeposit, 
			'leasePrice': leasePrice,
			'leaseTime': leaseTime, 
			'returnTime': returnTime, 
			'leaseDescription': leaseDescription, 
			'leaseAgreement': leaseAgreement,
			'channels': channels,
			'description': description,
			'photoUrls': photoUrls,
			'goods': goods
    	},
    	function(data){
    		if(data.code==1){
    			window.location.href="<@spring.url "/good/pos/list" />"
    		}
   		}
    );
    
}

function isNull(value, error){
	 if(!isNotNull(value)){
	 	showErrorTip(error);
	 	return true;
	 }
	 return false;
}

function isNotNull(value){
    return value != "" && value != null && value != undefined;
}

function isNotTwoDecimal(value, error){
	var re=/^\d+\.\d{2}$/;//2位小数
	if(isNotNull(value) && !(re.test(value))){
	 	showErrorTip(error);
		return true;
	}
	return false;
}

function fileChange(obj){
	var index = $(obj).attr("index");
  	var options = { 
        success: function(data){
			if(data.code==1){
				var img = $('#fileForm'+index).find(".item_photoBox img");
				if(img.length > 0){
					img.attr("value", "<@spring.url ""/>"+data.result);
					img.attr("dbValue", data.result);
				} else{
					var newImg = '<img src="<@spring.url "/resources/images/zp.jpg" />" class="cover" value="<@spring.url "" />'+data.result+'" dbValue="'+data.result+'">';
					$('#fileForm'+index).find(".item_photoBox")
						.append(newImg);
					$('#fileForm'+index).find(".item_photoBox a span").html("重新上传");
					infoTab('.cover','.img_info');
				}
			}
		},  
        resetForm: true, 
        dataType: 'json' 
    }; 
    $('#fileForm'+index).ajaxSubmit(options); 
    return false;
}

</script>
</@c.html>