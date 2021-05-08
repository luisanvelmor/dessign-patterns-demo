package com.lveliz.designpatterns.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Neuron n1 = new Neuron();
        Neuron n2 = new Neuron();
        NeuronLayer nl1 = new NeuronLayer();
        NeuronLayer nl2 = new NeuronLayer();

        n1.connectTo(n2);
        n2.connectTo(nl1);
        nl2.connectTo(nl1);

    }

}
