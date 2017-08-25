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
package boards;

import interfaces.LocalizableInterface;
import java.awt.Point;
import java.util.HashMap;

/**
 * A cell is the smallest unit on a board. It has a fixed position, and can not
 * be moved. In addition, it has a number of individual (but not necessarily
 * unique) properties to the other cells.
 *
 * @author gabpc
 */
public final class Cell implements LocalizableInterface {

    /**
     * Variables that stores the position of the Cell. They are final because a
     * cell can not be moved.
     */
    private final int xPosition, yPosition;

    /**
     * A HashMap which contains all the properties of the Cell. As key accepts a
     * String descriptive of the property. As value accepts any object, and it
     * will be the responsibility of the programmer to properly handle this.
     */
    private HashMap<String, Object> properties = null;

    /**
     * Creates a new cell in the position indicated, and with the property
     * "empty" equal to true,
     *
     * @param x is the x-axis position of the cell.
     * @param y is the y-axis position of the cell.
     */
    public Cell(int x, int y) {
        this.properties = new HashMap<>();
        this.xPosition = x;
        this.yPosition = y;
        this.setPropertie("Empty", true);
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
     * @return a Java AWT Point with the two points.
     */
    @Override
    public Point getPosition() {
        return new Point(this.xPosition, this.yPosition);
    }

    /**
     * Sets the value of a property. If the property does not exist, create it.
     * If the property exists, update it.
     *
     * @param key is the String that identifies the propertie.
     * @param value is the value of the propertie.
     */
    public final void setPropertie(String key, Object value) {
        this.properties.put(key, value);
    }

    /**
     * Returns the value of a property. If the property has not been set, it
     * will return null.
     *
     * @param key is the String that identifies the propertie.
     * @return the propertie value if exists, null otherwise.
     */
    public final Object getPropertie(String key) {
        return this.properties.get(key);
    }

}
