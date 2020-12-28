package polymorphism

class Captain : Weapon() {
    
    var asal : String = ""
    var aktor : String = ""

    fun posisi(){
        println("saya aktor dari $aktor, dan berasal dari $asal")
    }

    override fun kenal(){
        println("Perkenalkan diri saya pribadi yaitu $nama, dan tentunya umur saya pribadi $usia tahun")
    }

}