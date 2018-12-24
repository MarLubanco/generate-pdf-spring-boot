package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PESSOA")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

  @Id
  @GeneratedValue
  private Integer id;

  @Column
  @Size(max = 40)
  @NotNull
  private String nome;

  @Column
  @Size(max = 50)
  private String profissao;

  @Column
  private String cidade;

}
