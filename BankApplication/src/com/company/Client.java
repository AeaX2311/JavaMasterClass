package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Client {
    private final NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    private String name; private ArrayList<Double> transactions;

    public Client(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(transaction);
    }
    public void addTransaction(double amount){
        if(amount>0){
            transactions.add(amount);
            System.out.println("La transaccion se realizo correctamente.");
        }else {
            System.out.println("La transaccion no se realizo:");
            System.out.println("\tRevise la cantidad a ingresar.");
        }
    }
    public void checkBalance(){
        double balance=0;
        for(double x:transactions){
            balance+=x;
        }
        System.out.println("\tSu saldo total es de: "+ numberFormat.format(balance));
    }
    public void showTransactions(){
        int y=1;
        for(double x:transactions){
            System.out.println(" |"+y+"|- "+numberFormat.format(x));
            y++;
        }
        checkBalance();
    }
    public String getName() {
        return name;
    }
}
