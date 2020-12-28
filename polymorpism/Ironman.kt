package polymorphism

class Ironman : Weapon() {
    
    var asal : String = ""
    var aktor : String = ""


    fun posisi(){
        println("saya aktor dari $aktor, dan berasal dari $asal")
    }

    override fun kerja(){
        println("My Weapon is $senjata with best technologi in the world")
    }

}