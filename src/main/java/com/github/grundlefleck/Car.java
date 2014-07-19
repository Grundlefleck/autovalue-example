package com.github.grundlefleck;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Car {
	
	public abstract String model();
	public abstract int numWheels();
	
	
	public static Car create(String model) {
		return new AutoValue_Car(model, 4);
	}
}
