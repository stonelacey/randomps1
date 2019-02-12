
package ps1;

import javax.swing.*;
public class TextPanel  extends JPanel
{
    private JLabel text;
    
    TextPanel(){
        text = new JLabel("Hello!");
        add(text);
    }
    
    public void SetLabel(String text)
    {
        this.text.setText(text);
    }
    
    public JLabel GetLabel()
    {
        return this.text;
    }
    
    
    
    
}
