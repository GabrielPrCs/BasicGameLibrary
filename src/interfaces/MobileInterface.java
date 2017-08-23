/*
 * Copyright (C) 2017 gabpc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package interfaces;

import exceptions.InvalidMovementException;
import java.awt.Point;

/**
 * An interface that defines all the methods that a mobile object must implement
 * for its correct operation.
 *
 * @author gabpc
 */
public interface MobileInterface {

    /**
     * Method that moves the object that implements the interface a distance dx
     * on the X axis, and a distance dy on the Y axis.
     *
     * @param delta is a Java AWT Point with the dx and dy displacements.
     * @throws InvalidMovementException is an exception that occurs when the
     * object tries to make an invalid movement.
     */
    void move(Point delta) throws InvalidMovementException;

}
