/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-12-10 02:29:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>增加学生信息</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("    .midbox{\r\n");
      out.write("\r\n");
      out.write("    text-align: center; /*让div内部文字居中*/\r\n");
      out.write("   \r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    \r\n");
      out.write("    width: 350px;\r\n");
      out.write("    height: 450px;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("   background-color:\t#E6E6FA;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("\r\n");
      out.write("background-position: center center;\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */\r\n");
      out.write("    background-attachment: fixed;  //此条属性必须设置否则可能无效/\r\n");
      out.write("    /* 让背景图基于容器大小伸缩 */\r\n");
      out.write("   background-size: cover;\r\n");
      out.write("   /* 设置背景颜色，背景图加载过程中会显示背景色 */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"midbox\">\r\n");
      out.write("<div class=\"navbar navbar-duomi navbar-static-top\" role=\"navigation\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("     <div class=\"navbar-header\">\r\n");
      out.write("       <a class=\"navbar-brand\" href=\"/Admin/index.html\" id=\"logo\">学籍管理系统</a>\r\n");
      out.write("     </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("         \r\n");
      out.write("    <div class=\"addDIV\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"panel panel-success\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <h3 class=\"panel-title\">增加学生</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("            <form method=\"post\" id=\"addForm\" action=\"/addStudentInfo\" role=\"form\">\r\n");
      out.write("                <table class=\"addTable\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>学号：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"sno\" id=\"sno\" placeholder=\"请在这里输入学号\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>姓名：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"sname\" id=\"sname\" placeholder=\"请在这里输入名字\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>年龄：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"age\" id=\"age\" placeholder=\"请在这里输入年龄\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td>班级号：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"class_no\" id=\"class_no\" placeholder=\"请在这里输入学生班级号\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td>电话号码：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"phone\" id=\"phone\" placeholder=\"请在这里输入电话\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>性别：</td>\r\n");
      out.write("                        <td><input type=\"radio\" checked class=\"radio radio-inline\" name=\"sex\" value=\"男\"> 男\r\n");
      out.write("                            <input type=\"radio\" class=\"radio radio-inline\" name=\"sex\" value=\"女\"> 女\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>出生日期：</td>\r\n");
      out.write("                        <td><input type=\"date\" name=\"birth_date\" id=\"birth_date\" placeholder=\"请在这里输入出生日期\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>入学日期：</td>\r\n");
      out.write("                        <td><input type=\"date\" name=\"attend_date\" id=\"attend_date\" placeholder=\"请在这里输入入学日期\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr class=\"submitTR\">\r\n");
      out.write("                        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">提 交</button>\r\n");
      out.write("                        </td>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div> \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
