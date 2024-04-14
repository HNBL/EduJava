package lab.lab2.calc;

class Calculate {

    public static void main (String[] args){
       System.out.println(Sum(956,6));
        System.out.println(Minus(9.6,6));
        System.out.println(Del(9.6,6));
        System.out.println(Multi(9.6,665456655));
    }


    static int Sum(int a, int b) {
      return a+b;
    }
    static double Sum(double a, double b) {
        return a+b;
    }
    static long Sum(long a, long b) {
        return  a+b;
    }



    static int Minus(int a, int b) {
        return a-b;
    }
    static double Minus(double a, double b) {
        return a-b;
    }
    static long Minus(long a, long b) {
        return a-b;
    }



    static int Del(int a, int b) {
        return  a / b;
    }
    static double Del(double a, double b) {
        return  a / b;
    }
    static long Del(long a, long b) {
        return a / b;
    }


    static int Multi(int a, int b)
    {
        return a*b;
    }
    static double Multi(double a, double b)
    {
        return a*b;
    }
    static long Multi(long a, long b)
    {
        return a*b;
    }
}
