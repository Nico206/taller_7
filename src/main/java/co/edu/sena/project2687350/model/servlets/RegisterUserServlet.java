package co.edu.sena.project2687350.model.servlets;

import co.edu.sena.project2687350.model.User;
import co.edu.sena.project2687350.model.repository.Repository;
import co.edu.sena.project2687350.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register-user")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException{
        //collect all form data
        String user_firstname =  request.getParameter("user_firstname");
        String user_lastname = request.getParameter("user_lastname");
        String user_email = request.getParameter("user_email");
        String user_password = request.getParameter("user_password");

        //Fill it up in a User bean
        User user = new User();


        // call Repository  layer and save the user object
        Repository<User> repository = new UserRepositoryImpl();
        int rows = 0;
        try{
            rows= repository.saveObj(user);
        }catch (SQLException e){
            e.printStackTrace();
        }

        if (rows == 0){
            System.out.println("Ocurrio un error");
        }else{

        }
    }
}