/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettron6000;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author mah537
 */
public class TPanel extends JPanel{
    
    TimerPanel time;
    
    ArrayList<TicketPanel> ticketArray = new ArrayList();
    
    
    public TPanel(){
    
        super();
        this.setLayout(new GridLayout(20,1));
        createPanel();
        
    }  // end constructor
    
 public void createPanel(){
     
    // this.removeAll();
        time = new TimerPanel();
        this.add(time);  
     
        for(int i = 0; i < ticketArray.size(); i++){
            
          this.add(ticketArray.get(i));
        }
        
        
        
     
 } // end create panel  
    
    
    
} // end class
