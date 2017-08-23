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

import java.awt.Point;
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
public class BasicEntityTest {
    
    public BasicEntityTest() {
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
     * Test of getXPosition method, of class BasicEntity.
     */
    @Test
    public void testGetXPosition() {
        System.out.println("getXPosition");
        BasicEntity instance = new BasicEntityImpl();
        int expResult = 0;
        int result = instance.getXPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYPosition method, of class BasicEntity.
     */
    @Test
    public void testGetYPosition() {
        System.out.println("getYPosition");
        BasicEntity instance = new BasicEntityImpl();
        int expResult = 0;
        int result = instance.getYPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosition method, of class BasicEntity.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        BasicEntity instance = new BasicEntityImpl();
        Point expResult = new Point(0, 0);
        Point result = instance.getPosition();
        assertEquals(expResult, result);
    }

    public class BasicEntityImpl extends BasicEntity {

        public BasicEntityImpl() {
            super(0, 0);
        }
    }
    
}
