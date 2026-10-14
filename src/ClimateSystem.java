public class ClimateSystem {

    public void setTemperature(int temperature) {
        if (temperature < 16 || temperature > 30) {
            throw new IllegalArgumentException(
                    "Temperature must be between 16 and 30."
            );
        }

        System.out.println("Temperature set to " + temperature + " degrees.");
    }
}