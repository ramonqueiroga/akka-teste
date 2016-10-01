package br.com.akka.teste;

import akka.actor.UntypedActor;

/**
 * Created by Ramon on 01-Oct-16.
 */
public class Listener extends UntypedActor {
    @Override
    public void onReceive(Object message) {
        if (message instanceof PiApproximation) {
            PiApproximation approximation = (PiApproximation) message;
            System.out.println(String.format("\n\tPi approximation: \t\t%s\n\tCalculation time: \t%s",
                    approximation.getPi(), approximation.getDuration()));
            getContext().system().shutdown();
        } else {
            unhandled(message);
        }
    }
}
