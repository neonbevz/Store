import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private LinkedList<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar other) {
        for (Guitar guitar : guitars) {
            if (guitar.getBuilder() != other.getBuilder())
                continue;
            String model = other.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals((guitar.getModel().toLowerCase()))))
                continue;
        }
        return null;
    }


}
