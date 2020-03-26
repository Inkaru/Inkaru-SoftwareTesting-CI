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

    // Trigonometric functions
    public double sinrad(double num, boolean rad){
        if (rad == true)
            return Math.sin(num);
        else
            return Math.toDegrees(Math.sin(num));
    }

    public double cosrad(double num, boolean rad){
        if (rad == true)
            return Math.cos(num);
        else
            return Math.toDegrees(Math.cos(num));
    }

    public double tanrad(double num, boolean rad){
        if (rad == true)
            return Math.tan(num);
        else
            return Math.toDegrees(Math.tan(num));
    }

    public double sinhrad(double num, boolean rad){
        if (rad == true)
            return Math.sinh(num);
        else
            return Math.toDegrees(Math.sinh(num));
    }

    public double coshrad(double num, boolean rad){
        if (rad == true)
            return Math.cosh(num);
        else
            return Math.toDegrees(Math.cosh(num));
    }

    public double tanhrad(double num, boolean rad){
        if (rad == true)
            return Math.tanh(num);
        else
            return Math.toDegrees(Math.tanh(num));
    }

    // exp log pow sqrt
    public double exp(double a){
        return Math.exp(a);
    }
    public double ln(double a){
        return Math.log(a);
    }
    public double log(double a){ return Math.log10(a); }
    public double pow(double a, double b){
        return Math.pow(a,b);
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }

}
