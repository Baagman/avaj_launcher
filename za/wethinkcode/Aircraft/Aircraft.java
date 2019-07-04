/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 15:00:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 11:18:56 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.*;

abstract public class 	Aircraft {
	protected Coordinates coordinates;
	protected String name;
	protected long id;
	private static long idcounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		if (coordinates != null) {
			this.coordinates = coordinates;
			this.id = nextId();
		}
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

	public	long	nextId() {
		return ++idcounter;
	}
}
