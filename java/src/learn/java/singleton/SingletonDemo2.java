package learn.java.singleton;

public class SingletonDemo2 {
    public static void main(String[] args) {
        Marvel marvel=Marvel.getObject();
        marvel.avangers();
        Marvel obj =   Marvel.getObject();
        obj.xMan();

            System.out.println((marvel.hashCode()==obj.hashCode()));

    }
}
