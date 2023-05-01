# sales-point-project

## Introduction
the objective project is to bulid backend system by create API and apply CRUD methods on database with Implementation these  methods on  JPA Entities. and to build our code into an architecture layers to improve productivity.

## Models in projects
This project handle three types of modeles. The system starting with set of products and the user start ordring by use barcode for each product ,and the total of price is calculated by some bussines of logic . the purpose sales modele is to show the history of sales for each order by showing the name and price of each product.

**1. product**: the product table contains &rarr; `product_id` ,`product_name`,`product_price`,`barcode`.
**2. order**  : the order table contains   &rarr; `order_id`   , `total`.
**3. sale**   : the sale table contains    &rarr;  `sale_id`   , `product_id`.

## Testing 
in the testing process we started with :

1. Product Repo, and we tested some functions such add product , find All product
2. Then we tested ProductDao(service), here we mocked ProoductRepo and follow the same pricicples of test  at the step one which are Arrangment , act  , Assert.

In those examples of test , we connected the tesing  with `H2 database` rather than our real database


## Dependecy:
- spring boot starter web
- spring boot starter tomcat
- spring boot starter test
- lombok
- spring-boot-starter-data-jpa
- h2database
- junit


## Tools
- **xammp**   : to create our datbase.
- **postman** : to test the endpoints.



