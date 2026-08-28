# QA Automation – Mobil Uygulama Otomasyon Projesi

Bu proje, **Android Notepad uygulaması** üzerinde temel CRUD (Create, Read, Update, Delete) işlemlerinin otomasyonunu gerçekleştirmek amacıyla hazırlanmıştır.

Otomasyon testleri aşağıdaki teknolojiler kullanılarak geliştirilmiştir:

* Java
* Appium
* Gauge
* Maven
* IntelliJ IDEA

## 📱 Uygulama

Testlerde **Notepad** uygulaması kullanılmıştır.

Notepad uygulamasının kaynak kodlarına aşağıdaki GitHub repository üzerinden ulaşılabilir:

[Notepad GitHub Repository](https://github.com/farmerbb/Notepad?utm_source=chatgpt.com)

Testler Android Emulator üzerinde gerçekleştirilmiştir.



## 🧪 Test Senaryosu

Test senaryosu, Notepad uygulaması üzerinde uçtan uca bir CRUD akışını kapsamaktadır.

### 1. Uygulamanın Açılması

Notepad uygulaması cihaz üzerinde başlatılır.

### 2. Create – Yeni Not Oluşturma

Yeni not ekleme butonuna tıklanır.

Notun içerik alanına:

`Süt, Yumurta, Ekmek`

yazılır ve not kaydedilir.

Notun ana listede görüntülendiği doğrulanır.

### 3. Read – Notun Görüntülenmesi

Ana listede bulunan nota tıklanarak detay sayfasına gidilir.

Not detayında içeriğin eksiksiz geldiği doğrulanır.

### 4. Update – Notun Güncellenmesi

Mevcut notun içeriği temizlenir.

Yeni içerik:

`Peynir, Zeytin, Domates`

olarak girilir ve güncelleme kaydedilir.

### 5. Delete – Notun Silinmesi

Güncellenen nota tekrar girilir.

Silme butonuna basılarak işlem onaylanır.

Notun ana listeden kaldırıldığı doğrulanır.

## ▶️ Testlerin Çalıştırılması

Testler IntelliJ IDEA içerisindeki Run butonu kullanılarak çalıştırılmaktadır.

`notepad.spec` dosyası IntelliJ IDEA içerisinde açıldıktan sonra, ilgili test senaryosunun yanında bulunan Run butonuna tıklanarak test başlatılır.

Testlerin çalışabilmesi için öncelikle:

- Android Emulator'ın çalışıyor olması,

- Appium Server'ın aktif olması,

- Gerekli Maven bağımlılıklarının yüklenmiş olması gerekmektedir.

Test çalıştırıldığında Gauge senaryosu üzerinden Java step tanımları yürütülür ve Appium aracılığıyla Android Emulator üzerindeki Notepad uygulaması test edilir.

## 🎯 Projenin Amacı

Bu proje ile **Java + Appium + Gauge** kullanılarak bir mobil uygulama üzerinde **Create, Read, Update ve Delete** işlemlerinin otomasyonu gerçekleştirilmiştir.
