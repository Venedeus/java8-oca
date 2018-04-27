/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing ShapeController class.
 */
public class ShapeControllerTest {
    private static final int SHAPE_ARRAY_LENGTH = 5;
    /**
     * Instance of ShapeContoller.
     */
    private ShapeController  shapeCtrl;
    /**
     * Instance of ShapeController with empty elements.
     */
    private ShapeController  shapeCtrlEmpties;

    /**
     * Test method for {@link by.iba.gomel.ShapeController#countTotalArea()}.
     */
    @Test
    public void testCountTotalArea() {
        Assert.assertEquals("Method countTotalArea() failed.", 106.4,
                this.shapeCtrl.countTotalArea(), 0.1);
    }

    /**
     * Test method for {@link by.iba.gomel.ShapeController#countTotalArea()} with empty elements.
     */
    @Test
    public void testCountTotalAreaWithEmpties() {
        Assert.assertEquals("Method countTotalArea() failed.", 20.28,
                this.shapeCtrlEmpties.countTotalArea(), 0.01);
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInitialization() {
        this.shapeCtrl = new ShapeController(ShapeControllerTest.SHAPE_ARRAY_LENGTH);
        this.shapeCtrlEmpties = new ShapeController(ShapeControllerTest.SHAPE_ARRAY_LENGTH);

        int position = this.shapeCtrl.initializeNextShape(0, new Circle(5));
        position = this.shapeCtrl.initializeNextShape(position, new Square(3));
        position = this.shapeCtrl.initializeNextShape(position, new Square(6));
        position = this.shapeCtrl.initializeNextShape(position, new Rhombus(5, 1));
        position = this.shapeCtrl.initializeNextShape(position, new Rhombus(5, 5));

        position = this.shapeCtrlEmpties.initializeNextShape(0, new Square(3));
        position++;
        position = this.shapeCtrlEmpties.initializeNextShape(position, new Rhombus(5, 1));
        position++;
        position = this.shapeCtrlEmpties.initializeNextShape(position, new Circle(1));

    }

    /**
     * Test method for {@link by.iba.gomel.ShapeController#ShapeController()}.
     */
    @Test
    public void testShapeController() {
        Assert.assertNotNull("Instance creation failed.", this.shapeCtrl);
    }
}
