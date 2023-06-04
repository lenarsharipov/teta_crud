CREATE TABLE customers (
    customer_number     SERIAL PRIMARY KEY,
    name                VARCHAR NOT NULL,
    surname             VARCHAR NOT NULL,
    vehicle_plate       VARCHAR NOT NULL UNIQUE,
    company_id          INT     NOT NULL REFERENCES companies(id)
);