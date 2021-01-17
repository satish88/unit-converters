public class EvenOddProgram {
    // if else example

    public static void main(String[] args) {
        int i = 3;
        if (i % 2 == 0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        System.out.println("end of method");
    }

    public static void main1(String[] args) {
        int i = 3;
        if (i % 2 == 0 ) {
            System.out.println("Even");
            return;
        }

        System.out.println("Odd");

    }
}
