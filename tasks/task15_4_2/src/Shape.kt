// Task 15.4.2: Shape class, a superclass for different kinds of shape
import java.awt.Graphics2D
import java.awt.Color

abstract class Shape(val x: Int, val y: Int, val color: Color) {
    abstract fun draw(gc: Graphics2D)
}