
public class jad{
    
    public static void main(String[] args) {
        new jad(args);
    }
    
    public jad(String[] args){
        exp(args[0]);
    }
    
    public void exp(String url){
        log(url);
    }
    
    void log(String msg){
        System.out.println(msg);
    }
    
    
}

