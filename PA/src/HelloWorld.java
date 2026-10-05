public class HelloWorld {

    public static int[] foo(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.print("Hello World");

        int[] asjldhfa = foo(8);
        for (int i = 0; i < asjldhfa.length; i++) {
            System.out.print(asjldhfa[i]);
        }
    }

}
