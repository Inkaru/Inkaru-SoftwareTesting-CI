public class App {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) throws ArithmeticException{
        //if(b == 0) throw new ArithmeticException("division by zero is forbidden");
        return a / b;
    }
}
