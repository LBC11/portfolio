package com.bob.portfoliospring.domain.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String institution;
    private String degree;
    private String major;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "personal_information_id")
    private PersonalInformation personalInformation;
}
