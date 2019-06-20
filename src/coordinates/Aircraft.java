/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 15:00:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/20 15:33:04 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import coordinates.*;

public class 	Aircraft {
	protected 	Coordinates coordinates;
	protected 	String		name;
	protected 	long		id;
	private		long		idcounter;

	protected	Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		if (coordinates != null) {
			this.coordinates = coordinates;
		}
	}
}
