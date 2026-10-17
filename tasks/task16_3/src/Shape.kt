// Task 16.3: abstract Shape class
import java.awt.Graphics2D
import java.awt.Color

abstract class Shape(val x: Int, val y: Int, val color: Color) {
    abstract fun draw(gc: Graphics2D)
}