import static org.testng.Assert.assertEquals;

public class GramKilogramTest {

    @org.testng.annotations.Test
    public void assertIntegerGramConvertIntoKilogram() {
        GramKilogram test1 = new GramKilogram();
        float Kilogram = test1.convertGramIntoKilogram(4000);
        assertEquals(Kilogram, 4, "convert 4000gms Kilogram kgs");
    }

    @org.testng.annotations.Test
    public void assertNegativeGramConvertIntoKilogram() {
        GramKilogram test2 = new GramKilogram();
        float Kilogram = test2.convertGramIntoKilogram(-6000);
        assertEquals(Kilogram, 0, "Negative unit can't be used");
    }

    @org.testng.annotations.Test
    public void assertNegativeFloatGramConvertIntoKilogram() {
        GramKilogram test3 = new GramKilogram();
        float Kilogram = test3.convertGramIntoKilogram(-6783);
        assertEquals(Kilogram, 0, "Negative unit can't be used");
    }

    @org.testng.annotations.Test
    public void assertFloatGramConvertIntoKilogram() {
        GramKilogram test4 = new GramKilogram();
        float Kilogram = test4.convertGramIntoKilogram(5500);
        assertEquals(Kilogram, 5.5f, "Convert 5500gms into kilogram");
    }

    @org.testng.annotations.Test
    public void assertFloatGramConvertIntoKilogramAgain() {
        GramKilogram test5 = new GramKilogram();
        float Kilogram = test5.convertGramIntoKilogram(4800);
        assertEquals(Kilogram, 4.8f, "convert 4800gms into kgs");
    }

    @org.testng.annotations.Test
    public void assertFloatGramConvertIntoKilogramOnceAgain() {
        GramKilogram test6 = new GramKilogram();
        float Kilogram = test6.convertGramIntoKilogram(38768);
        assertEquals(Kilogram, 38.768f, "convert 38768gms into kgs");
    }

    @org.testng.annotations.Test
    public void assertZeroGramConvertIntoKilogram() {
        GramKilogram test7 = new GramKilogram();
        float Kilogram = test7.convertGramIntoKilogram(0);
        assertEquals(Kilogram, 0, "Convert 0gm into kg");
    }
}
