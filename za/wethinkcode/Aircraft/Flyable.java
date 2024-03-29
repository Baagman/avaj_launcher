/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 14:13:38 by tbaagman          #+#    #+#             */
/*   Updated: 2019/07/03 14:29:09 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

import za.wethinkcode.Tower.WeatherTower;

public interface Flyable {
    public abstract void updateConditions();
    public abstract void registerTower(WeatherTower weatherTower);
}