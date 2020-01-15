public class SimpleCalculation {
    static int sum = 0;
    static int mult = 1;

    static int add(int x, int y){
        return x + y;
    }
    static int add(int...a){
        for (int c = 0; c<a.length; c++){
            sum = sum + a[c];
        }
        return sum;
    }
    static int multiply(int x, int y){
        return x * y;
    }
    static int multiply(int... a){
        for (int c = 0; c<a.length; c++){
            mult = mult* a[c];
        }
        return mult;
    }


}