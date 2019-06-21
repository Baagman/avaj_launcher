/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 15:56:16 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import Coordinates.Coordinates;
import Aircraft.Aircraft;
import Aircraft.Helicopter.Helicopter;
import Aircraft.JetPlane.JetPlane;

public class Simulator {
	public static void main(String[] args) {
		Aircraft helicopter = new Helicopter("Helicopter", new Coordinates(10, 10, 10));
		helicopter.getCoordinates().setHeight(100);
		System.out.println(helicopter.getCoordinates().getHeight());
	}
}
