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

import exceptions.InvalidMovementException;
import interfaces.MobileInterface;
import java.awt.Point;

/**
 * Abstract entity that defines all the common logic to the entities that can
 * move.
 *
 * @author gabpc
 */
public abstract class MobileEntity extends BasicEntity implements MobileInterface {

    /**
     * Constructor of the class in which the position of the entity is
     * initialized.
     *
     * @param initialX is the initial x-axis position.
     * @param initialY is the initial y-axis position.
     */
    public MobileEntity(int initialX, int initialY) {
        super(initialX, initialY);
    }

    /**
     * Method that validates if the movement you are trying to perform is valid
     * or not. To do this, it is based on the current position of the object and
     * the amount you want to move, both on the x-axis and the y-axis.
     *
     * It should be implemented in each sub-class, depending on the needs of
     * that class.
     *
     * @param currentPosition is a Kava AWT Point with current position of the
     * object.
     * @param delta is a Java AWT Point with the dx and dy displacements.
     * @return true if the movement is valid, false otherwise.
     * @throws InvalidMovementException is an exception that occurs when the
     * object tries to make an invalid movement.
     */
    protected abstract boolean validateMovement(Point currentPosition, Point delta) throws InvalidMovementException;

    /**
     * Method that calculates the new rotation of the entity based on its
     * current position and the displacement that it will perform.
     *
     * It should be implemented in each sub-class, depending on the needs of
     * that class.
     *
     * @param currentPosition is a Kava AWT Point with current position of the
     * object.
     * @param delta is a Java AWT Point with the dx and dy displacements.
     */
    protected abstract void calculateRotation(Point currentPosition, Point delta);

    /**
     * Method that moves the object that implements the interface a distance dx
     * on the X axis, and a distance dy on the Y axis.
     *
     * It is a TemplateMethod, where the children will define the logic of
     * operation.
     *
     * @param delta is a Java AWT Point with the dx and dy displacements.
     * @throws InvalidMovementException is an exception that occurs when the
     * object tries to make an invalid movement.
     */
    @Override
    public final void move(Point delta) throws InvalidMovementException {
        /**
         * Validates the movement. If the validation fails, an
         * InvalidMovementException is thrown.
         */
        this.validateMovement(this.getPosition(), delta);
        /**
         * If the validation pass, then moves the entity.
         */
        this.calculateRotation(this.getPosition(), delta);
        this.xPosition += delta.x;
        this.yPosition += delta.y;
    }

}
