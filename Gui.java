import javax.swing.*;
class Gui{
    public static void main(String[] args){
        JFrame frame = new JFrame("");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(600,350);

        JLabel l1= new JLabel("Que1:Which one among these is not a datatype");
            frame.add(l1);
            l1.setBounds(10,10, 50,20);  
        
            
        frame.setVisible(true);
          
    }
}