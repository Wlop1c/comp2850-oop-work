// Task 16.3: Triangle class, a subclass of Shape
import java.awt.Graphics2D
import java.awt.Color
import java.awt.Polygon

class Triangle(x: Int, y: Int, color: Color, val width: Int, val height: Int) : Shape(x, y, color) {
    override fun draw(gc: Graphics2D) {
        gc.color = color
        val poly = Polygon()
        poly.addPoint(x, y + height)
        poly.addPoint(x + width / 2, y)
        poly.addPoint(x + width, y + height)
        gc.fillPolygon(poly)
    }
}
