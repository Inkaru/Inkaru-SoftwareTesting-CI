public class App {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException("division by zero is forbidden");
        return a / b;
    }

    public double substract(double a, double b){
        return 0;
    }
    public double multiply(double a, double b){
        return 0;
    }
    public int toInteger(double a){
        return 0;
    }
    public int roundedNumber(double a){
        return 0;
    }
    public int modulo(double a, double b){
        return 0;
    }
}
