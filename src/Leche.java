public class Leche extends DecoratorCafe{

    public Leche (Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "con Leche";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1;
    }
}
