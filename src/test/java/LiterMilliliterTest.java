import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LiterMilliliterTest {

    //Liter to Milliliter test cases
    @Test
    public void assertFloatLiterGetConvertedIntoMilliliterCorrectly() {
        LiterMilliliter converter = new LiterMilliliter();
        //float value of liter;
        float liter=3.5f;
        System.out.println(liter + "l");
        int milliliter = converter.convertLiterToMilliliter(liter);
        assertEquals(milliliter, 3500, "convert 3.5l to ml");
    }

    @Test
    public void assertIntLiterGetConvertedIntoMilliliterCorrectly() {
        LiterMilliliter converter = new LiterMilliliter();
        //int value of liter;
        float liter=8f;
        System.out.println(liter + "l");
        int milliliter = converter.convertLiterToMilliliter(liter);
        assertEquals(milliliter, 8000, "convert 8l to ml");
    }

    @Test
    public void assertLessThanZeroLiterGetConvertedIntoMilliliterCorrectly() {
        LiterMilliliter converter = new LiterMilliliter();
        // liter < 0;
        float liter = -700f;
        System.out.println(liter + "l");
        int milliliter = converter.convertLiterToMilliliter(liter);
        assertEquals(milliliter, 0, "convert -700l to ml");
    }

    @Test
    public void assertLessThanOneLiterGetConvertedIntoMilliliterCorrectly() {
        LiterMilliliter converter = new LiterMilliliter();
        //liter < 1;
        float liter = 0.5f;
        System.out.println(liter + "l");
        int milliliter = converter.convertLiterToMilliliter(liter);
        assertEquals(milliliter, 500, "convert 0.5l to ml");
    }


    //Milliliter to Liter test cases
    @Test
    public void assertIntMilliliterGetConvertedIntoLiterCorrectly () {
        LiterMilliliter converter = new LiterMilliliter();
        //int milliliter value;
        float milliliter = 2000f;
        System.out.println(milliliter + "ml");
        float liter = converter.convertMilliliterToLiter(milliliter);
        assertEquals(liter,2, "convert 2000ml to l" );
    }

    @Test
    public void assertFloatMilliliterGetConvertedIntoLiterCorrectly () {
        LiterMilliliter converter = new LiterMilliliter();
        //float milliliter value;
        float milliliter = 150.2f;
        System.out.println(milliliter + "ml");
        float liter = converter.convertMilliliterToLiter(milliliter);
        assertEquals(liter,0.1502, "convert 1502ml to l" );

    }

    @Test
    public void assertIntMilliliterNotMultipleOfFiveHundredGetConvertedIntoLiterCorrectly () {
        LiterMilliliter converter = new LiterMilliliter();
        // Milliliter value not a multiple of 500;
        float milliliter = 1200f;
        System.out.println(milliliter + "ml");
        float liter = converter.convertMilliliterToLiter(milliliter);
        assertEquals(liter,1.2, "convert 1200ml to l" );
    }

    @Test
    public void assertLessThanZeroFloatMilliliterGetConvertedIntoLiterCorrectly () {
        LiterMilliliter converter = new LiterMilliliter();
        //float milliliter value less than zero;
        float milliliter = -2500f;
        System.out.println(milliliter + "ml");
        float liter = converter.convertMilliliterToLiter(milliliter);
        assertEquals(liter,0, "convert -2500ml to l" );

    }

    @Test
    public void assertLessThanOneFloatMilliliterGetConvertedIntoLiterCorrectly () {
        LiterMilliliter converter = new LiterMilliliter();
        //float milliliter value less than one;
        float milliliter = 0.500f;
        System.out.println(milliliter + "ml");
        float liter = converter.convertMilliliterToLiter(milliliter);
        assertEquals(liter,0, "convert 0.500ml to l" );

    }

}