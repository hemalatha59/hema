package hema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MonthInFullForm {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
		Date d=new Date(sc.next());
		String s1=sdf.format(d);
		System.out.println(s1);
		//System.out.println(System.currentTimeMillis());
	}

}
