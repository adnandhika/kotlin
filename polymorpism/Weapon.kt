package polymorphism

open class Weapon : Human() {

    var senjata : String = ""

    open fun kerja(){
        println("saya punya senjata berupa $senjata untuk melawan musuh")
    }
}