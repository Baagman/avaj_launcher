/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: tbaagman <tbaagman@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 14:13:38 by tbaagman          #+#    #+#             */
/*   Updated: 2019/06/28 11:59:35 by tbaagman         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package za.wethinkcode.Aircraft;

public interface Flyable {
    public abstract void updateConditions();
    public abstract void registerTower();
}