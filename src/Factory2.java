public class Factory2 implements AbstractFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB createProduitB() {
        return new ProduitB2();
    }
}