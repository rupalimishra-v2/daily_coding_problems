package Easy;

public class FactorialOfNumber {
    public int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(new FactorialOfNumber().factorial(5));
    }
}
