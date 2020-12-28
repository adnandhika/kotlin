package inheritance

class Thor : Weapon() {
    
    var asal : String = ""
    var aktor : String = ""

    fun posisi(){
        println("saya aktor dari $aktor, dan berasal dari $asal")
    }



}