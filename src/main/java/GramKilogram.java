public class GramKilogram {
    public static float convertGramIntoKilogram(int gm) {
        float kilogram;
        kilogram = gm / 1000.0f;
        return kilogram;
    }

    public static void main(String[] args) {
        float result1 = convertGramIntoKilogram(6500);
        System.out.println(result1);
    }
}