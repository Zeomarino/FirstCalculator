// Sadece not almak amacı için eklenmiştir.
/* ilk olarak kullanıcı arayüzüzünü açıcağız -şimdilik- main activity ile işimiz yok. res/layout/activty_main.xml'e girelim
// Activity_main'de göz işaretine basıp show system ui'yi gösterelim. İlk açıldığı zaman karşımıza klasikleşmik olan Hello World yazısı geliyor tabiki bu hello world sağ klik yapıp silmekle başladık işe
Bomboş ve temiz bir projede başlamak bunun amacı. Hesap makinesi uygulamamız şimdilik kaba ve çirkin olucak bildiklerimizi pekiştirmek amacımız sadece 4 işlem yapabilcemiz basit birşey yapmak burdaki amaç
Rakamları yazmak için TEXT kısmında activity_main.xml dosyasından bahsediyorum Text view'i daha önce görmüştük alalım uygulamamızın üzerine sürüklüyelim. İçerisine birşey yazılabilir olduğundan daha önce
bahsetmiştik amacımız içerisine mesela sonucu vs yazdırmak o sebepten ekledim şimdilik. Ama kullanıcı bu aşamada buraya birşey yazamaz kullanıcının birşey yazması için Text sekmesinde edit text dediğimiz
bazı görünümler var  Nedir bunlar "Plain Text , Password , Password Numeric , Email , Phone , Postal Adress , Multiline Text , Time , Date , Number , Number(signed), Number (Decimal) )
Aslında hepsinin işlevi aynı ama misal Password yuvarlak yuvarlak yapıyorki şifre görünmesin diye misal. Biz en basiti olan plain text'i alıp uygulamamıza sürüklüyelim.
Attığımızda görülceği üzere (name) çıkar Bunu değiştiriceğiz . Bir tane daha ihtiyacımız var neden iki numara girilcek demiştik üst plain text'e adam 10 yazıcak aşağı 20 yazıcak sonra toplama çıkarma
çarpma bölme islerimden birinin butonuna basıcak ve sonucuda TextView sekmesinden görücek. O yüzden 4 İşlemli demiştik hatırlar isek basit birşey ve pekişmesi amacından sadece.
Şimdilik şöyle yapalım İD'lere dikkat edelim. İlk plain text'imizin id'si (editTextTextPersonName). İkinci plain text'imizin id'si (editTextTextPersonName2)
İd'i bölümünü göremiyor veya bilmiyorsanız söyle açıklayim Sağ tarafta Declared Attirubutes Özelliğini Açılır konumda olduğundan emin olmamız lazım.
Daha sonra önümdeki Apk uygulamasında üzerine tıkladığımız butonların idlerini rahatlıkla görüyor olcağız.İdleri değiştirebiliriz ister isek.
Ne gibi : textView'imizin id'si (textView) burada sonucu göstereceğiz diyelim adını "resultText" yapar isek şimdilik id'sinin değiştiğini göreceksiniz.
Aynı şekilde diğerlerinide değiştirebiliriz.İlk plain textimizin idsini number1Text yapıcağım şu aşamada  2 plain text'imizin idsini number2Text yapıcağım tabiki.
Birebir aynıda tutabilirdik fark etmez açıkcası ama daha düzenli olması açısından bunu yaptım. Şimdi ilk plainText butonumuza tıkladıgımızda
Text kısmında ilk eklendiğinden dolayı name yazdığını fark etmiş olcağız içerisinde birşey yazmasını istemediğim için şu aşamada silelim ve oranın boş olmasını
sağlıyalım eğer istersek bu tarz edit textlerin içerisine Common Attributes sekmesinin içerisinde hint denilen bir yer var Hint ipucu demek
ipucunu buraya yazabiliyoruz misal Enter Number gibi yada Numara gir gibi... Girdiğimizde silik gözükcek kullanıcı buraya numara yazdığında direk kendisi
arkaplandan siliniyor ve yazdığı numara gözüküyor bunu kullanabiliriz ister isek plainText'imiz 2'sine yine aynı işlevleri birebir uygulucağım.
Böylece kullanıcı buraya bir rakam bir numara yazıcağını anlar diye temelli ediyoruz. Son olarak resultTextimize gelelim All Attributes sekmesinden textSize kısmını
Birazcık büyütelim 24Sp yapıcağım şimdilik daha sonra textAligment sekmesinden _center ortala seçeneğini seçiceğim Text'i ortalamak yani yaptığımız.
Bunun textinde birşey yazmasına gerek yok ama şimdilik  Result: 0 Yazabiliriz misal kullanıcı bir işlem yaptıkça Result budur result şudur şeklinde artan bir işlem
yapabiliriz son olarak palette sekmesinden common'dan button koyucağız buton şu işleme yarar toplama çıkarma vs işlemleri bu butonlar sayesinde yapacağız.
    Mesela buton koyduğumuz birine + koyar isek textine direk + şeklinde gözükcektir. Butonlarımızı CTRL C CTRL V yardımı ile coğaltabilir veya.
    Tekrar tek tek ekliyebiliriz. + toplama - çıkarma * çarpma / bölme olarak yapalım * / islerimlerinde karşınıza birşey çıkabilir ürkmeyelim.
başka birşeye bastığımızda gittiğini göreceğiz. Daha sonra hesap makinemizde common attibrutes sekmesinde background ile oynayağım ben mavi yapıcağım ve şeçiyorum.
Tasarımda işimiz bittiğini düşünmeyelim Daha önce anlatılan Constraints' denilen bir button vardı üst tarafta gözün yanında görüceksiniz sihirli bir çubuga benzer
bir simgesi var neden bunu yapıyoruz diye düşünürsek direk şu halde başlattığımızda emulatorde buttonlarımızı / görünümlerimizi istediğimiz yerde çıkmadığını
karma karışık bir şekilde çıktığını görüceğiz neden tam olarak cıkmıyor sorusuna ise sınırları belli değil buttonlarımızın textlerimizin tam olarak ekranın nereye
konumlandırıldığını emulator bilmeyecek bunu bilmek için önümüzdeki bölüm itibari ile layout islemlerini görüceğiz ve bunları detaylıca öğreneceğiz.
fakat en azından şimdilik doğru düzgün gözükmesi adına bir kaçtane işlem yapmamız gerekiyor şuan emulatoru calıstırsak bütün buttonların sol tarafta kümelendiğini
görürüz öncelikle bunu cözmemiz gerek normalde bunun en kolay yolu uygulamamıza gelip activity_mail.xml den bahsediyorum Infer Constraints tusuna basmaktır
bastığımızda abuk subuk kaymalar görüceğiz özellikle + - buttonlarında ctrl z yaparak constraint leri kaldırdık infer constraints aslında sınırları kendisi belirliyor
ve otomatikmen belirlemeye çalısıyor fakat herzaman bu islem başarılı olmuyabilir bu tarz durumlarda ne yapılacağını detaylı bir şekilde öğreneceğiz fakat
şimdilik işimizi cözebilmek için palette sekmesinden Layouts sekmesine gelmemiz gerekiyor içerisinde LinearLayout (horizontal) , LinearLayout(Vertical) görüceğiz.
Biri yatay biri dikey layoutlar bunlar bu tarz çerçeveleri kullanarak  + - * / buttonlarının hepsini yatay bir şekilde düzgün bir eksende gösterebilceğimizi
gösterebilme şanşını elde edebiliriz o sebeple LinearLayout(Horizontal) yatay olanı buttonlarımız bölgesine atıyacağım ama görülen şuki bu bir görünüm değil
görsel değil buton değil bir özellik sadece buttonun kenarına bırakıyorum şimdik layoutumuzu.... Görülceği üzerine ilk geldiğinde adam gibi sürüklemişisek nerde
olduğu belli olmaz nerde olduğunu belli olması icin buttonlarımızı çerçevemizin içine koyduğumuzdan emin olalım bunun en güzel ve temiz yöntemi
Component Tree sekmesinden LinerarLayoutun icine buttonlarımızı taşımaktır :) sanki bir rar dosyasının içine birşey sürüklüyormuş gibi düsünelim. İnanın daha
basit olucaktır. Linear layoutumuzu istediğimiz yere sürüklüyebiliriz artık :) Apk'de nerede gözükceği size kalmış (eğer sağ taraftaki apk sekmemiz gözükmüyor ise)
Mavi 2 sayfa üst üste gelmiş şeklinde sekmeye tıklayıp Desing + Blueprint'in açık olduguna emin olalım şimdi bunlar grup halinde durdugu icin kendisinin
Constraitlerini verebilirim ne demek bu istediğimiz yere koyalım tam olarak istediğim görünüm oluştu şeklinde düsünelim İnfer Constrains tusuna basalım tekrar
bu sefer bir kaymanın yaşanmadığını görebilirsiniz. Tekrar emulatorumuzu calıstırırsak görüceğizki artık düzgün bir şekilde karşımıza çıkıcak son olarak tasarımda
işlerimizi bitirmeden önce nasıl idlerini verdik hepsinin burdada buttonlarımızın onclick methodlarını vermemiz gerekiyor basıldıgında ne yapılsın yani.
Butona tıkladığımızda ne olcagını yazdıgımız methodun ismidir onClick method. O Yüzden butonlara tıkladıgımızda  Common Attributes'in içinde onClick butonlarına gelip
istediğimiz ismi verebiliriz toplama çıkarma çarpma bölmede yazabilirsiniz türkçe karakter kullanmadan biz şimdilik ingilizcelerini yazıcağız
Şöyle yapıcağım yani + Toplama için (Sum) - için (deduct) * için (multiply) / için (divide) yazıcağım ve böylece onClick methodlarınıda atamış olduk tabiki
component Tree sekmesinde görülceği üzere hata veriyor onClick methodlarını buraya yazdık ama kodlama tarafına henüz daha yazmadığımız için.
Tabi bu şekilde çalıştırırsak App'i çökertebiliriz o yüzden bu işlemi yaptıktan sonra hemen gelip Kodlama tarafına kodlarını girmemiz ve atlamamız gerekiyorki
sağlık bir şekilde calıssın App'imiz çökmesin.
                                            // GÖRÜNÜMLERİMİZİ (Buttonlarımızı ONCLİCK METHODUMUZU) Kodlama bölümüne tanımlamak.
 // Onun için farklı şekilde not tuttuğumdan dolayı Notlar Main Activty Kod.jc 'ında not almamı ve kodlarımı MainActivty.javada devam etceğimi bildirmem lazım.
 // Burada sadece actity_main.xml üzerinde yaptığımız işlemlerin notunu tuttum.
 // Şu aşamada bir hesap makinesi uygulaması yaptık farklı bir string girdiğinde çöküyor bunu temizlemek amacı ile activty_main.xml dosyasına geri dönmek durumunda kaldım
    activty main.xml üzerinde edit text'in üzerine tıklar isek "inputType" diye bir yer var bu inputType şu işe yarıyor insan ismimi gireceğiz şifremi gireceğiz
    numaramı giriceğiz buradan seçebiliyoruz sadece number'i seçip true yapar isek şu aşamada (diğerlerini kaldırmamız gerekiyor) sadece numberi seçip tekrar çalıştırdıgımızda
sadece rakamların çıktığını görürüz. şu aşamada diğer tarafta notlarımı tutmaya devam ediceğim.
 */