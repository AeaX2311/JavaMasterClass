package com.company;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	    Album myAlbum1 = new Album("Album 1",new Song("a1s1",231));
	    myAlbum1.addSong(new Song("a1s2",311));
        myAlbum1.addSong(new Song("a1s3",312341));

        PlayList myPlayList1 = new PlayList("Play List 1", myAlbum1.getSong(1));
        myPlayList1.addSong(myAlbum1.getSong(2));
        myPlayList1.addSong(myAlbum1.getSong(3));

        Album myAlbum2 = new Album("Album 2",new Song("a2s1",231));
        myAlbum2.addSong(new Song("a2s2",311));
        myAlbum2.addSong(new Song("a2s3",312341));

        PlayList myPlayList2 = new PlayList("Play List 2", myAlbum2.getSong(1));
        myPlayList2.addSong(myAlbum2.getSong(2));
        myPlayList2.addSong(myAlbum2.getSong(3));

        toPlay(myPlayList1);
        toPlay(myPlayList2);

    }

    public static void toPlay(PlayList playList){
        int value=1; boolean dir=true;
        System.out.println("\n\t|Reproduciendo playlist: "+playList.getName()+"|");
        ListIterator<Song> iterator = playList.getIterator();
        iterator.next().playSong();
        printMenu();

        while(value!=0) {
            System.out.print("\t--> ");
            value = sc.nextInt();
            switch (value) {
                case 0: break;
                case 1:
                    playList.printSongs(); break;
                case 2:
                    if(!dir){
                        if (iterator.hasNext())
                            iterator.next();
                        dir=true;
                    }
                    if(iterator.hasNext()) {
                        iterator.next().playSong(); dir=true;
                    }else{
                        System.out.println("Se termino la lista de reproduccion.");
                        System.out.println("Ingrese 0 para salir, o 5 para reiniciar lista");
                    } break;
                case 3:
                    if(dir){
                        if (iterator.hasPrevious())
                            iterator.previous();
                        dir=false;
                    }
                    if(iterator.hasPrevious()) {
                        iterator.previous().playSong(); dir=false;
                    }else{
                        System.out.println("Te encuentras en la primer cancion.");
                    }break;
                case 4:
                    printMenu(); break;
                case 5:
                    toPlay(playList);
                default:
                    System.out.println("OPCION INVALIDA.");
            }
        }
        System.out.println("Cerrando playlist..");
    }

    public static void printMenu(){
        System.out.println("\nSeleccione una opcion:");
        System.out.println("[0]- Salir.");
        System.out.println("[1]- Mostrar todas las canciones en la lista actual.");
        System.out.println("[2]- Siguiente cancion.");
        System.out.println("[3]- Cancion anterior.");
        System.out.println("[4]- Imprimir menu.");
    }
}
