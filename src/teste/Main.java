package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws ParseException {
		LinkedHashSet<Email> hs = new LinkedHashSet<Email>();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		Email e1 = new Email(22, dateformat.parse("17/08/2016"));
		hs.add(e1);
		
		Email e2 = new Email(11, dateformat.parse("12/10/2018"));
		hs.add(e2);

		Email e3 = new Email(55, dateformat.parse("22/11/2017"));
		hs.add(e3);
		
		Email e4 = new Email(2, dateformat.parse("15/09/2017"));
		hs.add(e4);

		hs = hs.stream().sorted(Comparator.comparing(Email::getDataAtualizacao))
//				.limit(2)
				.collect(Collectors.toCollection(LinkedHashSet::new));

		for (Email email : hs) {
			System.out.println(email.getId() + " : " + dateformat.format(email.getDataAtualizacao()));
		}
	}
}
