public class App {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) throws ArithmeticException{
        if(b == 0) throw new ArithmeticException("division by zero is forbidden");
        return a / b;
    }

    public double substract(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public int toInteger(double a){
        int res = (int) a;
        return res;
    }

    public int roundedNumber(double a){
        int superior = (int) a+1;
        int inferior = (int) a;
        if((superior-a)<=(a-inferior)){
            return superior;
        }
        return inferior;
    }
    public int modulo(double a, double b) throws ArithmeticException {
        int aConverted = (int) a;
        int bConverted = (int) b;
        if((aConverted!=a)||(bConverted!=b)){
            throw new ArithmeticException("modulo with float is forbidden");
        }
        if(bConverted==0){
            throw new ArithmeticException("modulo by zero is forbidden");
        }
        return aConverted % bConverted;
    }
}
