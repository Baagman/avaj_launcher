/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WeatherTower.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 14:32:04 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 14:57:59 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Tower;

import za.wethinkcode.Coordinates.*;
import za.wethinkcode.Weather.*;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates) {
		return WeatherProvider.getProvider().getCurrentWeather(coordinates);
	}

	public void changeWeather() {
		this.changeConditions();
	}
}