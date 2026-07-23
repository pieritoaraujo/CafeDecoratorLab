public class Chocolate extends DecoratorCafe{

    public Chocolate(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "con Chocolate";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1.8;
    }
}
