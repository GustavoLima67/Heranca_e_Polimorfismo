/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gustavo
 */
public class OutsourcerEmployee extends Employee{
    private Double additionalCharge;
    
    public OutsourcerEmployee(){
        super();
    }
    public OutsourcerEmployee(String name, Integer hours, Double valuePerHour,Double additionalCharge){
        super(name,hours,valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    public Double getAddItionalCharge(){
        return additionalCharge;
    }
    public void setAddItionalCharge(Double additionalCharge){
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
