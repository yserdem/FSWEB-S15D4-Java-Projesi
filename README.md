#  Java Stacks & Queues

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Stack Challenge

 * Amacımız Stack kullanarak bir string değerinin palindrom olup olmadığına karar vermek.
 * İstediğiniz veri yapısını kullanabilirsiniz. Onemli olan ```LIFO``` mantığına uygun bir dizayn yapılması.
 * String değer .,?!_- gibi değerler içerebilir.Boşluk karakterini içerebilir. String değerleri büyük harfle ya da küçük harfle yazılabilir.
 * Yazacağınız kod bütün bu karakterlere ve küçük harf büyük harfe uygun çalışmalı.
 * Examples:
 * ```I did, did I?``` => palindrom 
 * ```Racecar``` => palindrom 
 * ```hello``` => palindrom değil
 * ```Was it a car or a cat I saw ?``` => palindrom
 * Çözümünüz mutlaka ```LIFO``` mantığına uygun yazılmalıdır.

### Queues Challenge

 * Amacımız Stack ve Queue kullanarak bir string değerinin palindrom olup olmadığına karar vermek. 
 * Stack için geçerli olan tüm kurallar burada geçerlidir.
 *  ```I did, did I?``` => palindrom
 * ```Racecar``` => palindrom
 * ```hello``` => palindrom değil
 * ```Was it a car or a cat I saw ?``` => palindrom
 *  Çözümünüz mutlaka ```LIFO``` ve ```FIFO``` mantığını birlikte içermelidir.

### Convert Decimal Numbers To Binary

 * Günlük hayatımız da hep 10'luk(Decimal) sistemde çalışırız bu yüzden kullanabildiğimiz rakamlar 0,1,2,3,4,5,6,7,8,9 dur.
 * Ancak bilgisayarlar 2'lik(binary) sistemde çalışırlar. O yüzden sadece 0 ve 1 rakamlarını bilirler.
 * Decimal bir sayıyı ikilik tabanda yazabiliriz.
 * Örnek olarak:
      * 5 sayısı 2'lik tabanda şu şekilde yazılır 101 => 2^2 + 0 + 2^0
      * 6 sayısı 2'lik tabanda şu şekilde yazılır 110 => 2^2 + 2^1 + 0
      * 13 sayısı 2'lik tabanda şu şekilde yazılır => 1101 => 2^3 + 2^2 + 0 + 2^0
   
 * Matematiksel olarak ilgili cevirme işlemininin nasıl yapıldığıyla ilgili detayı buradan okuyabilirsiniz: https://www.cuemath.com/numbers/decimal-to-binary/
 * Görevimiz Decimal number alıp günün sonunda bu değeri binary formata ceviren bir kod yazmak.
 * Bunun için kullanılabilecek en uygun Veri Yapısı hangisi olurdu ? Çözümünüz bu veri yapısını içermeli.
