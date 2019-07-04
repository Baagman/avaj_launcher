/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Baloon.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 12:49:49 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 14:16:08 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import java.util.HashMap;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Simulator.WriteAndRead;
import za.wethinkcode.Tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable {

	private WeatherTower weatherTower = new WeatherTower();
	private WriteAndRead writeAndRead = new WriteAndRead();

	public Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		if (weatherTower != null) {
			String currentWeather = weatherTower.getWeather(getCoordinates());
			HashMap <String, String> message = new HashMap<String, String>();
			
			switch (currentWeather) {
			case "SUN":
				getCoordinates().setHeight(getCoordinates().getHeight() + 4);
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 2);
				message.put(currentWeather, "Let's enjoy the good weather and take some pics.");
				break;
			case "RAIN":
				getCoordinates().setHeight(getCoordinates().getHeight() - 5);
				message.put(currentWeather, "Damn you rain! You messed up my baloon.");
				break;
			case "FOG":
				getCoordinates().setHeight(getCoordinates().getHeight() - 3);
				message.put(currentWeather, "My eyes I can't see.");
				break;
			case "SNOW":
				getCoordinates().setHeight(getCoordinates().getHeight() - 15);
				message.put(currentWeather, "It's snowing we're gonna crash");
			}

			if (getCoordinates().getHeight() == 0) {
				writeAndRead.WriteMessageToFile("Baloon#" + getName() + "(" + getId() + ") landing.");
				weatherTower.unregister(this);
			} else if (message.get(currentWeather) != null) {
				writeAndRead.WriteMessageToFile("Baloon#" + getName() + "(" + getId() + "): " + message.get(currentWeather));	
			}
				
		}
		return ;
	}

	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		weatherTower.register(this);
		writeAndRead.WriteMessageToFile("Tower says: Baloon#" + getName() + "(" + getId() + ") registered to weather tower.");
	}	
}