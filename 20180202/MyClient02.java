import java.net.*;
import java.io.*;
  
public class MyClient02 {
  public static void main (String[] args) {

  	Socket sock = null;
  	OutputStream os = null;
  	PrintWriter pw = null;
  

  	try {

  		sock = new Socket("172.16.21.59",6000);

  		os = sock.getOutputStream();
  		pw = new PrintWriter(os);
  		pw.println("ALOHA!");
  		pw.flush();
  
  	} catch (IOException e) {
      System.err.println("クライアントエラー");
  	  System.exit(1);
  	}
  }
}