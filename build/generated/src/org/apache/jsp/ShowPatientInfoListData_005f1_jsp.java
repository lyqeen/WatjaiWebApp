package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.DataHealth;
import java.util.List;
import Model.Patient;

public final class ShowPatientInfoListData_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>ข้อมูลประจำตัวผู้ป่วย</title>\n");
      out.write("\n");
      out.write("        <!--style-->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/wjdiapatStyle.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Prompt\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Script-->\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
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
      out.write("                            นายแพทย์สวัสดี ทวีสุจ</span>\n");
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
      out.write("                <li class=\"active customWH\"><a href=\"/Watjai/ShowAllPatient\" > รายชื่อผู้ป่วยทั้งหมด</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/ShowDiaPatient\"> รายชื่อผู้ป่วยรอการวินิจฉัย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"/Watjai/RegisterPatient.jsp\"> ลงทะเบียนผู้ป่วย</a></li>\n");
      out.write("                <li class=\"customWH\"><a href=\"#\"> จัดการผู้ป่วย </a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div><!--/.sidebar-->\n");
      out.write("\n");
      out.write("        <!-- content-->\n");
      out.write("        ");

            Patient p = (Patient) request.getAttribute("patObj");
        
      out.write("\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li><a href=\"/Watjai/ShowAllPatient\">รายชื่อผู้ป่วย</a></li>\n");
      out.write("                    <li class=\"active\">");
      out.print(p.getFname());
      out.write(' ');
      out.print(p.getLname());
      out.write("</li>\n");
      out.write("                </ol>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("            <!-- title main -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">ประวัติผู้ป่วย</h1>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 \">\n");
      out.write("                    <div class=\"panel panel-default di\">\n");
      out.write("                        <div class=\"panel-body ti\">\n");
      out.write("                            <form method=\"post\">\n");
      out.write("                                <table  border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td rowspan=\"4\"  width=\"180px\"><img src=\"image/uesr_image.png\" class=\"img-circle \"  width=\"150\" height=\"150\"></td>\n");
      out.write("\n");
      out.write("                                        <td width=\"90px\" valign=\"bottom\" >\n");
      out.write("                                            ชื่อ-นามสกุล\n");
      out.write("                                        </td>\n");
      out.write("                                        <td >    \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" value=\"");
      out.print(p.getFname());
      out.write(' ');
      out.print(p.getLname());
      out.write("\" readonly>\n");
      out.write("                                        </td>\n");
      out.write("\n");
      out.write("                                        <td  width=\"90px\" valign=\"bottom\">\n");
      out.write("                                            อายุ  \n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" placeholder=\"อายุ\" value=\"");
      out.print(p.getBirthdate());
      out.write("\">\n");
      out.write("                                        </td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"\" valign=\"bottom\" class=\"text-right mdtext\">\n");
      out.write("                                            เพศ\n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" placeholder=\"เพศ\" value=\"");
      out.print(p.getSex());
      out.write("\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td valign=\"bottom\"> \n");
      out.write("                                            โรคประจำตัว\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>     \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" placeholder=\"โรคประจำตัว\" value=\"");
      out.print(p.getUnderlyingDisease());
      out.write("\" readonly></td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"\" valign=\"bottom\" class=\"text-right mdtext\">\n");
      out.write("                                            กรุ๊ปเลือด\n");
      out.write("                                        </td>\n");
      out.write("                                        <td> \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" placeholder=\"กรุ๊ปเลือด\" value=\"");
      out.print(p.getBloodType());
      out.write("\">\n");
      out.write("                                        </td>\n");
      out.write("                                        <td valign=\"bottom\"> \n");
      out.write("                                            เบอร์โทร\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>     \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\"\n");
      out.write("                                                   placeholder=\"เบอร์โทร\" value=\"");
      out.print(p.getPatTel());
      out.write("\" readonly></td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr >\n");
      out.write("                                        <td valign=\"bottom\"> \n");
      out.write("                                            ที่อยู่\n");
      out.write("                                        </td>\n");
      out.write("                                        <td colspan=\"3\">     \n");
      out.write("                                            <input type=\"text\" class=\"info-pat\" placeholder=\"ที่อยู่\"\n");
      out.write("                                                   value=\"");
      out.print(p.getAddress());
      out.write(' ');
      out.print(p.getSubDistrict());
      out.write(' ');
      out.print(p.getDistrict());
      out.write(' ');
      out.print(p.getProvince());
      out.write("\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body si\">\n");
      out.write("                            <ul id=\"myTab\" class=\"nav nav-tabs\">\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <a href=\"#home\" data-toggle=\"tab\">ข้อมูลทั้งหมด</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"#unread\" data-toggle=\"tab\">ข้อมูลการเต้นผิดปกติของหัวใจ ยังไม่ได้ตรวจสอบ</a></li>\n");
      out.write("                                <li><a href=\"#all\" data-toggle=\"tab\">ข้อมูลการเต้นผิดปกติของหัวใจ</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                $(document).on('click', '#refresh', function () {\n");
      out.write("                                    var $link = $('li.active a[data-toggle=\"tab\"]');\n");
      out.write("                                    $link.parent().removeClass('active');\n");
      out.write("                                    var tabLink = $link.attr('href');\n");
      out.write("                                    $('#myTab a[href=\"' + tabLink + '\"]').tab('show');\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                                $('a[data-toggle=\"tab\"]').on('shown.bs.tab', function () {\n");
      out.write("                                    $('.show-time').html(new Date().toLocaleTimeString());\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"tab-pane fade in active\" id=\"home\">\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("\n");
      out.write("                                                <!--title header-->\n");
      out.write("                                                <tr class=\"\" height=\"40px\">\n");
      out.write("                                                    <th class=\"col-xs-4 text-center\">ID </th>\n");
      out.write("                                                    <th class=\"col-xs-8 text-center\">วันที่ส่ง</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");

                                                    List<DataHealth> dhlist = (List) request.getAttribute("dataList");
                                                    int i = 1;
                                                    if (dhlist != null) {
                                                        for (DataHealth d : dhlist) {
                                                
      out.write("\n");
      out.write("                                                <tr  onclick=\"window.document.location = 'ServeletShowGraph?idMea=");
      out.print(d.getMeasureId());
      out.write("&idPat=");
      out.print(p.getPatId());
      out.write("';\">\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(d.getMeasureId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(d.getMeasureTime());
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                    }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"unread\">\n");
      out.write("                                  \n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("\n");
      out.write("                                                <!--title header-->\n");
      out.write("                                                <tr class=\"\" height=\"40px\">\n");
      out.write("                                                    <th class=\"col-xs-4 text-center\">ID </th>\n");
      out.write("                                                    <th class=\"col-xs-8 text-center\">วันที่และเวลาที่แจ้งเตือน</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");

                                                    List<DataHealth> listUnread = (List) request.getAttribute("dataUnread");

                                                    if (listUnread != null) {
                                                        for (DataHealth unread : listUnread) {
                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                <tr  onclick=\"window.document.location = 'ShowGraphAbnormal?idPat=");
      out.print(p.getPatId());
      out.write("&idMea=");
      out.print(unread.getMeasureId());
      out.write("';\">\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(unread.getMeasureId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(unread.getMeasureTime());
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                    }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"all\">\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-hover\">\n");
      out.write("                                            <thead>\n");
      out.write("\n");
      out.write("                                                <!--title header-->\n");
      out.write("                                                <tr class=\"\" height=\"40px\">\n");
      out.write("                                                    <th class=\"col-xs-4 text-center\">ID </th>\n");
      out.write("                                                    <th class=\"col-xs-8 text-center\">วันที่และเวลาที่แจ้งเตือน</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");

                                                    List<DataHealth> dhm = (List) request.getAttribute("dataMea");

                                                    if (dhm != null) {
                                                        for (DataHealth dm : dhm) {
                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                <tr  onclick=\"window.document.location = 'ShowGraogRead?idPat=");
      out.print(p.getPatId());
      out.write("&idMea=");
      out.print(dm.getMeasureId());
      out.write("';\">\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(dm.getMeasureId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(dm.getMeasureTime());
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                    }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
