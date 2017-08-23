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
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabpc
 */
public class MobileEntityTest {

    public MobileEntityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validateMovement method, of class MobileEntity.
     */
    @Test
    public void testValidateMovement() {
        System.out.println("checkMovement");
        Point currentPosition = new Point(0, 0);
        Point delta = new Point(11, 1);
        MobileEntity instance = new MobileEntityImpl();
        boolean expResult = true;
        boolean result;
        try {
            result = instance.validateMovement(currentPosition, delta);
            fail("InvalidMovementException expected");
        } catch (InvalidMovementException ex) {
            System.out.println("checkMovement pass");
        }
    }

    /**
     * Test of move method, of class MobileEntity.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Point delta = new Point(-1, 1);
        MobileEntity instance = new MobileEntityImpl();;
        try {
            instance.move(delta);
            Point result = instance.getPosition();
            Point expResult = new Point(-1, 1);
            assertEquals(expResult, result);
        } catch (InvalidMovementException ex) {
            fail("InvalidMovementException not expected");
        }

    }

    public class MobileEntityImpl extends MobileEntity {

        public MobileEntityImpl() {
            super(0, 0);
        }

        @Override
        public boolean validateMovement(Point currentPosition, Point delta) throws InvalidMovementException {
            boolean checkX = currentPosition.x + delta.x <= 10;
            boolean checkY = currentPosition.y + delta.y <= 10;
            if (checkX && checkY) {
                return true;
            } else {
                throw new InvalidMovementException();
            }
        }

        @Override
        protected void calculateRotation(Point currentPosition, Point delta) {
            // DO NOTHING
        }
    }

}
