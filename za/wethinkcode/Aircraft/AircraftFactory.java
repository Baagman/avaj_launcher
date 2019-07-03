/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   AircraftFactory.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/03 13:32:51 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/03 13:45:46 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.Coordinates;

public class AircraftFactory {
	public Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
		Coordinates coordinates = new Coordinates(longitude, latitude, height);
		if (type.equalsIgnoreCase("Helicopter")) {
			return new Helicopter(name, coordinates);
		} else if (type.equalsIgnoreCase("JetPlane")) {
			return new JetPlane(name, coordinates);
		} else if (type.equalsIgnoreCase("Baloon")) {
			return new Baloon(name, coordinates);
		}
		return null;   
	}
}