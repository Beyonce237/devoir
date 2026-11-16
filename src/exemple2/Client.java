package exemple2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Famille essence :");
        utiliserFactory(new FactoryEssence());

        System.out.println("Famille electrique :");
        utiliserFactory(new FactoryElectrique());
    }

    private static void utiliserFactory(AbstractFactory factory) {
        Automobile automobile = factory.ConstruireAutomobile();
        Scooter scooter = factory.ConstruireScooter();
        automobile.methodeAutomobile();
        scooter.methodeScooter();
    }
}