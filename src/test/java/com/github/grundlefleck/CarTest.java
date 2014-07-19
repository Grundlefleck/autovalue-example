package com.github.grundlefleck;

import com.google.auto.value.AutoValue;
import org.junit.Test;
import org.mutabilitydetector.unittesting.MutabilityAssert;

public class CarTest {

  @Test public void isImmutable() {
    MutabilityAssert.assertImmutable(AutoValue_Car.class);
  }
}
