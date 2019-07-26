/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muet;

/**
 *
 * @author ADIL RAZA
 */
public class Students extends Dept{
    String Batch;
 
   
    public Students( String batch,String Name,String dept,  String rollno) {
super(Name, dept, rollno);
this.Batch=batch;    }

   

   
    
    public void show(){
    
        System.out.println("this is Student class show method ");
        System.out.println("the Student  is from Batch  "+Batch);
        System.out.println("the Student Name is "+Name);
        System.out.println("The  Student Depatrment is  "+dept);
        System.out.println("THE  Student RollNo is "+rollno);
        
    }
    
    public void data(){
        System.out.println("this is Student class data method ");
 
    }
    
    
}
