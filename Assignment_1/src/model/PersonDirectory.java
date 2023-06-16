/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mydel
 */
public class PersonDirectory {

    private ArrayList<Person> profiles;

    public PersonDirectory() {
        profiles = new ArrayList<>();
    }

    public ArrayList<Person> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Person> profiles) {
        this.profiles = profiles;
    }

    public Person addProfile() {
        Person p = new Person();
        profiles.add(p);
        return p;
    }

    public void deleteProfile(Person p) {
        profiles.remove(p);
    }
}
