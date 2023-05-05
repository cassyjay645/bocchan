
import java.net.*;
import java.io.*;

public class jad{
    
    public static void main(String[] args) {
        new jad(args);
    }
    
    public jad(String[] args){
        exp(args[0]);
    }
    
    public void exp(String url){
        log(url);
        try
        {
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            
            InputStream ins = con.getInputStream();
            
            int red;
            byte[] buf = new byte[2048*3];
            
            FileOutputStream o = new FileOutputStream("cat.jpg");
            
            while( (red = ins.read(buf)) != -1){
                o.write(buf,0,red);
            }
            
            o.flush();
            o.close();
            
            
            ins.close();
            con.disconnect();
        }
        catch (IOException e)
        {}
    } 
    
    void log(String msg){
        System.out.println(msg);
    }
    
    
}

