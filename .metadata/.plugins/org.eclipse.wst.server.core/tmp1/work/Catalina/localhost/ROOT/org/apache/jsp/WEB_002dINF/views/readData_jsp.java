/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2020-12-18 04:34:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;

public final class readData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/ERP/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/ERP/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1604883783799L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title> READ </title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#calendar {width:308px; overflow:hidden; left:10%;}\r\n");
      out.write("\t.none {width:42px; height:50px; float:left; margin:1px;}\r\n");
      out.write("\t.wom1, .wom2, .wom3, .wom4, .wom5, .wom6 {width:40px; height:50px; float:left; border:dotted 1px black; margin:1px;}\r\n");
      out.write("\t\r\n");
      out.write("\t#readData {text-align:center;}\r\n");
      out.write("</style>\r\n");

	GregorianCalendar cal = new GregorianCalendar();
	String thisYear = cal.get(GregorianCalendar.YEAR)+"";
	String thisMonth = cal.get(GregorianCalendar.MONTH)+1+"";
	String thisDay = cal.get(GregorianCalendar.DAY_OF_MONTH)+"";

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<select id=\"choose\">\r\n");
      out.write("\t\t<option value=\"salesData.json\" selected>매출</option>\r\n");
      out.write("\t\t<option value=\"refundData.json\">환불</option>\r\n");
      out.write("\t\t<option value=\"costData.json\">비용</option>\r\n");
      out.write("\t\t<option value=\"depositData.json\">예금</option>\r\n");
      out.write("\t\t<option value=\"loansData.json\">대출</option>\r\n");
      out.write("\t\t<option value=\"invenData.json\">재고</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"calendarView\"></div>\r\n");
      out.write("\t<table id=\"readData\"></table>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("var choose = \"salesData.json\";\r\n");
      out.write("var year = ");
      out.print(thisYear);
      out.write("-1;\r\n");
      out.write("var month = ");
      out.print(thisMonth);
      out.write(";\r\n");
      out.write("var day = ");
      out.print(thisDay);
      out.write(";\r\n");
      out.write("for(var i = 1; i <= 9; i++) {\r\n");
      out.write("\tif(day == i) {\r\n");
      out.write("\t\tday = \"0\" + day;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("calendar();\r\n");
      out.write("setTimeout(updateData, 300);\r\n");
      out.write("\r\n");
      out.write("$(\"#choose\").on(\"change\", function() {\r\n");
      out.write("\tchoose = $(\"#choose\").val();\r\n");
      out.write("\t$(\"#readData\").html(\"\");\r\n");
      out.write("\tsetTimeout(updateData, 100);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// getMonth();\r\n");
      out.write("\r\n");
      out.write("// var date = year +\"/\"+ month;\r\n");
      out.write("// getDay();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// $(\"#btn\").on(\"click\", function() {\r\n");
      out.write("// \tgetInvenList();\r\n");
      out.write("// });\r\n");
      out.write("\r\n");
      out.write("$(\"#calendarView\").on(\"click\", \"#calendar [name=wom]\", function() {\r\n");
      out.write("\tvar addList = \"\";\r\n");
      out.write("\tvar date = $(this).find(\".pleaseData\").attr(\"id\");\r\n");
      out.write("\tif($(this).attr(\"style\").split(\"background: \")[1] != \"white;\") {\r\n");
      out.write("\t\tvar URL = $(\"#choose option:selected\").val().split(\"D\")[0];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(URL.charAt(0) == \"s\" || URL.charAt(0) == \"r\") {\r\n");
      out.write("\t\t\tURL = URL.charAt(0).toUpperCase() + URL.substring(1);\r\n");
      out.write("\t\t\tURL = \"read\" + URL + \".json\";\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:URL,\r\n");
      out.write("\t\t\t\tdata:{\"date\":date},\r\n");
      out.write("\t\t\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t\t\taddList += \"<tr><td width=300>제품</td><td width=100>결제방법</td><td width=50>수량</td><td width=100>가격</td><td width=50>유형</td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\taddList += \"<tr><td>\"+this.CATEGORYNAME.split(\"/\")[2]+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.PAYTYPE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.SALESCOUNT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.SALESAMOUNT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.SALESTYPE+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#readData\").html(addList);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(URL.charAt(0) == \"c\") {\r\n");
      out.write("\t\t\tURL = URL.charAt(0).toUpperCase() + URL.substring(1);\r\n");
      out.write("\t\t\tURL = \"read\" + URL + \".json\";\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:URL,\r\n");
      out.write("\t\t\t\tdata:{\"date\":date},\r\n");
      out.write("\t\t\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t\t\taddList += \"<tr><td width=150>비용내역</td><td width=100>금액</td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\taddList += \"<tr><td>\"+this.COSTACCOUNTNAME+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.COSTAMOUNT+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#readData\").html(addList);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(URL.charAt(0) == \"d\") {\r\n");
      out.write("\t\t\tURL = URL.charAt(0).toUpperCase() + URL.substring(1);\r\n");
      out.write("\t\t\tURL = \"read\" + URL + \".json\";\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:URL,\r\n");
      out.write("\t\t\t\tdata:{\"date\":date},\r\n");
      out.write("\t\t\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t\t\taddList += \"<tr><td width=150>계좌</td><td width=100>은행명</td><td width=150>기초잔액</td><td width=100>예금유형</td><td width=150>발생금액</td><td width=150>기말잔액</td><td width=100>이율</td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\taddList += \"<tr><td>\"+this.DEPOSITACCOUNTCODE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.DEPOSITACCOUNTBANKNAME+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.STARTBALANCE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.DEPOSITTYPE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.DEPOSITAMOUNT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.ENDBALANCE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.DEPOSITRATE+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#readData\").html(addList);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(URL.charAt(0) == \"l\") {\r\n");
      out.write("\t\t\tURL = URL.charAt(0).toUpperCase() + URL.substring(1);\r\n");
      out.write("\t\t\tURL = \"read\" + URL + \".json\";\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:URL,\r\n");
      out.write("\t\t\t\tdata:{\"date\":date},\r\n");
      out.write("\t\t\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t\t\taddList += \"<tr><td width=200>계좌</td><td width=100>상환일</td><td width=150>원금</td><td width=150>상환금</td><td width=150>잔금</td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\taddList += \"<tr><td>\"+this.LOANSACCOUNTCODE+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+date+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.LOANSACCOUNTAMOUNT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.LOANSAMOUNT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.LOANSBALANCE+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#readData\").html(addList);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(URL.charAt(0) == \"i\") {\r\n");
      out.write("\t\t\tURL = URL.charAt(0).toUpperCase() + URL.substring(1);\r\n");
      out.write("\t\t\tURL = \"read\" + URL + \".json\";\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\t\turl:URL,\r\n");
      out.write("\t\t\t\tdata:{\"date\":date},\r\n");
      out.write("\t\t\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t\t\taddList += \"<tr><td width=300>재고명</td><td width=100>기초재고</td><td width=100>입고</td><td width=100>출고</td><td width=100>기말재고</td></tr>\";\r\n");
      out.write("\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\taddList += \"<tr><td>\"+this.INVENACCOUNTNAME.split(\"/\")[1]+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.STARTINVEN+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.INVENIN+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.INVENOUT+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\taddList += \"<td>\"+this.ENDINVEN+\"</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#readData\").html(addList);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function updateData() {\r\n");
      out.write("\tvar date = year +\"/\"+ month;\r\n");
      out.write("\t$(\"#calendarView\").find(\"#calendar\").find(\"[name=wom]\").css(\"background\", \"white\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype:\"get\",\r\n");
      out.write("\t\turl:choose,\r\n");
      out.write("\t\tdata:{\"date\":date},\r\n");
      out.write("\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\tvar d = this.day;\r\n");
      out.write("\t\t\t\t$(\"#calendarView\").find(\"#calendar\").find(\"[name=wom]\").each(function() {\r\n");
      out.write("\t\t\t\t\tif($(this).find(\".pleaseData\").attr(\"id\") == d) {\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"salesData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"pink\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"refundData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"red\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"costData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"green\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"invenData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"yellow\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"depositData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"navy\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(choose == \"loansData.json\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"background\", \"lightgray\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calendar() {\r\n");
      out.write("\tvar date = year +\"/\"+ month;\r\n");
      out.write("\tvar addCalendar = \"<div id='calendar'>\";\r\n");
      out.write("\tvar cnt = 0;\r\n");
      out.write("\tvar cnt1 = 0;\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"daily.json\",\r\n");
      out.write("\t\ttype:\"get\",\r\n");
      out.write("\t\tdata:{\"date\":date},\r\n");
      out.write("\t\tsuccess:function(data) {\r\n");
      out.write("\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\tif(this.wom == 1) {\r\n");
      out.write("\t\t\t\t\tcnt++;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(cnt != 7) {\r\n");
      out.write("\t\t\t\tfor(var i = 0; i <7-cnt; i++) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='none'></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\tif(this.wom == 1) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom1' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(this.wom == 2) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom2' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(this.wom == 3) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom3' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(this.wom == 4) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom4' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(this.wom == 5) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom5' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(this.wom == 6) {\r\n");
      out.write("\t\t\t\t\taddCalendar += \"<div class='wom6' name='wom' style='color:black;'>\"+this.day.split(\"-\")[2].substring(0,2)+\"<div class='pleaseData' id='\"+date+\"/\"+this.day.split(\"-\")[2].substring(0,2)+\"'></div></div>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\taddCalendar += \"</div>\";\r\n");
      out.write("// \t\t\talert(addCalendar);\r\n");
      out.write("\t\t\t$(\"#calendarView\").html(addCalendar);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}