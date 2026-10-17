// Task 17.5: Image class (subclass of Bitmap, implements Drawable)
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.File

open class Bitmap(val fileName: String, val width: Int, val height: Int)

class Image(val x: Int, val y: Int, fileName: String) : Bitmap(fileName, 0, 0), Drawable {
    private val img: BufferedImage? = try {
        ImageIO.read(File("images/$fileName"))
    } catch (e: Exception) {
        null
    }

    override fun draw(gc: Graphics2D) {
        img?.let {
            gc.drawImage(it, x, y, null)
        }
    }
}