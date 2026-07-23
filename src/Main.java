void main() {

        Cafe pedido = new Espresso();
        pedido = new Canela(pedido);
        pedido = new Leche(pedido);
        System.out.println(pedido.getDescripcion());
        System.out.println(pedido.getCosto());

        Cafe pedido1 = new Cappuchino();
        pedido1 = new Chocolate(pedido1);
        System.out.println(pedido1.getDescripcion());
        System.out.println(pedido1.getCosto());

}