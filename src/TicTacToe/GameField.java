package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameField extends JButton implements ActionListener{

	public int buttonsize = 150;
    private static int clickCounter = 0; 
    private static int buttonCount = 0;
    private int buttonNumber;
    private static Player playerOne = new Player("andi");
    private static Player playerTwo = new Player("mascha");
    

    public GameField( window w){
       setSize(buttonsize, buttonsize);
        w.getContentPane().add(this);
        addActionListener(this);
        setFont(new Font("Arial", Font.PLAIN, 70));
        buttonNumber = buttonCount;
        buttonCount++;
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = clickCounter % 2;

        switch(value){
            case 0: this.setText("X");
            this.setEnabled(false);
            break;
            case 1: this.setText("O");
            this.setEnabled(false);
            break;
        }
        clickCounter++;
    }
    
}