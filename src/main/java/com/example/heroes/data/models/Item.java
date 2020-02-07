package com.example.heroes.data.models;

import com.example.heroes.data.models.base.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Item extends BaseEntity {
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.STRING)
    private Slot Slot;
    @Column
    private int stamina;
    @Column
    private int strenght;
    @Column
    private int attack;
    @Column
    private int defence;

    @ManyToMany(mappedBy = "items")
    List<Hero> heroes;


}
