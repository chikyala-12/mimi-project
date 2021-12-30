package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import pack.Dbconnection;
import java.sql.Connection;

public final class user_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html> \n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Security Evaluation</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("  <!-- modernizr enables HTML5 elements and feature detects -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/modernizr-1.5.min.js\"></script>\n");
      out.write("    <link rel=\"shortcut icon\" type=\"x-icon\" href=\"images/ic.png\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("window.history.forward(1);\n");
      out.write("function noBack(){\n");
      out.write("window.history.forward();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onunload=\"\">\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <header>\n");
      out.write("\t  <div id=\"banner\">\n");
      out.write("\t    <div id=\"welcome\">\n");
      out.write("\t      <h3>Security <span>Evaluation</span></h3>\n");
      out.write("\t    </div><!--close welcome-->\n");
      out.write("\t    <div id=\"welcome_slogan\">\n");
      out.write("\t      <h3>Pattern Classifiers under Attack</h3>\n");
      out.write("\t    </div><!--close welcome_slogan-->\t\t\t\n");
      out.write("\t  </div><!--close banner-->\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\t<nav>\n");
      out.write("\t  <div id=\"menubar\">\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("         \n");
      out.write("            <li><a href=\"files.jsp\">Files</a></li>\n");
      out.write("            <li><a href=\"spam_filter.jsp\">Spam Filter</a></li>\n");
      out.write("            <li><a href=\"profile_picture.jsp\">Change Profile Picture</a></li>\n");
      out.write("          <li><a href=\"index.html\">Logout</a></li>\n");
      out.write("<!--          <li><a href=\"projects.html\">Projects</a></li>\n");
      out.write("          <li><a href=\"contact.html\">Contact Us</a></li>-->\n");
      out.write("        </ul>\n");
      out.write("      </div><!--close menubar-->\t\n");
      out.write("    </nav>\t\n");
      out.write("    \n");
      out.write("\t<div id=\"site_content\">\t\n");

 Connection con= Dbconnection.getConn();
 Statement st=con.createStatement();
 
       

      out.write("\n");
      out.write("      <div >\n");
      out.write("\t    <ul >\n");
      out.write("                <li ><img width=\"200\" height=\"250\" src=\"disp_image.jsp\" alt=\"&quot;face detection&quot;\"/></li>\n");
      out.write("<!--          <li><img width=\"900\" height=\"250\" src=\"images/b2.png\" alt=\"&quot;face detection&quot;\" /></li>-->\n");
      out.write("<!--          <li><img width=\"900\" height=\"250\" src=\"images/home_1.jpg\" alt=\"&quot;Enter your caption here&quot;\" /></li>-->\n");
      out.write("        </ul> \n");
      out.write("\t  </div>\t\n");
      out.write("\t\n");
      out.write("\t  <div id=\"content\">\n");
      out.write("        <div class=\"content_item\">\n");
      out.write("            ");

HttpSession user=request.getSession();
String name=user.getAttribute("name").toString();           

      out.write("\n");
      out.write("\t\t  <h1>Welcome ! ");
      out.print(name);
      out.write("</h1> \n");
      out.write("          \n");
      out.write("\n");
      out.write("\t\t  \n");
      out.write("\t\t</div><!--close content_item-->\n");
      out.write("      </div><!--close content-->   \n");
      out.write("\t</div><!--close site_content-->  \t\n");
      out.write("  </div><!--close main-->\n");
      out.write("  \n");
      out.write("<!--    <footer>\n");
      out.write("\t  <a href=\"index.html\">Home</a> | <a href=\"ourwork.html\">Our Work</a> | <a href=\"testimonials.html\">Testimonials</a> | <a href=\"projects.html\">Projects</a> | <a href=\"contact.html\">Contact</a><br/><br/>\n");
      out.write("\t  website template by <a href=\"http://www.freehtml5templates.co.uk\">Free HTML5 Templates</a>\n");
      out.write("    </footer>-->\n");
      out.write("\n");
      out.write("  <!-- javascript at the bottom for fast page loading -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/image_slide.js\"></script>\n");
      out.write("  \n");
      out.write("</body>\n");
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
