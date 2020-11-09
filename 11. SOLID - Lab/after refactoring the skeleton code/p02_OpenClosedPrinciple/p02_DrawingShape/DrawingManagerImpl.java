package p02_OpenClosedPrinciple.p02_DrawingShape;


import p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.DrawingManager;
import p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {


    @Override
    public void draw(Shape shape) {
        shape.draw();
    }
}
