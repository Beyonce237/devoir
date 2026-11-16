public class Client {
    public static void main(String[] args) {
        System.out.println("Famille 1 :");
        utiliserFactory(new Factory1());

        System.out.println("Famille 2 :");
        utiliserFactory(new Factory2());

        System.out.println("Famille 3 :");
        utiliserFactory(new Factory3());
    }

    private static void utiliserFactory(AbstractFactory factory) {
        ProduitA produitA = factory.createProduitA();
        ProduitB produitB = factory.createProduitB();
        produitA.methodeproduitA();
        produitB.methodeproduitB();
    }
}