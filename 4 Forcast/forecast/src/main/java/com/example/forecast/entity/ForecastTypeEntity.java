package com.example.forecast.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "ForecastType")
public class ForecastTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String name;
    private char contributionOrder; //P-Positively Contribute, N- NegativelyContribute

    public ForecastTypeEntity(String pName, char pContributionOrder) {
        this.name = pName;
        this.contributionOrder = pContributionOrder;
    }


}
