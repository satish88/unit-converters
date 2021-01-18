public class KilogramGram {
    public static int convertKilogramIntoGram(int kg) {
        int gram;
        gram = 1000 * kg;
        return gram;
    }
    public static void main(String[] args) {
        int result = convertKilogramIntoGram(45);
        System.out.println(result);
    }
}


