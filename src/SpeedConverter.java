public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHOur){

        if(kilometersPerHOur < 0){
            System.out.println("invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHOur);
            System.out.println(kilometersPerHOur + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
