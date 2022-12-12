package com.company;
import java.util.ArrayList;

public class Bank {
    private String name; private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches=new ArrayList<>();
    }
    public void showBranches(){
        int y=1;
        for(Branch x:branches){
            System.out.println(y+"- "+x.getName());
            y++;
        }
    }
    public Branch getBranch(int position){
        return branches.get(position-1);
    }
    public void addBranch(Branch newBranch){
        branches.add(newBranch);
        System.out.println("Se creo una nueva sucursal.");
    }

    public String getName() {
        return name;
    }
}
