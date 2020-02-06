package com.divya.epam.maven;

import java.util.Comparator;

class SortByPrice implements Comparator<Sweets>{
	public int compare(Sweets a, Sweets b) {
		return (int)(a.weight-b.weight);
	}


}
