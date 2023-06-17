package co.edu.sena.project2687350.model.servlets;

import co.edu.sena.project2687350.model.Products;

import co.edu.sena.project2687350.model.repository.Repository;
import co.edu.sena.project2687350.model.repository.ProductsRepositorylml;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/register-product")

public class RegisterProductServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        //collect all form data
        String product_name =  request.getParameter("product_name");
        Integer product_value = Integer.valueOf(request.getParameter("product_value"));
        Integer category_id  = Integer.valueOf(request.getParameter("category_id"));

        //Fill it up in a User bean
        Products product = new Products();


        // call Repository  layer and save the user object
        Repository<Products> repository = new ProductsRepositorylml();
        int rows = 0;
        try{
            rows= repository.saveObj(product);
        }catch (SQLException e){
            e.printStackTrace();
        }

        if (rows == 0){
            System.out.println("Ocurrio un error");
        }else{

        }
    }
    }


