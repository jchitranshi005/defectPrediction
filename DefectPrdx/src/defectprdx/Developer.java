
package defectprdx;

import java.math.BigDecimal;

import java.math.BigDecimal;
import java.lang.Class;

public class Developer {

    private String name;
    private BigDecimal salary;
    private int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    //...

    String getName() {
        return name;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getSalary() {
        return salary;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getAge() {
        return age;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
