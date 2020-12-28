package polymorphism

open class Human () {
    var nama: String = ""
    var usia : Int = ""

    open fun kenal(){
        println("Hello my name is $nama, and my age is $usia")
    }
}