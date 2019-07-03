/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 15:00:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/03 13:42:17 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Coordinates.*;

abstract public class 	Aircraft {
	protected Coordinates coordinates;
	protected String name;
	protected long id;
	private long idcounter;

	protected Aircraft(String name, Coordinates coordinates) {
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
