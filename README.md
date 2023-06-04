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

## Start App

Create database with following script using login: postgres, password: password
<pre>CREATE DATABASE teta_crud;</pre>

Start app by starting main method of following class:

<b>/src/main/java/teta/crud/TetaCrudApplication.java</b>

## Screenshots
Save company
![001_create_company.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F001_create_company.png)

Delete company by id
![002_delete_company.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F002_delete_company.png)

List all companies
![003_find_all_companies.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F003_find_all_companies.png)

Update persisted company
![004_update_company.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F004_update_company.png)

Save customer
![005_create_customer.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F005_create_customer.png)

Update customer
![006_update_customer.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F006_update_customer.png)

Search customer by name, surname, company id
![007_find_customer_by_name.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F007_find_customer_by_name.png)

Search customer by customer unique number and company id
![008_find_customer_by_number.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F008_find_customer_by_number.png)

Search customer by vehicle plate and company id
![009_find_customers_by_plate.png](src%2Fmain%2Fresources%2Fstatic%2Fscreenshots%2F009_find_customers_by_plate.png)

### Contacts
<ul>
    <li><a href="mailto:lenarsharipov@gmail.com">lenarsharipov@gmail.com</a></li>
    <li><a href="https://t.me/LenarSharipov" rel="nofollow">telegram</a></li>
</ul>
