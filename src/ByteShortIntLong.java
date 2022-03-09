public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // Shows minimum value for int
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // Shows maximum value for int

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMaxIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // Shows minimum value for byte
        System.out.println("Byte Maximum Value = " + myMaxByteValue); // Shows maximum value for byte

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println();


        int myTotal = (myMinIntValue / 2);

        //casting

        //java recognizes parentheses as INT, must declare what it should be in parentheses before equation.
        byte myNewByteValue = (byte) (myMinByteValue / 2);


    }
}
