package org.github.guppy.backend.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    private UUID businessId;

    @Column
    private String imageUrl;

    @Column
    private String createdAt;

    @Column
    private String updatedAt;

}
