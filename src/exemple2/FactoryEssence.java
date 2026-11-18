package exemple2;

public class FactoryEssence extends AbstractFactory {
    @Override
    public Automobile ConstruireAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter ConstruireScooter() {
        return new ScooterEssence();
    }

    @Override
    public Locomotive ConstruireLocomotive() {
        return new LocomotiveEssence();
    }
}