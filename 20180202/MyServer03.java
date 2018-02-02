import java.net.*;
import java.io.*;
  
public class MyServer03 {
  public static void main (String[] args) {
  	ServerSocket servSock = null;
  	Socket sock = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    InputStream is = null;
    
  
  	try {
      servSock = new ServerSocket(6000, 30);
     
      is = sock.getInputStream();

      isr = new InputStreamReader(is);

      br = new BufferedReader(isr);

      String serverData = br.readLine();

      System.out.println("受信データ: "+serverData);
    } catch (IOException e) {
      System.err.println("サーバエラー");
      System.exit(1);
    }
  }
}