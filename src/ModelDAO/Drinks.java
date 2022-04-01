/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;


/**
 *
 * @author huyparody
 */
public class Drinks {

  
    private int id;
    private String name;
    private int price;
    private int soluong;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
  

    public Drinks() {
    }

    public Drinks(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Drinks(int id, String name, int price,int soluong) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.soluong=soluong;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  

    @Override
    public String toString() {
        return name;
    }
}
