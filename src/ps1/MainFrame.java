
package ps1;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
    MainFrame()
    {
    //title bar
    super("Window");
    
    //creates panel object
    MainPanel mPanel = new MainPanel();
    
    getContentPane().add(mPanel);
    //sets size x,y
    setSize(500, 250);
    //makes it kill itself on close
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //sets it so the window is visable
    setVisible(true);
    
    }
}
