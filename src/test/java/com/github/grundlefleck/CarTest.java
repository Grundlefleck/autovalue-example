package com.github.grundlefleck;

import static org.junit.Assert.assertEquals;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

import org.junit.Test;

public class CarTest {

	@Test
	public void testRecompilationWithNewProperties() {
		// Not the kind of tests you would normally write,
		// included here just to see how the IDE handles changes.
		Car instanceOfCar = Car.create("Ford Focus");
		assertEquals(instanceOfCar.model(), "Ford Focus");
		assertEquals(instanceOfCar.numWheels(), 4);
	}

	@Test
	public void isImmutable() {
		assertImmutable(Car.create("Ferrari").getClass());
	}
}
