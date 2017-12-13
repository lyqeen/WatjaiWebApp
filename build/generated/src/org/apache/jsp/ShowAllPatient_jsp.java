package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Patient;
import java.util.List;

public final class ShowAllPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <!--style-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/stylesShowAllPatient.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Prompt\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>WATJAI - รายชื่อผู้ป่วยทั้งหมด</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                        <img alt=\"WATJAI\" src=\"image/logoweb02.png\" width=\"150\" style=\"margin-top: -0.2em;\">\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"pull-right logout\">\n");
      out.write("                        <span style=\"color: #00939a;font-size: 12pt;\">\n");
      out.write("                            นายแพทย์สวัสดี ทวีสุจจ </span>\n");
      out.write("                        <a href=\"Login.jsp\" style=\"color: white\"> ลงชื่อออก </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- side bar -->\n");
      out.write("\n");
      out.write("        <div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav menu\">\n");
      out.write("                <li class=\"active customWH\"><a href=\"/Watjai/ShowAllPatient\"> รายชื่อผู้ป่วยทั้งหมด</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/ShowDiaPatient\"> รายชื่อผู้ป่วยรอการวินิจฉัย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/RegisterPatient.jsp\"> ลงทะเบียนผู้ป่วย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"#\"> จัดการผู้ป่วย </a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div><!--/.sidebar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- content-->\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li class=\"active\">รายชื่อผู้ป่วยทั้งหมด</a></li>\n");
      out.write("\n");
      out.write("                </ol>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("            <!-- title main -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">รายชื่อผู้ป่วยทั้งหมด</h1>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("            <!--table-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <table class=\"table table-hover order-table\">\n");
      out.write("                            <thead>\n");
      out.write("\n");
      out.write("                                <!--Search-->\n");
      out.write("                                <tr style=\"height: 3.5em;\">\n");
      out.write("                                    <!--search image-->\n");
      out.write("                                    <td class=\"textcenter\">\n");
      out.write("                                        <img src=\"image/search.png\" style=\"\n");
      out.write("                                             height: 18px;\n");
      out.write("                                             margin-top: 8px;\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                    <!--filter search-->\n");
      out.write("                                    <td style=\"padding-top: 1em;\">\n");
      out.write("                                        <div class=\"test\">\n");
      out.write("                                            <input type=\"search\" class=\"light-table-filter\" data-table=\"order-table\" placeholder=\"Search\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <!--title header-->\n");
      out.write("                                <tr class=\"ji\">\n");
      out.write("                                    <th class=\"col-xs-1 text-center\">#</th>\n");
      out.write("                                    <th class=\"col-xs-5\">ชื่อ-นามสกุล</th>\n");
      out.write("                                   \n");
      out.write("                                    <th class=\"col-xs-2 text-center\">รหัสผู้ป่วย</th>\n");
      out.write("                           \n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("\n");
      out.write("                            ");

                                List<Patient> plist = (List) request.getAttribute("patinetList");
                                int i = 1;
                                if (plist != null) {
                                    for (Patient pa : plist) {

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tbody>                                    \n");
      out.write("                                <tr onclick=\"window.document.location = 'ServletShowPatientInfo?idPat=");
      out.print(pa.getPatId());
      out.write("';\">  \n");
      out.write("                              \n");
      out.write("                            <td class=\"text-center\"> ");
      out.print(i);
      out.write(" </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <a href=\"#\" class=\"pull-left\">\n");
      out.write("                                        <img src=\"https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg\" class=\"media-photo\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        ");
      out.print(pa.getFname());
      out.write(' ');
      out.write(' ');
      out.print(pa.getLname());
      out.write("\n");
      out.write("                                        <p class=\"summary\">โรคประจำตัว ");
      out.print(pa.getUnderlyingDisease());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                           \n");
      out.write("                            <td class=\"text-center\">");
      out.print(pa.getPatId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                            </tr>\n");
      out.write("                            </tbody>\n");
      out.write("\n");
      out.write("                            ");
 i++;
                                    }
                                } else {
                                    System.out.println("no info");
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("        </div>   \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            (function (document) {\n");
      out.write("                'use strict';\n");
      out.write("\n");
      out.write("                var LightTableFilter = (function (Arr) {\n");
      out.write("\n");
      out.write("                    var _input;\n");
      out.write("\n");
      out.write("                    function _onInputEvent(e) {\n");
      out.write("                        _input = e.target;\n");
      out.write("                        var tables = document.getElementsByClassName(_input.getAttribute('data-table'));\n");
      out.write("                        Arr.forEach.call(tables, function (table) {\n");
      out.write("                            Arr.forEach.call(table.tBodies, function (tbody) {\n");
      out.write("                                Arr.forEach.call(tbody.rows, _filter);\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    function _filter(row) {\n");
      out.write("                        var text = row.textContent.toLowerCase(), val = _input.value.toLowerCase();\n");
      out.write("                        row.style.display = text.indexOf(val) === -1 ? 'none' : 'table-row';\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return {\n");
      out.write("                        init: function () {\n");
      out.write("                            var inputs = document.getElementsByClassName('light-table-filter');\n");
      out.write("                            Arr.forEach.call(inputs, function (input) {\n");
      out.write("                                input.oninput = _onInputEvent;\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                })(Array.prototype);\n");
      out.write("\n");
      out.write("                document.addEventListener('readystatechange', function () {\n");
      out.write("                    if (document.readyState === 'complete') {\n");
      out.write("                        LightTableFilter.init();\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            })(document);\n");
      out.write("        </script>\n");
      out.write("\n");
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
