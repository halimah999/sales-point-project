# sales-point-project

## Introduction
the objective project is to bulid backend system by create API and apply CRUD methods on database with Implementation these  methods on  JPA Entities. and to build our code into an architecture layers to improve productivity.

## Application layers: 
In general we divided our project into 5 components: <br />
- Controller: to handeling HTTP requests.
- Dao : we dealt with dao as service to make bussines logic , but in future we will seprate between Daos and Services layers
- Entity:  contains classes mapped to tables
- Dto: Data transfer object, we used it  here  for certain purposes to save order also to save sales based on product and order . And to choose require field of entities during interact with client
- Repository: to manipulation of databases

## Models in projects
This project handle three types of modeles. The system starting with set of products and the user start ordring by use barcode for each product ,and the total of price is calculated by some bussines of logic . the purpose sales modele is to show the history of sales for each order by showing the name and price of each product.

**1. product**: the product table contains &rarr; `product_id` ,`product_name`,`product_price`,`barcode`.<br /><br />
<p align="center" style="text-align:center">
<img src ="./img/product.png ">
</p>

<br />

**2. order**  : the order table contains   &rarr; `order_id`   , `total`.<br /><br />
<p align="center" style="text-align:center">
<img src ="./img/order.png ">
</p>

**3. sale**   : the sale table contains    &rarr;  `sale_id`   , `product_id`.<br /><br />
<p align="center" style="text-align:center">
<img src ="./img/sale.png ">
</p>


## Testing 
in the testing process we started with :<br />

1. ProductRepo, and we tested some functions such add product , find All product 
2. Then we tested ProductDao(service), here we mocked ProoductRepo and follow the same pricicples of test  at the step one which are Arrangment , act  , Assert. 
<br /><br />
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



