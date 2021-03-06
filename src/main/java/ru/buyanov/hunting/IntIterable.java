package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;
    private int currIndex = 0;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        public boolean hasNext() {
        	if(currIndex < backed.length)
        		return true;
        	else
        		return false;
        }

        public Integer next() {
        	return backed[currIndex++];
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
