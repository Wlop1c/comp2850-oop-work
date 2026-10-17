// Task 17.5: Rectangle class (subclass of Shape, implements Drawable)
import java.awt.Graphics2D
import java.awt.Color

class Rectangle(x: Int, y: Int, color: Color, val width: Int, val height: Int) : Shape(x, y, color) {
    override fun draw(gc: Graphics2D) {
        gc.color = color
        gc.fillRect(x, y, width, height)
    }
}