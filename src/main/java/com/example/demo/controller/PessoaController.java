package com.example.demo.controller;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

  @Autowired
  private PessoaService pessoaService;

  @GetMapping
  private List<Pessoa> getAll() {
    return pessoaService.getAll();
  }

  @PostMapping
  private Pessoa save(@RequestBody Pessoa pessoa) {
    return pessoaService.save(pessoa);
  }

}
