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


        MinuteHour convert = new MinuteHour();
        float result1 = convert.convertMinuteToHour(150);
        System.out.println(result1);

        int result = convert.convertHourToMinute(4);
        System.out.println(result);



        System.out.println("Output: ");
    }

}
