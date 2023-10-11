import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;

public class Data_Base {

	// Complete the implementation for this method
		// This method will accept the file name as an argument
		// Load all the data from the file and create objects
		// Add the objects to arrayList and then return that list
	
	//public static ArrayList<Book> loadData(String filename) throws Exception
		public static ArrayList<Book> loadData(String fileName) throws Exception{
			ArrayList<Book> list = new ArrayList<>();
			FileReader flr=new FileReader(fileName);
			try (Scanner input = new Scanner(flr)) {
				while(input.hasNext()) {
					
					
					int id=Integer.parseInt(input.nextLine());
					String ISBN=input.nextLine();
					String title=input.nextLine();
					String auther=input.nextLine();
					String purchaseDate=input.nextLine();
				
					int Memberid=Integer.parseInt(input.nextLine());
					
					Book b1 = new Book(id,ISBN,title,auther,purchaseDate,Memberid);

					list.add(b1);
				}
			}
			flr.close();
			return list;
			
		}
		
		
		// Complete the implementation for this method
		// This method will accept an arrayList and a file name and store the
		// complete data from ArrayList to the file
		public static void storeData(ArrayList<Book> list, String fileName) throws Exception{
				FileWriter flr=new FileWriter(fileName);
				for (int i = 0; i < list.size(); i++) {
					flr.write(Main.list.get(i).toString()+"\n");
					
					
				}
				flr.close();
			
		}
	
	
}
