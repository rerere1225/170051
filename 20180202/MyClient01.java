import java.net.*;
import java.io.*;
  
public class MyClient01 {
  public static void main (String[] args) {

  	Socket sock = null;
  

  	try {

  		sock = new Socket("172.16.21.59",6000);
  
  	} catch (IOException e) {
      System.err.println("クライアントエラー");
  	  System.exit(1);
  	}
  }
}