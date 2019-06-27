/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Craft.java                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 15:00:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 16:32:15 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircrafts;

import za.wethinkcode.Coordinates.*;

abstract public class 	Craft {
	protected Coordinates coordinates;
	protected String name;
	protected long id;
	private long idcounter;

	protected Craft(String name, Coordinates coordinates) {
		this.name = name;
		if (coordinates != null) {
			this.coordinates = coordinates;
		}
	}

	public	long	getIdCounter() {
		return this.idcounter;
	}
	public	Coordinates	getCoordinates() {
		return this.coordinates;
	}

	public	String	getName() {
		return this.name;
	}

	public	long	getId() {
		return this.id;
	}
}
