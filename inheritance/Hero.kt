package inheritance

fun main(){

    val robert = Ironman()
    robert.nama = "Robert Downey"
    robert.usia = 60
    robert.kenal()
    robert.senjata = "Robot Jarvis"
    robert.kerja()
    robert.asal = "New York"
    robert.aktor = "Marvel"

    val thor = Thor()
    thor.nama = "Thor Thor"
    thor.usia = 70
    thor.kenal()
    thor.senjata = "Palu"
    thor.kerja()
    thor.asal = "Chicago"
    thor.aktor = "Marvel"

    val chris = Captain()
    chris.nama = "Captain America"
    chris.usia = 100
    chris.kenal()
    chris.senjata = "Shield"
    chris.kerja()
    chris.asal = "New York"
    chris.aktor = "Marvel"

    val doctor = Hulk()
    doctor.nama = "Doctor Hulk"
    doctor.usia = 80
    doctor.kenal()
    doctor.senjata = "Strength Green"
    doctor.kerja()
    doctor.asal = "Las Vegas"
    doctor.aktor = "Marvel"

    val luis = Superman()
    luis.nama = "Luis Saga"
    luis.usia = 40
    luis.kenal()
    luis.senjata = "Mata Laser"
    luis.kerja()
    luis.daerah = "London"
    luis.comic = "DC"

    val david = Batman()
    david.nama = "David Gerd"
    david.usia = 60
    david.kenal()
    david.senjata = "Batarang"
    david.kerja()
    david.daerah = "Liverpool"
    david.comic = "DC"

    val alex = Flash()
    alex.nama = "Alex Iwobi"
    alex.usia = 30
    alex.kenal()
    alex.senjata = "Speed Running"
    alex.kerja()
    alex.daerah = "Manchester"
    alex.comic = "DC"




}