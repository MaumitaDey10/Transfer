package com.example.domain;

public abstract class EntityImpl implements Entity {

    protected int id;

    public EntityImpl() {
    }

    public EntityImpl(int id) {
        this.id = id;
    }

    @Override
    public int getId() {

        return id;
    }

    @Override
    public void setId(int id) {

        this.id = id;

    }
}
