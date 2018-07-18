package Day2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateUtility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Date StartTime= new Date();
		System.out.println(StartTime);
		SimpleDateFormat formatdate= new SimpleDateFormat("HH:mm:ss:ms");
		//SimpleDateFormat formatdate= new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
		System.out.println(formatdate.format(StartTime));
		Thread.sleep(5000);
		Date EndTime= new Date();
		System.out.println(formatdate.format(EndTime));
		long TotalTime= EndTime.getTime()-StartTime.getTime();
		float Tz= 2.339f;
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println(String.format("%.2f",TotalTime));
		System.out.print(df.format(Tz));
		//System.out.println(Tz);

	}

}
