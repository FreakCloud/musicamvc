package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class MusicaController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista(1,"Fredy Mercury", "Rock", 25, "Algo","https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Freddie_Mercury_%281977_Press_Kit_Photo%29.jpg/250px-Freddie_Mercury_%281977_Press_Kit_Photo%29.jpg" );
        model.addAttribute("artista", artista);
        return "artista";
    }

}
