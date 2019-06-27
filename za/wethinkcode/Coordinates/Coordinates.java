/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 13:51:47 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 17:19:35 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Coordinates;

public class Coordinates {
	private int latitude;
	private	int	longitude;
	private	int	height;

	public 	Coordinates(int longitude, int latitude, int height) {
		setHeight(height);
		setLatitude(latitude);
		setLongitude(longitude);
	}

	public	int	getLatitude() {
		return this.latitude;
	}

	public	int	getLongitude() {
		return this.longitude;
	}

	public	int	getHeight() {
		return height;
	}

	public	void setHeight(int height) {
		if (height < 0) 
			height = 0;
		else if ( height > 100)
			height = 100;
		this.height = height;
	}

	public	void setLatitude(int latitude) {
		if (latitude < 0)
			latitude = 0;
		this.latitude = latitude;
	}

	public	void setLongitude(int longitude) {
		if (longitude < 0)
			longitude = 0;
		this.longitude = longitude;
	}
}
