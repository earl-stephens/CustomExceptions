package application;

public class Thermostat {
	public void setTemperature (double temperature) {
		setMachineTemperature(temperature);
		System.out.println("Setting temperature to " + temperature);
	}

	public void setMachineTemperature(double temperature) {
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("Temperature out of range");
		}
	}
}
