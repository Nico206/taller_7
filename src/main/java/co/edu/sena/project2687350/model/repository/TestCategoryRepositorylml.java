package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.Categories;

import java.sql.SQLException;


public class TestCategoryRepositorylml {
    public static void main(String[] args) throws SQLException {
        Repository<Categories> repository = new CategoryRepositorylml();
        System.out.println("==========saveObj Insert ==========");
        Categories categoryInsert = new Categories();
        categoryInsert.setCategory_name("Comida");
        
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("Aseo");

        repository.saveObj(categoryInsert);

        System.out.println("========== listAllOb =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Categories categoryUpdate= new Categories();
        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);
    }
}
