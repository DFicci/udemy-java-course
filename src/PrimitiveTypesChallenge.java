public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
       byte randomByteNumber = 56;
       short randomShortNumber = 30;
       int randomIntNumber = 3;

       long myLongNumber = 5000L + 10L * (randomByteNumber + randomShortNumber + randomIntNumber);
       System.out.println(myLongNumber);

       short shortTotal = (short) (1000 + 10 *
               (randomByteNumber + randomShortNumber + randomIntNumber));
        System.out.println(shortTotal);
    }
}
