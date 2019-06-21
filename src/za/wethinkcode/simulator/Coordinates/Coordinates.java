/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 13:51:47 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 15:50:51 by tbaagman         ###   ########.fr       */
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
		return latitude;
	}

	public	int	getLongitude() {
		return longitude;
	}

	public	int	getHeight() {
		return height;
	}

	public	void setHeight(int height) {
		this.height = height;
	}

	public	void setLatitue(int latitude) {
		this.latitude = longitude;
	}

	public	void setLongitude(int longitude) {
		this.longitude = longitude;
	}
}
