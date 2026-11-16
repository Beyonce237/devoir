public class Factory3 implements AbstractFactory {
    @Override
    public ProduitA createProduitA() {
        return new ProduitA3();
    }

    @Override
    public ProduitB createProduitB() {
        return new ProduitB3();
    }
}