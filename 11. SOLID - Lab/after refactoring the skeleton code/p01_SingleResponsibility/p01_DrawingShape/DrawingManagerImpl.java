package p01_SingleResponsibility.p01_DrawingShape;

import p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    public DrawingManagerImpl() {
    }

    @Override
    public void draw(Shape shape) {
        shape.draw();
    }
}
