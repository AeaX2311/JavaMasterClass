package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(1547231);
    }
    public static int reverse(int n){
        int reversa=0;
        while(n!=0){
            reversa=reversa*10 + n%10;
            n/=10;
        }
        return reversa;
    }
    public static int getDigitCount(int n){
        if(n<0)
            return -1;

        int sum=1;n/=10;
        while (n!=0){
            sum++;
            n/=10;
        }
        return sum;
    }

    public static void numberToWords(int n){
        if(n<0)
            System.out.println("Invalid Value");

        int m=n,repz=0,aux=getDigitCount(n); n=reverse(n);

        if(aux!=getDigitCount(m))
            repz=getDigitCount(m)-1;

        for(int x=1;x<=aux;x++){
            m=n%10; n/=10;
            switch (m){
                case 0: System.out.println("Zero");break;
                case 1: System.out.println("One");break;
                case 2: System.out.println("Two");break;
                case 3: System.out.println("Three");break;
                case 4: System.out.println("Four");break;
                case 5: System.out.println("Five");break;
                case 6: System.out.println("Six");break;
                case 7: System.out.println("Seven");break;
                case 8: System.out.println("Eight");break;
                case 9: System.out.println("Nine");break;
            }
        }
        for(int x=0;x<repz;x++)
            System.out.println("Zero");
    }



}
