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

import java.awt.Point;

/**
 * An interface that defines all the methods that any object that can be
 * localized must implement.
 *
 * It is assumed that the object is in the XY plane, ie in 2D.
 *
 * @author gabpc
 */
public interface LocalizableInterface {

    /**
     * Method that returns the current position on the X axis
     *
     * @return an integer with the actual x position.
     */
    int getXPosition();

    /**
     * Method that returns the current position on the Y axis
     *
     * @return an integer with the actual y position.
     */
    int getYPosition();

    /**
     * Method that returns the current position on the X axis and on the Y axis
     *
     * @return a Java AWT Point with the two points.
     */
    Point getPosition();
}
