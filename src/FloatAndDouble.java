public class FloatAndDouble {
    public static void main(String[] args){
//        Minimum and maximum float values
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Number = " + myMinFloatValue);
        System.out.println("Float Maximum Number = " + myMaxFloatValue);

//        minimum and maximum double values
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Number = " + myMinDoubleValue);
        System.out.println("Double Maximum Number = " + myMaxDoubleValue);

        int myIntValue = 5 / 3 ;
        float myFloatValue = 5.25f / 3f;
        double myDoubleValue = 5.25 / 3.00;
        System.out.println("My int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

//        Challenge:
//        convert a given number of pounds to kilograms
        double conversionToPounds = 1000d;
        double convertedKilograms = conversionToPounds * 0.45359237d;
        System.out.println("pounds converted = " + convertedKilograms);

//        different ways you can write out a number
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
