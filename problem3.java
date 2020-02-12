/*3.Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. 
It parses the string with the delimiter as ‘\’ and displays the String in the
 following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

Hint:  Use String Builder for concatenating the folder names with |.


*/
import java.util.StringTokenizer; 
class MyClass {
    
		public static void main(String args[]) {
	 //StringTokenizer st1 = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE", "\\"); 
	//	System.out.println(st1);
	
    String str=new String("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		
     System.out.println("Drive:  " +str.substring(0, 3));
		
     String str2= str.substring(3,18);

     System.out.println("Folders:" + str2.replace("\\","||"));
		 
     System.out.println("Drive: " +str.substring(20));

		    }

}