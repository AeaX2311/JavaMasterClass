package com.company;

public class Main {
    /*  PRIMERA SOLUCION HECHA
        public static int getLargestPrime(int n){
            if(n<=1)
                return -1;
            boolean isPrime1;
            for(int x=n;x>=2;x--){
                isPrime1=true;
                for(int z=2;z<=Math.sqrt(x);z++){
                    if(n%z==0) {
                        isPrime1 = false;
                        break;
                    }
                }

                if(isPrime1){
                    for(int y=1;y<=n;y++){
                        if(x*y==n)
                            return x;
                    }
                }
            }
            return -1;
        }
    */
    public static int getLargestPrime (int number){
        if (number<= 1)
            return -1;

        int divisor = 2;
        while(divisor < number) {
            if(number % divisor != 0) {
                divisor++;
            }else {
                number /= divisor;
                divisor = 2;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("__"+getLargestPrime(217));
        /*
         * CASOS DE PRUEBA
         * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
         * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
         * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
         * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
         * getLargestPrime (-1); should return -1 since the parameter is negative
         * */
    }
}
