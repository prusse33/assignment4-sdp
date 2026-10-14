public class SmartHomeFacade {

    private final SecuritySystem security;
    private final LightingSystem lights;
    private final ClimateSystem climate;
    private final SmartLock lock;

    public SmartHomeFacade() {
        security = new SecuritySystem();
        lights = new LightingSystem();
        climate = new ClimateSystem();
        lock = new SmartLock();
    }

    public void leaveHome() {
        System.out.println("Leaving home...");

        lights.turnOff();
        lock.lock();
        security.activate();

        System.out.println("Home is secured.");
    }

    public void arriveHome() {
        System.out.println("Arriving home...");

        security.deactivate();
        lock.unlock();
        lights.turnOn();

        System.out.println("Welcome home!");
    }

    public void prepareComfortMode(int temperature) {
        System.out.println("Preparing comfort mode...");

        lights.turnOn();
        climate.setTemperature(temperature);

        System.out.println("Comfort mode is ready.");
    }
}