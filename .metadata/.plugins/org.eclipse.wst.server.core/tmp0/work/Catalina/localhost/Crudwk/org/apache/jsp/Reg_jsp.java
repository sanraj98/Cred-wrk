/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-08-26 04:50:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Cred-wrk/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Crudwk/WEB-INF/lib/spring-webmvc-5.3.22.jar!/META-INF/spring-form.tld", Long.valueOf(1657768256000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.22.jar", Long.valueOf(1658834777668L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Register page</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("*{background-color:#1a1c2b;}\r\n");
      out.write(".fm form{\r\n");
      out.write("text-align:center;\r\n");
      out.write("opacity:0.8;\r\n");
      out.write("}\r\n");
      out.write(".fm h2{color:white;\r\n");
      out.write("margin-top:80px;\r\n");
      out.write("margin-left:40px}\r\n");
      out.write(".fm label{color:white;}\r\n");
      out.write(".fm label[for=sex]{margin-right:35px;}\r\n");
      out.write(".fm label[for=f]{margin-right:35px;}\r\n");
      out.write(".fm label[for=m]{margin-right:10px;}\r\n");
      out.write(".fm input[type=text]{background-color:white;\r\n");
      out.write("margin-left:5px;\r\n");
      out.write("padding:5px;}\r\n");
      out.write(".fm input[type=password]{\r\n");
      out.write("background-color:white;\r\n");
      out.write("margin-left:15px;\r\n");
      out.write("padding:5px;}\r\n");
      out.write(".fm input[type=email]{background-color:white;\r\n");
      out.write("margin-left:35px;\r\n");
      out.write("padding:5px;}\r\n");
      out.write(".fm input[type=date]{background-color:white;\r\n");
      out.write("width:10.5%;\r\n");
      out.write("padding:5px;\r\n");
      out.write("margin-left:30px;}\r\n");
      out.write(".fm input[type=submit]{border-radius:5px;\r\n");
      out.write("padding:7px;\r\n");
      out.write("background-color:#04AA6D;\r\n");
      out.write("border: 1px solid #ccc;\r\n");
      out.write("color:white;\r\n");
      out.write("cursor:pointer;\r\n");
      out.write("width:5%;\r\n");
      out.write("margin-left:45px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"fm\">\r\n");
      out.write("<form action=\"reg\" method=\"post\">\r\n");
      out.write("<h2>Register Form!</h2>\r\n");
      out.write("<label>User Name :</label><input type=\"text\" name=\"uN\" placeholder=\"enter ur name\"/><br><br>\r\n");
      out.write("<label>Password :</label><input type=\"password\" name=\"pas\" placeholder=\"enter ur new password \"/><br><br>\r\n");
      out.write("<label>Email :</label><input type=\"email\" name=\"emal\" placeholder=\"enter ur email\"/><br><br>\r\n");
      out.write("<label for=\"sex\">Sex :</label><input type=\"Radio\" value=\"Male\" name=\"sex\"/><label for=\"m\">Male</label><input type=\"Radio\" value=\"Female\" name=\"sex\"/><label for=\"f\">Female</label><br><br>\r\n");
      out.write("<label>Date :</label><input type=\"date\" name=\"dt\" value=\"2018-07-22\"\r\n");
      out.write("       min=\"1990-01-01\" max=\"2022-12-31\"><br><br>\r\n");
      out.write("<input type=\"submit\" value=\"Register\">\r\n");
      out.write("</form>\r\n");
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
