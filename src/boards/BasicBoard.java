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

/**
 * Class that models a game board, where entities can be placed and / or moved.
 *
 * @author gabpc
 */
public abstract class BasicBoard {

    /**
     * A matrix with the cells that make up the board.
     */
    private Cell[][] cells = null;

    /**
     * Variables that stores the maximum valor of the x-axis and y-axis on the
     * board.
     */
    private final int maxX, maxY;

    /**
     * Creates a new board with the indicated sizes.
     *
     * @param maxX indicates the maximum size of the x-axis.
     * @param maxY indicates the maximum size of the y-axis.
     */
    public BasicBoard(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.cells = this.generateCells();
    }

    /**
     * Method that generates the cells matrix.
     *
     * @return a matrix of Cell.
     */
    private Cell[][] generateCells() {
        Cell[][] aux = new Cell[this.maxX][this.maxY];

        for (int x = 0; x < this.maxX; x++) {
            for (int y = 0; y < this.maxY; y++) {
                aux[x][y] = new Cell(x, y);
            }
        }

        return aux;
    }

    /**
     * Sets the value of a property in the cell indicated by the x and y values.
     * If the property does not exist, create it. If the property exists, update
     * it.
     *
     * @param x indicates the x-axis position of the cell
     * @param y indicates the y-axis position of the cell
     * @param key is the String that identifies the propertie.
     * @param value is the value of the propertie.
     */
    public void setCellPropertie(int x, int y, String key, Object value) {
        Cell cell = this.cells[x][y];
        cell.setPropertie(key, value);
    }

    /**
     * Returns the value of a property in the cell indicated by the x and y
     * values. If the property has not been set, it will return null.
     *
     * @param x indicates the x-axis position of the cell
     * @param y indicates the y-axis position of the cell
     * @param key is the String that identifies the propertie.
     * @return the propertie value if exists, null otherwise.
     */
    public Object getCellPropertie(int x, int y, String key) {
        Cell cell = this.cells[x][y];
        return cell.getPropertie(key);
    }

}
