/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 14:46:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("\t    <!-- Bootstrap -->\r\n");
      out.write("\t    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t    <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("\t    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<title>登录</title>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#eye\").click(function(){\r\n");
      out.write("\t\t\t\tif($(\"#password\").attr(\"type\")==\"password\"){\r\n");
      out.write("\t\t\t\t\t$(\"#password\").attr(\"type\",\"text\");\r\n");
      out.write("\t\t\t\t\t$(\"#eye\").attr(\"class\",\"glyphicon glyphicon-eye-close\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#password\").attr(\"type\",\"password\");\r\n");
      out.write("\t\t\t\t\t$(\"#eye\").attr(\"class\",\"glyphicon glyphicon-eye-open\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#main{\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\twidth: 400px;\r\n");
      out.write("\t\t\theight: 300px;\r\n");
      out.write("\t\t\tleft:50%;\r\n");
      out.write("\t\t\ttop:40%;\r\n");
      out.write("\t\t\tmargin-left: -200px;\r\n");
      out.write("\t\t\tmargin-top: -100px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"main\" class=\"panel panel-primary\">\r\n");
      out.write("\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t<div class=\"panel-title\">\r\n");
      out.write("\t\t\t后台登录\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"panel-body\">\r\n");
      out.write("\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<img src=\"../image/mistore_logo.png\" alt=\"logo\" width=\"30%\" height=\"30%\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/adminLogin.action\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label>用户名:</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"username\" id=\"\" class=\"form-control\" placeholder=\"请输入用户名\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label>密&nbsp;&nbsp;&nbsp;码:</label>\r\n");
      out.write("\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\"  placeholder=\"请输入密码\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-eye-open\" id=\"eye\"></span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"登录\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"重置\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
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
}
