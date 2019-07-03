/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WriteToFile.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/07/03 16:04:07 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/03 16:22:47 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Simulator;

import java.io.IOException;

public class WriteToFile {
	public void WriteMessageToFile(String message) {
		try {
			Simulator.writer.write(message);
		} catch (IOException e) {
			System.out.println("Error: There was an error while wrtting to file");
		}
	}
}