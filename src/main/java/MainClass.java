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

        LiterMilliliter converter = new LiterMilliliter();
        int result;
        result = converter.convertLiterToMilliliter(3);
        System.out.println(result);

        float result1;
        result1 = converter.convertMilliliterToLiter(800);
        System.out.println(result1);










        System.out.println("Output: ");
    }

}
