package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter person1 = new Mitarbeiter("Rich", "Ivy", "Fachinformatikerin", 2007);				

		output("Name: " + person1.getInfo("#name"));
        output("Vorname: " + person1.getInfo("#vorname"));
		output("Funktion im Unternehmen: " + person1.getInfo("#function"));
		output("Eintrittsjahr: " + person1.getStartyear());

		output("------------------------");

		Mitarbeiter person2 = new Mitarbeiter("Mütze", "Max", "Abteilungsleiter", 2003);				

		output("Name: " + person2.getInfo("#name"));
        output("Vorname: " + person2.getInfo("#vorname"));
		output("Funktion im Unternehmen: " + person2.getInfo("#function"));
		output("Eintrittsjahr: " + person2.getStartyear());

		output("------------------------");

		Mitarbeiter person3 = new Mitarbeiter("Bunter", "Gunter", "Grafiker", 2015);				

		output("Name: " + person3.getInfo("#name"));
        output("Vorname: " + person3.getInfo("#vorname"));
		output("Funktion im Unternehmen: " + person3.getInfo("#function"));
		output("Eintrittsjahr: " + person3.getStartyear());

		output("------------------------");
	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}
	
}
