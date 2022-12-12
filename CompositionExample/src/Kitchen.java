public class Kitchen {
    private Stove stove;

    public void cook(){
        stove.turnOnStove();
        System.out.println("Ahora puedes cocinar.");
    }

    public Kitchen(Stove stove) {
        this.stove = stove;
    }

    public Stove getStove() {
        return stove;
    }

}

class Stove{
    private String color;

    public void turnOnStove(){
        System.out.println("Se encendio la estufa.");
    }
    public Stove(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
