/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 14:47:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showGoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" />\r\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../js/DatePicker.js\"></script>\r\n");
      out.write("<title>商品列表</title>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        function deleteGoods(id){\r\n");
      out.write("            var res = confirm(\"是否删除\");\r\n");
      out.write("            if(res==true){\r\n");
      out.write("                window.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/goods/deleteGoods.action?id=\"+id;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //条件查询\r\n");
      out.write("        $(function(){\r\n");
      out.write("            //给查询按钮 添加 点击事件\r\n");
      out.write("            $(\"#search\").click(function(){\r\n");
      out.write("                var name = $(\"input[name='name']\").val();\r\n");
      out.write("                var pubdate = $(\"input[name='pubdate']\").val();\r\n");
      out.write("\r\n");
      out.write("                //使用ajax 进行异步交互\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/goods/searchgoodslist.action?name=\"+name+\"&pubdate=\"+pubdate,\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    success:function(data){\r\n");
      out.write("                        if(data==0){\r\n");
      out.write("                            //alert(\"未找到指定内容\");\r\n");
      out.write("                            $(\"#tb_list\").html(\"<tr class='tr_head'><td>序号</td><td>商品名称</td><td>价格</td><td>上架时间</td><td>类型</td><td>描述</td><td>操作</td></tr>\");\r\n");
      out.write("\r\n");
      out.write("                        }else{\r\n");
      out.write("                            //showMsg(data);\r\n");
      out.write("                            var list = data;\r\n");
      out.write("                            $(\"#tb_list\").html(\"<tr class='tr_head'><td>序号</td><td>商品名称</td><td>价格</td><td>上架时间</td><td>类型</td><td>描述</td><td>操作</td></tr>\");\r\n");
      out.write("                            var i = 1;\r\n");
      out.write("                            for (var g in list) {\r\n");
      out.write("                                //声明 tr  td  对象\r\n");
      out.write("                                var tr = $(\"<tr></tr>\");\r\n");
      out.write("                                var td1 = $(\"<td>\" + (i++) + \"</td>\");\r\n");
      out.write("                                var td2 = $(\"<td>\"+list[g].name+\"</td>\");\r\n");
      out.write("                                var td3 = $(\"<td>\"+list[g].price+\"</td>\");\r\n");
      out.write("                                var td4 = $(\"<td>\"+list[g].pubdate+\"</td>\");\r\n");
      out.write("                                var td5 = $(\"<td>\"+list[g].typeName+\"</td>\");\r\n");
      out.write("                                var td6 = $(\"<td>\"+list[g].intro+\"</td>\");\r\n");
      out.write("\r\n");
      out.write("                                //将td 添加到tr中\r\n");
      out.write("                                tr.append(td1);\r\n");
      out.write("                                tr.append(td2);\r\n");
      out.write("                                tr.append(td3);\r\n");
      out.write("                                tr.append(td4);\r\n");
      out.write("                                tr.append(td5);\r\n");
      out.write("                                tr.append(td6);\r\n");
      out.write("                                $(\"#tb_list\").append(tr);\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error:function(XMLHttpRequest,textStatus,errorThrown){\r\n");
      out.write("                        alert(\"失败\"+XMLHttpRequest.status+\":\"+textStatus+\":\"+errorThrown);\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"row\" style=\"width:98%;margin-left: 1%;\">\r\n");
      out.write("\t<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t商品列表\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>商品名称</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>上架时间</span><!--  readonly=\"readonly\"   onclick=\"setday(this)\" -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"pubdate\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"search\"><span class=\"glyphicon glyphicon-search\"></span></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"height: 400px;overflow: scroll;\">\r\n");
      out.write("\t\t\t\t\t<table id=\"tb_list\" class=\"table table-striped table-hover table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>序号</td><td>商品名称</td><td>价格</td><td>上架时间</td><td>类型</td><td>描述</td><td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /admin/showGoods.jsp(108,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/showGoods.jsp(108,6) '${goodsList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${goodsList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /admin/showGoods.jsp(108,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("goods");
    // /admin/showGoods.jsp(108,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.pubdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.typeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<button onclick=\"deleteGoods(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\" class=\"btn btn-danger btn-sm\">删除</button>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-danger btn-sm\" data-toggle=\"modal\" data-target=\"#myModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">修改</button>&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<!-- 弹出模态框 -->\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"myModal");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span>&times;</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"modal-title\">修改商品</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/goods/updategoods.action\" method=\"post\" enctype=\"multipart/form-data\" class=\"form-horizontal\" style=\"padding:10px\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"motal-body\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">商品名</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">价格</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"price\" class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">日期</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" readonly=\"readonly\" name=\"pubdate\" class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.pubdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">商品类名</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"typeName\" class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.typeName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">商品星级</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"star\" class=\"form-control\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label>商品图片</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"file\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-2 control-label\">商品描述</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"intro\" class=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"motal-footer text-center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">修改</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
