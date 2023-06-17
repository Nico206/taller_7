# Taller 7

Imclusion de las tablas categorias y productos en la base de datos 

CREATE TABLE categories(
category_id int primary key auto_increment,
category_name varchar(50) not null
);

create table products(
product_id int primary key auto_increment,
product_name varchar(50) not null,
product_value int not null,
category_id int,
foreign key (category_id) references categories (category_id)
);

# Inclusion de los beans para las tablas productos y categorias

![image](https://github.com/NicoYwY/taller_7/assets/125584676/e9a91ebb-6793-4d8c-b564-1429cd5e7ebf)

![image](https://github.com/NicoYwY/taller_7/assets/125584676/a7faa169-9433-4006-94d5-4234977beb10)


 # Inclusion de los repositorios para cada tabla 

![image](https://github.com/NicoYwY/taller_7/assets/125584676/5bef18f9-2fee-4d9b-ac03-4099cf899313)

![image](https://github.com/NicoYwY/taller_7/assets/125584676/86028e42-93f0-47e5-9b72-6f23ea4664ce)


# Inclusion de JSP requeridos para captura de datos


![image](https://github.com/NicoYwY/taller_7/assets/125584676/8deffbf3-a73b-4c98-bd5e-596b200292c7)

![image](https://github.com/NicoYwY/taller_7/assets/125584676/f3619e6f-5da3-4747-a757-ae938ef9610c)





