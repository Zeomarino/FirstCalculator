/*
Main Activty java'yı önümüze açalım herşeyden önce şunu yapmamız gerek.
Bizim açtığımız tasarım bölümündeki onCreate methodlarını yazıcazki bunları unutmayalım aklımızdan çıkmasın ve temiz bir hal alsın.
neydi bu onClick methodları + - * / girdiğimiz onClick methodlarıydı sum vs.
mainactivty javamızda onCreate altına değil tabiki başlagınçta olmasını istemeyiz ama sınıfın içine yani
} sonra ama } sınıftaki süslü parantezin içine umarım tam olarak açıklayıcı bir şekilde anlatabilmişimdir tanımlıyalım methodumuzu.
public void sum() { yazıp methodumuzu açıyoruz bu methodumuz ama () içerisine daha önceki dersimizde anlatıldığı üzere görünüm tarafından çağrılcağını belirtmek için
 + ile çalışması için sum ismini almıştır onClick + için sum girmiştir hatırlar iseniz. her neyse konumuza dönmemiz gerekirse (içerisine) (View) yazıyoruz
 daha sonra syntax hatası kırmızı cizgi hatası alır isek alt + enter tus kombinasyonlarına basarak sınıfımızın içine view'imizi import edelim. daha sonra
 (View view) yazıp syntax hatalarımızın tümünü giderelim yani kısacası (View) yazıktan sonra kırmızı çizgi hatası alırsak ilk başta alt enter ile import edip
 daha sonra  (View view) şeklinde yapıyoruz. Böylece bunun bir görünüm tarafından cağrılcağını methodumuza belirtmiş oluyoruz şimdi aynısını diğerleri için yapalım
daha sonra bu method içerisinde temel olarak sunu yapıcağız 2 ekrandan sayıyı alıcağız kullanıcının yazdığı ve onları 4 işleme tabi tutacağız bu 2 sayıyı alabilmek için
edit textimize ihtiyacımız var sonra bu işlemi tabi tuttuktan sonra sonucu kullancıya gösterebilmek için resultText'imize ihtiyacımız var bu sebepleri onları
bu methodlar içinde tanımlamamız gerekiyor daha önce imageWiew tarafında bir çalışma yapmıştık orda tanımlama nasıl yapılıyor görmüştük onCreatenin altında yazalım
öncelikle hangi görünümü tanımlıyacaksak onun sıfını yazmamız gerekiyor onCreate bölümünde EditText yazıyoruz yine aynı şekilde alt enter ediyoruzki import etmesi için
Şu şekilde devam ediyoruz EditText number1Text = idsinide bu şekilde demiştik hatırlar isek EditText number1Text = findWiewById(R.id.)
yazdıktan sonra seçebilceğimiz şeyler geliyor karşımıza number1Text yaptığımız için .dan sonra R.id.number1Text şeklinde yapıyoruz.
 EditText number1Text = findViewById(R.id.number1Text); bu şekilde kodumuz son halini alıyor aynı işlev number2Text içinde geçerli.
 Birde hatırlarsak TextView'imiz vardı onuda resultText yapmıştır hatırlar isek onuda bu şekilde yapıyoruz.
 TextView resultText = findViewById(R.id.resultText);
 farkedersek number1Text (R.id.number1Text) şeklinde idlerimiz aynı oldu bunların ister isek isimlerini değiştirebilirdik ama bu şekilde yapar isek karısıklık olmadan
 basit bir şekilde anlaşılır vaziyette yapar isek bizim icin daha güzel olur. Tabi burda işlemimiz bitmiyor number1Text felan tanımladık number1Text'den içinde
 yazan şeyi almak için tanımlamamız gerekiyor onun için number1Text.getText() der isek eğer  ve aldığımız texti .toString() çevirir isek aslında kullanıcının yazdığı şey
 string formatında yani metin olarak alabiliyoruz         number1Text.getText() şekilde oluyor yani fakat bu işlemi onCreate altında yapmanın bir mantığı yok
niçin onCreate ne zaman yapılıyordu hatırlar isek app ilk açıldıgı gibi şimdi zaten app ilk açıldıgında boş bir ekran görüceğiz her 2 taraftada numaramız olmucak
yani burda ne yazdığını onCreate altında almamızın hiç bir anlamı yok biz orda yazanı ne zaman almalıyız der iseniz kullanıcı + - * / tıkladıgı zaman almalıyızki
 işimiz daha güzel ve sorunsuz olsun. ben bu işlemi alıp public void sum'ın içinde tanımlıcayağım. number1Text dediğimizde içine yazdığı şeyi hemen görücekmi cevabı ise
 hayır görmüyecek çünkü scope dediğimiz kapsam dediğimiz her kod bloğunun kendi içerisinde kendi bacağından asıldıgı bir durum vardı peki biz
 edit textlerimizi textviewi alıp her seferinde methodumuzun içinde yazar isek çalışırmı çalışır fakat verimsiz bir iş yapmış oluruz hem hafıza olarak verimli olmaz
 hemde bizim icin verimli olmaz onun yerine hatırlar isek edittextlerimizi vs global tanımlıyabiliyorduk daha doğrusu aynı sınıf içerisinde tanımlıyabiliyorduk ve
 o sınıf içerisinde tüm methodlardan ulaşabiliyorduk bunu aslında bir değişken olarak tanımlamayı öğrenmiştik
 appcombat activty'nin içine  int myNumber; diyip sonra myNumber'i gelip create içinde 0 a eşitleyip her yerde kullanabilmiştik  hatırlarsanız
 fakat zaten aynı şeyi burdada yapabiliriz AppCopat içine EditText number1Text; şeklinde yazar isek erişebiliyor oluruz ama şuna dikkat edelim
         EditText number1Text = findViewById(R.id.number1Text); olan satırlarımızın başından EditText vs 'i silelim çünkü yukarda birkere tanımladık artık
         cağıracağız  böylece number1Text dediğimizde appcompatın icinde genel sınıfımızın içindekine erişebiliyor vs olucağız lütfen başındaki tanımlamaları
         silmeyi unutmayalım. Yoksa çalışmaz. Şu aklımızda kalsın eğer bir görünüm tanımlıyacaksak Sınıfın altında tanımlayıp onCreatede findViewByid'sini yapmak bize
bütün methodlarda kullanmamız için bir kapı açar  gelip farklı methodlar içinde number1Text der isek zaten erişebiliyor olucağız bu dakikadan sonra.
Şimdi bu dakikadan sonra toplama çıkarma işlemlerimizi tanımlamamız gerekiyor şu zamana kadar appimiz için
Görünümleri yaptık , görünümleri yaptıktan sonra koda tanımladık  daha işlem yapmadık yani toplama çıkarma vs oralara giremedik şimdi oralara girebilmek için
yeni bir kaç şey öğrenmemiz lazım number1Text'den mesela kullanıcının yazdığı şeyi nasıl alabiliyoruz number1Text.getText() der isek aslında içinde yazan metni bize
veriyor ama sağtrafta açılan pencerede Editable diye bir sınıfta veriyor bunu Editable bir data tipidir bir sınıf değil bir veri tipi degil  bu tamamen getText
ve setText'te kullanılan bir custom sınıf biz bunu alıp işlemlerimizde kullanamayız bir string gibi davranamayız buna zaten o sebeple
number1text.getText() dedikten sonra bir . koyar isek tooString() diye birşey çıkarmıslar yani aldığım metni stringe çeviriyorum böylece şu şekilde oluyor
number1Text.getText().toString() peki string almak bizim işimize yarıyormu ? Şu şekilde yaparsak : String myString = number1Text.getText().toString();
kullanıcının verdiği şeyi yazdığı şeyi string olarak alabilirim ama biz stringlerde toplama yapmak istemiyoruz biz rakamları toplamak istiyoruz şimdi rakamları toplamak için
ozaman bunu rakama çevirmemiz lazım yani Double'ye yada İnteger'e .  Kesirli olmasını istiyorsak Doubleye tam sayı olmasını istiyorsak İnteger'e.
Şimdilik biz integer'e gidelim basit tutmak için sonuçta tam foksiyonal bir hesap makinesi yapmıyoruz test amaçlı bunları yapıyoruz sonrasında zaten
çok daha düzgün apller yapıcağız  şimdilik number1Text'i nasıl integere çevirebiliriz onu anlıyacağız integer'e çevirmeninde bir kaç yolu var en kolay yollarından biri
Integer.parseInt demek bunu dediğimizde bizden bir string istiyor ve verdiğimiz stringi tam sayıya çeviriyor bizim stringimiz var o halde şöyle yapalım.
Integer.parseInt(number1Text.getText().toString()); farkederseniz daha önceki yaptığmız number1texti sadece parseIntın içine yazdım bu sayede benim integerim oldu artık
yani biz artık şunu diyebiliriz gönül rahatlıygıyla : int number1 = Integer.parseInt(number1Text.getText().toString()); böylece ilk integerimizi oluşturmuş olduk.
aynı işlemi number 2 textede yapalım  daha sonra ise bu 2 sini toplayıp result diye bir integer oluşturabiliriz şu şekilde "int result = number1 + number2;"
ve en son "resultText.setText();" diyip yukardaki resultı gösterebiliriz. Sonucu yazdırabiliriz yani.
Burda dikkat etmemiz gereken şey şu resultText.setText(); buraya gelip direk result yazamayız yani şu şekilde olmaz direk
resultText.setText(result); yazarız bir sıkıntı olmaz ama çalıştırınca cöker aslında setText bizden bir karakter bir string istiyor biz direk integeri içerisine
veremeyiz nasılki yukarda stringi integere çevirdik burdada integer'i bir stringe çevirmemiz lazım şanşlıyızki şöyle birşey yaparsak "" ekleyip
"Result: " gibi bir stringle başlayıp sonra + result der isek yani başında bir metin varsa zaten direk bizim için bir stringe çeviriyor bunu
şu aşamamızda app'imiz çalıştırır isek + sum isleminin çalıştığını görebiliriz.
Ozaman ne yapıcağız yazdığımız kod satırını gelip öteki islemlerimizin methodlarının içlerine yazalım.
Multiply deduct vs vs içlerine girelim. Sadece yapmamız gereken şu aşamadaki işlemleri değiştirmek yani "int result = number1 - number2;" gibi
"int result = number1 * number2;" gibi sadece aradaki islemleri değiştirdik. Tabiki çok daha kompleks çok daha fazla islemlerin yapılabildigi bir hesap makinesi
yapabilirdik fakat şuanlık onlara gerek yok öğrendiklerimizi pratik ediyoruz Şu aşamada app'imizi çalıştırdğımızda çalıştığını görebiliriz.
Bu aşamada tek sıkıntı şu olabilir 2 Aşamadan birine hiçbir sayı girilmez veya işlemlerden birine bir isim girilirse app'imiz çöker
Çöktüğünde logcat'i açıp error'u seçtiğimizde bir dolu hata mesajı görürüz. bizim app'imizin neden çöktüğüne gelir isek onClickte çektiğini söylüyor error sekmesinde
onClick'i çalıştırmadım diyor yani "boş" bir input vermissin diyor bunu parseInt yapmaya çalıştım yapamadım diyor yani  bu tarz şeylerin üstesinden gelebilmek için
bir kaç yöntem düşünebiliriz en azından bunu basit bir şekilde nasıl halledebiliriz şimdilik bunu düşünelim  :

Şimdi ne gibi bir sorunumuz vardı hatıyalım aslında programımız çalışıyor ama kullanıcı yanlış inputlar verir ise çökmeye yol açabilir kullancının verdiği hiç bir input
yanlış olmaz sizin yazdığınız kod yanlış olur kullanıcı her zaman zaten abuk birşey yapıcağını düşünerek hareket etmemiz gerekiyor o sebeple ilk akla gelen şu olabiliyor
sayılara tıkladığımızda düzgün klavye açılmasın sadece numaralar çıksın mesela böylece adam sadece numara girebilsin ki mantıklı düsünce zaten hesap makinesi yapıyoruz
niye harfler çıkıyor mesela onu nasıl yapabiliriz .
Layout / Activity_main.xml'e geçiceğim. Ve şu aşamada notlarımı notlar xml üzerinden alıcağım.
Main_activty.xml üzerinde inputu sadece number olarak tanımladığımda sadece rakam yazdırabilir şekilde düzenlendi.
Gelip birşey yazamıcak numara dışında yani. Peki şu aşamada kullanıcı ne yapabilir boş bırakabilir. Boş bırakırsa app'imiz yine cökücek çünkü bu sefer
getText ve getText.tooString'in sonucu istediğimiz gibi olmuyacak yine aynı şey peki bunu nasıl fixliyebiliriz bunu kodda kontrol etmemiz lazım şunu dememiz lazım
yani adam boş bıraktıysa hata mesajı ver boş bırakmadıysa devam et bu işlemi yap dememiz lazım bunu şöyle yaparız :
java temellerinde bulunan if kontrolleri ile edit texti nasıl alıyorduk numbertext.getText().tooString()); gibi bütün bu işlemleri yapmadan önce bir if kontrolü
yapalım ozaman " if (number1Text.getText().toString())" şu şekilde girdimize aklımıza hemen şu gelebilir if (number1Text.getText().toString()) == "") şu şekilde
2 tane "" işareti koyup kontrol edebiliriz diyebiliriz aslında coğu şey için doğru sadece stringleri == şeklinde kontrol edemiyoruz nasıl ediyoruz ozaman.
Şöyle yapıyoruz tooString() dedikten sonra . diyoruz matches diye birşey cıkıyor matches demek stringin içerisindeki karakterler birazdan yazacağım karakterlerle
eşleşiyormu demek .matches yazar isek matches(bunun içine bir string vermemiz lazım) neyle kontrol etmek istiyorsak misal biz boş bir stringle kontrol etmek istiyoruz
o yüzden "" bir tane boş string koyuyoruz şu hali alıyor if (number1Text.getText().toString().matches("")) ondan sonra kontrolümüz bukadar aslında ama biz şuan
sadece number1 texti kontrol ettik hem number1Text hemde number2Text boş işe bu işlemi yapmıcağız yani o yüzden
if (number1Text.getText().toString().matches(""))   dan sonra "||" veya yapıyorduk aynısını number 2 string için yazıyoruz yani
if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){ şeklinde oluyor bunlar eğer var ise eğer yok ise
if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
} else { yapıp
içine kodlarımızı yapıştırıyoruz peki gerçekten boş işe ne yapmak istiyoruz kullanıcıya bir hata mesajı gösterebiliriz
}
hata mesajını göstermek icin "resultText.setText("Enter number numara gir!");" yazabiliriz ve işlem bittiğinde çalıştırdığımızda çalıştığını bir kaç hatamızın
fixlendiğini görebiliyoruz daha sonra diyer methodlarımızın icine kopyala yapıştır yapabiliriz işlemleri değiştirdiğimizden emin olalım - ye bastıgında - islemi yapsın
yani artık app'imiz bitti . Tabiki bir çok farklı şey düşünebiliriz 0 a bölüncede işlemimiz cökebilir ozaman onuda kontrol edebiliriz veya 0 yazıp 0 ile çarparsak
zaten 0 cıkıcagı belli niye öyle birşey yapıyorsun yazdırabiliriz biz bunu gerçekten hesap makinesi yapalım diye değil örnek olsun diye yaptık bunu pratik amaclı düsünelim
gerçekten bir hesap makinesi yapmıyoruz hem güvenli düşünmeyi hem hata mesajı çıkarsa nerden bakıcağımızı hem editTextden nasıl text alınabilceğini vs gördük
ve layout islemlerine kücük bir giriş yaptık bundan sonra bu işlemleri daha detaylı görmeye devam ediceğiz







 */