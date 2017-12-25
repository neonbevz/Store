public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            case OLSON: return "Olson";
            case RYAN:  return "Ryan";
            case MARTIN: return "Martin";
            case PRS: return "PRS";
            case ANY: return "Any";
            default: return "builder";
        }
    }
}
