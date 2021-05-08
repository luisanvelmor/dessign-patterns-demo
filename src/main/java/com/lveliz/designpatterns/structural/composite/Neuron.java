package com.lveliz.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Neuron implements NeuronGroup {

    private ArrayList<Neuron> in, out;

    public Neuron() {
    }

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    public void setIn(ArrayList<Neuron> in) {
        this.in = in;
    }

    public ArrayList<Neuron> getIn() {
        return this.in;
    }

    public void setOut(ArrayList<Neuron> out) {
        this.out = out;
    }

    public ArrayList<Neuron> getOut() {
        return this.out;
    }

}
