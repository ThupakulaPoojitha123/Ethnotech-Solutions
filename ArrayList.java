//Array list for listing songs in playlist
import java.util.*;
public class ArrayList{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> playlist=new ArrayList<>();
		System.out.println("Enter how many songs you want to push into list ");
		int n=sc.nextInt();
		System.out.println("Enter the songs ");
		for(int i=0;i<n;i++){
			String song=sc.nextLine();
			playlist.add(song);
		}
		System.out.println(playlist);
	}
}
