/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-08-28 05:42:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.frontend;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class comingSoon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <title>Coming Soon | eBookStore</title>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;700&amp;display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v6.1.1/css/all.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/font-awesome/css/fontawesome-all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/flaticon/font/flaticon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/animate.css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/bootstrap-select/dist/css/bootstrap-select.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/slick-carousel/slick/slick.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/theme.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<main id=\"content\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"space-2 space-md-3 space-lg-4 space-top-xl-6 space-bottom-xl-5\">\r\n");
      out.write("            <div class=\"d-flex flex-column align-items-center\">\r\n");
      out.write("                <div class=\"font-weight-medium font-size-15 font-size-xs-25 mb-3\">We’re coming soon.\r\n");
      out.write("                </div>\r\n");
      out.write("                <h6 class=\"font-weight-medium mb-2 col-lg-7 text-center text-lh-lg mb-5\">Our website is under\r\n");
      out.write("                    construction. We’ll be here soon with our new awesome site, subscribe to be notified.</h6>\r\n");
      out.write("                <div class=\"countdown-timer\">\r\n");
      out.write("                    <div class=\"d-flex justify-content-between\">\r\n");
      out.write("                        <div class=\"py-2d75 d-md-flex align-items-center pr-3\">\r\n");
      out.write("                            <span class=\"font-weight-medium font-size-3\">114</span>\r\n");
      out.write("                            <span class=\"font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1\">Days</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"border-left pr-3\">&nbsp;</div>\r\n");
      out.write("                        <div class=\"py-2d75 d-md-flex align-items-center pr-3\">\r\n");
      out.write("                            <span class=\"font-weight-medium font-size-3\">03</span>\r\n");
      out.write("                            <span class=\"font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1\">Hours</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"border-left pr-3\">&nbsp;</div>\r\n");
      out.write("                        <div class=\"py-2d75 d-md-flex align-items-center pr-3\">\r\n");
      out.write("                            <span class=\"font-weight-medium font-size-3\">60</span>\r\n");
      out.write("                            <span class=\"font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1\">Mins</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"border-left pr-3\">&nbsp;</div>\r\n");
      out.write("                        <div class=\"py-2d75 d-md-flex align-items-center pr-0\">\r\n");
      out.write("                            <span class=\"font-weight-medium font-size-3\">25</span>\r\n");
      out.write("                            <span class=\"font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1\">Secs</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</main>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"assets/vendor/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/jquery-migrate/dist/jquery-migrate.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/popper.js/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/bootstrap-select/dist/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/slick-carousel/slick/slick.min.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/multilevel-sliding-mobile-menu/dist/jquery.zeynep.js\"></script>\r\n");
      out.write("<script src=\"assets/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"assets/js/hs.core.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.unfold.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.malihu-scrollbar.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.header.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.slick-carousel.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.selectpicker.js\"></script>\r\n");
      out.write("<script src=\"assets/js/components/hs.show-animation.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).on('ready', function () {\r\n");
      out.write("        // initialization of unfold component\r\n");
      out.write("        $.HSCore.components.HSUnfold.init($('[data-unfold-target]'));\r\n");
      out.write("\r\n");
      out.write("        // initialization of slick carousel\r\n");
      out.write("        $.HSCore.components.HSSlickCarousel.init('.js-slick-carousel');\r\n");
      out.write("\r\n");
      out.write("        // initialization of header\r\n");
      out.write("        $.HSCore.components.HSHeader.init($('#header'));\r\n");
      out.write("\r\n");
      out.write("        // initialization of malihu scrollbar\r\n");
      out.write("        $.HSCore.components.HSMalihuScrollBar.init($('.js-scrollbar'));\r\n");
      out.write("\r\n");
      out.write("        // initialization of show animations\r\n");
      out.write("        $.HSCore.components.HSShowAnimation.init('.js-animation-link');\r\n");
      out.write("\r\n");
      out.write("        // init zeynepjs\r\n");
      out.write("        var zeynep = $('.zeynep').zeynep({\r\n");
      out.write("            onClosed: function () {\r\n");
      out.write("                // enable main wrapper element clicks on any its children element\r\n");
      out.write("                $(\"body main\").attr(\"style\", \"\");\r\n");
      out.write("\r\n");
      out.write("                console.log('the side menu is closed.');\r\n");
      out.write("            },\r\n");
      out.write("            onOpened: function () {\r\n");
      out.write("                // disable main wrapper element clicks on any its children element\r\n");
      out.write("                $(\"body main\").attr(\"style\", \"pointer-events: none;\");\r\n");
      out.write("\r\n");
      out.write("                console.log('the side menu is opened.');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // handle zeynep overlay click\r\n");
      out.write("        $(\".zeynep-overlay\").click(function () {\r\n");
      out.write("            zeynep.close();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // open side menu if the button is clicked\r\n");
      out.write("        $(\".cat-menu\").click(function () {\r\n");
      out.write("            if ($(\"html\").hasClass(\"zeynep-opened\")) {\r\n");
      out.write("                zeynep.close();\r\n");
      out.write("            } else {\r\n");
      out.write("                zeynep.open();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
