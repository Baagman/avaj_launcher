/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Helicopter.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 16:27:44 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 17:03:09 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircrafts;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Tower.WeatherTower;

public class Helicopter extends Craft implements Flyable {

	private WeatherTower weatherTower = new WeatherTower();
	public Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
		System.out.println(name + " has been created");
	}

	public void updateConditions() {
		String weather = weatherTower.getWeather(getCoordinates());
		if (weather == "SUN") {
			getCoordinates().setHeight(getCoordinates().getHeight() + 2);
			getCoordinates().setLongitude(getCoordinates().getLongitude() + 10);
		} else if (weather == "RAIN") {
			getCoordinates().setLongitude(getCoordinates().getLongitude() + 5);
		} else if (weather == "FOG") {
			getCoordinates().setLongitude(getCoordinates().getLongitude() + 1);
		} else if (weather == "SNOW") {
			getCoordinates().setHeight(getCoordinates().getHeight() - 12);
		}
	}

	public void registerTower() {
		
	}
}