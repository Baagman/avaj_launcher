/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Helicopter.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/20 16:27:44 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/21 13:05:34 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Aircraft.Helicopter;
import Aircraft.Aircraft;
import Coordinates.Coordinates;

public class Helicopter extends Aircraft {

    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
        System.out.println(name + " has been created");
    }
}