package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Patient;
import Model.DataHealth;

public final class ShowGraph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"canvasjs-1.9.10-stable/canvasjs.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--style-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/wjRegisterStyle.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Prompt\" rel=\"stylesheet\">\n");
      out.write("        <title>ข้อมูล ECG</title>\n");
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
      out.write("                            นายแพทย์สวัสดี ทวีสุจจ</span>\n");
      out.write("                        <a href=\"#\"> ลงชื่ออก </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav menu\">\n");
      out.write("                <li class=\"active customWH\"><a href=\"/Watjai/ShowAllPatient\" > รายชื่อผู้ป่วยทั้งหมด</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/ShowDiaPatient\"> รายชื่อผู้ป่วยรอการวินิจฉัย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/RegisterPatient.jsp\"> ลงทะเบียนผู้ป่วย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"#\"> จัดการผู้ป่วย </a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div><!--/.sidebar-->\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    Patient p = (Patient) request.getAttribute("patObj");
                
      out.write("\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li><a href=\"/Watjai/ShowAllPatient\">รายชื่อผู้ป่วย</a></li>\n");
      out.write("                    <li><a href=\"/Watjai/ServletShowPatientInfo?idPat=");
      out.print(p.getPatId());
      out.write('"');
      out.write('>');
      out.print(p.getFname());
      out.write(' ');
      out.print(p.getLname());
      out.write("</a></li>\n");
      out.write("                    <!-- onclick='window.history.back()-->\n");
      out.write("                    <li class=\"active\">ข้อมูล</li>\n");
      out.write("                </ol>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">ข้อมูล</h1>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default di\">\n");
      out.write("                        ");

                            DataHealth dh = (DataHealth) request.getAttribute("dataObj");
                        
      out.write("\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td valign=\"bottom\" style=\"padding-left: 2em;\">\n");
      out.write("                                    วันที่\n");
      out.write("                                </td>\n");
      out.write("                                <td>    \n");
      out.write("                                    <input type=\"text\" class=\"info-pat\" placeholder=\"วันที่\" value=\"");
      out.print(dh.getMeasureTime());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td valign=\"bottom\" style=\"padding-left: 3.8em;\">    \n");
      out.write("                                    ID DataHealth\n");
      out.write("                                </td>\n");
      out.write("                                <td> \n");
      out.write("                                    <input type=\"text\" class=\"info-pat\" placeholder=\"ID\" value=\"");
      out.print(dh.getMeasureId());
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table><br><br>\n");
      out.write("                        <!--ID = ");
      out.print(dh.getMeasureId());
      out.write(" <br>\n");
      out.write("                        TIME =");
      out.print(dh.getMeasureTime());
      out.write(" <br>\n");
      out.write("                        DATA = ");
      out.print(dh.getMeasureData());
      out.write("<br>-->\n");
      out.write("\n");
      out.write("                        <div id=\"chartContainer\" style=\"height: 400px; width: 100%;\"></div>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            var xAxisStripLinesArray = [];\n");
      out.write("                            var yAxisStripLinesArray = [];\n");
      out.write("                            var dps = [];\n");
      out.write("                            var dataPointsArray = ");
      out.print(dh.getMeasureData());
      out.write(";\n");
      out.write("\n");
      out.write("\n");
      out.write("                            var chart = new CanvasJS.Chart(\"chartContainer\",\n");
      out.write("                                    {\n");
      out.write("\n");
      out.write("                                        axisY: {\n");
      out.write("                                            stripLines: yAxisStripLinesArray,\n");
      out.write("                                            gridThickness: 2,\n");
      out.write("                                            gridColor: \"#DC74A5\",\n");
      out.write("                                            lineColor: \"#DC74A5\",\n");
      out.write("                                            tickColor: \"#DC74A5\",\n");
      out.write("                                            labelFontColor: \"#DC74A5\",\n");
      out.write("                                            maximum: 5\n");
      out.write("                                        },\n");
      out.write("                                        axisX: {\n");
      out.write("                                            stripLines: xAxisStripLinesArray,\n");
      out.write("                                            gridThickness: 2,\n");
      out.write("                                            gridColor: \"#DC74A5\",\n");
      out.write("                                            lineColor: \"#DC74A5\",\n");
      out.write("                                            tickColor: \"#DC74A5\",\n");
      out.write("                                            labelFontColor: \"#DC74A5\"\n");
      out.write("                                        },\n");
      out.write("                                        data: [\n");
      out.write("                                            {\n");
      out.write("                                                type: \"spline\",\n");
      out.write("                                                color: \"black\",\n");
      out.write("                                                dataPoints: dps\n");
      out.write("                                            }\n");
      out.write("                                        ]\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                            addDataPointsAndStripLines();\n");
      out.write("                            chart.render();\n");
      out.write("\n");
      out.write("                            function addDataPointsAndStripLines() {\n");
      out.write("                                //dataPoints\n");
      out.write("                                for (var i = 0; i < dataPointsArray.length; i++) {\n");
      out.write("                                    dps.push({y: dataPointsArray[i]});\n");
      out.write("                                }\n");
      out.write("                                //StripLines\n");
      out.write("                                for (var i = 0; i < 3000; i = i + 0.1) {\n");
      out.write("                                    if (i % 1000 != 0)\n");
      out.write("                                        yAxisStripLinesArray.push({value: i, thickness: 0.7, color: \"#DC74A5\"});\n");
      out.write("                                }\n");
      out.write("                                for (var i = 0; i < 1400; i = i + 1) {\n");
      out.write("                                    if (i % 200 != 0)\n");
      out.write("                                        xAxisStripLinesArray.push({value: i, thickness: 0.7, color: \"#DC74A5\"});\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-default di\">\n");
      out.write("                       \n");
      out.write("                        &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;\n");
      out.write("                       <h3> <b>การ</b>วินิฉัยกราฟหัวใจมีความผิดปกติในเรื่องของ</h3>\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"checkArrhy\"><br>\n");
      out.write("\n");
      out.write("                                <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Arrhythmia  <br><br>\n");
      out.write("                                <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Bradyarrhythmia  <br><br>\n");
      out.write("                                <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Tachyarrhythmias  <br><br>\n");
      out.write("                                <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Irregular Heartbeat  <br><br>\n");
      out.write("                                <input type=\"radio\" name=\"arrhyType\" value=\"gx\"> Normal Heartbeat<br><br>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"comment\"> <h3> Comment:</h3></label>\n");
      out.write("                                <textarea class=\"form-control\" rows=\"6\" id=\"comment\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"submit-btn\"><br>\n");
      out.write("\n");
      out.write("                                <input formaction=\"ShowPats04.html\" type=\"submit\" value=\"Send Notification\">\n");
      out.write("                            </div>\n");
      out.write("                            <br><br>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
