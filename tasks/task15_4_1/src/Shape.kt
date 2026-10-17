// Task 15.4.1: Shape class, a superclass for different kinds of shape
import java.awt.Graphics2D
import java.awt.Color

open class Shape(val x: Int, val y: Int, val color: Color) {
    open fun draw(gc: Graphics2D) {}
}