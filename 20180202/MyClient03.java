import java.net.*;
import java.io.*;
  
public class MyClient03 {
  public static void main (String[] args) {

  	Socket sock = null;
  	InputStream is = null;
  	InputStreamReader isr = null;
  	BufferedReader br = null;
  

  	try {

  		sock = new Socket("172.16.21.59",6000);

  		is = sock.getInputStream();
  		isr = new InputStreamReader(is);
  		br = new BufferedReader(isr);
  
  		String serverData = br.readLine();
		System.out.println("受信データ: "+serverData);
  
  	} catch (IOException e) {
      System.err.println("クライアントエラー");
  	  System.exit(1);
  	}
  }
}