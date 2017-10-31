package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Prompt\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--Style-->\n");
      out.write("        <link href=\"css/loginStyle.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Script tags-->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg\">\n");
      out.write("            <div class=\"slideInDown animated\">\n");
      out.write("                <center><img src=\"image/logoWithTitle.png\" class=\"logo\"></center>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <section id=\"login\">\n");
      out.write("                <div class=\"container flipInY animated\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12\">\n");
      out.write("                            <div class=\"form-wrap\">\n");
      out.write("\n");
      out.write("                                <form role=\"form\" action=\"ServletLogin\" method=\"post\" id=\"login-form\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label  class=\"sr-only\">Username</label>\n");
      out.write("                                        <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"key\" class=\"sr-only\">Password</label>\n");
      out.write("                                        <input type=\"password\" name=\"userpass\" id=\"key\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                        <span class=\"character-checkbox\" onclick=\"showPassword()\"></span>\n");
      out.write("                                        <span class=\"label\">Show password</span>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <input type=\"submit\" id=\"btn-login\" class=\"btn btn-custom btn-lg btn-block\" value=\"Log in\">\n");
      out.write("                              \n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- /.col-xs-12 -->\n");
      out.write("                    </div> <!-- /.row -->\n");
      out.write("                </div> <!-- /.container -->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function showPassword() {\n");
      out.write("\n");
      out.write("                var key_attr = $('#key').attr('type');\n");
      out.write("\n");
      out.write("                if (key_attr != 'text') {\n");
      out.write("\n");
      out.write("                    $('.checkbox').addClass('show');\n");
      out.write("                    $('#key').attr('type', 'text');\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("\n");
      out.write("                    $('.checkbox').removeClass('show');\n");
      out.write("                    $('#key').attr('type', 'password');\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
