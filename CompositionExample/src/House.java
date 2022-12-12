public class House {
    private Kitchen kitchen;
    private Bathroom bathroom;

    public House(Kitchen kitchen, Bathroom bathroom) {
        this.kitchen = kitchen;
        this.bathroom = bathroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void takeShower(){
        bathroom.getBath().fillWater();
        System.out.println("Ahora puedes tomar la ducha");
    }
}
