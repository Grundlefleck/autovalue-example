package com.github.grundlefleck;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Car {
	
	public abstract String model();
	public abstract int numWheels();
}
