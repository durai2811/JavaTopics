package learn.java.singleton;

public class Marvel {
    private static Marvel marvel=null;
    private Marvel(){

    }
    public static Marvel getObject(){
        if(marvel==null){
            marvel=new Marvel();
        }
        return marvel;
    }
    public void avangers(){
        System.out.println("Avengers is owned by Marvel comics");

    }
     public void xMan(){
         System.out.println("X-man is owned by Marvel comics");
     }
}
