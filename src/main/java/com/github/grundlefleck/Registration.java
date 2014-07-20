package com.github.grundlefleck;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Registration {
	public abstract String code();
	
	public static Registration create(String code) {
		return new AutoValue_Registration(code);
	}
}