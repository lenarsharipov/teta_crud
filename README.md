# Spring CRUD Backend Application

## Summary

A REST service is be designed for creating and updating subscribers and companies within the application. The subscriber will have a name, surname, subscriber number, and vehicle plate information. The company fields will be recorded as company name, phone number, and address. Migration is required for creating the tables.

## Technologies Used

<ul>
    <li>Spring Boot</li>
    <li>PostgreSql</li>
    <li>JPA Hibernate</li>
</ul>


## Endpoints and Contents

<ul>
    <li>Save Company (Endpoint)
        <ul>
            <li>Company Name</li>
            <li>Phone Number</li>
            <li>Address Information</li>
        </ul>
    </li>
    <li>Update Company (Endpoint)
        <ul>
            <li>Company Name</li>
            <li>Phone Number</li>
            <li>Address Information</li>
        </ul>
    </li>
    <li>Delete Company (Endpoint)</li>
    <li>List Companies (Endpoint)</li>
    <li>Add Subscriber (Endpoint)
        <ul>
            <li>Name</li>
            <li>Surname</li>
            <li>Subscriber Number</li>
            <li>Vehicle Plate</li>
            <li>Company ID</li>
        </ul>
    </li>
    <li>Update Subscriber (Endpoint)
        <ul>
            <li>Name</li>
            <li>Surname</li>
            <li>Subscriber Number</li>
            <li>Vehicle Plate</li>
            <li>Company ID</li>
        </ul>
    </li>
    <li>Search Subscriber (Endpoint)
        <ul>
            <li>Search can be performed based on name, subscriber number, or vehicle plate.</li>
            <li>Even if there is no exact match in the vehicle plate search, subscribers with similar plates will be listed.</li>
            <li>For example, if the subscriber's vehicle plate is 06TETA123, when the following plates are entered, the result will still be displayed:
                <ul>
                    <li>06TET123</li>
                    <li>06TETA1231</li>
                    <li>6TETA12</li>
                    <li>06ETA123</li>
                </ul>
            </li>
            <li>When searching for subscribers, each company can view its own subscribers.</li>
        </ul>
    </li>
</ul>

## Bonus

• Levenshtein distance for similarity algorithm. 

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
