/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Baloon.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 12:49:49 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/06 12:10:34 by tbaagman         ###   ########.fr       */
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
			
			if (getCoordinates().getHeight() == 0) {
				writeAndRead.WriteMessageToFile("Baloon#" + getName() + "(" + getId() + ") landing.");
				writeAndRead.WriteMessageToFile("Tower says: Baloon#" + getName() + "(" + getId() + ") unregistered from weather tower.");
				weatherTower.unregister(this);
				return ;
			}
			
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
				break;
			default:
				System.out.println("Uhm we seem to be having some weather problem");
				return ;
			}
			
			if ((message.get(currentWeather) != null) && (!message.get(currentWeather).isEmpty())) {
				writeAndRead.WriteMessageToFile("Baloon#" + getName() + "(" + getId() + "): " + message.get(currentWeather));	
			}		
		}
		return ;
	}

	public void registerTower(WeatherTower weatherTower) {
		if (weatherTower != null) {
			this.weatherTower = weatherTower;
			this.weatherTower.register(this);
			writeAndRead.WriteMessageToFile("Tower says: Baloon#" + getName() + "(" + getId() + ") registered to weather tower.");
		}
		return ;
	}	
}