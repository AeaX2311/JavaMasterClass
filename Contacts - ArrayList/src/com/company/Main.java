package com.company;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        int aux; String auxName, auxPhone;
        System.out.print("Selecciona una opcion:"); printMenu();
        aux=sc.nextInt();
        if(aux!=0){
            do{
                sc.nextLine();
                switch (aux){
                    case 1:
                        printMenu(); break;
                    case 2:
                        System.out.print("Ingrese el nombre del nuevo contacto: "); auxName=sc.nextLine();
                        System.out.print("Ingrese el numero para \""+auxName+"\": "); auxPhone=sc.nextLine();
                        myPhone.addContact(auxName,auxPhone); break;
                    case 3:
                        System.out.print("Desea eliminar por nombre <0> o por posicion <1>. Seleccione la opcion-->"); aux=sc.nextInt(); sc.nextLine();
                        if(aux==0){
                            System.out.print("Ingrese el nombre del contacto a eliminar : "); auxName=sc.nextLine();
                            myPhone.deleteContact(auxName);
                        }else{
                            System.out.print("Ingrese la posicion del contacto a eliminar: "); aux=sc.nextInt();
                            myPhone.deleteContact(aux);
                        } break;
                    case 4:
                        System.out.print("Desea actualizar por nombre <0> o por posicion <1>. Seleccione la opcion-->"); aux=sc.nextInt(); sc.nextLine();
                        if(aux==0){
                            System.out.print("Ingrese el nombre del contacto a actualizar : "); auxName=sc.nextLine();
                            System.out.print("Ingrese el nuevo nombre del contacto: "); String auxNewName=sc.nextLine();
                            System.out.print("Ingrese el nuevo numero para el contacto: "); auxPhone=sc.nextLine();
                            myPhone.updateContact(auxName,auxNewName,auxPhone);
                        }else{
                            System.out.print("Ingrese la posicion del contacto a actualizar : "); aux=sc.nextInt(); sc.nextLine();
                            System.out.print("Ingrese el nuevo nombre del contacto: "); auxName=sc.nextLine();
                            System.out.print("Ingrese el nuevo numero para el contacto: "); auxPhone=sc.nextLine();
                            myPhone.updateContact(aux,auxName,auxPhone);
                        } break;
                    case 5:
                        myPhone.showContacts(); break;
                    default:
                        System.out.println("Opcion invalida"); break;
                }
                System.out.print("\nSelecciona una opcion: "); aux=sc.nextInt();
            }while (aux!=0);
        }
        System.out.print("\nCerrando aplicacion...");
    }
    public static void printMenu(){
        System.out.println("\n<0> Salir.");
        System.out.println("<1> Mostrar menu.");
        System.out.println("<2> Agregar contacto.");
        System.out.println("<3> Eliminar contacto.");
        System.out.println("<4> Actualizar contacto.");
        System.out.println("<5> Mostrar lista de contactos.");
    }
}
