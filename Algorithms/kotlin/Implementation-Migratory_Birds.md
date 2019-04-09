Array.groupBy: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/group-by.html

inline fun <K> IntArray.groupBy(
    keySelector: (Int) -> K
): Map<K, List<Int>> (source)

Array.sort: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sort.html

inline fun <T : Comparable<T>> Array<out T>.sort() (source)

description:

### difference with groupBy -> sort and sort -> groupBy

groupBy -> sort: O(N) + O(N/2)
Array의 elements를 순차탐색하며 Map 타입의 key에 value를 할당한다. O(N)
Map의 key를 탐색하여 정렬한다. 최소: O(1), 최대: O(N), 평균: O(N/2) 

sort -> groupBy: O(N) + O(N)
Array의 elements를 순차탐색하여 정렬한다. O(N)
정렬된 Array의 elements를 순차탐색하며 Map 타입의 key에 value를 할당한다. O(N)
