
package ps1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MainModel {
        
    int index;
    ArrayList <String> games;
    MainModel(){
        index = 0;
        this.games = new ArrayList<String>();
        
        ReadFile(games);

    }
    
    
    public void ReadFile(ArrayList games)
    {


            try
            {

                FileReader file = new FileReader("games.txt");
                BufferedReader br = new BufferedReader(file);

                String str;
                while((str = br.readLine()) != null)
                {
                    this.games.add(str);

                }
                System.out.println("nice");
            }catch(IOException e)
            {
                System.out.println("it fucked");
            }

    }
    
    public String getGame()
    {
        int arraySize = this.games.size();
        Random rand = new Random();
        int value = rand.nextInt((arraySize - 1));
        
        if (value >= arraySize)
        {value = this.games.size()-1;}
        if (value < 0)
        {value = 0;}
        String game = this.games.get(value);
        
        return game;
    }
    
}
