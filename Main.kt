fun main() {

    val adnan : Human = Human("Adnandhika R.D")
    val dhika : Human = Human("Lionel Messi")

    adnan.email = "adnandhika@gmail.com"
    adnan.address = "Jakarta"

    dhika.email = "dhikaadnan@gmail.com"
    dhika.address = "Tangerang"

    adnan.talk()
    dhika.talk()

    adnan.introduce()

    println(adnan.verify("adnandhika@gmail.com"))

    //Object
    println(Acer.name)

    val asus : Acer = Acer
    println(asus.nationality)

}