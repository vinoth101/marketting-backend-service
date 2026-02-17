package com.example.marketting_backend_service.entity;

import jakarta.persistence.*;
import lombok.experimental.NonFinal;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Table(name="leads")
@Entity
public class Leads {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @Column(name = "lastname")
    private String lastname;

    @NotNull
    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column(name = "company")
    private String company;

    @Column(name = "company_type")
    private String company_type;
}
