package com.lveliz.designpatterns.structural.composite;

interface NeuronGroup extends Iterable<Neuron> {

    default void connectTo(NeuronGroup other) {

        if (this == other) {
            return;
        }

        for (Neuron from : this) {
            for (Neuron to : other) {
                from.getOut().add(to);
                to.getIn().add(from);
            }
        }

    }

}
