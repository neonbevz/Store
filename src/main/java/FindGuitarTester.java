public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        initializeInventory(inv);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);

        Guitar guitar = inv.search(whatErinLikes);

    }

    private static void initializeInventory(Inventory inv) {
        inv.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
    }
}
