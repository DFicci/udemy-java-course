public class OperatorsOperandsAndExpressions {
    public static void main(String[] args){
        int result = 1 + 2; // should be 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 =" + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
    }
}