package com.example.demo.service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

  @Autowired
  private PessoaRepository pessoaRepository;

  public Optional<Pessoa> getPessoa(Long id) {
    return pessoaRepository.findById(id);
  }

  public List<Pessoa> getAll() {
    return pessoaRepository.findAll();
  }

  public Pessoa save(Pessoa pessoa) {
    return pessoaRepository.save(pessoa);
  }

}

