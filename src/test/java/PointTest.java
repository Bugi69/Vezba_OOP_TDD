import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@Test
    public void test() {
        Point test = new Point(6, 7);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 7);
    }
    @Test
    public void testBoolean() {
        Point test = new Point(6, 7, true);
        assertTrue(test.isSelectable());
    }
    @Test
    public void testSeter() {
        Point test = new Point();
        test.SetX(6);
        test.SetY(8);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 8);
    }
    @Test
    public void testPrazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }
    @Test
    public void testSelectable() {
        Point test = new Point(6,5,true);
        assertTrue(test.isSelectable());
        test.setSelectable(false);
        assertTrue(!test.isSelectable());
    }
    @Test
    public void testDeafult() {
        Point test = new Point();
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 5);
        assertFalse(test.isSelectable());
    }
    @Test
    public void testMetodaRastojanja() {
        Point test = new Point(5, 5);
        assertEquals(test.rastojanje(2, 5), 3.0);
    }
    @Test
    public void testPripadanja() {
        Point test = new Point(5, 5);
        Point test1 = new Point(5, 6);
        assertTrue(test.Sadrzi(test1));
    }
    @Test
    public void testToString(){
        Point test= new Point(x:5, y:6, selectable: false);
        Point test= new Point(x:5, y:6, selectable: false)
    }
    @Test 
    public void testInstanceOfShape(){
        assertTrue(Shape.class.IsAssignableFrom)
    }