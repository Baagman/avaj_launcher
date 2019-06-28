/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Baloon.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 12:49:49 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/28 13:59:11 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable {

	private WeatherTower weatherTower = new WeatherTower();

	public Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		if (weatherTower != null) {
			String currentWeather = weatherTower.getWeather(getCoordinates());
			System.out.println(currentWeather);
			switch (currentWeather) {
				case "SUN":
					getCoordinates().setHeight(getCoordinates().getHeight() + 4);
					getCoordinates().setLongitude(getCoordinates().getLongitude() + 2);
					break;
				case "RAIN":
					getCoordinates().setHeight(getCoordinates().getHeight() - 5);
					break;
				case "FOG":
					getCoordinates().setHeight(getCoordinates().getHeight() - 3);
					break;
				case "SNOW":
					getCoordinates().setHeight(getCoordinates().getHeight() - 15);
					break;
				default:
					System.out.println("Error: Unknown Weather");
			}
		}
	}

	public void registerTower() {

	}

	
}