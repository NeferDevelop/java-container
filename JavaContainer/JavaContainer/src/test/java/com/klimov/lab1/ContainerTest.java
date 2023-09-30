package com.klimov.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing the Container implementation
 * @author s.a.klimov
 */
public class ContainerTest {
    private Container<Integer> container;

    /**
     * Initialize the container before each test.
     */
    @BeforeEach
    void setUp() {
        container = new Container<>();
    }

    /**
     * Test adding elements to the container and checking the size.
     */
    @Test
    void testAdd() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }

    /**
     * Test retrieving elements by index.
     */
    @Test
    void testGet() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(1, container.get(0).intValue());
        assertEquals(2, container.get(1).intValue());
        assertEquals(3, container.get(2).intValue());
    }

    /**
     * Test removing an element by index and checking the size and content.
     */
    @Test
    void testRemove() {
        container.add(1);
        container.add(2);
        container.add(3);
        container.remove(1);
        assertEquals(2, container.size());
        assertEquals(1, container.get(0).intValue());
        assertEquals(3, container.get(1).intValue());
    }

    /**
     * Test getting the size of the container.
     */
    @Test
    void testSize() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(3, container.size());
    }

    /**
     * Test checking the presence of elements in the container.
     */
    @Test
    void testContains() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertTrue(container.contains(1));
        assertTrue(container.contains(2));
        assertTrue(container.contains(3));
        assertFalse(container.contains(4));
    }
}
