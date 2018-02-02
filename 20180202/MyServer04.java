import java.net.*;
import java.io.*;
  
  public class MyServer04 {
  public static void main (String[] args) {

    ServerSocket serv = null;
    Socket sock = null;
    OutputStream os = null;
    PrintWriter pw = null;
    
    try {
      serv = new ServerSocket(6000, 30);

      os = sock.getOutputStream();
      pw = new PrintWriter(os);
      pw.println("Hello!");
      pw.flush(); 
    } catch (IOException e) {
      System.err.println("サーバエラー");
      System.exit(1);
    }
  }
}