package Data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendar_ {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));

		//adicionando 4 hrs nessa data
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//quantos minutos tem na data
		int minutes = cal.get(Calendar.MINUTE);
		//adiciona o 1 pq no Calendar começa a contar a partir do 0
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " +  minutes);
		System.out.println("Month: " + month);
		
	}

}
