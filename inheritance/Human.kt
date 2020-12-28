package inheritance

open class Human () {
    var nama: String = ""
    var usia : Int = ""

    fun kenal(){
        println("Hello my name is $nama, and my age is $usia")
    }
}