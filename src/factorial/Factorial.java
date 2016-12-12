package factorial;

public class Factorial {

    public static void main(String[] args) {

        int value;
        int factor;

        value = 8;

        int i;
        if (value == 0) {
            factor = 1;
        } else {
            factor = 1;
            for (i = value; i >= 1; i--) {
                factor = factor * i;
            }
        }

        System.out.println(factor);

    }

}
