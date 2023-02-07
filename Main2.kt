fun main() {
    val kutlama = dogumGunu()
    println(kutlama)
    val kutlama2 = dogum2("Örnek")
    println(kutlama2)
    println(dogum3("Ege", 15))
    islem()
    hesap()
}

fun dogumGunu():String {
    val isim:String="Ege"
    val msg:String="Doğum Günün Kutlu Olsun!"
    return "$isim, $msg"
}

fun dogum2(isim2:String):String {
    val msg:String="Doğum Günün Kutlu Olsun $isim2!"
    return "$msg"
}

fun dogum3(isim3:String, yas:Int=0):String {
    val msg:String="Doğum Günün Kutlu Olsun $isim3,\nArtık ${yas+1} Yaşındasın!"
    return "$msg"
    // Yaş ddeğeri girilmediği sürece 0 olarak alınacak
}

fun islem():Unit {
    val sayi1 = 10
    val sayi2 = 5
    val sayi3 = 8

    val sonuc = topla(s1= sayi1, s2= sayi2, s3= sayi3)

    println("$sayi1 + $sayi2 + $sayi3 = $sonuc")
}

fun topla(s1:Int, s2:Int, s3:Int):Int {
    return s1 + s2 + s3
}

fun hesap():Unit {
    val ft:Double = 100.0 // Fiyat
    val pc:Double = 0.2 // İndirim (Yüzde)

    println("$ft₺ değerindeki ürün, $pc indirimle ${ft - indirim(fiyat = ft, perc = pc)}₺ oluyor!")
}

fun indirim(fiyat:Double, perc:Double):Double {
    val ind:Double = fiyat * perc
    return ind
}