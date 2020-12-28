package polymorphism

class Hulk : Weapon() {
    
    var asal : String = ""
    var aktor : String = ""

    fun posisi(){
        println("saya aktor dari $aktor, dan berasal dari $asal")
    }

    override fun kenal(){
        println("Kenalin nama gue $nama, dan usia gue $usia tahun")
    }

}