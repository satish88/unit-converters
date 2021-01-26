import static org.testng.Assert.assertEquals;

public class KilogramGramTest {

    @org.testng.annotations.Test
    public void assertIntegerKilogramIntoGram() {
        KilogramGram test1 = new KilogramGram();
        float Gram = test1.convertKilogramIntoGram(4);
        assertEquals(Gram, 4000, "convert 4ks Kilogram ggs");
    }

    @org.testng.annotations.Test
    public void assertNegativeKilogramIntoGram() {
        KilogramGram test2 = new KilogramGram();
        float Gram = test2.convertKilogramIntoGram(-6);
        assertEquals(Gram, 0, "Negative unit can't be used");
    }

    @org.testng.annotations.Test
    public void assertNegativeFloatKilogramConvertIntoGram() {
        KilogramGram test3 = new KilogramGram();
        float Gram = test3.convertKilogramIntoGram(-67.83f);
        assertEquals(Gram, 0, "Negative unit can't be used");
    }

    @org.testng.annotations.Test
    public void assertFloatKilogramConvertIntoGram() {
        KilogramGram test4 = new KilogramGram();
        float Gram = test4.convertKilogramIntoGram(5.5683f);
        assertEquals(Gram, 5568.3f, "Convert 55683kgs into gms");
    }

    @org.testng.annotations.Test
    public void assertFloatKilogramConvertIntoGram2() {
        KilogramGram test5 = new KilogramGram();
        float Gram = test5.convertKilogramIntoGram(4.8f);
        assertEquals(Gram, 4800, "convert 4.8kgs into gms");
    }

    @org.testng.annotations.Test
    public void assertFloatKilogramConvertIntoGram3() {
        KilogramGram test6 = new KilogramGram();
        float Gram = test6.convertKilogramIntoGram(0.083f);
        assertEquals(Gram, 83, "convert 0.0838kgs into kgs");
    }

    @org.testng.annotations.Test
    public void assertZeroKilogramConvertIntoGram() {
        KilogramGram test7 = new KilogramGram();
        float Gram = test7.convertKilogramIntoGram(0);
        assertEquals(Gram, 0, "Convert 0gm into kg");
    }
}