/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-10 09:13:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contractDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/Code/InsuranceSystem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/InsuranceSystem/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1614745664078L));
    _jspx_dependants.put("jar:file:/D:/Code/InsuranceSystem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/InsuranceSystem/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("  \tfunction payInsurancePayment() {\r\n");
      out.write("  \t\tvar theForm = document.getElementById(\"checkInsuranceMoney\");\r\n");
      out.write("//   \t\tvar contractID = document.getElementById(\"contractID\");\r\n");
      out.write("  \t\tvar contractID = document.getElementById('contractID').childNodes[0].nodeValue;\r\n");
      out.write("\t\ttheForm.action = \"checkInsuranceMoney?contractID=\" + contractID;\r\n");
      out.write("\t\ttheForm.submit()\r\n");
      out.write("  \t}\r\n");
      out.write("  \tfunction destroyContract() {\r\n");
      out.write("  \t\tvar theForm = document.getElementById(\"checkInsuranceMoney\");\r\n");
      out.write("  \t\tvar contractID = document.getElementById(\"contractID\").childNodes[0].nodeValue;\r\n");
      out.write("  \t\tif( confirm(\"이 계약을 파기하시겠습니까?\") ){\r\n");
      out.write("  \t\t\ttheForm.action = \"destroyContract?contractID=\" + contractID;\r\n");
      out.write("  \t\t\ttheForm.submit()\r\n");
      out.write("  \t\t}\r\n");
      out.write("  \t\treturn false;\r\n");
      out.write("  \t}\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("\ttable {\r\n");
      out.write("   \t\twidth: 30%;\r\n");
      out.write("    \tborder: 1px solid #444444;\r\n");
      out.write("    \tborder-collapse: collapse;\r\n");
      out.write("    \ttext-align: center;\r\n");
      out.write("  \t}\r\n");
      out.write("  \tth, td {\r\n");
      out.write("    \tborder: 1px solid #444444;\r\n");
      out.write("    \tpadding: 3px;\r\n");
      out.write("  \t}\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<title>계약 상세보기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"checkInsuranceMoney\" id=\"checkInsuranceMoney\"\r\n");
      out.write("\t\tmethod=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr style=\"text-align: center;\">\r\n");
      out.write("\t\t<td style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님의계약</th>\r\n");
      out.write("\t\t\t\t\t<th>계약 상세보기 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${insuranceName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr><td>계약ID</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"contractID\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.contractID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>보장한도</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.insuranceMoneyLimit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>손해율</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.lossRate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>수익성등급</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.profitabilityRating}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>잔여제지급금</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.remainingExpectedMoney}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>지급받은보험금</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.compensationHistory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>보험료</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.insurancePayment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>위험률</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.extraChargeRate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>납부방식</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.paymentType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>보험금지급방식</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.compensationType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>은행</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.bank}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>시작일</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${startDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>만기일</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>보험종류</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contract.insuranceType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>매니저</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contractManagerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>수령인</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${recipientName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td></tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type = \"hidden\" name = \"customerID\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customerID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-outline btn-primary\"\r\n");
      out.write("\t\t\t\tonclick=\"payInsurancePayment()\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-edit fa-fw\"></i> 보험료 납부하기\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<button class=\"btn btn-outline btn-primary\"\r\n");
      out.write("\t\t\t\tonclick=\"destroyContract()\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-edit fa-fw\"></i> 계약 파기하기\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-outline btn-primary\" onclick=\"history.back(-1);\">\r\n");
      out.write("            <i class=\"fa fa-edit fa-fw\"></i> 뒤로가기\r\n");
      out.write("         </button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
