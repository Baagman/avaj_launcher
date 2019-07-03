/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/03 15:20:41 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;

import java.io.*;

import za.wethinkcode.Aircraft.AircraftFactory;
import za.wethinkcode.Aircraft.Flyable;
import za.wethinkcode.Tower.WeatherTower;

public class Simulator {
	public static FileWriter writer;
	public static void main(String[] args) {
		File simulationFile = new File("simulation.txt");
		try {
			if (args.length == 1) {
				File file = new File(args[0]);
				if ((file.exists()) && (!file.isDirectory())) {
					int lineNumber = 1;
					int simulationRuns = 0;
					BufferedReader buff = new BufferedReader(new FileReader(file));
					String lineRead = null;
					String[] splittedParams;
					AircraftFactory aircraftFactory = new AircraftFactory();
					WeatherTower weatherTower = new WeatherTower();
					writer = new FileWriter(simulationFile);
					while ((lineRead = buff.readLine()) != null) {
						if (lineNumber == 1) {
							try {
								simulationRuns = Integer.parseInt(lineRead);
								if (simulationRuns < 0) {
									System.out.println("Error: First Line of scenario file must be a positive integer...");
									return ;
								}
							} catch (NumberFormatException numformatex) {
								System.out.println("Error: First Line of the scenario file must be a single integer...");
								return ;
							}
						} else {
							splittedParams = lineRead.split(" ");
							if ((splittedParams.length == 1) && (splittedParams[0].isEmpty()))
								continue;
							if (splittedParams.length == 5) {
								System.out.println(splittedParams[0]);
								System.out.println(splittedParams[1]);
								System.out.println(splittedParams[2]);
								System.out.println(splittedParams[3]);
								System.out.println(splittedParams[4]);
							} else {
								System.out.println("Error: Lines must have 5 paramters seperated by a single space...");
							}
						}
						lineNumber++;
					}
				}
			} else {
				System.out.println("Error: Missing scenario file");
				return ;
			}
		} catch (Exception ex) {
			ex.printStackTrace();	
		}
	}
}
