package com.github.grundlefleck;

import static org.junit.Assert.assertEquals;
import static org.mutabilitydetector.unittesting.AllowedReason.provided;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Test;
import org.mutabilitydetector.unittesting.AllowedReason;
import org.mutabilitydetector.unittesting.MutabilityAssert;
import org.mutabilitydetector.unittesting.MutabilityMatchers;

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
        assertInstancesOf(Car.create("Ferrari").getClass(), areImmutable(), provided(Registration.class).isAlsoImmutable());
	}
}
