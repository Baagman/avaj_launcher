/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 17:20:26 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;
import za.wethinkcode.Coordinates.*;
import za.wethinkcode.Aircrafts.*;


public class Simulator {
	public static void main(String[] args) {
		JetPlane helicopter = new JetPlane("Helicopter", new Coordinates(1, 2, 34));
		helicopter.updateConditions();
		System.out.println(helicopter.getCoordinates().getLongitude());
		System.out.println(helicopter.getCoordinates().getLatitude());
		System.out.println(helicopter.getCoordinates().getHeight());
	}
}
