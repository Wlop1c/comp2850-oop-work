// Task 15.4.2: Circle class, a subclass of Shape
import java.awt.Graphics2D
import java.awt.Color

class Circle(x: Int, y: Int, color: Color, val radius: Int) : Shape(x, y, color) {
    override fun draw(gc: Graphics2D) {
        gc.color = color
        gc.fillOval(x, y, radius * 2, radius * 2)
    }
}
