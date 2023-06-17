package co.edu.sena.project2687350.model;

public class Products {
    //atribuos
    private Integer product_id;
    private String product_name;
    private Integer product_value;
    private Integer category_id;

    //Constructores
    public Products() {

    }
    public Products(Integer product_id, String product_name, Integer product_value, Integer category_id){
        this.product_id= product_id;
        this.product_name=product_name;
        this.product_value=product_value;
        this.category_id= category_id;
    } 

    //GETTERS

    public Integer getProduct_id() {
        return product_id;
    }
    
    public String getProduct_name() {
        return product_name;
    }
    
    public Integer getProduct_value() {
        return product_value;
    }
    
    public Integer getCategory_id() {
        return category_id;
    }

    //SETTERS
    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    
    public void setProduct_value(Integer product_value) {
        this.product_value = product_value;

    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;

    }

    // ToString
    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_values='" + product_value + '\'' +
                ", category_id='" + category_id + '\'' +
                '}';
    }
    
    



}



