/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   JetPlane.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 12:53:52 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 15:08:16 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Aircraft.JetPlane;

import Coordinates.Coordinates;
import Aircraft.Aircraft;

public class	JetPlane extends Aircraft {
	public JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
		System.out.println(name + " has been created");
	}
}