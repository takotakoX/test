package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userCreateComplete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("\t<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t<title>userCreateComplete画面</title>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("/* \t\tTag Layout */\r\n");
      out.write("\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tpadding:0;\r\n");
      out.write("\t\t\tline-height:1.6;\r\n");
      out.write("\t\t\tletter-spacing:1px;\r\n");
      out.write("\t\t\tfont-family:Verdana, Helvetica, sans-serif;\r\n");
      out.write("\t\t\tfont-size:12px;\r\n");
      out.write("\t\t\tcolor:#333;\r\n");
      out.write("\t\t\tbackground:#fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\ttable{\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tmargin:0 auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("/* \t\tID Layout */\r\n");
      out.write("\r\n");
      out.write("\t\t#top{\r\n");
      out.write("\t\t\twidth:780px;\r\n");
      out.write("\t\t\tmargin:30px auto;\r\n");
      out.write("\t\t\tborder:1px solid #333;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#header{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:80px;\r\n");
      out.write("\t\t\tbackground-color:black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#main{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:500px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#footer{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:50px;\r\n");
      out.write("\t\t\tbackground-color:black;\r\n");
      out.write("\t\t\tclear:both;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"pr\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<p>UserCreateComplete</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h3>ユーザーの登録が完了しました。</h3>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a href='");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>ログインへ</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<div id=\"pr\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /userCreateComplete.jsp(76,13) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("HomeAction");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }
}
