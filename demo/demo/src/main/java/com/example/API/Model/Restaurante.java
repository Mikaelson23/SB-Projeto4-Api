package com.example.API.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "Restaurante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @NotBlank
    @NotNull
    private String nome;
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(max = 11)
    private String telefone;
    @NotBlank
    @NotNull
    private String endereco;

}
