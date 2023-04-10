public class Main {
    public static void main(String[] args) {
        Bicycle kama = new Bicycle("Kama", 2);
        Bicycle ural = new Bicycle("Ural", 4);

        kama.updateTyre(ural);
    }
}