/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Helicopter.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 16:27:44 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/06 12:05:02 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import java.util.HashMap;
import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Simulator.WriteAndRead;
import za.wethinkcode.Tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

	private WeatherTower weatherTower = new WeatherTower();
	private WriteAndRead writeAndRead = new WriteAndRead();
	
	public Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		String currentWeather = weatherTower.getWeather(getCoordinates());
		HashMap <String, String> message = new HashMap<String, String>();

		if (getCoordinates().getHeight() == 0) {
			writeAndRead.WriteMessageToFile("Helicopter#" + getName() + "(" + getId() + ") landing.");
			writeAndRead.WriteMessageToFile("Tower says: Helicopter#" + getName() + "(" + getId() + ") unregistered from weather tower.");
			this.weatherTower.unregister(this);
			return ;
		}
		
		switch (currentWeather) {
			case "SUN":
				getCoordinates().setHeight(getCoordinates().getHeight() + 2);
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 10);
				message.put(currentWeather, "This is hot.");
				break;
			case "RAIN":
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 5);
				message.put(currentWeather, "Ehh time to turn on the wipers.");
				break;
			case "FOG":
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 1);
				message.put(currentWeather, "Thank God for the rader.");
				break;
			case "SNOW":
				getCoordinates().setHeight(getCoordinates().getHeight() - 12);
				message.put(currentWeather, "My rotor is going to freeze!");
				break;
			default:
				System.out.println("Uhm we seem to be having some weather problem");
				return ;
		}

		if ((message.get(currentWeather) != null) && (!message.get(currentWeather).isEmpty())) {
			writeAndRead.WriteMessageToFile("Helicopter#" + getName() + "(" + getId() + "): " + message.get(currentWeather));
		}
		return ;
	}

	public void registerTower(WeatherTower weatherTower) {
		if (weatherTower != null) {
			this.weatherTower = weatherTower;
			this.weatherTower.register(this);
			writeAndRead.WriteMessageToFile("Tower says: Helicopter#" + getName() + "(" + getId() + ") registered to weather tower.");
		}
	}
}