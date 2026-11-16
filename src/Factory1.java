public class Factory1 implements AbstractFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB createProduitB() {
        return new ProduitB1();
    }
}