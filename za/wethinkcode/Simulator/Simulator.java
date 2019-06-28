/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 12:17:55 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/28 16:59:31 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;

import java.io.*;

public class Simulator {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("simulation.txt");
			writer.write("Hello World");
			writer.close();
			
		} catch (IOException e) {
			System.out.println("ERROR WHILE WRITTING TO FILE");
		}
	}
}
