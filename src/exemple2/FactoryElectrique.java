package exemple2;

public class FactoryElectrique extends AbstractFactory {
    @Override
    public Automobile ConstruireAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Scooter ConstruireScooter() {
        return new ScooterElectrique();
    }

    @Override
    public Locomotive ConstruireLocomotive() {
        return new LocomotiveElectrique();
    }
}