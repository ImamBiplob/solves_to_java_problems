public class Calculator {
    public int divide(int dividend, int divisor) throws DivideByZeroException {

//        try {
//            result = dividend/divisor;
//        }
//
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }

        if(divisor==0)
            throw new DivideByZeroException("Divisor should not be Zero");

        int result = dividend/divisor;

        return result;
    }
}
