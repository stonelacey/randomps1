//also another part of GUI
package ps1;

//imports for panel
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


//implementing ActionListener lets the program listen for button press
public class MainPanel extends JPanel implements ActionListener{
    MainPanel()
    {
        setLayout(new GridLayout(2,0));
       int index = 0;
        ArrayList <String> games = new ArrayList<String>();
        
        ReadFile(games);
        index = DisplayGame(games);

//creates button objects
        //JButton("skdjgnfsl"): string contains what button says
        JLabel text = new JLabel(games.get(index));
        JButton button = new JButton("This game sucks");
        button.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent e) { 
                     GameSucked(text, games);
                     revalidate();
                                                            } 
                                                          } );
        
 
    add(text);
    add(button);

    
    }
    
    
    public static void GameSucked(JLabel text, ArrayList games)
    {
        int arraySize = games.size();
        Random rand = new Random();
        int value = rand.nextInt((arraySize - 1));
        
        if (value >= arraySize)
        {value = games.size()-1;}
        if (value < 0)
        {value = 0;}
        
        String newText = games.get(value).toString();
        
        text.setText(newText);
        
    }
    
   public static void ReadFile(ArrayList games)
    {


            try
            {

                FileReader file = new FileReader("games.txt");
                BufferedReader br = new BufferedReader(file);

                String str;
                while((str = br.readLine()) != null)
                {
                    games.add(str);

                }
            }catch(IOException e)
            {
                System.out.println("it fucked");
            }

    }
    
    public static int DisplayGame(ArrayList games)
    {
        int arraySize = games.size();
        Random rand = new Random();
        int value = rand.nextInt((arraySize - 1));
        
        if (value >= arraySize)
        {value = games.size()-1;}
        if (value < 0)
        {value = 0;}
        
       
        System.out.println(games.get(value));
        return value;
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
