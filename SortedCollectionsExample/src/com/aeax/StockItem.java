package com.aeax;

public class StockItem implements Comparable<StockItem> {
    private final String name;private double price;private int quantityStock;

    public StockItem(String name, double price) {
        this(name,price,0);
    }
    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantityStock) {
        int newQuantityStock = this.quantityStock+quantityStock;
        if(newQuantityStock>=0)
            this.quantityStock = newQuantityStock;
    }

    @Override
    public int compareTo(StockItem o) {
        if(this == o)
            return 0;
        if(o!=null)
            return this.name.compareTo(o.getName());

        throw new NullPointerException();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(obj==null || obj.getClass() != this.getClass())
            return false;

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
