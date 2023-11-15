fun main() {
    var nama:String? = null
    var uang:String? = null

    println("------------------------")
    println("Latihan Operator Elvis (null safety) Dinda khoirunnisa")
    println("------------------------")

    println("Nama : $nama")
    println("Nomer : $uang")

    val ambilNilaiNama:String = nama ?: "Dinda khoirunnisa"
    val ambilNilaiUang:Int = uang?.toInt() ?:800000000

    println("Nama : $ambilNilaiNama")
    println("Nomer : $ambilNilaiUang")

    println("---------------------------------")

}