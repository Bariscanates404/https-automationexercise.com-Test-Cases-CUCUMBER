Feature: TC18_View Category Products
  @view_category_products
  Scenario: TC18_View Category Products
            (Kategorideki urunleri goruntuleme)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then kullanici sol tarafta kategorilerin gorunur oldugunu test eder
    Then kullanici Women kategorisine tiklar
    Then kullanici Women kategorisi altindaki herhangi bir kategori baglantisina tiklar
    Then kullanici kategori sayfasinin goruldugunu test eder
    Then kullanici Women kategorisindeki hangi alt basligi secerse, acilan sayfada ona gore kategori basligi test eder
    Then kullanici sol tarafta Men kategorisi altindaki herhangi bir kategori baglantisina tiklar
    Then kullanici Men kategorisindeki hangi alt basligi secerse, acilan sayfada ona gore kategori basligi test eder
