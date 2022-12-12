package com.company;

public class LinkedListA implements ActionsNode{
    private ListItem root;

    public LinkedListA(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public void addValue(ListItem newItem) {
        if (this.root == null)
            this.root = newItem;
        else {
            for (ListItem currentItem = this.root; currentItem != null; currentItem = currentItem.nextValue()) {
                int comparison = currentItem.compareTo(newItem);
                if (comparison >= 0) {
                    if (comparison > 0) {
                        if (currentItem.previousValue() != null) {
                            currentItem.previousValue().setNextValue(newItem).setPreviousValue(currentItem.previousValue());
                            newItem.setNextValue(currentItem).setPreviousValue(newItem);
                        } else {
                            newItem.setNextValue(this.root).setPreviousValue(newItem);
                            this.root = newItem;
                        } return;
                    }

                    System.out.println("\t\""+newItem.getValue() + "\" Ya existe no se agrego."); return;
                }

                if (currentItem.nextValue() == null) {
                    currentItem.setNextValue(newItem).setPreviousValue(currentItem); return;
                }
            }
        }
    }

    @Override
    public void removeValue(ListItem listItem) {
        if(listItem!=null) {
            ListItem aux = this.root;
            while (aux!=null){
                if(aux.compareTo(listItem)==0){
                    if(aux.previousValue()==null)
                        this.root=aux.nextValue();
                    else if(aux.nextValue()==null)
                        aux.previousValue().setNextValue(null);
                    else
                        aux.previousValue().setNextValue(aux.nextValue()).setPreviousValue(aux.previousValue());

                    System.out.println("\tSe removio correctamente");
                    return;
                }
                aux=aux.nextValue();
            }
        }
        System.out.println("No se removio:");
        System.out.println("\tNo existe tal elemento.");
    }

    @Override
    public void traverse(ListItem listItem) {
        /* RECURSIVIDAD
        if(listItem!=null){
            System.out.println(listItem.getValue());
            traverse(listItem.nextValue());
        }*/
        if(listItem==null)
            System.out.println("La lista esta vacia.");
        else {
            int y = 1;
            while (listItem != null) {
                System.out.println(y + "- " + listItem.getValue());
                y++;
                listItem = listItem.nextValue();
            }
        }
    }
}
