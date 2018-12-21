public class Problem2 {
    public static void main(String[] args){
        System.out.print(run());
    }

    public static int run(){
        int sum = 0;
        int a = 1;
        int b = 2;
        while(a <= 4000000){
            if(a % 2 == 0){
                sum = sum + a;
            }
            int z = a+b;
            a = b;
            b = z;
        }

        return sum;
    }
}
