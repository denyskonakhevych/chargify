package com.chargify.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomHealthIndicator extends AbstractHealthIndicator
{
	@Override
	protected void doHealthCheck(Builder builder) throws Exception {

		final Random rnd = new Random();
		builder.withDetail( "num1", rnd.nextInt() );
		builder.withDetail( "num2", rnd.nextInt() );
		builder.withDetail( "double1", rnd.nextDouble() );
		final boolean rndStatus = rnd.nextInt() % 2 == 0;
		builder.status(rndStatus ? Status.UP : Status.DOWN);
	}
}
