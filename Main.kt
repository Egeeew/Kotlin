fun main() {
    println("Başlıyorum!")
    println("2.mesaj")
    val sayi: Int = 2
    println(sayi)
    val isim: String = "Ege"
    println("Merhaba " + isim)
    val sayi2: Double = 15.23572829357383
    println(sayi2)
    val isimA: String = "Ege"
    println("Merhaba $isimA")

    val s1:Int=13
    val s2:Int=11
    println("Sayıların toplamı: ${s1+s2}")

    // Sonradan değiştirilecek değişkenler için "var" sabit ve diğerleri için "val" kullanılır.

    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")

    var count = 10
    println("$count okunmamış mesajınız var.")
    count = count + 1
    println("yeni: $count")
    count++
    println("yeni: $count")
    count--
    println("yeni: $count")

    val yol1:Double=3.2
    val yol2:Double=8.64
    val yol3:Double=1.39
    val yolToplam:Double=yol1+yol2+yol3
    println("Toplam kalan yol $yolToplam km.")

    val belirtisizVar = "Bu değişkeni belirlerken tipini belirtmedim. "
    val acikla = "Ama String olduğunu kesinlikle algıladı."
    val msg = belirtisizVar+acikla
    println(msg)

    println("Kaçış \"dizisi\"")

    val oglen:Boolean=false
    println("Şu an öğlen mi: $oglen")
    val taksit:Boolean=true
    println("Taksitleriniz bitti mi: $taksit")

    // Yorum satırı
    /*
     *Çoklu yorum satırı
     */
}