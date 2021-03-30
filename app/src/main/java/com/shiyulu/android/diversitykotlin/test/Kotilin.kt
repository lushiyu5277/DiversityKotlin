package com.shiyulu.android.diversitykotlin.test

import com.shiyulu.android.diversitykotlin.bean.User


fun main() {
    var user = User("shiyu", "123", "456")
    var userCopy = user.copy()
    println(user)
    println(userCopy)
    println(user == userCopy)
}

fun doubleX(x: Int): Int {
    return x * 2
}

val name = "shiyu" //只读变量，不是常量
var num = 13; //
var java = Java()

