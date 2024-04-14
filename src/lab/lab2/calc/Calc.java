package lab.lab2.calc;

class Calculate {

    public static void main(String[] args) {
        System.out.println(sum(956, 6));
        System.out.println(minus(9.6, 6));
        System.out.println(del(9.6, 6));
        System.out.println(multi(9.6, 665456655));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static long sum(long a, long b) {
        return a + b;
    }


    static int minus(int a, int b) {
        return a - b;
    }

    static double minus(double a, double b) {
        return a - b;
    }

    static long minus(long a, long b) {
        return a - b;
    }


    static double del(int a, int b) {
        return (double) a / b;
    }

    static double del(double a, double b) {
        return a / b;
    }

    static double del(long a, long b) {
        return (double) a / b;
    }


    static int multi(int a, int b) {
        return a * b;
    }

    static double multi(double a, double b) {
        return a * b;
    }

    static long multi(long a, long b) {
        return a * b;
    }
}
