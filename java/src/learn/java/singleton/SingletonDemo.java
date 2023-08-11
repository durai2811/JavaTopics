package learn.java.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Formula formula= Formula.getInstance();
        Formula formula1 =Formula.getInstance();
        if(formula.hashCode() == formula1.hashCode()){
            System.out.println("formula object : "+formula.hashCode());
            System.out.println("formula1 object : "+formula1.hashCode());
            System.out.println("check if both object is equal? "+(formula.hashCode() == formula1.hashCode()));
        }
        System.out.println("add two numbers : "+formula.add(10,20));
        System.out.println("area of circle : "+formula.areaOfCircle(4));
        System.out.println("perimeter of square : "+formula.perimeterOfSquare(4));
        System.out.println("Hypotenuse : "+formula.pythagorean(10,20));
        System.out.println("multiple two numbers : "+formula.multiply(20,21));

    }
}
