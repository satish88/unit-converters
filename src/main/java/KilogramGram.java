public class KilogramGram {
    public float convertKilogramIntoGram(float kg) {
        if (kg > 0) {
            float gram = kg * 1000;
            return gram;
        } else {
            return 0;
        }
    }
}