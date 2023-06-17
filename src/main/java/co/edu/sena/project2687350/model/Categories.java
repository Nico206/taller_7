package co.edu.sena.project2687350.model;

public class Categories {
    //atribuos
    private Integer category_id;
    private String category_name;


    //Constructores
    public Categories() {

    }

    public Categories(Integer category_id, String category_name){
        this.category_id= category_id;
        this.category_name= category_name;
    }

    //GETTERS

    public Integer getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    //SETTERS

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    // ToString
    @Override
    public String toString() {
        return "Categories{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }


    
}
