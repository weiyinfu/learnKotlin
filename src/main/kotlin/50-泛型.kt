fun <T : Comparable<T>> sort(list: List<T>) {
    //排序函数
    list.sortedWith(Comparator({ x, y ->
        x.compareTo(y)
    }))
}
class LinkedList<T>(t:T){
    
}
fun main() {

}