package com.example.MiPrimerServidorDeAplicacion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "hola mundo desde mi servidor de aplicaciones";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "hola: "+nombre+" desde mi servidor de aplicacion";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "Recibi tu mensaje: "+ mensaje;
    }
}
