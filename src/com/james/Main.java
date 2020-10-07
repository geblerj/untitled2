package com.james;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	try {
			List<String> boats = new ArrayList<>();
			boats.add("Big Boat");
			boats.add("Small Boat");
			boats.add("Medium Boat");
			boats.add("Extra Large Boat");
			boats.add("Tiny Boat");
			boats.add("Ludicrously Large Boat");
			boats.add("Minuscule Boat");
			Collections.sort(boats);
			System.out.println(boats);
			String[] boaty = boats.toArray(new String[0]);
			for (String boat:boaty) {
				System.out.println(boat);
			}
			List<String> boatSublist = boats.subList(2, 5);
			System.out.println(boatSublist);
			String theGOATBoat = boatSublist.get(0);
			System.out.println(theGOATBoat);
			boats.remove(theGOATBoat);
			List<String> anotherBoat = new ArrayList<>();
			Collections.copy(anotherBoat, boats);
			System.out.println(boats);
			System.out.println(anotherBoat);
			// System.out.println(boatSublist); Doesn't work, because boatSublist and boats are both referencing the same object.
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
