package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Service;

public class ServiceBuilder extends ProductBuilder<ServiceBuilder, Service> {
	private Integer time;

	public ServiceBuilder withTime(Integer time) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	protected void validate() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Service build() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

}