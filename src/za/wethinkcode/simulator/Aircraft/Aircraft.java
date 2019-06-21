/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 15:00:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 16:07:27 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Aircraft;

import Coordinates.Coordinates;

public class 	Aircraft {
	protected 	Coordinates coordinates;
	protected 	String		name;
	protected 	long		id;
	private		long		idcounter;

	protected  Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		if (coordinates != null) {
			this.coordinates = coordinates;
		}
	}

	public	long	getIdCounter() {
		return idcounter;
	}
	public	Coordinates	getCoordinates() {
		return coordinates;
	}

	public	String	getName() {
		return name;
	}

	public	long	getId() {
		return id;
	}
}
