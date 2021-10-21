package pt.pa.adts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRectangleTest {

    @Test
    void getWidth() {
        MyRectangle rectangle = new MyRectangle("Rect X ", 10.0, 20.0, 3.0, 4.0);
        assertEquals(3.0, rectangle.getWidth());
    }

    @Test
    void getHeight() {
    }

    @Test
    void getArea() {
    }
}