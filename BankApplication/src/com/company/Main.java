package com.company;
public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank("Torotiba");
        myBank.addBranch(new Branch("AeaX"));
        myBank.addBranch(new Branch("aEAx2"));
        myBank.showBranches();
        myBank.getBranch(1).addClient(new Client("Alan",1000));
        myBank.getBranch(1).addClient(new Client("Alan",1000));
        myBank.getBranch(1).addClient(new Client("Abiud",1000));
        myBank.getBranch(1).addClient(new Client("Castro",1000));
        myBank.getBranch(1).deleteClient("Abiud");
        myBank.getBranch(1).showClients();
        myBank.getBranch(1).getClient(1).addTransaction(-23);
        myBank.getBranch(1).getClient(1).addTransaction(530.32);
        myBank.getBranch(1).getClient(1).showTransactions();

    }
}
