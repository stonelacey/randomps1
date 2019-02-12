
package ps1;

import javax.swing.*;
public class ButtonPanel extends JPanel
{
    private JButton button;
    ButtonPanel()
    {
       button = new JButton ("this game sucks");
       add(button);
    }
    
    public JButton GetButton()
    {
        return button;
    }
    
}
