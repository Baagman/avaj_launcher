/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WriteAndRead.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/03 16:04:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 13:23:19 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import za.wethinkcode.Aircraft.AircraftFactory;
import za.wethinkcode.Aircraft.Flyable;
import za.wethinkcode.Tower.WeatherTower;

public class WriteAndRead {
	public void WriteMessageToFile(String message) {
		try {
			Simulator.bufferedWriter.write(message);
			Simulator.bufferedWriter.newLine();
		} catch (IOException e) {
			System.out.println("Error: There was an error while writing to simulation file");
		}
	}

	public int ReadScenarioFile(File file, AircraftFactory aircraftFactory, WeatherTower tower) {
		int lineNumber = 1;
		int simulationRuns = 0;
		String lineRead = null;
		String[] splitParams;
		Flyable flyable;
		try {
			BufferedReader buff = new BufferedReader(new FileReader(file));
			while ((lineRead = buff.readLine()) != null) {
				if (lineNumber == 1) {
					try {
						simulationRuns = Integer.parseInt(lineRead);
						if (simulationRuns < 0) {
							System.out.println("Error: First Line of scenario file must be a positive integer...");
						}
					} catch (NumberFormatException numformatex) {
						System.out.println("Error: First Line of the scenario file must be a single integer...");
					}
				} else {
					splitParams = lineRead.split(" ");
					if ((splitParams.length == 1) && (splitParams[0].isEmpty()))
						continue;
					if (splitParams.length == 5) {
						flyable =  aircraftFactory.newAircraft(
							splitParams[0],
							splitParams[1],
							Integer.parseInt(splitParams[2]),
							Integer.parseInt(splitParams[3]), 
							Integer.parseInt(splitParams[4]));
						if (flyable != null)
							flyable.registerTower(tower);
					} else {
						System.out.println("Error: Lines must have 5 paramters seperated by a single space...");
					}
				}
				lineNumber++;
			}
			buff.close();
		} catch (IOException exception) {	
		}
		return simulationRuns;
	}
}
