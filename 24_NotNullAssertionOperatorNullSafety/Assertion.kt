fun main () {
    var nama:String? = "Dinda"
    val panjangKarakter :Int

    println("-------------------------")
    println("Latihan operator not-null Assertion (null safety) Dinda")
    println("---------------------------\n")
    panjangKarakter = nama!!.length
    println("Panjang karakter dari variabel nama : $nama")
    println("Panjang Karakter : $panjangKarakter")

    println("----------------------------------------")
}