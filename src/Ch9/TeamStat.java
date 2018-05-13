//Additional example for Java Interfaces
/**
 * author Naresh P
 * since 2018
 * version 2.0
 */
package Ch9;

interface team1{

void playersnotplaying(int a);
void playersplaying(int b);
}

interface team2 extends team1{

int nooftshirts();

}

class Participate implements team2{

static int totalplayers = 15;
int playersinjured;
int playersplaying;
int tshirt;

public void playersnotplaying(int decrement){

playersinjured = totalplayers - decrement;

}

public void playersplaying (int nothing){

playersplaying = totalplayers + nothing;

}

public int nooftshirts(){

return tshirt = playersplaying - playersinjured;	
	
}

void currentTeamStatus(){

System.out.println("Current Team Stats: ");
System.out.println("No of Injured: " + playersinjured 
		+ "No of playing: "+ playersplaying 
		+ "No of TShirts Required: " + tshirt);

	}
}
public class TeamStat{

public static void main(String agrs[]){

Participate IndTeam = new Participate ();

IndTeam.playersplaying(0);
IndTeam.playersnotplaying(3);
IndTeam.nooftshirts();
IndTeam.currentTeamStatus();
	}
}