package hospital;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;

public class Hospital {

   
    public static void main(String[] args) {
       int s= JOptionPane.showConfirmDialog(null,  "Would you like to take the natural length determination test??", "Quesiton",
         JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
        if (s==JOptionPane.YES_OPTION) {
             JOptionPane.showInputDialog(null, "Enter your length please:", "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter your father length please:", "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter your mother length please:", "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter age please:", "", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter your gender please:", "", JOptionPane.PLAIN_MESSAGE);
        Object[] values = {"dr.nisreen", "dr.renas", "dr.hawjin", "dr.shero"};
JOptionPane.showInputDialog(null, "Select your doctor please", "", JOptionPane.PLAIN_MESSAGE, null, values, values[0]);
JOptionPane.showMessageDialog(null, "thank you for choice life's hospital please take your result test from your doctor", "Information Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
        
        JOptionPane.showMessageDialog(null, "");
        
        
        
        }
    }
}