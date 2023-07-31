/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical4;

/**
 *
 * @author kavin
 */
public class practical4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercise1
        //Mr.Bogdan 
        Employee bogdan=new Employee();
        bogdan.setEmpName("Mr.Bogdan ");
        bogdan.setEmpID(001);
        bogdan.setEmpDes("Mannager");
        System.out.println("Employee Name:"+bogdan.getEmpName()+"\n"+
                           "Emplyee ID:"+bogdan.getEmpID()+"\n"+
                           "Designation:"+bogdan.getEmpDes());
        
        //Ms.Bird 
        Employee Bird=new Employee();
        Bird.setEmpName("Mr.Bird ");
        Bird.setEmpID(002);
        Bird.setEmpDes("Emplyee");
        System.out.println("Employee Name:"+Bird.getEmpName()+"\n"+
                           "Emplyee ID:"+Bird.getEmpID()+"\n"+
                           "Designation:"+Bird.getEmpDes());
        //ENd of excersice1
        //exercise
        SuperB b=new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        subC c = new subC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 


        
    }
    
}
