package com.example.demo.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PdfService;

import java.io.IOException;

@RestController
@RequestMapping("/gerador-pdfs")
public class PdfController {

  @Autowired
  private PdfService pdfService;

  @GetMapping("{nome}")
  public Document getPdf(@PathVariable String nome) {
     return pdfService.getPdf(nome);
  }

  @GetMapping
  public void getPdfByHtml() throws IOException, DocumentException {
    pdfService.getPdfHtml();
  }
}
