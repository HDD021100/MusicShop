package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LIÊN HỆ CHÚNG TÔI - FPT ACOUSTIC SHOP</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- animation-effect -->\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script>\n");
      out.write(" new WOW().init();\n");
      out.write("</script>\n");
      out.write("<!-- //animation-effect -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"animated wow fadeInLeft\" data-wow-delay=\".5s\">Liên Hệ</h2>\n");
      out.write("\t\t<h3 class=\"animated wow fadeInRight\" data-wow-delay=\".5s\"><a href=\"index.html\">Trang Chủ</a><label>/</label>Liên Hệ</h3>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- contact -->\n");
      out.write("\t<div class=\"contact\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-8 contact-grids1 animated wow fadeInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t<form action=\"ContactServlet\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-form2\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Họ và tên</h4>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"\" name=\"name\" required>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-form2\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Website</h4>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"web\" placeholder=\"\" required>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-form2\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Email</h4>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"\" required>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-form2\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Tiêu đề</h4>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"title\" placeholder=\"\" required>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"contact-me \">\n");
      out.write("\t\t\t\t\t<h4>Lời nhắn</h4>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<textarea type=\"text\" name=\"message\"  placeholder=\"\" required> </textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                    <input type=\"hidden\" name=\"command\" value=\"insert\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Gửi Liên Hệ\" >\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-4 contact-grids\">\n");
      out.write("\t\t\t\t<div class=\" contact-grid animated wow fadeInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"contact-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid2 \">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid3\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Địa Chỉ</h4>\n");
      out.write("\t\t\t\t\t\t\tToà Nhà Gamma Campus FPT Đà Nẵng <span>Q.Ngũ Hành Sơn, TP. Đà Nẵng.</span></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\" contact-grid animated wow fadeInUp\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"contact-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid2 contact-grid4\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid3\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Gọi Chúng Tôi</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>093 5526 224<span>0168 784 1467 </span></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\" contact-grid animated wow fadeInRight\" data-wow-delay=\".5s\">\n");
      out.write("\t\t\t\t\t<div class=\"contact-grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid2 contact-grid5\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-grid3\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Email</h4>\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"contactto:info@example.com\">contact@fpt.edu.vn</a><span><a href=\"contactto:info@example.com\">lienhe@fpt.edu.vn</a></span></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"map\">\n");
      out.write("        <iframe class=\"animated wow fadeInLeft\" d   ata-wow-delay=\".5s\" src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3835.864802122017!2d108.2585099!3d15.9684352!3m2!1i1024!2 i768!4f13.1!3m3!1m2!1s0x3142116949840599%3A0x365b35580f52e8d5!2zxJDhuqFpIGjhu41jIEZQVCAoRlBUIHVuaXZlcnNpdHkp!5e0!3m2!1sen!2s!4v1605576616920!5m2!1sen!2s\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("        </div >\n");
      out.write("                \n");
      out.write("         <div class=\"clearfix\"> </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <div class=\"social animated wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"https://www.facebook.com/profile.php?id=100011135228395\"target=\"_blank\">FACEBOOK</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"https://twitter.com/realDonaldTrump?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor\"target=\"_blank\">TWITTER</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"https://www.google.com/\"target=\"_blank\">GOOGLE+</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"https://www.pinterest.com/\"target=\"_blank\">PINTEREST</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
