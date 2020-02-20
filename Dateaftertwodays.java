package hema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Dateaftertwodays {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*LocalDate l=LocalDate.now();
		LocalDate ld=l.plusDays(2);
		System.out.println(ld);
		Scanner sc = new Scanner(System.in);
		String dob=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		Date d1=sdf.parse(dob);
		LocalDate ld1=d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().now();
		System.out.println(ld1);*/
		LocalDate l1,l2;
		LocalDate l=LocalDate.parse("2019-01-01");
		//l1=l.plusDays(2);
		l1=l.minusYears(1);
		
		l2=l1.minusDays(1);
		
		System.out.println(l2);
		
	}

}
