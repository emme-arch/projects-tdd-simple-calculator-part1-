public class Main {

    public static void main(String[] args) {
        System.out.println(SimpleCalculation.add(1,2));
// should return 3
        System.out.println(SimpleCalculation.add(-1,-1));
// should return -2
        System.out.println(SimpleCalculation.add(1,2,3,4,5));
// should return 15
        System.out.println(SimpleCalculation.add(1,2));
// should still return 3
        System.out.println(SimpleCalculation.add(-1,-1));
// should still return -2
        System.out.println(SimpleCalculation.multiply(1,3));
// should return 3
        System.out.println(SimpleCalculation.multiply(-1,3));
// should return -3
        System.out.println(SimpleCalculation.multiply(1,2,3,4,5));
// should return 120
        System.out.println(SimpleCalculation.multiply(1,3));
// should still return 3
        System.out.println(SimpleCalculation.multiply(-1,3));
// should still return -3
    }
}
