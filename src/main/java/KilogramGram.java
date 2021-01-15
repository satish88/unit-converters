public class KilogramGram {
    public static int convertKilogramIntoGram(int kg) {
        int gram;
        gram = 1000 * kg;
        return gram;
    }

    public static float convertGramIntoKilogram(int gm) {
        float kilogram;
        kilogram = gm / 1000.0f;
        return kilogram;
    }

    public static void main(String[] args) {
        int result = convertKilogramIntoGram(45);
        float result1 = convertGramIntoKilogram(6500);
        System.out.println(result);
        System.out.println(result1);
    }
}


