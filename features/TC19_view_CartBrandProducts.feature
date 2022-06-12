Feature: View And Cart Brand Products

@brands_products
Scenario: TC19_View And Cart Brand Products
          (Marka urunleri goruntuleme ve sepete atma)

  When kullanici tarayiciyi baslatir
  Then kullanici anasayfaya gider
  Then ana sayfanin gorunur oldugunu test eder
  And kullanici Products butonuna tiklar
  And kullanici sol tarafta brands in goruldugunu test eder
  And kullanici herhangi bir marka ismini tiklar
  And kullanici marka sayfasina yonlendirildigini ve marka urunlerinin goruntulendigini test eder
  And kullanici sol tarafta baska bir marka baglantisini tiklar
  And kullanici o marka sayfasina yonlendirildigini ve marka urunlerinin goruntulendigini test eder