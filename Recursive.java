//Recursive 

public static int fibonacciRecursive(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}
//Iterative

public static int fibonacciIterative(int n) {
    if (n <= 1) {
        return n;
    }
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}

//Recursive

public static String decimalToBinaryRecursive(int n) {
    if (n == 0) {
        return "0";
    }
    if (n == 1) {
        return "1";
    }
    return decimalToBinaryRecursive(n / 2) + (n % 2);
}
//Iterative

public static String decimalToBinaryIterative(int n) {
    if (n == 0) return "0";
    StringBuilder binary = new StringBuilder();
    while (n > 0) {
        binary.insert(0, n % 2);
        n = n / 2;
    }
    return binary.toString();
}
