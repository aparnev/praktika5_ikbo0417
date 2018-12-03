public class Main {
    public static void printRecursive(int n){
        printRecursive(0, n);
    }

    public static void printRecursive(int i, int n){
        if(i >= n)
            return;
        System.out.print(n + " ");
        printRecursive(i + 1, n);
    }

    public static void recursion(int n) {
        recursion(0, n);
    }

    public static void recursion(int i, int n){
        if(i > n)
            return;
        printRecursive(i);
        System.out.print('\n');
        recursion(i + 1, n);
    }

    public static void main(String[] args) {
        if(args.length > 0){
            recursion(Integer.parseInt(args[0]));
        }

    }
}
