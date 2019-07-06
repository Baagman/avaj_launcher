/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/06 11:34:42 by tbaagman         ###   ########.fr       */
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
			File simulationFile = new File("simulation.txt");
			if ((scenarioFile.exists()) && (!scenarioFile.isDirectory())) {
				try {
					bufferedWriter = new BufferedWriter(new FileWriter(simulationFile));
					simulationRuns = writeAndRead.ReadScenarioFile(scenarioFile, new AircraftFactory(), tower);
					if (simulationRuns > 0) {
						while (simulationRuns > 0) {
							tower.changeWeather();
							simulationRuns--;
						}
						bufferedWriter.close();
					} else
						simulationFile.delete();
				} catch (IOException e) {
					System.out.println("Error: Cannot create output file..");
					simulationFile.delete();
				}
			} else {
				System.out.println("Error: Scenario file does not exist.");
				simulationFile.delete();
			}
		} else {
			System.out.println("Error: Please specify scenario file.");
		}
	}
}
