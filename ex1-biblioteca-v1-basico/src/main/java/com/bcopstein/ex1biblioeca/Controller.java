package com.bcopstein.ex1biblioeca;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemDeBemVindo() {
        return "Bem vindo a biblioteca central!";
    }

    @GetMapping("/biblioteca/livros") // Devolve a lista dos títulos pertencentes ao acervo
    @CrossOrigin(origins = "*")
    public List<Livro> listaLivros() {
        List<Livro> livros = new LinkedList<>();
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1, 1899));
        livros.add(new Livro("1984", "George Orwell", 2, 1949));
        livros.add(new Livro("Romeu e Julieta", "Shakespeare", 3, 1597));
        return livros;
    }

    @GetMapping("/biblioteca/autores") // Devolve a lista dos autores pertencentes ao acervo
    @CrossOrigin(origins = "*")
    public List<String> listaAutores() {
        List<String> autores = new LinkedList<>();
        autores.add("Shakespeare");
        autores.add("George Orwell");
        autores.add("Machado de Assis");
        return autores;
    }
}