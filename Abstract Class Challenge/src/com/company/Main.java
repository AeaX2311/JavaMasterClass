package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedListA l = new LinkedListA(new Node("Alan"));

        addElements("Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra Alan Abiud Castro Cruz",l);
        addElements("X",l);
        l.traverse(l.getRoot());
        l.removeValue(new Node("Alan"));
        l.traverse(l.getRoot());
    }
    public static void addElements(String stringData, LinkedListA l){
        String[] data = stringData.split(" ");
        for (String s : data) {
            l.addValue(new Node(s));
        }
    }
}
