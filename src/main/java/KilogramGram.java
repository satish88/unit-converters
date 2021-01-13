public class KilogramGram {
    public static void convertKilogramIntoGram(int kg) {
        int gram;
        gram = 1000 * kg;
        System.out.println(gram);
    }
    public static void convertGramIntoKilogram(int gm){
        float kilogram;
        kilogram = gm / 1000.0f;
        System.out.println(kilogram);
    }

    public static void main(String[] args) {
        System.out.println();
        convertKilogramIntoGram(45);
        convertGramIntoKilogram(6500);
    }
}


