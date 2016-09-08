package com.epam.chemistry.model;

/**
 * Created by мвидео on 03.09.2016.
 */
public class Compound {

    private long id;
    private int type;
    private int weight;
    private String name;

    public Compound(){}

    public Compound(final String name, final int type) {
        this.name = name;
        this.type = type;
    }

    public Compound(final long id, final String name, final int type) {
        this(name, type);
        this.id = id;
    }

    public Compound(final long id, final String name, final int weight, final int type) {
        this(id, name, type);
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
