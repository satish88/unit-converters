public class MainClass {
    // members


    // methods


    // main method
    public static void main(String[] args) {
        System.out.println("What do you want to convert");
        // 1. Weight
        // 2. Distance
        // 3. Temperature
        // ...
        System.out.println("Input and Output Units");
        // 1. Celsius -> Fahrenheit
        // 2. F -> Celsius
        System.out.println("Enter input");
        /// ---- some magic ---


        MeterKilometer convert = new MeterKilometer();
        float result1= convert.convertMeterToKilometer(1200);
        System.out.println(result1);

        int result= convert.convertKilometerToMeter(9);
        System.out.println(result);




        System.out.println("Output: ");
    }

}
