package com.company;

public abstract class ListItem {
    protected ListItem right; protected ListItem left; protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

        public abstract ListItem nextValue();
        public abstract ListItem previousValue();

        public abstract ListItem setNextValue(ListItem listItem);
        public abstract void setPreviousValue(ListItem listItem);

        public abstract int compareTo(ListItem listItem);


    public Object getValue() {
        return value;
    }

    public void setValue(Object actualValue) {
        this.value = actualValue;
    }
}
