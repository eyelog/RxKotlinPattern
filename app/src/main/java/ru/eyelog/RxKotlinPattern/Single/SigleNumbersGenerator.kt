package ru.eyelog.RxKotlinPattern.Single

class SigleNumbersGenerator() {

    var a: Int = 1
    var b: Int = 1
    var c: Int = 0

    fun generate(i: Int) : Int {
        a=1
        b=1
        c=0
        repeat(i){
            c = a + b
            b = c
            a = b
        }
        return c
    }
}