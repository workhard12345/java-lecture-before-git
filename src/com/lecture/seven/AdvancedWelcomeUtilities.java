package com.lecture.seven;


public class AdvancedWelcomeUtilities {
    private String name;
    private  String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNameAndSurname(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printNameAndSurname(){
        System.out.println("Name: "+name+" Surname:"+surname);
    }


}
