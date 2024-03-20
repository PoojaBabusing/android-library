package com.example.mylibrary

class Multiply {

    companion object {
        fun printTheMessage(message: String) {
            println("This is printed from android libray $message")
        }

        fun multiply(a: Int, b: Int) {
            println("This result of this is ${a * b}")
        }
    }
}

