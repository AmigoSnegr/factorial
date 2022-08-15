public class Factorial {
    public static void main(String[] args) {
        System.out.println(findNFactorial(10));
    }

    public static int findNFactorial(int a) {
        int tmp;
        int i = a - 1;
        if (a == 0 || a == 1) {
            return (1);
        }
        System.out.println(i);
        tmp = a - i;
        while (a - i != a) {
            i--;
            tmp = tmp * (a - i);
        }
        return (tmp);
    }
}
