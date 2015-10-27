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
 * @author Niranjan
 */
public class UpcomingTasks extends JFrame{
    Object currentWindow = this;

    public UpcomingTasks() 
    {
        super();
        super.setTitle("Upcoming Tasks");
        super.setSize(500, 500);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
    
        JLabel usageImage = new JLabel();
        //usageImage.setIcon(new ImageIcon("Pie_3.png"));
        
        usageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sjsu/uidesign/Upcoming.png"))); // NOI18N
        add(usageImage);
    }  
}
