package main.java.com.example.exemplo.controller;

import main.java.com.example.exemplo.model.Livro;
import main.java.com.example.exemplo.repository.LivroRepository;

@Controller
public class LivrosController {
    @autowired
    LivroRepository livroRepository;


    @GetMapping("/livro")
    public ModelAndView getLivros (@requestParam String param){
        ModelAndView = new ModelAndView ("game-list");
        mv.addObject("livros", livroRepository.findAll());
        return mv; 
    }

    @GetMapping("/addLivro")
    public String getAddLivro(){
        return "livro-adm";
    }

    @PostMapping("/addLivro")
        public String postMapping


    // @PostMapping("/livro")
    // public String postLivro (Livro livro){
    //     LivroRepository.save(livro);
    //     return "/livro";
    // }
}
