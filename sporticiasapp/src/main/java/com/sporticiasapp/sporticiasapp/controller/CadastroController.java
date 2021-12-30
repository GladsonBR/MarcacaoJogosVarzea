package com.sporticiasapp.sporticiasapp.controller;

import com.sporticiasapp.sporticiasapp.models.Cadastro;
import com.sporticiasapp.sporticiasapp.models.CadastroCampo;
import com.sporticiasapp.sporticiasapp.repository.CadastroCampoRepository;
import com.sporticiasapp.sporticiasapp.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;
    @Autowired
    private CadastroCampoRepository cadastroCampoRepository;

    @RequestMapping(value="/cadastrar", method = RequestMethod.GET)
    public String form(){
        return "cadastro/formCadastro";
    }
    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public String form( Cadastro cadastro, CadastroCampo cadastroCampo ){
        cadastroRepository.save ( cadastro );
        cadastroCampoRepository.save ( cadastroCampo );
        return "redirect:/cadastrar";
    }
}
