/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-12-10 02:35:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editCourseInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/MavenRepository/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1541255405200L));
    _jspx_dependants.put("jar:file:/D:/MavenRepository/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
  }

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write(" <script src=\"js/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("    <link href=\"css/bootstrap/3.3.6/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"js/bootstrap/3.3.6/bootstrap.min.js\"></script>\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>课程管理页面 - 编辑页面</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"editDIV\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"panel panel-success\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <h3 class=\"panel-title\">编辑课程</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("            <form method=\"post\" id=\"editForm\" action=\"/updateCourseInfo\" role=\"form\">\r\n");
      out.write("                <table class=\"editTable\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>课程号：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"cno\" id=\"cno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${courseinfo.cno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                   placeholder=\"请在这里输入课程号\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>课程名：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"cname\" id=\"cname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${courseinfo.cname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请在这里输入课程名\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>学分：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"cedit\" id=\"cedit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${courseinfo.cedit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请在这里输入学分\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td>开设院系：</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"dept\" id=\"dept\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${courseinfo.dept}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请在这里输入开设院系\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        \r\n");
      out.write("                    <tr class=\"submitTR\">\r\n");
      out.write("                        <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${courseinfo.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write(" <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            $(\"#editForm\").submit(function () {\r\n");
      out.write("            \r\n");
      out.write("                if (!checkEmpty(\"cno\", \"课程号\"))\r\n");
      out.write("                    return false;\r\n");
      out.write("                if (!checkEmpty(\"cname\", \"课程名\"))\r\n");
      out.write("                    return false;\r\n");
      out.write("                if (!checkEmpty(\"cedit\", \"学分\"))\r\n");
      out.write("                    return false;\r\n");
      out.write("                if (!checkEmpty(\"dept\", \"开设院系\"))\r\n");
      out.write("                    return false;\r\n");
      out.write("                return true;\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        function checkEmpty(id, name) {\r\n");
      out.write("            var value = $(\"#\" + id).val();\r\n");
      out.write("            if (value.length == 0) {\r\n");
      out.write("                alert(name + \"不能为空\");\r\n");
      out.write("                $(\"#\" + id).focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
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
