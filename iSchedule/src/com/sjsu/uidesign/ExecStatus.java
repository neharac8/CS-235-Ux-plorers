/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.uidesign;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Niranjan
 */
public class ExecStatus extends JFrame{
    
    Object currentWindow = this;

    public ExecStatus() 
    {
        super();
        super.setTitle("Task Execution Status");
        super.setSize(500, 500);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
    
        JLabel usageImage = new JLabel();
        //usageImage.setIcon(new ImageIcon("Pie_3.png"));
        
        //usageImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sjsu/uidesign/Bar_4.png"))); // NOI18N
        //add(usageImage);
        
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(6, "Cache Cleanup", "Cache Cleanup");
        barChartData.setValue(8, "Antivirus Scan", "Antivirus Scan");
        barChartData.setValue(7, "Empty Recycle Bin", "Empty Recycle Bin");
        
        JFreeChart barChart = ChartFactory.createBarChart("Task Execution Status", "Task Name","Status", createDataset(), PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot barChar = barChart.getCategoryPlot();
        barChar.setRangeGridlinePaint(Color.ORANGE);
        
        ChartPanel barPanel = new ChartPanel(barChart);
        
        
        JPanel panelChart = new JPanel();
        panelChart.removeAll();
        panelChart.add(barPanel, BorderLayout.CENTER);
        panelChart.validate();
        add(panelChart);
    }
    
     private CategoryDataset createDataset() {
     
      // row keys...
      final String success = "Success";
      final String  inProgress = "InProgress";
      final String failure = "Failure";

      // column keys...
      final String cache = "Clean Cache";
      final String bkp = "Data Backup";
      final String scan = "Antivirus scan";
      
      // create the dataset...
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

      dataset.addValue(2.0, failure, cache);
      dataset.addValue(3.0, failure, bkp);
      dataset.addValue(2.0, failure, scan);
     
      dataset.addValue(2.0, inProgress, cache);
      dataset.addValue(1.0, inProgress, bkp);
      dataset.addValue(1.0, inProgress, scan);
      
      dataset.addValue(5.0, success, cache);
      dataset.addValue(4.0, success, bkp);
      dataset.addValue(5.0, success, scan);
      
      return dataset;
     
  }

}
