public class Canela extends DecoratorCafe{

    public Canela(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " con Canela";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.5;
    }
}
