package inheritance

open class Weapon : Human() {

    var senjata : String = ""

    fun kerja(){
        println("saya punya senjata berupa $senjata untuk melawan musuh")
    }
}