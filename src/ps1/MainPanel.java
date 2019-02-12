//also another part of GUI
package ps1;

//imports for panel
import java.awt.BorderLayout;
import javax.swing.*;


//implementing ActionListener lets the program listen for button press
public class MainPanel extends JPanel{
    ButtonPanel bP;
    TextPanel tP;
    MainPanel()
    {
        super();
        setLayout(new BorderLayout());
        this.bP = new ButtonPanel();
        this.tP = new TextPanel();
        
       add(this.tP, BorderLayout.NORTH);
       add(this.bP, BorderLayout.SOUTH);
       
    }
    
    public JButton GetButton()
    {
        return this.bP.GetButton();
    }
    
    public void SetGame(String game)
    {
        tP.SetLabel(game);
    }
}
