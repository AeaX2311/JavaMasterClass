package com.company;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem nextValue() {
        return this.right;
    }

    @Override
    public ListItem setNextValue(ListItem listItem) {
        this.right = listItem;
        return this.right;
    }
    @Override
    public ListItem previousValue() {
        return this.left;
    }

    @Override
    public void setPreviousValue(ListItem listItem) {
        this.left = listItem;
//        return this.left;
    }

    @Override
    public int compareTo(ListItem listItem) {
        if(listItem!=null)
            return ((String)super.getValue()).compareTo((String)listItem.getValue());
        return -1;
    }
}
