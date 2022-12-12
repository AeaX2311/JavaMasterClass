package com.company;
import java.util.ArrayList;

public class Phone {
    private ArrayList<Contact> listContacts = new ArrayList<>();

    public void updateContact(int position, String newName, String newPhone){
        if(position>=0) {
            String name = listContacts.get(position-1).getName();
            listContacts.set(position - 1, new Contact(newName, newPhone));
            System.out.println("Se actualizo el contacto \""+name+"\" correctamente.");
        }else
            System.out.println("El contacto que desea actualizar no existe.");
    }
    public void updateContact(String name, String newName, String newPhone){
        updateContact(getNamePosition(name),newName,newPhone);
    }

    public void deleteContact(int position){
        if(position>=0) {
            String name = listContacts.get(position-1).getName();
            listContacts.remove(position-1);
            System.out.println("Se removio \"" + name + "\" de la lista de contactos.");
        }else
            System.out.println("El contacto que desea eliminar no existe.");
    }
    public void deleteContact(String name){
        deleteContact(getNamePosition(name));
    }
    public void addContact(String name, String phone){
        if(getNamePosition(name)==-1) {
            listContacts.add(new Contact(name, phone));
            System.out.println("El contacto se agrego correctamente.");
        }else {
            System.out.println("No se agrego el contacto:");
            System.out.println("\tYa existe un contacto con este nombre.");
        }
    }
    public void showContacts(){
        if(listContacts.size()>0) {
            int x = 1;
            for (Contact X : listContacts) {
                System.out.println("[" + x + "]- " + X.getName()+" | "+X.getPhone());
                x++;
            }
        }else
            System.out.println("No hay contactos.");
    }
    private int getNamePosition(String name){
        int y=1;
        for (Contact x: listContacts) {
            if(x.getName().equals(name))
                return y;
            y++;
        }
        return -1;
    }
}
