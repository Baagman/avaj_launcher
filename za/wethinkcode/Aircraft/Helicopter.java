/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Helicopter.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 16:27:44 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/28 13:59:04 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

	private WeatherTower weatherTower = new WeatherTower();
	public Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		String currentWeather = weatherTower.getWeather(getCoordinates());

		switch (currentWeather) {
			case "SUN":
				getCoordinates().setHeight(getCoordinates().getHeight() + 2);
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 10);
				break;
			case "RAIN":
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 5);
				break;
			case "FOG":
				getCoordinates().setLongitude(getCoordinates().getLongitude() + 1);
				break;
			case "SNOW":
				getCoordinates().setHeight(getCoordinates().getHeight() - 12);
				break;
			default:
				System.out.println("Error: Unknown Weather");
		}
	}

	public void registerTower() {
		
	}
}