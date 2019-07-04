/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Tower.java                                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 12:55:23 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/04 13:14:43 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Tower;

import java.util.ArrayList;
import za.wethinkcode.Aircraft.Flyable;

public class Tower {
	private ArrayList<Flyable> observers = new ArrayList<Flyable>();

	public void register(Flyable flyable) {
		if (observers.contains(flyable)) {
			return ;
		}
		observers.add(flyable);
		return ;
	}

	public void	unregister(Flyable flyable) {
		if (observers.contains(flyable)) {
			observers.remove(flyable);
		}
		return ;
	}

	protected void changeConditions() {
		int numberOfAircrats = 0;
		while (numberOfAircrats < observers.size()) {
			observers.get(numberOfAircrats).updateConditions();
			numberOfAircrats++;
		}
		return ;
	}
}