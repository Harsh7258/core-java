package methods;

public class method2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 17;

        int sum = add(x , y);
        System.out.println(sum);
    }
    static int add(int x, int y){
        int sum = x + y;
        return sum;
    }
}
