package com.rahul.rahulapp.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    @Id//primary is unique and not null
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    private String friendname;


    private String talent;

}
