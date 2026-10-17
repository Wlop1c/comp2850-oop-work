// Task 15.4.2: Picture class, representing a collection of shapes
import java.awt.Graphics2D
import java.util.ArrayList

class Picture {
    private val shapes = ArrayList<Shape>()

    fun add(shape: Shape) {
        shapes.add(shape)
    }

    fun draw(gc: Graphics2D) {
        for (shape in shapes) {
            shape.draw(gc)
        }
    }
}