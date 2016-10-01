package br.com.akka.teste;

import akka.util.Duration;

import java.io.Serializable;

/**
 * Created by Ramon on 01-Oct-16.
 */
public class PiApproximation implements Serializable {

    private final double pi;
    private final Duration duration;

    public PiApproximation(double pi,Duration duration) {
        this.pi = pi;
        this.duration = duration;
    }

    public double getPi() {
        return pi;
    }

    public Duration getDuration() {
        return duration;
    }
}
