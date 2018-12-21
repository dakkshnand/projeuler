public class Problem3 {
    public static void main(String[] args){
        System.out.print(run());
    }

    public static String run(){
        long n = 600851475143L;
        while(true){
            long p = smallestFactor(n);
            if(p<n){
                n /= p;
            } else{
                return Long.toString(n);
            }
        }
    }

    public static long smallestFactor(long n){
        if(n<=1){
            throw new IllegalArgumentException();
        }

        for(long i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return i;
            }
        }
        return n;
    }
}
