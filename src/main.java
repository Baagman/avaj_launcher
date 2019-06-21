/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 13:17:41 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import Coordinates.Coordinates;
import Aircraft.Aircraft;
import Aircraft.Helicopter.Helicopter;
import Aircraft.JetPlane.JetPlane;

class Simulator {
	public static void main(String[] args) {
		Coordinates coordinates = new Coordinates(10, 10, 10);
		Aircraft helicopter = new Helicopter("Helicopter", coordinates);
		Aircraft jetplane = new JetPlane("JetPlane", coordinates);
	}
}
