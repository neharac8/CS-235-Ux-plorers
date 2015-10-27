/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.uidesign;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author Niranjan
 */
public class SystemUsage extends JFrame {

    Object currentWindow = this;

    public SystemUsage() 
    {
        super();
        super.setTitle("System Usage");
        super.setSize(500, 500);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
    
        //JLabel usageImage = new JLabel();
        //usageImage.setIcon(new ImageIcon("Pie_3.png"));
        
        //usageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sjsu/uidesign/Pie_3.png"))); // NOI18N
        //add(usageImage);
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("System Idle", 30);
        pieDataset.setValue("System Busy", 70);
        
        JFreeChart pieChart = ChartFactory.createPieChart3D("System Usage", pieDataset, true, true, true);
        
       Plot Pie =  pieChart.getPlot();
        ChartPanel piePanel = new ChartPanel(pieChart);
        
        JPanel panelPie = new JPanel();
        panelPie.removeAll();
        panelPie.add(piePanel, BorderLayout.CENTER);
        panelPie.validate();
        
        add(panelPie);
        
        
    }
}
