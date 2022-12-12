public class Bathroom {
    private Bath bath;
    private String color;
    private double area;

    public Bathroom(Bath bath, String color, double area) {
        this.bath = bath;
        this.color = color;
        this.area = area;
    }

    public Bath getBath() {
        return bath;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}

class Bath{
    private boolean water;

    public Bath(boolean water) {
        this.water = water;
    }

    public boolean isWater() {
        return water;
    }

    public void fillWater(){
        water = true;
        System.out.println("La bañera se lleno de agua");
    }
}
