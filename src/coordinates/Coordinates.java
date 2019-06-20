/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 13:51:47 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/20 16:21:10 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Coordinates;

public class Coordinates {
	private int latitude;
	private	int	longitude;
	private	int	height;

	public 	Coordinates(int longitude, int latitude, int height) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}

	public	int	getLatitude() {
		return this.latitude;
	}

	public	int	getLongitude() {
		return this.longitude;
	}

	public	int	getHeight() {
		return this.height;
	}

}
