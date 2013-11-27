package com.cesarandres.z.content;

import com.cesarandres.z.main.GameElement;
import com.cesarandres.z.main.Location;

public class Person extends GameElement{

	public Person(Location location, int id) {
		super(location, id, ElementType.PERSON);
	}

}
