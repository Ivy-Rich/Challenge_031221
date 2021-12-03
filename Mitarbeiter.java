package com.cc.java;

public class Mitarbeiter {
    
    private String name;
    private String surName;
    private String functionJob;
    private int startYear;

    public Mitarbeiter(String name, String surName, String functionJob, int startYear) {
        this.name = name;
        this.surName = surName;
        this.functionJob = functionJob;
        this.startYear = startYear;
    }

    public String getInfo(String facts){
        switch (facts) {
            case "#name":
                return name;
            case "#vorname":
                return surName;
            case "#function":
                return functionJob;
            default:
                return "#!?"; // wenn ich default weglasse wird der switch case nicht ausführt. warum?
        }  
    }
    
    public int getStartyear() {
        return startYear;
    }


    
    // scheissidee
    // public void facts(){
    //     System.out.println("Nachname: " + this.name + "Vorname: " + this.surName + "Funktion im Unternehmen: " + this.functionJob + "Eintrittsjahr: " + this.startYear);
    // }

}
