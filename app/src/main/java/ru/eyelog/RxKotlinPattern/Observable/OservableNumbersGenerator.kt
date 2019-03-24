package ru.eyelog.RxKotlinPattern.Observable

class OservableNumbersGenerator{

    var a: Int = 1
    var b: Int = 1
    var c: Int = 0

    lateinit var numbers : ArrayList<Int>

    fun generate(i: Int) : List<Int> {
        a=1
        b=1
        c=0

        numbers = ArrayList()

        repeat(i){
            c = a + b
            b = c
            a = b

            numbers.add(c)
        }
        return numbers
    }
}