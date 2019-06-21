/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 15:32:20 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import Coordinates.Coordinates;
import Aircraft.Aircraft;
import Aircraft.Helicopter.Helicopter;
import Aircraft.JetPlane.JetPlane;

public class Simulator {
	public static void main(String[] args) {
		Coordinates coordinates = new Coordinates(10, 10, 10);
		Aircraft aircraft = new Helicopter("Helicopter", coordinates);
	}
}
