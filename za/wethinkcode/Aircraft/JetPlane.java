/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   JetPlane.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 12:53:52 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 13:16:51 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

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
			switch (currentWeather) {
				case "SUN":
					getCoordinates().setHeight(getCoordinates().getHeight() + 2);
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 10);
					break;
				case "RAIN":
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 5);
					break;
				case "FOG":
					getCoordinates().setLatitude(getCoordinates().getLatitude() + 1);
					break;
				case "SNOW":
					getCoordinates().setHeight(getCoordinates().getHeight() - 7);
					break;
				default:
					System.out.println("Error: Unknown Weather");
			}
		}
	}

	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		this.weatherTower.register(this);
		writeAndRead.WriteMessageToFile("Tower says: JetPlane#" + getName() + "(" + getId() + ") registered to weather tower.");
	}
}