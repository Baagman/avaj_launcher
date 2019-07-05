/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   JetPlane.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 12:53:52 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/05 17:06:35 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import java.util.HashMap;
import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Simulator.WriteAndRead;
import za.wethinkcode.Tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
	
	private WeatherTower weatherTower = new WeatherTower();
	private WriteAndRead writeAndRead = new WriteAndRead();
	
	public JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		if (weatherTower != null) {
			String currentWeather = weatherTower.getWeather(getCoordinates());
			HashMap <String, String> message = new HashMap<String, String>();
	 		switch (currentWeather) {
				case "SUN":
					getCoordinates().setHeight(getCoordinates().getHeight() + 2);
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 10);
					message.put(currentWeather, "Where is the Aircon.");
					break;
				case "RAIN":
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 5);
					message.put(currentWeather, "It's raining. Better watch out for lightings.");
					break;
				case "FOG":
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 1);
					message.put(currentWeather, "MAYDAY MAYDAY this is The Pilot my vision has been impaired.");
					break;
				case "SNOW":
					getCoordinates().setHeight(getCoordinates().getHeight() - 7);
					message.put(currentWeather, "OMG! Winter is coming!");
					break;
				default:
					System.out.println("Uhm we seem to be having some weather problem");
					return ;
			}
			
			if (getCoordinates().getHeight() == 0) {
				writeAndRead.WriteMessageToFile("JetPlane#" + getName() + "(" + getId() + ") landing.");
				writeAndRead.WriteMessageToFile("Tower says: JetPlane#" + getName() + "(" + getId() + ") unregistered from weather tower.");
				weatherTower.unregister(this);
			} else if ((message.get(currentWeather) != null) && (!message.get(currentWeather).isEmpty())) {
				writeAndRead.WriteMessageToFile("JetPlane#" + getName() + "(" + getId() + "): " + message.get(currentWeather));
			}
		}
	}

	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		this.weatherTower.register(this);
		writeAndRead.WriteMessageToFile("Tower says: JetPlane#" + getName() + "(" + getId() + ") registered to weather tower.");
	}
}