public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen(new Stove("black"));
        Bathroom bathroom = new Bathroom(new Bath(false),"Blue",125.4);

        House miHouse = new House(kitchen,bathroom);

        miHouse.getKitchen().cook();
        miHouse.takeShower();

        System.out.println("AeaX");
    }
}
