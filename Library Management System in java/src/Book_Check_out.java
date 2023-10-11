import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Book_Check_out {
	// This method will search for the book from file using the searchBook method
		// If the book is found then the book is checked out with the member
		// and store the log in the log file e.g. "BookTitle borrowed by Member Name at Date : Date"
		// You should use current Date
	
	
		public static void checkOut(String title, Member member)throws Exception  {
				
				FileWriter flr=new FileWriter("log.txt",true);
		
				int getIndex=Book_Search.searchBook(title);
				
				
				if (getIndex >=0) {
					
				
					flr.write("\nBorrwed By Member name is:"+member.getName()+","+"Borrwed By Member ID is:"+member.getId()+","+"Book Title:"+Main.list.get(getIndex).getTitle()+","+"Book ID is:"+Main.list.get(getIndex).getId()+","+"Check Date: "+java.time.LocalDate.now());
					
					
					flr.close();
					//this is for if Member id is = 0 wo we can assign a id if bOok Title is found
					Main.list.get(getIndex).setMemberId(member.getId());
					
					
//					Now we need to store data in data base by using calling method of store data base
					System.out.println("Book Successly Checkout");
//					System.out.println("Do you want to borrow a book");
//					System.out.println("press Y or N");
//					
//					Scanner input=new Scanner(System.in);
//					
//					String tem=input.nextLine();
//					
//					if(tem.equalsIgnoreCase("y")) {
						
						
						Data_Base.storeData(Main.list, "Data-Base.txt");
						System.out.println("Operation Successfully");
					//}
					
					
						
				}
				else
				{
					System.out.println("...........................................Book not found in library...................................................");
				}
				
				
				
		}
		
		
		
		
		

			
			public static void recheckOut(String title, Member member)throws Exception  {
				
				FileWriter flr=new FileWriter("log.txt",true);
		
				int getIndex=Book_Search.searchBook(title);
				
				
				if (getIndex >=0 && (Main.list.get(getIndex).getMemberId() == member.getId())) {
					
				
					flr.write("\nReBorrwed By Member name is:"+member.getName()+","+"ReBorrwed By Member ID is:"+member.getId()+","+"Book Title:"+Main.list.get(getIndex).getTitle()+","+"Book ID is:"+Main.list.get(getIndex).getId()+","+"Check Date: "+java.time.LocalDate.now());
					
					
					flr.close();
					//this is for if Member id is = 0 wo we can assign a id if bOok Title is found
					Main.list.get(getIndex).setMemberId(member.getId());
					
					
//					Now we need to store data in data base by using calling method of store data base
					System.out.println("Book Successly Checkout");
					
						
						Data_Base.storeData(Main.list, "Data-Base.txt");
						System.out.println("ReBorrowed Operation Successfully");
		
					
					
						
				}
				else
				{
					System.out.println("...........................................Book not found in library...................................................");
				}
				
				
				
		}
			
			
}
		
	
	
	
	
