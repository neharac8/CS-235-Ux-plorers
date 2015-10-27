/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.uidesign;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ux-Plorers
 */
public class CurrentlyExecuting extends JFrame{
   Object currentWindow = this;

    public CurrentlyExecuting() 
    {
        super();
        super.setTitle("Task Currently Executing");
        super.setSize(500, 500);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
    
        JLabel usageImage = new JLabel();
        //usageImage.setIcon(new ImageIcon("Pie_3.png"));
        usageImage.setBounds(50, 50, 50, 50);
        usageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sjsu/uidesign/currExec.png"))); // NOI18N
        add(usageImage);
    }  
}
