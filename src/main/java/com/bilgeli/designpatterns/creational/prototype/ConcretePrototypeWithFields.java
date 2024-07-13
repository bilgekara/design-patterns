package com.bilgeli.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ConcretePrototypeWithFields implements Prototype {
    private String field;

    @Override
    public Prototype clone() {
        return new ConcretePrototypeWithFields(this.field);
    }
}
