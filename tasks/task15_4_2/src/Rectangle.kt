// Task 15.4.2: Rectangle class, a subclass of Shape
import java.awt.Graphics2D
import java.awt.Color

class Rectangle(x: Int, y: Int, color: Color, val width: Int, val height: Int) : Shape(x, y, color) {
    override fun draw(gc: Graphics2D) {
        gc.color = color
        gc.fillRect(x, y, width, height)
    }
}