package br.com.akka.teste;

import java.io.Serializable;

/**
 * Created by Ramon on 01-Oct-16.
 */
public class Work implements Serializable {

    private final int start;
    private final int nrOfElements;

    public Work(int start, int nrOfElements) {
        this.start = start;
        this.nrOfElements = nrOfElements;
    }

    public int getStart() {
        return start;
    }

    public int getNrOfElements() {
        return nrOfElements;
    }

}
