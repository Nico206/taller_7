package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.Products;

import java.sql.SQLException;


public class TestProductsRepositorylml {
    public static void main(String[] args) throws SQLException {
        
        Repository<Products> repository = new ProductsRepositorylml();
        System.out.println("==========saveObj Insert ==========");
        Products productInsert = new Products();
        productInsert.setProduct_name("Perro caliente");
        productInsert.setProduct_value(5000);
        productInsert.setCategory_id(1);

        
        repository.saveObj(productInsert);
        productInsert.setProduct_name("escoba");
        productInsert.setProduct_value(3500);
        productInsert.setCategory_id(2);

        repository.saveObj(productInsert);

        System.out.println("========== listAllOb =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Products productUpdate= new Products();
        productUpdate.setProduct_id(2);
        productUpdate.setProduct_name("Hamburguesa");
        productUpdate.setProduct_value(5500);
        productUpdate.setCategory_id(2);
        repository.saveObj(productUpdate);
        repository.listAllObj().forEach(System.out::println);
    }
}
