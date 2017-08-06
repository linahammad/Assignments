import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Team 
{
private String name;
private int count;
private int size;
ArrayList <Player> MyPlayerList;

public Team()
{
    name = JOptionPane.showInputDialog("Enter the team name ");
    size = Integer.parseInt(JOptionPane.showInputDialog("Enter the maximum number of players "));
    MyPlayerList = new ArrayList<Player>(size);
   
    int answer = JOptionPane.showConfirmDialog(null,"Do you want to enter the information of all team's players: ");
    if(answer == 0)
       addPlayers();
    
    
        
}
public String getName()
{
    return name;
}
public int getSize()
{
    return size;
}
public int getCount()
{
    return count;
}
public boolean addPlayer(Player p1)
{
    if (count>= size)
    {
        JOptionPane.showMessageDialog(null, "Sorry.. the team is full .. it's NOT allowed to add a player");
        return false;
    }
    else
    {
    MyPlayerList.add(p1);
    count++;
    JOptionPane.showMessageDialog(null, "The palyer has successfully added");
    return true;
    }
}
 public static Player createPlayer()
 {
    //JOptionPane.showInputDialog
    String pName = JOptionPane.showInputDialog("Enter player's name ");
    double pAge = Double.parseDouble(JOptionPane.showInputDialog("Enter player's age "));
    int pNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter player's number "));
    Player p = new Player (pName, pAge, pNumber);
    return p;
 }
 public void addPlayers()
 {
     int remaining = size - count;
     for(int i=1; i<= remaining; i++)
     {
         Player pp = createPlayer();
         addPlayer(pp); 
     }
 }
 public String toString()
 {
     String str = "Team " + name + " has " + count + " player(s)\n";
     for(int i=0; i<count; i++)
     {
     Player pp = MyPlayerList.get(i);
     str+= (i+1) + "- " + pp ;
     }       
     return str;
 }
}

