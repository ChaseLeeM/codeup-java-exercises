public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition(7,9));
        System.out.println(Subtraction(4,7));
        System.out.println(Multiplication(6,8));
        System.out.println(Division(12,4));
        System.out.println(Division(36,2) % Multiplication(2,4));

    }
    public static int Addition(int x, int y){
        return x + y;
    }
    public static int Subtraction(int x, int y){
        return x - y;
    }
    public static int Multiplication(int x, int y){
        return x * y;
    }
    public static int Division(int x, int y){
        return x / y;
    }



}
