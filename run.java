package heussteuerung;

import java.util.ArrayList;
import java.util.List;

public class run {

	public static void main(String[] args) throws InterruptedException {

		List<Device> liste = new ArrayList<Device>();

		// Kerzenständer
		Device kerzenstaender = new Device("Kerzenständer", "Steckdose1", "-", "192.168.178.144");
		liste.add(kerzenstaender);

		// Wintergartenlicht
		Device wintergartenlicht = new Device("Wintergartenlicht", "Wintergarten/Deckenlicht", "-", "192.168.178.145");
		liste.add(wintergartenlicht);

		// Ventilator
		Device ventilator = new Device("Ventilator", "Wohnzimmer/Ventilator", "-", "192.168.178.141");
		liste.add(ventilator);

		// Universal3fach
		Device UniversalDreifachsteckdose = new Device("UniversalDreifachsteckdose", "UniversalDreifachsteckdose", "-",
				"http://192.168.178.143/");
		liste.add(UniversalDreifachsteckdose);

		// Küchenradio
		Device kuechenradio = new Device("kuechenradio", "Kuechenradio", "-", "http://192.168.178./");
		liste.add(kuechenradio);

		// Markise
		Device markise = new Device("markise", "Markise", "-", "http://192.168.178./");
		liste.add(markise);
		// Iterator

		for (Device s : liste) {
			System.out.println(s.getBroker());
			s.off();
		}

	}

}
