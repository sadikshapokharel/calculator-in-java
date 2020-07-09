package calculatordemo;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorDemo {
    static double num1=0,num2=0,result=0,temp=0;
    static String operator;
    public static void main(String[] args) {
        JFrame f1=new JFrame("Calculator");
        f1.getContentPane().setBackground(new Color(82, 81, 78));
        
        JTextField tf1=new JTextField();
        tf1.setEditable(false);
        tf1.setBounds(20,20,335,60);
        tf1.setBackground(new Color(194, 204, 197));
        tf1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        tf1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        f1.add(tf1);

        JButton b7= new JButton("7");
        b7.setBounds(20,90,80,60);
        b7.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b7);

        JButton b8= new JButton("8");
        b8.setBounds(105,90,80,60);
        b8.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b8);

        JButton b9= new JButton("9");
        b9.setBounds(190,90,80,60);
        b9.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b9);

        JButton bclear= new JButton("C");
        bclear.setBounds(275,90,80,60);
        bclear.setBackground(Color.orange);
        bclear.setForeground(Color.white);
        bclear.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bclear);

        JButton b4= new JButton("4");
        b4.setBounds(20,160,80,60);
        b4.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b4);

        JButton b5= new JButton("5");
        b5.setBounds(105,160,80,60);
        b5.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b5);

        JButton b6= new JButton("6");
        b6.setBounds(190,160,80,60);
        b6.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b6);

        JButton bplus= new JButton("+");
        bplus.setBounds(275,160,80,60);
        bplus.setBackground(new Color(130, 140, 134));
        bplus.setForeground(Color.white);
        bplus.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bplus);

        JButton b1= new JButton("1");
        b1.setBounds(20,230,80,60);
        b1.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b1);

        JButton b2= new JButton("2");
        b2.setBounds(105,230,80,60);
        b2.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b2);

        JButton b3= new JButton("3");
        b3.setBounds(190,230,80,60);
        b3.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b3);

        JButton bminus= new JButton("-");
        bminus.setBounds(275,230,80,60);
        bminus.setBackground(new Color(130, 140, 134));
        bminus.setForeground(Color.white);
        bminus.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bminus);

        JButton bdecimal= new JButton(".");
        bdecimal.setBounds(20,300,80,60);
        bdecimal.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bdecimal);

        JButton b0= new JButton("0");
        b0.setBounds(105,300,80,60);
        b0.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(b0);

        JButton bmultiply= new JButton("*");
        bmultiply.setBounds(190,300,80,60);
        bmultiply.setBackground(new Color(130, 140, 134));
        bmultiply.setForeground(Color.white);
        bmultiply.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bmultiply);

        JButton bdivide= new JButton("/");
        bdivide.setBounds(275,300,80,60);
        bdivide.setBackground(new Color(130, 140, 134));
        bdivide.setForeground(Color.white);
        bdivide.setFont(new Font("Arial", Font.PLAIN, 26));
        f1.add(bdivide);

        JButton bequal= new JButton("=");
        bequal.setBounds(20,370,335,60);
        bequal.setBackground(new Color(130, 140, 134));
        bequal.setForeground(Color.white);
        bequal.setFont(new Font("Arial", Font.PLAIN, 36));
        f1.add(bequal);

        
        
        f1.setLayout(null);
        f1.setSize(395,490);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        
        
        
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                tf1.setText(tf1.getText()+"7");
            }  
        });
        
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tf1.setText(tf1.getText()+"8");
            }     
        });
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tf1.setText(tf1.getText()+"9");
            }     
        });
        bplus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String a=tf1.getText();
               num1=Double.parseDouble(a);
               tf1.setText("");
               operator="+";
            }     
        });
        
         b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                tf1.setText(tf1.getText()+"4");
            }  
        });
        
          b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                tf1.setText(tf1.getText()+"5");
            }  
        });
          
           b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                tf1.setText(tf1.getText()+"6");
            }  
        });
           
           bmultiply.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String a=tf1.getText();
               num1=Double.parseDouble(a);
               tf1.setText("");
               operator="*";
            }     
        });
           
           bminus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String a=tf1.getText();
               num1=Double.parseDouble(a);
               tf1.setText("");
               operator="-";
            }     
        });
           
            b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            tf1.setText(tf1.getText()+"1");
            }  
        });
              
            b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            tf1.setText(tf1.getText()+"2");
            }  
        });
                 
            b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            tf1.setText(tf1.getText()+"3");
            }  
        });
            
                bdivide.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String a=tf1.getText();
               num1=Double.parseDouble(a);
               tf1.setText("");
               operator="/";
            }     
        });
                
                  bclear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tf1.setText(""); 
               num1=0;
               num2=0; 
            }     
        });
                  
            b0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tf1.setText(tf1.getText()+"0");
            }     
        });
                    
             bdecimal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               tf1.setText(tf1.getText()+".");
            }     
        });
 
                    
             bequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String b=tf1.getText();
               num2=Double.parseDouble(b);
               if(operator=="+"){     //for addition
                   result=num1+num2;
                   String c=Double.toString(result);
                   tf1.setText(c);
                   num1=result;
               }
               else if(operator=="-"){     //for subtraction
                   result=num1-num2;
                   String c=Double.toString(result);
                   tf1.setText(c);
                   num1=result;
               }
               else if(operator=="*"){     //for multiply
                   result=num1*num2;
                   String c=Double.toString(result);
                   tf1.setText(c);
                   num1=result;
               }
               
               else if(operator=="/"){     //for division
                   result=num1/num2;
                   String c=Double.toString(result);
                   tf1.setText(c);
                   num1=result;
               }
             if(result == Math.floor(result))
               {
                   tf1.setText((int)(result)+"");
               }
             else{
                 tf1.setText(result + "");
             }
            }
        });
             
    
    }
    
}
