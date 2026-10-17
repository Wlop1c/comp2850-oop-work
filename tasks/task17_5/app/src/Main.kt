// Task 17.5: main program
import javax.swing.JFrame
import java.awt.Color

fun main() {
    val picture = Picture()
    picture.add(Circle(50, 50, Color.RED, 50))
    picture.add(Rectangle(200, 100, Color.BLUE, 100, 80))
    picture.add(Image(100, 150, "cat.jpg"))

    val canvas = Canvas(picture)
    canvas.background = Color.WHITE

    val frame = JFrame("Picture App")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(400, 400)
    frame.add(canvas)
    frame.isVisible = true
}
