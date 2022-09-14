package org.github.guppy.backend.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Business {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private UUID ownerId;

    @Column
    private String createAt;

    @Column
    private String updateAt;
}
