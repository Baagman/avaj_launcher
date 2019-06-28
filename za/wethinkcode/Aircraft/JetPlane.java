/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   JetPlane.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 12:53:52 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/28 13:52:34 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.Coordinates;
import za.wethinkcode.Tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
	
	private WeatherTower weatherTower = new WeatherTower();
	
	public JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		if (weatherTower != null) {
			String currentWeather = weatherTower.getWeather(getCoordinates());
			System.out.println(currentWeather);
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

	public void registerTower() {

	}
}