package boletin7.pkg3;

import javax.swing.JOptionPane;

public class Boleto7 {
    public void negPos(){
        int num =Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        if(num>0){
            JOptionPane.showMessageDialog(null, "+");
            
        }
        else if (num<0){
            JOptionPane.showMessageDialog(null, "-");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "0");
            
        }
       
        
    }
    
}
