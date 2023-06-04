# Spring ile CRUD Backend Uygulaması

## Özet

Uygulama üzerinde aboneler ve firmalar oluşturup güncellenebilecek bir REST servis
tasarlanacak. Abonenin adı soyadı, abone numarası, araç plakası ve firma bilgisi olacaktır. Firma
alanları firma adı, telefon numarası ve adresi şeklinde kayıt edilecektir. Tabloları oluşturma için
migration zorunludur.

## Kullanılan Teknolojiler

<ul>
    <li>Spring Boot</li>
    <li>PostgreSql</li>
    <li>JPA Hibernate</li>
</ul>


## Endpointler ve İçerikler

<ul>
    <li>Firma Kaydetme (Endpoint)
        <ul>
            <li>Firma Adı</li>
            <li>Telefon Numarası</li>
            <li>Adres Bilgisi</li>
        </ul>
    </li>
    <li>Firma Güncelleme (Endpoint)
        <ul>
            <li>Firma Adı</li>
            <li>Telefon Numarası</li>
            <li>Adres Bilgisi</li>
        </ul>
    </li>
    <li>Firma Silme (Endpoint)</li>
    <li>Firma Listeleme (Endpoint)</li>
    <li>Abone Ekleme (Endpoint)
        <ul>
            <li>Adı</li>
            <li>Soyadı</li>
            <li>Abone Numarası</li>
            <li>Araç Plakası</li>
            <li>Firma ID</li>
        </ul>
    </li>
    <li>Abone Güncelleme (Endpoint)
        <ul>
            <li>Adı</li>
            <li>Soyadı</li>
            <li>Abone Numarası</li>
            <li>Araç Plakası</li>
            <li>Firma ID</li>
        </ul>
    </li>
    <li>Abone Arama (Endpoint)
        <ul>
            <li>Arama ad soyad, abone numarası veya araç plakası üzerinden yapılacak</li>
            <li>Araç plakası aramasında tam eşleşme olmasada benzer plakalı aboneler listelenecektir.</li>
            <li>Örneğin abonenin araç plakası 06TETA123. Arama yapılırken alttaki plakalar
                girildiğinde sonuç yine gösterilecek
                <ul>
                    <li>06TET123</li>
                    <li>06TETA1231</li>
                    <li>6TETA12</li>
                    <li>06ETA123</li>
                </ul>
            </li>
            <li>Abone araması yapılırken her firma kendi abonelerini görüntüleyebilecek</li>
        </ul>
    </li>
</ul>

## Bonus

• Benzerlik algoritması için levenshtein distance. 