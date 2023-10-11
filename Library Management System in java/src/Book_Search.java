

public class Book_Search {
	// Complete the implementation of this method
		// This method will accept a title of the book 
		// Call the method of Database to load the data from file
		// Then search for the book in the arrayList returned by the method of Database
		// return that index of that book if found and -1 if not found.
		public static int searchBook(String title) {
			// Your code here
			for (int i = 0; i <Main.list.size(); i++) {
			
				String tem=Main.list.get(i).getTitle();
				if (title.equalsIgnoreCase(tem) ) {
					
					return i;
				}
				
			}
			
			return -1;
		}
}


