
package ps1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainController 
{
    MainView vi;
    MainModel mO;
    
    MainController(MainView vi)
    {
        this.vi = vi;
        this.vi.setVisible(true);
        
        mO = new MainModel();
        
        this.vi.AddListener(new ButtonListener());
    }
    
    class ButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                vi.SetGame(mO.getGame());
            }

    }
    
}
