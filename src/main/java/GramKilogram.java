public class GramKilogram {
    public float convertGramIntoKilogram(float gm) {
        if (gm > 0) {
            float kilogram = gm / 1000.0f;
            return kilogram;
        } else {
            return 0;
        }
    }
}