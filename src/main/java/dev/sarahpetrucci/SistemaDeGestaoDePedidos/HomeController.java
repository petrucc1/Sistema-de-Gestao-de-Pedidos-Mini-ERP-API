package dev.sarahpetrucci.SistemaDeGestaoDePedidos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "A API está rodando!";
    }
}
