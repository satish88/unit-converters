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
        int input = 5;  // we have collected user input into this variable
        // we want to convert weight and what is the input

        if (input < 0) {
            System.out.println("you have entered invalid input");
            return;
        }

        // actual logic


        /// ---- some magic ---

        LiterMilliliter converter = new LiterMilliliter();
        int result = converter.convertLiterToMilliliter(1f);
        System.out.println(result +"milliliter");

        LiterMilliliter converter1 = new LiterMilliliter();
        float result1 = converter1.convertMilliliterToLiter(0.200f);
        System.out.println(result1 + "liter");



        System.out.println("Output: ");
    }

}
