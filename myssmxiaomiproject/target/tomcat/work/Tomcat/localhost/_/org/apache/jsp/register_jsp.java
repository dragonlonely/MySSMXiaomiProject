/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 14:29:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.validate.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/messages_zh.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/login.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/login2.css\">\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#username\").change(function () {\r\n");
      out.write("                //使用ajax 做username 的异步验证 checkUsername?username=xxxx\r\n");
      out.write("                $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/checkusername.action?username=\" + this.value + \"&num=\" + Math.random(), function (data) {\r\n");
      out.write("                    //alert(data);\r\n");
      out.write("                    if (data != \"0\") {\r\n");
      out.write("                        $(\"#usernameMsg\").html(\"用户名已经存在\").css(\"color\", \"red\");\r\n");
      out.write("                        $(\"#registerBtn\").attr(\"disabled\", true);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        $(\"#usernameMsg\").html(\"用户名可用\").css(\"color\", \"green\");\r\n");
      out.write("                        $(\"#registerBtn\").removeAttr(\"disabled\");\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $(\"#form1\").validate({\r\n");
      out.write("                rules: {\r\n");
      out.write("                    username: \"required\",\r\n");
      out.write("                    password: {\r\n");
      out.write("                        required: true,\r\n");
      out.write("                        rangelength: [6, 12]\r\n");
      out.write("                    },\r\n");
      out.write("                    repassword: {\r\n");
      out.write("                        equalTo: \"#password\"\r\n");
      out.write("                    },\r\n");
      out.write("                    email: {\r\n");
      out.write("                        required: true,\r\n");
      out.write("                        email: true\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                messages: {\r\n");
      out.write("                    username: null,\r\n");
      out.write("                    password: {\r\n");
      out.write("                        required: \"密码不能为空\",\r\n");
      out.write("                        rangelength: \"密码长度{0}-{1}位\"\r\n");
      out.write("                    },\r\n");
      out.write("                    repassword: {\r\n");
      out.write("                        equalTo: \"两次密码不一致\"\r\n");
      out.write("                    },\r\n");
      out.write("                    email: {\r\n");
      out.write("                        required: \"邮箱不能空\",\r\n");
      out.write("                        email: \"邮箱格式不正确\"\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //发送短信验证码\r\n");
      out.write("            $(\"#validCode\").click(function(){\r\n");
      out.write("                var phone = $(\"input[name='phone']\").val();\r\n");
      out.write("                if(phone==\"\"){\r\n");
      out.write("                    alert(\"手机号不能为空\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                //使用ajax 进行异步交互\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sms/msg.action?phone=\"+phone,\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    success:function(data){\r\n");
      out.write("                        if(data.length>0){\r\n");
      out.write("                            alert(\"验证码发送成功\");\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>注册</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"regist\">\r\n");
      out.write("    <div class=\"regist_center\">\r\n");
      out.write("        <div class=\"regist_top\">\r\n");
      out.write("            <div class=\"left fl\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;会员注册</div>\r\n");
      out.write("            <div class=\"right fr\">\r\n");
      out.write("                <a href=\"index.jsp\" target=\"_black\">小米商城</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("            <div class=\"xian center\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"center-block\" style=\"margin-top: 30px;\">\r\n");
      out.write("            <form id=\"form1\" class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/register.action\"\r\n");
      out.write("                  method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">用户名</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"text\" id=\"username\" name=\"username\" class=\"form-control col-sm-10\"\r\n");
      out.write("                               placeholder=\"Username\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <p class=\"text-danger\"><span class=\"help-block \" id=\"usernameMsg\"></span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">密码</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\"\r\n");
      out.write("                               class=\"form-control col-sm-10\" placeholder=\"Password\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <p class=\"text-danger\">\r\n");
      out.write("                            <label id=\"password-error\" class=\"error\" for=\"password\"></label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">确认密码</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"password\" name=\"repassword\" class=\"form-control col-sm-10\"\r\n");
      out.write("                               placeholder=\"Password Again\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">邮箱</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control col-sm-10\"\r\n");
      out.write("                               placeholder=\"Email\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <p class=\"text-danger\"><label id=\"email-error\" class=\"error\" for=\"email\"></label></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">手机号</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"text\" name=\"phone\" id=\"phone\" class=\"form-control col-sm-10\"\r\n");
      out.write("                               placeholder=\"Phone\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <p class=\"text-danger\"><label id=\"phone-error\" class=\"error\" for=\"phone\"></label></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">手机验证码</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <input type=\"text\" name=\"validCode\" class=\"form-control col-sm-10\" placeholder=\"请输入验证码\"/>&nbsp;&nbsp;\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                               ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        <input type=\"button\" value=\"获取手机验证码\" class=\"btn btn-primary\" id=\"validCode\"></input>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"col-sm-2 control-label\">性别</label>\r\n");
      out.write("                    <div class=\"col-sm-8\" style=\"width: 40%\">\r\n");
      out.write("                        <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("                                                            name=\"gender\" value=\"男\" checked=\"checked\"> 男\r\n");
      out.write("                        </label> <label class=\"radio-inline\"> <input type=\"radio\"\r\n");
      out.write("                                                                     name=\"gender\" value=\"女\"> 女\r\n");
      out.write("                    </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-2\">\r\n");
      out.write("                        <p class=\"text-danger\"><span id=\"helpBlock\" class=\"help-block \">你是帅哥 还是美女</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-sm-7 col-sm-push-2\">\r\n");
      out.write("                        <input id=\"registerBtn\" type=\"submit\" value=\"注册\" class=\"btn btn-primary  btn-lg\"\r\n");
      out.write("                               style=\"width: 200px;\"/> &nbsp; &nbsp;\r\n");
      out.write("                        <input type=\"reset\" value=\"重置\" class=\"btn btn-default  btn-lg\" style=\"width: 200px;\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"text-center\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registerMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
