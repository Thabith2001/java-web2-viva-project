/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-08-27 11:11:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.frontend;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class myAccountWishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!----------------------Wishlist--------------------------->\r\n");
      out.write("<div class=\"tab-pane fade show active\" id=\"pills-six-example1\" role=\"tabpanel\" aria-labelledby=\"pills-six-example1-tab\">\r\n");
      out.write("    <div class=\"pt-5 pl-md-5 pt-lg-8 pl-lg-9 space-bottom-lg-3\">\r\n");
      out.write("        <h6 class=\"font-weight-medium font-size-7 ml-lg-1 mb-lg-8 pb-xl-1\">Wishlist</h6>\r\n");
      out.write("        <table class=\"table mb-0\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr class=\"border\">\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 border-bottom-0 font-weight-medium pl-3 pl-md-5\">Prouct</th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 border-bottom-0 font-weight-medium\">Price</th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 border-bottom-0 font-weight-medium\">Stock Staus</th>\r\n");
      out.write("                <th scope=\"col\" class=\"py-3 border-bottom-0 font-weight-medium\">Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            <tr class=\"border\">\r\n");
      out.write("                <th class=\"pl-3 pl-md-5 font-weight-normal align-middle py-6\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center\">\r\n");
      out.write("                        <a class=\"d-block\" href=\"#\">\r\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/90x138/img1.jpg\" alt=\"Image-Description\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"ml-xl-4\">\r\n");
      out.write("                            <div class=\"font-weight-normal\">\r\n");
      out.write("                                <a href=\"#\">The Overdue Life of Amy Byler</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"font-size-2\"><a href=\"#\" class=\"text-gray-700\" tabindex=\"0\">Jay Shetty</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </th>\r\n");
      out.write("                <td class=\"align-middle py-5\">$37</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">In Stock</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">\r\n");
      out.write("                    <span class=\"product__add-to-cart\">ADD TO CART</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"border\">\r\n");
      out.write("                <th class=\"pl-3 pl-md-5 font-weight-normal align-middle py-6\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center\">\r\n");
      out.write("                        <a class=\"d-block\" href=\"#\">\r\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/90x138/img3.jpg\" alt=\"Image-Description\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"ml-xl-4\">\r\n");
      out.write("                            <div class=\"font-weight-normal\">\r\n");
      out.write("                                <a href=\"#\">The Overdue Life of Amy Byler</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"font-size-2\"><a href=\"#\" class=\"text-gray-700\" tabindex=\"0\">Jay Shetty</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </th>\r\n");
      out.write("                <td class=\"align-middle py-5\">$37</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">In Stock</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">\r\n");
      out.write("                    <span class=\"product__add-to-cart\">ADD TO CART</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"border\">\r\n");
      out.write("                <th class=\"pl-5 font-weight-normal align-middle py-6\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center\">\r\n");
      out.write("                        <a class=\"d-block\" href=\"#\">\r\n");
      out.write("                            <img class=\"img-fluid\" src=\"assets/img/90x138/img4.jpg\" alt=\"Image-Description\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"ml-xl-4\">\r\n");
      out.write("                            <div class=\"font-weight-normal\">\r\n");
      out.write("                                <a href=\"#\">The Overdue Life of Amy Byler</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"font-size-2\"><a href=\"#\" class=\"text-gray-700\" tabindex=\"0\">Jay Shetty</a></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </th>\r\n");
      out.write("                <td class=\"align-middle py-5\">$37</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">In Stock</td>\r\n");
      out.write("                <td class=\"align-middle py-5\">\r\n");
      out.write("                    <span class=\"product__add-to-cart\">ADD TO CART</span>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!----------------------Wishlist--------------------------->\r\n");
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
