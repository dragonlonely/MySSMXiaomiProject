/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 14:24:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1537494909000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1546918003478L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/login2.css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>小米商城首页</title>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/goods/getgoodstypelist.action\",\r\n");
      out.write("\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tfor(var i in data){//i是索引\r\n");
      out.write("\t\t\t\t\tvar a = $(\"<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/goods/getgoodsbytypeid.action?typeId=\"+data[i].id+\"'>\"+data[i].name+\"</a>\");\r\n");
      out.write("\t\t\t\t\t$(\"#goodsType\").append(a);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\talert(\"失败\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\t\t\r\n");
      out.write(" <div id=\"top\">\r\n");
      out.write("    \t<div id=\"topdiv\">\r\n");
      out.write("            <span>\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\" id=\"a_top\" target=\"_blank\">小米商城</a>\r\n");
      out.write("                <li>|</li>\r\n");
      out.write("                <a href=\"\" id=\"a_top\">小米商城移动版</a>\r\n");
      out.write("                <li>|</li>\r\n");
      out.write("                <a href=\"\" id=\"a_top\">问题反馈</a>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span style=\"float:right\">\r\n");
      out.write("           \t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       \t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <li>|</li>\r\n");
      out.write("                <a href=\"https://account.xiaomi.com/pass/serviceLogin?callback=https%3A%2F%2Forder.mi.com%2Flogin%2Fcallback%3Ffollowup%3Dhttps%253A%252F%252Forder.mi.com%252Fmessage%252Flist%26sign%3DMjEyY2NkOTg5NjAzZmMyNWUyMDBhNzE2MDczNWJkYzFkMTg1Yjc0MQ%2C%2C&sid=mi_eshop&_bannerBiz=mistore&_qrsize=180\" id=\"a_top\">消息通知</a>\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cart/getcart.action\" id=\"shorpcar\">购物车</a>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div id=\"second\">\r\n");
      out.write("\t    <a href=\"\" id=\"seimg\" style=\" margin-top:23px;\"><img id=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/logo_top.png\" width=\"55\" height=\"54\"/></a>\r\n");
      out.write("        <a href=\"\" id=\"seimg\" style=\" margin-top:17px;\"><img id=\"gif\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/yyymix.gif\" width=\"180\" height=\"66\" /></a>\r\n");
      out.write("        <p id=\"goodsType\">\r\n");
      out.write("\t\t\t<!-- 根据ajax 回调函数 填写数据 到此id中 -->\r\n");
      out.write("        </p>\r\n");
      out.write("       <form class=\"form-inline pull-right\" style=\"margin-top: 40px;margin-right: 10px;\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/goods/searchgoods.action\" method=\"get\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t    ");
      out.write("\r\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" style=\"width: 400px\"  placeholder=\"搜索一下好东西...\" name=\"goodsname\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <button type=\"submit\" class=\"btn btn-warning\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;&nbsp;搜索</button>\r\n");
      out.write("\t  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--网站中间内容开始-->\r\n");
      out.write("<div id=\"thred\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/banner2.jpg\" width=\"1230\" height=\"460\" />\r\n");
      out.write("</div>\r\n");
      out.write("   <div id=\"forth\">\r\n");
      out.write("   \t\t<span>\r\n");
      out.write("        \t<a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_01.gif\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_02.gif\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_03.gif\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_04.gif\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_05.gif\" /></a>\r\n");
      out.write("            <a href=\"\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hjh_06.gif\" /></a>\r\n");
      out.write("        </span>\r\n");
      out.write("        <a href=\"\" id=\"a_left\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/hongmi4x.png\" width=\"316\" height=\"170\" /></a>\r\n");
      out.write("        <a href=\"\" id=\"a_left\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/xiaomi5.jpg\" width=\"316\" height=\"170\" /></a>\r\n");
      out.write("    \t<a href=\"\" id=\"a_left\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinghengche.jpg\" width=\"316\" height=\"170\" /></a>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div id=\"fifth\">\r\n");
      out.write("   \t\t<span id=\"fif_text\">小米明星单品</span>\r\n");
      out.write("   </div>\r\n");
      out.write("    <div id=\"sixth\">\r\n");
      out.write("            <span style=\"margin-left:0px; border-top:#ffa500 1px solid\">\r\n");
      out.write("            \t<a href=\"\" id=\"siximg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinpai1.png\" width=\"234\" height=\"234\" /></a>\r\n");
      out.write("            \t<a href=\"\" id=\"na\">小米MIX</a>\r\n");
      out.write("                <p id=\"chip\">5月9日-21日享花呗12期分期免息</p>\r\n");
      out.write("                <p id=\"pri\">3499元起</p>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span style=\" border-top:#008000 1px solid\">\r\n");
      out.write("            \t<a href=\"\" id=\"siximg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinpai2.png\" width=\"234\" height=\"234\" /></a>\r\n");
      out.write("                <a href=\"\" id=\"na\">小米MIX</a>\r\n");
      out.write("                <p id=\"chip\">5月9日-21日享花呗12期分期免息</p>\r\n");
      out.write("                <p id=\"pri\">3499元起</p>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span style=\"border-top:#0000ff 1px solid\">\r\n");
      out.write("            \t<a href=\"\" id=\"siximg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinpai3.png\" width=\"234\" height=\"234\" /></a>\r\n");
      out.write("                <a href=\"\" id=\"na\">小米MIX</a>\r\n");
      out.write("                <p id=\"chip\">5月9日-21日享花呗12期分期免息</p>\r\n");
      out.write("                <p id=\"pri\">3499元起</p>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span style=\"border-top:#ff0000 1px solid\">\r\n");
      out.write("            \t<a href=\"\" id=\"siximg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinpai4.png\" width=\"234\" height=\"234\" /></a>\r\n");
      out.write("                <a href=\"\" id=\"na\">小米MIX</a>\r\n");
      out.write("                <p id=\"chip\">5月9日-21日享花呗12期分期免息</p>\r\n");
      out.write("                <p id=\"pri\">3499元起</p>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span style=\"border-top:#008080 1px solid\">\r\n");
      out.write("            \t<a href=\"\" id=\"siximg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/pinpai5.png\" width=\"234\" height=\"234\" /></a>\r\n");
      out.write("                <a href=\"\" id=\"na\">小米MIX</a>\r\n");
      out.write("                <p id=\"chip\">5月9日-21日享花呗12期分期免息</p>\r\n");
      out.write("                <p id=\"pri\">3499元起</p>\r\n");
      out.write("            </span>\r\n");
      out.write("    </div>\r\n");
      out.write("   <!-- 底部 -->\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!--网站版权部分开始-->\r\n");
      out.write(" <div id=\"seventh\">\r\n");
      out.write("    \t<p id=\"sevep\">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</p>\r\n");
      out.write("        <p id=\"sevep\">©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</p>\r\n");
      out.write("        <p id=\"sevep\">违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p>\r\n");
      out.write(" </div>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /header.jsp(34,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                <a href=\"/login.jsp\" id=\"a_top\">登录</a>\r\n");
        out.write("\t                <li>|</li>\r\n");
        out.write("\t                <a href=\"/register.jsp\" id=\"a_top\">注册</a>\r\n");
        out.write("           \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /header.jsp(39,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty user}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("       \t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/self_show.jsp\" id=\"a_top\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("       \t\t\t\t<li>|</li>\r\n");
        out.write("       \t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/user/logout.action\" onclick=\"return confirm('确定要注销吗?')\" id=\"a_top\">注销</a>\r\n");
        out.write("       \t\t\t\t<li>|</li>\r\n");
        out.write("       \t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/order/getorderlist.action\" id=\"a_top\">我的订单</a>\r\n");
        out.write("       \t\t\t\t<li>|</li>\r\n");
        out.write("       \t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/address/getaddress.action\" id=\"a_top\">地址管理</a>\r\n");
        out.write("       \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
