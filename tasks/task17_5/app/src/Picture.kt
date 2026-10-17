// Task 17.5: Picture class, representing a collection of Drawable things
import java.awt.Graphics2D
import java.util.ArrayList

class Picture {
    private val items = ArrayList<Drawable>()

    fun add(item: Drawable) {
        items.add(item)
    }

    fun draw(gc: Graphics2D) {
        for (item in items) {
            item.draw(gc)
        }
    }
}