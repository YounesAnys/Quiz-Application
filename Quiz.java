import javax.swing.*;


class Quiz  {

    JFrame fr;
    JRadioButton rb1,rb2,rb3,rb4;
    JButton b1;
    JLabel lb1;
    ButtonGroup bg;

    String ques[]={"Que1:Which one among these is not a datatype"};
    String op1[]={"int"};
    String op2[]={"Float"};
    String op3[]={"boolean"};
    String op4[]={"char"};

    
    Quiz(){
fr=new JFrame();
fr.setLayout(null);
fr.setSize(600,350);

lb1=new JLabel(ques[0]);
lb1.setBounds(50,50,300,30);
fr.add(lb1);

rb1=new JRadioButton(op1[0]);
rb1.setBounds(100,100,100,30);
fr.add(rb1);
rb2=new JRadioButton(op2[0]);
rb2.setBounds(100,130,100,30);
fr.add(rb2);
rb3=new JRadioButton(op3[0]);
rb3.setBounds(100,160,100,30);
fr.add(rb3);
rb4=new JRadioButton(op4[0]);
rb4.setBounds(100,190,100,30);
fr.add(rb4);
bg =new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);

b1=new JButton("Next");
b1.setBounds(100,250,100,30);
fr.add(b1);



fr.setVisible(true);
}
public static void main(String s[])
{
new Quiz();
}


}



    
          


