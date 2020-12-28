package polymorphism

class Superman : Weapon() {
    
    var daerah : String = ""
    var comic : String = ""

    fun posisi(){
        println("Karakter dari $comic, dan berasal dari $daerah")
    }

    override fun kenal(){
        println("Nama saya adalah $nama, dan saya berusia $usia tahun")
    }

}