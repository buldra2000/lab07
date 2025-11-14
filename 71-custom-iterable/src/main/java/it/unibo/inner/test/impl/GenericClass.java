package it.unibo.inner.test.impl;

import java.util.Iterator;
import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class GenericClass<T> implements IterableWithPolicy<T>{

    public GenericClass(T[] elem){

    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {
        //TODO
    }
}
