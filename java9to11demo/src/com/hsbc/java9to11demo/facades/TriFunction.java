package com.hsbc.java9to11demo.facades;
@FunctionalInterface
public interface TriFunction<T,U,V,R> {

	R apply(T t,U u,V v);
}
