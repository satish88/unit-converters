import static org.testng.Assert.*;

public class TestExampleTest {

    @org.testng.annotations.Test
    public void assertIntegerGramsGetConvertedIntoKgsCorrectly() {
        TestExample  example = new TestExample();
        float kilograms = example.convertGramIntoKilogram(1000);
        assertEquals(kilograms, 1, "converting 1000 gms to kgs");
    }

    @org.testng.annotations.Test
    public void assertFloatingGramsGetConvertedIntoKgsCorrectly() {
        TestExample example = new TestExample();
        float kilograms = example.convertGramIntoKilogram(1500);
        assertEquals(kilograms, 1.5, "converting 1500 gms to kgs");
    }

    @org.testng.annotations.Test
    public void assertZeroGramsGetConvertedIntoKgsCorrectly() {
        TestExample  example = new TestExample();
        float kilograms = example.convertGramIntoKilogram(23);
        assertEquals(kilograms, 0.023000000044703484, "converting 23 gms to kgs");
    }

}