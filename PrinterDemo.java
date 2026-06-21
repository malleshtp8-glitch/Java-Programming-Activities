class Printer {

    void print(int n) {
        System.out.println("Integer: " + n);
    }

    void print(String str) {
        System.out.println("String: " + str);
    }

    void print(int arr[]) {
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class PrinterDemo {
    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(100);
        p.print("Hello Java");

        int arr[] = {10, 20, 30, 40, 50};
        p.print(arr);
    }
}