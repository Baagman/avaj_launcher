/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/05 14:28:22 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import za.wethinkcode.Aircraft.AircraftFactory;
import za.wethinkcode.Tower.WeatherTower;

public class Simulator {
	public static BufferedWriter bufferedWriter;
	public static void main(String[] args) {
		if (args.length == 1) {
			File scenarioFile = new File(args[0]);
			WriteAndRead writeAndRead = new WriteAndRead();
			WeatherTower tower = new WeatherTower();
			int simulationRuns;
			if ((scenarioFile.exists()) && (!scenarioFile.isDirectory())) {
				try {
					File simulationFile = new File("simulation.txt");
					bufferedWriter = new BufferedWriter(new FileWriter(simulationFile));
					simulationRuns = writeAndRead.ReadScenarioFile(scenarioFile, new AircraftFactory(), tower);
					if (simulationRuns > 0) {
						while (simulationRuns > 0) {
							tower.changeWeather();
							simulationRuns--;
						}
						bufferedWriter.close();
					}
				} catch (IOException e) {
					System.out.println("Error: Cannot create output file..");
				}
			} else {
				System.out.println("Error: Please specify scenario file.");
			}
		}
	}
}
