
package ps1;

import java.awt.*;
import javax.swing.*;

public class MainView extends JFrame{
    
    
    
        MainView(){
            setTitle("Playstation 1 Buddy");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,500); 
            setResizable(false);
            
            MainPanel mP = new MainPanel();
            add(mP);
                    
        }
}
