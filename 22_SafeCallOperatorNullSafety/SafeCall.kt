fun main() {
    var nama:String? = null
    var usia:String? = null

    println("--------------------")
    println("Latihan Operator safe calls (null safety): Dinda")
    println("--------------------------\n")

    println("Mengambil panjang karakter string dengan fungsi length :")
    print("Panjang Karakter Nama :")
    println(nama?.length)

    nama = "Dinda Khoirunnisa"
    val jumlahKarakter:Int?=nama?.length
    println("Panjang karakter pada variabel Nama:\'$nama\'adalah: $jumlahKarakter")

    usia="16"
    val umur:Int?=usia?.toInt()
    println("Usia : $umur")
    println("-------------------------------")
}