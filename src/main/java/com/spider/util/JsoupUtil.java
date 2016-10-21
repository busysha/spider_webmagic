package com.spider.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;


/**
 * 数据抓取
 *
 */
public class JsoupUtil {
	
	private static final Logger logger=Logger.getLogger(JsoupUtil.class);
	private static final String access_key=PropertiesUtil.getValue("qiniu.access.key");
	private static final String secret_key=PropertiesUtil.getValue("qiniu.secret.key");
	private static final String bucket=PropertiesUtil.getValue("qiniu.bucket");
	private static final String qiniu_url  =  PropertiesUtil.getValue("qiniu.url");
	public static String download(String urlString){
		try{
		    // 构造URL
		    URL url = new URL(urlString);
		    // 打开连接
		    URLConnection con = url.openConnection();
		    // 输入流
		    InputStream is = con.getInputStream();
		   
		    ByteArrayOutputStream swapStream = new ByteArrayOutputStream(); 
		    byte[] buff = new byte[100]; //buff用于存放循环读取的临时数据 
		    int rc = 0; 
		    while ((rc = is.read(buff, 0, 100)) > 0) { 
		    swapStream.write(buff, 0, rc); 
		    } 
		    byte[] in_b = swapStream.toByteArray(); //in_b为转换之后的结果 
		    
	       Auth auth = Auth.create(access_key,secret_key);
	       UploadManager uploadManager = new UploadManager();
	       String Uname = UUID.randomUUID().toString().replaceAll("-", "");
	       uploadManager.put(in_b,Uname, auth.uploadToken(bucket));
	       return qiniu_url + Uname;
		}catch(Exception e){
			logger.error("",e);
		}
	  return "";
	}   
	
	
	
	/**
	 *  urlencode 转 中文
	 * @param info
	 * @return
	 */
	public  static String encode(String info) {
		//logger.info(info);
		info=info.replaceAll("msgList = '", "");
		info=info.replaceAll("';", "");
		info=info.replaceAll("&quot;", "\"");
		info=info.replaceAll("\\\\", "");
		info=info.replaceAll("amp;", "");
		info=info.replaceAll("&nbsp;", "");
		
		//logger.info(info);
		return info;
	}




	/**
	 * 通过url 获取 内容
	 * @param url
	 * @return
	 */
	public static Elements getDocumentByUrl(String url){
		 Document doc;
		 try {
            doc = Jsoup.connect(url)  .data("query", "Java")   // 请求参数
            		  .userAgent("I ’ m jsoup") // 设置 User-Agent 
            		  .cookie("auth", "token") // 设置 cookie 
            		  .timeout(10000)           // 设置连接超时时间
            		  .get();  
            Elements ListDiv = doc.children();
            return ListDiv;
        } catch (IOException e) {
        	logger.info("",e);
        }
		return null;
	}
	
	
	public static Document  getArticalList(String sid,String url) throws Exception{
		Map<String,String> cookies = new HashMap<String,String>();
		cookies.put("PHPSESSID", sid);
		
		String ua= "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36";
		String referer="http://www.wxb.com/home";
		String accept="application/json, text/javascript, */*; q=0.01";
		String X_Requested_With="XMLHttpRequest";
		//String url = "http://www.wxb.com/follow/index?page=1&group_id=73161&pageSize=30";
		
		Document doc = Jsoup.connect(url).userAgent(ua)
				.cookies(cookies)
				.referrer(referer)
				.header("Accept", accept)
				.header("X-Requested-With",X_Requested_With)
				.get();
		
		return doc;
	}
	
	/**
	 * unicode to 中文
	 * @param theString
	 * @return
	 */
	public static String decodeUnicode(String theString) {      
	    char aChar;      
	    int len = theString.length();      
	    StringBuffer outBuffer = new StringBuffer(len);      
	    for (int x = 0; x < len;) {      
	    aChar = theString.charAt(x++);      
		    if (aChar == '\\') {      
		    aChar = theString.charAt(x++);      
		    if (aChar == 'u') {      
		       int value = 0;      
		       for (int i = 0; i < 4; i++) {      
		        aChar = theString.charAt(x++);      
		        switch (aChar) {      
		   
		        case '0':      
		   
		        case '1':      
		   
		        case '2':      
		   
		        case '3':      
		   
		        case '4':      
		   
		        case '5':      
		   
		         case '6':      
		          case '7':      
		          case '8':      
		          case '9':      
		           value = (value << 4) + aChar - '0';      
		           break;      
		          case 'a':      
		          case 'b':      
		          case 'c':      
		          case 'd':      
		          case 'e':      
		          case 'f':      
		           value = (value << 4) + 10 + aChar - 'a';      
		          break;      
		          case 'A':      
		          case 'B':      
		          case 'C':      
		          case 'D':      
		          case 'E':      
		          case 'F':      
		           value = (value << 4) + 10 + aChar - 'A';      
		           break;      
		          default:      
		           throw new IllegalArgumentException(      
		             "Malformed   \\uxxxx   encoding.");      
		          }      
		        }      
		         outBuffer.append((char) value);      
		        } else {      
		        if (aChar == 't')      
		          aChar = '\t';      
		         else if (aChar == 'r')      
		          aChar = '\r';      
		   
		         else if (aChar == 'n')      
		   
		          aChar = '\n';      
		         else if (aChar == 'f')      
		          aChar = '\f';      
		         outBuffer.append(aChar);      
		        }      
		      } else     
	       outBuffer.append(aChar);      
	      }      
	      return outBuffer.toString();      
	  }    
	
	
	
	
	
	
	
}
