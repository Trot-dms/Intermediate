package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Item;

public class ItemBuilder extends ProductBuilder<ItemBuilder, Item> {
	private Double weight;

	public ItemBuilder withWeight(Double weight) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	protected void validate() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Item build() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

}