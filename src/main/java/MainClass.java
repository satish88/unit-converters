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

        //converting grams into kilograms
        GramKilogram converting1 = new GramKilogram();
        float result1 = converting1.convertGramIntoKilogram(735f);
        System.out.println(result1 + "Kilograms");

        //converting kilograms into grams
        KilogramGram converting2 = new KilogramGram();
        float result2 = converting2.convertKilogramIntoGram(0.5f);
        System.out.println(result2 + "Grams");

        System.out.println("Output: ");
    }

}
