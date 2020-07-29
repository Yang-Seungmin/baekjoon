import java.util.*
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val testCase = scanner.nextInt()
    var count: Int

    for(t in 0 until testCase) {
        count = 0
        val x1 = scanner.nextInt()
        val y1 = scanner.nextInt()
        val x2 = scanner.nextInt()
        val y2 = scanner.nextInt()

        val nPlanetsSystem = scanner.nextInt()

        for(n in 0 until nPlanetsSystem) {
            val a = arrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
            if ((getDistance(x1, y1, a[0], a[1]) < a[2]) xor (getDistance(x2, y2, a[0], a[1]) < a[2]))
                count++
        }

        println(count)
    }

}

fun getDistance(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1).toDouble())
}