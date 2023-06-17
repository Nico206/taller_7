package co.edu.sena.project2687350.model.servlets;

import co.edu.sena.project2687350.model.Categories;
import co.edu.sena.project2687350.model.repository.CategoryRepositorylml;
import co.edu.sena.project2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;
import java.sql.SQLException;

@WebServlet("/register-category")
public class RegisterCategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        //collect all form data
        String category_name =  request.getParameter("category_name");


        //Fill it up in a User bean
        Categories category = new Categories();


        // call Repository  layer and save the user object
        Repository<Categories> repository = new CategoryRepositorylml();
        int rows = 0;
        try{
            rows= repository.saveObj(category);
        }catch (SQLException e){
            e.printStackTrace();
        }

        if (rows == 0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Se registro exito");
        }
    }
}
