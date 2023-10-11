import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import java.util.Collection;
import java.util.LinkedList; 
import java.util.Scanner;
public class RegisterMember{

	
	//>>>>>>>>>>Work-By-Me
	public static Queue<Integer> LoadFile1() throws IOException{
		FileReader freader = new FileReader("MemberIdLog.txt");
		Scanner inputp = new Scanner(freader);
		Queue<Integer> list = new LinkedList<Integer>();
		
		while(inputp.hasNext()) {
			int Id = inputp.nextInt();
			list.add(Id);	
		}
		freader.close();
		inputp.close();
		return list;
	
	}



	

}
