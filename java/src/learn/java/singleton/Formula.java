package learn.java.singleton;

public class Formula {
    static Formula formula =null;
    private Formula(){

    }
    public static Formula getInstance(){
        if(formula==null){
            formula =new Formula();
        }
        return formula;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double pythagorean(double base,double altitude) {
        //c^2=a^2+b^2
        return Math.hypot(base,altitude);
    }
    public double areaOfSquare(double area){
        //x^2
        return Math.pow(area,2);
    }
    public double perimeterOfSquare(double perimeter){
        // 4 * x
        return  4*perimeter;
    }
    public double areaOfCircle(double radius){
      //  pi * r^2
        return Math.PI* Math.pow(radius,2);
    }
}
