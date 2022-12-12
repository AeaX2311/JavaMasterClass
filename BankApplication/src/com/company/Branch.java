package com.company;
import java.util.ArrayList;

public class Branch {
    private String name; private ArrayList<Client> clientsList;

    public Client getClient(int position){
        return clientsList.get(position-1);
    }

    public Branch(String name) {
        this.name = name;
        clientsList = new ArrayList<>();
    }

    public void showClients(){
        int y=1;
        for(Client x:clientsList){
            System.out.println(y+"- "+x.getName());
            y++;
        }
    }
    public void deleteClient(int position){
        if(position>=0){
            clientsList.remove(position-1);
        }else{
            System.out.println("No se elimino el cliente:");
            System.out.println("\t No existe tal cliente.");
        }
    }
    public void deleteClient(String name){
        deleteClient(getNamePosition(name));
    }
    private int getNamePosition(String name){
        if(nameExists(name)){
            int y=1;
            for(Client x:clientsList){
                if(x.getName().equals(name))
                    return y;
                y++;
            }
        }
        return -1;
    }
    public void addClient(Client newClient){
        if(!nameExists(newClient.getName())) {
            clientsList.add(newClient);
            System.out.println("El cliente se agrego correctamente.");
        }else{
            System.out.println("No se agrego el cliente:");
            System.out.println("\t Ya existe un cliente con este nombre.");
        }
    }
    private boolean nameExists(String name){
        for(Client x:clientsList){
            if(x.getName().equals(name))
                return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }
}
