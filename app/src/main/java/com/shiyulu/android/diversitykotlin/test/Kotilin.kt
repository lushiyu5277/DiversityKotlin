package com.shiyulu.android.diversitykotlin.test

import android.view.View
import com.shiyulu.android.diversitykotlin.bean.User


fun main() {
    var user = User("shiyu", "123", "456")
    var userCopy = user.copy()
    println(user)
    println(userCopy)
    println(user == userCopy)
    println(user === userCopy)
    val(name, password, code) = getUser()
    repeat(100) {
        println(it)
    }
    funcType()
}

fun doubleX(x: Int): Int {
    return x * 2
}

fun getUser(): User {
    return User("shiyu", "123", "456")
}

fun funcType() {
    val view = KotlinView()
    view.setOnClickListener {
        println(it)
    }
    view.setOnClickListener(::click)
}

fun click(view: View) {
    println(view)
}

val name = "shiyu" //只读变量，不是常量
var num = 13; //
var java = Java()

