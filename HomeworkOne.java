
package homework;

import javax.swing.JOptionPane;


public class Homework {

  
    public static void main(String[] args) {
      String m=JOptionPane.showInputDialog(null,"write number",JOptionPane.QUESTION_MESSAGE);
      int i=Integer.parseInt(m);
        System.out.println(m);
      if(i%2==0){
        JOptionPane.showMessageDialog(null, "that number is even ");
          
      }
      else
          JOptionPane.showMessageDialog(null, "that number is odd ");
      int n;
      n=JOptionPane.showConfirmDialog(null, "do another ","select an option",JOptionPane.YES_NO_CANCEL_OPTION);
      if(n==JOptionPane.YES_OPTION)
          JOptionPane.showInputDialog(null, "inter an integer ","input",JOptionPane.QUESTION_MESSAGE);
        System.out.println(m);
         Integer.parseInt(m);
         if(i%2==0){
             JOptionPane.showMessageDialog(null, "this number is even ");
         }
         else 
             JOptionPane.showMessageDialog(null, "this number is odd ");
         if(n==JOptionPane.NO_OPTION)
             JOptionPane.showMessageDialog(null, "lier!");
         else{
             n=JOptionPane.showConfirmDialog(null, "do another","     ",JOptionPane.NO_OPTION);
         }
    }
}
             
         
     
         
    
    

