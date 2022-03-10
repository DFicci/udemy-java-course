public class OperatorsOperandsAndExpressions {
    public static void main(String[] args) {

        //Using operators-----------------------------------------------------------------------------------------------
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

        //Continued: Abbreviated operators------------------------------------------------------------------------------
        // result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);
        //result = result - 1
        result--;
        System.out.println("2 - 1 = " + result);
        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);
        // result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);
        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);
        //result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        //Continued: if - then statement--------------------------------------------------------------------------------
        // add code blocks in order for statement to print out multiple lines of code otherwise it will only print one.
        boolean isAlien = false;
        if (isAlien == false) { // does the content in parentheses evaluate to true? if so the next line will print out
            System.out.println("It is not an alien!");
            System.out.println("and i am scared of aliens");
        }

        //Continued: logical and operator-------------------------------------------------------------------------------
        int topScore = 100;
        if (topScore >= 100){
            System.out.println("you got the high score!");
        }

        //using logical and operator both much be true in order to continue
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <= 100)){
            System.out.println("greater than second top score and less than 100");
        }

        //Continued: Logical or operator--------------------------------------------------------------------------------
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("either or both of the conditions are true");
        }

        //Continued: Assignment Operator vs Equal Operator--------------------------------------------------------------
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        //Cannot use one = sign, use 2
        boolean isCar = false;
        if (isCar == false){
            System.out.println("This is supposed to happen");
        }

        // or

        if (!isCar){
            System.out.println("this works too");
        }

        //Continued: ternary Operator-----------------------------------------------------------------------------------
        // isCar ? true : false statement is just saying that if is car is true set wasCar to true otherwise false.
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("wasCar is true");
        }


        //Continued: Operator Challenge---------------------------------------------------------------------------------

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder.");
        }


    }
}
