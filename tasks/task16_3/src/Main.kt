// Task 16.3: main program
import javax.swing.JFrame
import java.awt.Color

fun main() {
    val picture = Picture()
    picture.add(Circle(50, 50, Color.RED, 50))
    picture.add(Rectangle(200, 100, Color.BLUE, 100, 80))
    picture.add(Circle(150, 200, Color.GREEN, 40))
    picture.add(Rectangle(50, 250, Color.MAGENTA, 80, 50))
    picture.add(Triangle(250, 250, Color.ORANGE, 80, 100))

    val canvas = Canvas(picture)
    canvas.background = Color.WHITE

    val frame = JFrame("Picture App")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(400, 400)
    frame.add(canvas)
    frame.isVisible = true
}
