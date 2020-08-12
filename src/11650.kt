import java.util.*
import kotlin.collections.*
fun main(){val scanner=Scanner(System.`in`)
val N=scanner.nextInt()
val list=ArrayList<Pair<Int,Int>>()
for (i in 0..N-1)list.add(Pair(scanner.nextInt(),scanner.nextInt()))
println(list.sortedWith(kotlin.Comparator{o1,o2->if(o1.first==o2.first)o1.second-o2.second else o1.first-o2.first }).joinToString("\n"){"${it.first} ${it.second}"})}