package org.github.guppy.backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private UUID id;

    @Column
    private String name;

    @Column
    private double price;

    // There are some missing columns ....
}
