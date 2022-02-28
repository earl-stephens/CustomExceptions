package application;

import application.exceptions.TemperatureOutOfRangeException;

public class Thermostat {
	public void setTemperature (double temperature) throws TemperatureOutOfRangeException {
		setMachineTemperature(temperature);
		System.out.println("Setting temperature to " + temperature);
	}

	public void setMachineTemperature(double temperature) throws TemperatureOutOfRangeException{
		if(temperature < 0 || temperature > 35) {
			throw new TemperatureOutOfRangeException("Temperature out of range");
		}
	}
}

/* no clear direction on when to use exceptions
 * a lot of the time it's used for major errors
 * Exceptions do have some advantages.
 * Some only throw exceptions when there is a 
 * serious problem with the program that is not
 * really expected
 */

/* Checked or unchecked exception? Kind of have to use
 * your own judgment.  Use checked if you really want your
 * user to handle the error
 */
