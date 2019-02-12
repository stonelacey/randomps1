
package ps1;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainView extends JFrame{
    
    
        MainPanel mP;
        MainView(){
            setTitle("Playstation 1 Buddy");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,200); 
            setResizable(false);
            
            this.mP = new MainPanel();
            add(mP);
                    
        }
        
        public void AddListener(ActionListener al)
        {
            this.mP.GetButton().addActionListener(al);
        }
        
        public void SetGame(String game)
        {
            mP.SetGame(game);
        }
        
}
