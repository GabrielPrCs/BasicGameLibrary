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
package entities;

import boards.Cell;
import interfaces.LocalizableInterface;
import java.awt.Point;

/**
 * Class that models any entity that can be located in a 2D plane, that is, by
 * its x and y coordinates.
 *
 * @author gabpc
 */
public abstract class BasicEntity implements LocalizableInterface {

    /**
     * Enum used to indicate the current orientation of the entity. The entity
     * can be oriented at any of the 8 cardinal points.
     */
    protected static enum Orientation {
        NORTH,
        NORTHEAST,
        EAST,
        SOUTHEAST,
        SOUTH,
        SOUTHWEST,
        WEST,
        NORTHWEST;

        /**
         * Method that returns the next orientation in a clockwise rotation.
         *
         * @param orientation is the actual orientation.
         * @return the next orientation, based on the actual.
         */
        protected Orientation clockwiseRotation(Orientation orientation) {

            switch (orientation) {
                case NORTH:
                    return NORTHEAST;
                case NORTHEAST:
                    return EAST;
                case EAST:
                    return SOUTHEAST;
                case SOUTHEAST:
                    return SOUTH;
                case SOUTH:
                    return SOUTHWEST;
                case SOUTHWEST:
                    return WEST;
                case WEST:
                    return NORTHWEST;
                case NORTHWEST:
                    return NORTH;
                default:
                    return orientation;
            }

        }

        /**
         * Method that returns the next orientation in a anti-clockwise
         * rotation.
         *
         * @param orientation is the actual orientation.
         * @return the next orientation, based on the actual.
         */
        protected Orientation antiClockwiseRotation(Orientation orientation) {

            switch (orientation) {
                case NORTH:
                    return NORTHWEST;
                case NORTHEAST:
                    return NORTH;
                case EAST:
                    return NORTHEAST;
                case SOUTHEAST:
                    return EAST;
                case SOUTH:
                    return SOUTHEAST;
                case SOUTHWEST:
                    return SOUTH;
                case WEST:
                    return SOUTHWEST;
                case NORTHWEST:
                    return WEST;
                default:
                    return orientation;
            }

        }
    }

    /**
     * Variables that stores the current entity's position.
     */
    protected int xPosition, yPosition;
    
    /**
     * Variable that stores the current entity's orientation.
     */
    protected Orientation actualOrientation = null;

    /**
     * Constructor of the class in which the position of the entity is
     * initialized.
     *
     * @param x is the x-axis position.
     * @param y is the y-axis position.
     */
    public BasicEntity(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
        this.actualOrientation = Orientation.NORTH;
    }

    /**
     * Method that returns the current position on the X axis
     *
     * @return an integer with the actual x position.
     */
    @Override
    public int getXPosition() {
        return this.xPosition;
    }

    /**
     * Method that returns the current position on the Y axis
     *
     * @return an integer with the actual y position.
     */
    @Override
    public int getYPosition() {
        return this.yPosition;
    }

    /**
     * Method that returns the current position on the X axis and on the Y axis
     *
     * @return a Java AWT Point with the two current positions.
     */
    @Override
    public Cell getPosition() {
        return new Cell(this.xPosition, this.yPosition);
    }
}
