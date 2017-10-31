package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testCanvas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <script type=\"text/javascript\" src=\"canvasjs-1.9.10-stable/canvasjs.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Test Canvas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <div id=\"chartContainer\" style=\"height: 400px; width: 100%;\"></div>\n");
      out.write("       \n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("      var xAxisStripLinesArray = [];\n");
      out.write("var yAxisStripLinesArray = [];\n");
      out.write("var dps = [];\n");
      out.write("var dataPointsArray = [2.28,2.34,1.57,1.49,1.73,1.71,1.81,1.78,1.8,1.83,1.8,1.94,1.85,1.87,1.41,1.31,1.47,1.83,1.95,2.46,1.77,1.48,1.59,1.7,1.75,1.71,1.82,1.74,1.87,1.79,1.98,1.71,0.94,1.87,1.49,1.68,1.96,2.34,1.96,1.41,1.49,1.71,1.68,1.79,1.7,1.88,1.81,1.79,1.29,1.36,1.46,1.74,2.01,2.41,1.77,1.4,1.63,1.66,1.83,1.71,1.89,1.87,1.83,1.49,4.66,1.34,1.67,1.89,2.25,2.31,1.41,1.6,1.65,1.85,1.73,1.88,1.78,1.95,1.86,1.84,3.06,1.13,1.6,1.79,2.14,2.42,1.71,1.46,1.75,1.71,1.85,1.75,1.87,1.83,1.88,1.96,1.82,1.71,4.83,1.41,1.6,1.93,2.13,2.45,1.49,1.61,1.65,1.79,1.75,1.78,1.82,1.8,1.88,1.84,1.96,1.72,2,1.1,1.56,1.71,2.04,2.38,1.79,1.44,1.61,1.74,1.72,1.8,1.74,1.87,1.75,1.91,1.88,1.86,1.33,4.17,1.35,1.7,1.89,2.23,2.31,1.44,1.6,1.63,1.82,1.7,1.84,1.79,1.88,1.81,1.93,1.84,1.79,4.22,1.17,1.64,1.78,2.17,2.39,1.66,1.45,1.71,1.7,1.81,1.75,1.82,1.83,1.81,1.87,1.9,1.87,1.49,4.72,1.32,1.73,1.83,2.27,2.33,1.52,1.52,1.69,1.78,1.75,1.84,1.77,1.9,1.79,1.95,1.9,1.89,1.47,4.6,1.35,1.68,1.89,2.21,2.4,1.45,1.6,1.63,1.83,1.72,1.86,1.77,1.89,1.81,1.89,1.95,1.84,1.28,3.75,1.44,1.63,1.95,2.21,2.35,1.4,1.61,1.64,1.8,1.75,1.79,1.82,1.8,1.87,1.83,1.96,1.74,2,1.14,1.61,1.73,2.09,2.42,1.8,1.44,1.6,1.76,1.74,1.81,1.74,1.88,1.76,2,1.74,1.64,4.8,1.38,1.64,1.89,2.25,2.33,1.51,1.5,1.74,1.72,1.84,1.73,1.88,1.79,1.91,1.94,1.83,1.32,4.04,1.42,1.64,1.94,2.23,2.35,1.41,1.62,1.64,1.83,1.75,1.83,1.81,1.84,1.85,1.85,2,1.76,1.08,2.88,1.49,1.64,1.98,2.28,2.21,1.43,1.58,1.7,1.75,1.83,1.75,1.87,1.76,1.91,1.82,1.97,1.74,2.54,1.09,1.59,1.78,2.07,2.52,1.69,1.48,1.57,1.8,1.72,1.86,1.76,1.89,1.79,1.99,1.78,1.53,4.67,1.35,1.7,1.87,2.34,2.29,1.51,1.47,1.74,1.72,1.84,1.75,1.84,1.83,1.85,1.91,1.91,1.84,1.09,1.56,1.43,1.8,1.92,2.47];\n");
      out.write("\n");
      out.write("\n");
      out.write("var chart = new CanvasJS.Chart(\"chartContainer\",\n");
      out.write("\t{\n");
      out.write("  \t\ttitle:{\n");
      out.write("      \ttext:\"ECG Report\",\n");
      out.write("      },\n");
      out.write("      subtitles:[{\n");
      out.write("          text: \"Patient Name: Patient Name\",\n");
      out.write("          horizontalAlign: \"left\",\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("          text: \"Age: X-Years\",\n");
      out.write("          horizontalAlign: \"left\",\n");
      out.write("        },\n");
      out.write("         {\n");
      out.write("          text: \"Doctor Sign\",\n");
      out.write("          horizontalAlign: \"right\",\n");
      out.write("          verticalAlign: \"bottom\",\n");
      out.write("        },\n");
      out.write("\t\t\t],\n");
      out.write("      axisY:{\n");
      out.write("      \tstripLines:yAxisStripLinesArray,\n");
      out.write("        gridThickness: 2,\n");
      out.write("        gridColor:\"#DC74A5\",\n");
      out.write("        lineColor:\"#DC74A5\",\n");
      out.write("        tickColor:\"#DC74A5\",\n");
      out.write("        labelFontColor:\"#DC74A5\",        \n");
      out.write("      },\n");
      out.write("      axisX:{\n");
      out.write("      \tstripLines:xAxisStripLinesArray,\n");
      out.write("        gridThickness: 2,\n");
      out.write("        gridColor:\"#DC74A5\",\n");
      out.write("        lineColor:\"#DC74A5\",\n");
      out.write("        tickColor:\"#DC74A5\",\n");
      out.write("        labelFontColor:\"#DC74A5\",\n");
      out.write("      },\n");
      out.write("      data: [\n");
      out.write("      {\n");
      out.write("        type: \"spline\",\n");
      out.write("        color:\"black\",\n");
      out.write("        dataPoints: dps\n");
      out.write("      }\n");
      out.write("      ]\n");
      out.write("    });\n");
      out.write("  \n");
      out.write("addDataPointsAndStripLines();\n");
      out.write("chart.render();\n");
      out.write("  \n");
      out.write("function addDataPointsAndStripLines(){\n");
      out.write("\t\t//dataPoints\n");
      out.write("    for(var i=0; i<dataPointsArray.length;i++){\n");
      out.write("        dps.push({y: dataPointsArray[i]});\n");
      out.write("    }\n");
      out.write("    //StripLines\n");
      out.write("    for(var i=0;i<3000;i=i+100){\n");
      out.write("      if(i%1000 != 0)\n");
      out.write("          yAxisStripLinesArray.push({value:i,thickness:0.7, color:\"#DC74A5\"});  \n");
      out.write("    }\n");
      out.write("    for(var i=0;i<1400;i=i+20){\n");
      out.write("      if(i%200 != 0)\n");
      out.write("          xAxisStripLinesArray.push({value:i,thickness:0.7, color:\"#DC74A5\"});  \n");
      out.write("    }\n");
      out.write("}\n");
      out.write("  </script>\n");
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
