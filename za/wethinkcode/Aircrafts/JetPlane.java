/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   JetPlane.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 12:53:52 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 17:09:01 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircrafts;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Tower.WeatherTower;

public class JetPlane extends Craft implements Flyable {
	
	private WeatherTower weatherTower = new WeatherTower();
	
	public JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
		System.out.println(name + " has been created");
	}

	public void updateConditions() {
		String weather = weatherTower.getWeather(getCoordinates());
		
		if (weather == "SUN") {
			getCoordinates().setHeight(getCoordinates().getHeight() + 2);
			getCoordinates().setLatitude(getCoordinates().getLatitude() + 10);
		} else if (weather == "RAIN") {
			getCoordinates().setLatitude(getCoordinates().getLatitude() + 5);
		} else if (weather == "FOG") {
			getCoordinates().setLatitude(getCoordinates().getLatitude() + 1);
		} else if (weather == "SNOW") {
			getCoordinates().setHeight(getCoordinates().getHeight() - 7);
		}
	}

	public void registerTower() {

	}
}