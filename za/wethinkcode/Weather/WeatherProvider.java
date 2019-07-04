/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WeatherProvider.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 13:35:02 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 15:00:31 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Weather;
import java.util.Random;

import za.wethinkcode.Coordinates.*;

public class WeatherProvider {
	
	private static WeatherProvider weatherProvider = new WeatherProvider();
	private static Random random = new Random();
	private static String[] weather = {
		"SNOW",
		"SUN",
		"RAIN",
		"FOG"
	};

	public WeatherProvider() {
		
	}

	public static WeatherProvider getProvider() {
		return WeatherProvider.weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
		int weatherSeed = random.nextInt(4);
		return weather[weatherSeed % 4];
	}
}