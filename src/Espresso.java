public class Espresso implements Cafe{

    @Override
    public String getDescripcion() {
        return "Expresso";
    }

    @Override
    public double getCosto() {
        return 5;
    }
}
