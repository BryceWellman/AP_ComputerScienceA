public class SwapAlgorithm {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int c = a;
        a = b;
        b = c;

        System.out.println("The value stored in var a is: "+ a);
        System.out.println("The value stored in var b is: "+ b);
    }
}