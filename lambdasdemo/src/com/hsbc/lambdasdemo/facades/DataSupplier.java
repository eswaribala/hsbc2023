package com.hsbc.lambdasdemo.facades;

import java.time.LocalDate;
@FunctionalInterface
public interface DataSupplier<T> {
	
	T getData();

}
