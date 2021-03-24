public class NewClass {

    public static void main(String[] args) {
        System.out.println("Hello World");
        test();
        test_two(test());
        test_two("String one");
    }

    public static String test() {
        System.out.println("Test One");
        return "";
    }

    static void test_two(String st1) {
        System.out.println(st1);
        String st2 = st1 + " to the power of two";
        System.out.println("String one");
        System.out.println(st2);
    }
}
