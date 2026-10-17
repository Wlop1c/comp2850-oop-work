// Task 15.4.2: Canvas class
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JPanel

class Canvas(val picture: Picture) : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val gc = g as Graphics2D
        picture.draw(gc)
    }
}