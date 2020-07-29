import java.util.*

val fibos: Array<Array<Int>?> = arrayOfNulls(41)

fun main() {
    val scanner = Scanner(System.`in`)
    val testCase = scanner.nextInt()

    for(t in 0 until testCase) {
        val f = fibonacci(scanner.nextInt())
        println("${f[0]} ${f[1]}")
    }
}

fun fibonacci(n: Int): Array<Int> =
        if (n == 0) {
            if (fibos[0] == null) fibos[0] = arrayOf(1, 0, 0)
            fibos[0]!!
        } else if (n == 1) {
            if (fibos[1] == null) fibos[1] = arrayOf(0, 1, 1)
            fibos[1]!!
        } else {
            if (fibos[n - 1] == null) fibos[n - 1] = fibonacci(n - 1)
            if (fibos[n - 2] == null) fibos[n - 2] = fibonacci(n - 2)
            val fibo_n_1 = fibos[n - 1]!!
            val fibo_n_2 = fibos[n - 2]!!
            fibo_n_1.zip(fibo_n_2, Int::plus).toTypedArray()
        }