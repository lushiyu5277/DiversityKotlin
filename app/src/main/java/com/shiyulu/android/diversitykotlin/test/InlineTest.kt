package com.shiyulu.android.diversitykotlin.test

/**
 * 这里加inline和不加性能差别明显，加了后10次都是0ms，没加10次3次0ms，2次2ms，5次1ms
 */
inline fun measureTime(action: () -> Unit) {
    print(">>>>  ")
    val start = System.currentTimeMillis();
    action()
    val end = System.currentTimeMillis()
    print("<<<<  [${end - start}ms]")
}

fun main() {
    measureTime {
        println("Hello inline")
    }
}