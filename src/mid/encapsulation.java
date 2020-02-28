/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

/**
 *
 * @author a_ash
 */
public class encapsulation {
    private String name;
    private int age;
    
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
      this.name=name;  
     }
    void setAge(int age){
        this.age=age;
    }
}
