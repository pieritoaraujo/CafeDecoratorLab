public abstract class DecoratorCafe implements Cafe{
    protected Cafe cafe;

    public DecoratorCafe(Cafe cafe){
        this.cafe = cafe;
    }
}
