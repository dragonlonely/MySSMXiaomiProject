<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
 
<title>个人中心-收货地址页面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login2.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function deleteAddr(id){
		var res = confirm("是否删除");
		if(res==true){
			window.location.href="${pageContext.request.contextPath }/address/deleteaddress.action?id="+id;
		}
	}
	function defaultAddr(id,level){
		var res = confirm("是否设为默认");
		if(res==true){
			window.location.href="${pageContext.request.contextPath }/address/defaultaddress.action?id="+id+"&level="+level;
			
		}
	}
</script>
</head>
<body>
<%@ include file="header.jsp"%>
<!--网站中间内容开始-->
<div id="dingdanxiangqing_body">
    <div id="dingdanxiangqing_body_big">
        <div id="big_left">
           	   <p style="font-size:18px;margin-top: 15px">订单中心</p>
               <a id="big_left_a" href="dingdanxiangqing.html">&nbsp;&nbsp;我的订单</a><br/>
               <a id="big_left_a" href="">&nbsp;&nbsp;意外保</a><br/>
               <a id="big_left_a" href="">&nbsp;&nbsp;团购订单</a><br/>
               <a id="big_left_a" href="">&nbsp;&nbsp;评价晒单</a><br/>
               <p style="font-size:18px;margin-top: 15px" href="">个人中心</p>
               <a id="big_left_a" href="${pageContext.request.contextPath }/self_show.jsp">&nbsp;&nbsp;个人资料</a><br/>
               <a id="big_left_a" href="">&nbsp;&nbsp;消息通知</a><br/>
               <a id="big_left_a" href="">&nbsp;&nbsp;优惠券</a><br/>
               <a id="big_left_a" href="${pageContext.request.contextPath }/self_info.jsp">&nbsp;&nbsp;收货地址</a><br/>
        </div>
     <div id="big_right" style="height: 500px;overflow: scroll;">
     
         <div style="margin:0 20px;">
	         <h3>收货地址</h3>
	         <hr>
	         <table class="table table-striped table-hover table-bordered">
				<tr>
					<th>序号</th><th>收件人</th>
					<th>手机号</th><th>地址</th>
					<th>操作</th>
				</tr>
				<c:forEach var="address" items="${addList}" varStatus="i" >
					<tr>
						<Td>${i.count}</Td>
						<td>${address.name}</td>
						<td>${address.phone}</td>
						<td>${address.detail}</td>
						<td>
							<button onclick="deleteAddr(${address.id})" class="btn btn-danger btn-sm">删除</button>&nbsp;&nbsp;
							<button class="btn btn-default btn-sm" data-toggle="modal" data-target="#myModal${address.id}">修改</button>&nbsp;&nbsp;
							<!-- 弹出模态框 -->
							
							<div class="modal fade" tabindex="-1" role="dialog" id="myModal${address.id}">
							  <div class="modal-dialog" role="document">
							    <div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span>&times;</span>
										</button>
										<h4 class="modal-title">修改地址</h4>
									</div>
									<form action="${pageContext.request.contextPath }/address/updateaddress.action" method="post" class="form-horizontal" style="padding:10px">
										<div class="motal-body">
											<div class="form-group">
												<label class="col-sm-2 control-label">收件人</label>
												<div class="col-sm-10">
													<input type="hidden" name="id" value="${address.id}">
													<input type="hidden" name="level" value="${address.level}">
													<input type="text" name="name" class="form-control" value="${address.name}">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">电话</label>
												<div class="col-sm-10">
													<input type="text" name="phone" class="form-control" value="${address.phone}">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label">详细地址</label>
												<div class="col-sm-10">
													<input type="text" name="detail" class="form-control" value="${address.detail}">
												</div>
											</div>
											
										</div>
										<div class="motal-footer text-center">
											<button type="submit" class="btn btn-primary">修改</button>
										</div>
									</form>
								</div>
							</div>
							</div>
							
							<button onclick="defaultAddr(${address.id},${address.level})" class="btn btn-primary btn-sm">设为默认</button>
							<c:if test="${address.level==1}">
								<span class="badge" style="background-color:red;">默认</span>
							</c:if>
							<c:if test="${address.level==0}">
								<span class="badge">普通</span>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br>
		<div class="container" style="width:960px;">
		
			<form action="${pageContext.request.contextPath }/address/addaddress.action" method="post" class="form-horizontal">
				<div class="form-group">
				    <label class="col-sm-2 form-label">收件人</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" name="name"/>
				    </div>
				</div>
		  		<div class="form-group">
				    <label class="col-sm-2 form-label">手机号</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" name="phone"/>
				    </div>
				</div>	
				<div class="form-group">
					<label class="col-sm-2 form-label">详细地址</label>
					 <div class="col-sm-8">
					 	<input type="text" class="form-control" name="detail"/>
					 </div>
				</div>
				<div class="form-group col-md-12">
					<input type="submit" class="btn btn-primary" value="添加地址">
				</div>
				<div class="form-group col-md-12" style="color:red">
					${msg }
				</div>
				
				<input type="hidden" value="${loginUser.id}" name="uid">
			</form>
	      </div>
       </div>
    </div>
</div>
	
<!-- 底部 -->
<%@ include file="footer.jsp"%>

</body>
</html>