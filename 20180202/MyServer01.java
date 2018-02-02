import java.net.*;
import java.io.*;
  
  public class MyServer01 {
  public static void main (String[] args) {

  	ServerSocket serv = null;
    
  	try {
      serv = new ServerSocket(6000, 30);
  	} catch (IOException e) {
  		System.err.println("サーバエラー");
  		System.exit(1);
  	}
  }
}