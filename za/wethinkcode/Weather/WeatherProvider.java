/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WeatherProvider.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 13:35:02 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/27 16:51:31 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Weather;
import za.wethinkcode.Coordinates.*;

public class WeatherProvider {
	
	private static WeatherProvider weatherProvider = new WeatherProvider();
	private static String[] weather = {
		"RAIN",
		"SUN",
		"SNOW",
		"FOG"
	};

	public WeatherProvider() {
		
	}

	public static WeatherProvider getProvider() {
		return WeatherProvider.weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
		int weatherSeed = coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight();
		return weather[weatherSeed % 4];
	}
}