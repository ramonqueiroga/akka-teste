package br.com.akka.teste;

import java.io.Serializable;

/**
 * Created by Ramon on 01-Oct-16.
 */
public class Result implements Serializable {

    private final double value;

    public Result(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
