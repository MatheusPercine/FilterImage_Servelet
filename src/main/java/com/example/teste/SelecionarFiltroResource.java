//Nome:Dhener Rosemiro Silva                      DRE:121043412
//Nome:Matheus da Cruz Percine Pinto              DRE:121068501
//Nome:Cássio Emanuel Ferreira da Silva           DRE:120154812
//Nome:Lucas Cavalcante Nascimento Silva          DRE:121056863

package com.example.teste;

import javax.ws.rs.*;

@Path("/filtro")
public class SelecionarFiltroResource {

    public static String ImagemGlobal;

    @GET
    @Produces("text/html")

    public String Filtrar(@QueryParam("imagem") @DefaultValue("") String imagem) {
        ImagemGlobal = imagem;
        String background = "https://wallpaperaccess.com/full/358836.jpg";
        String html = "<html><head><meta charset=\"UTF-8\"><title>Filtrar imagens</title></head>";
        html += "<body style=\"background-image: url(" + background + ");\">";
        html += "$formbuscar<p><a href=\"selecionar\">Cancelar</a></p><body></html>";
        html = html.replace("$formbuscar",htmlForm());
        return html;
    }

    public String htmlForm(){
        String form = "<h2>Escolher Filtro</h2><form method=\"GET\" action=\"resultadodaescolha\">";
        form += "<input type=\"radio\" id=\"grayscale\" name=\"tipoFiltro\" value=\"GRAYSCALE\">";
        form += "<label for=\"grayscale\">GRAYSCALE</label><br>";
        form += "<input type=\"radio\" id=\"blur\" name=\"tipoFiltro\" value=\"BLUR\">";
        form += "<label for=\"blur\">BLUR</label><br>";
        form += "<input type=\"radio\" id=\"brightness\" name=\"tipoFiltro\" value=\"BRIGHTNESS\">";
        form += "<label for=\"brightness\">BRIGHTNESS</label><br>";
        form += "<input type=\"radio\" id=\"sepia\" name=\"tipoFiltro\" value=\"SEPIA\">";
        form += "<label for=\"sepia\">SEPIA</label><br>";
        form += "<input type=\"radio\" id=\"invert\" name=\"tipoFiltro\" value=\"INVERT\">";
        form += "<label for=\"invert\">INVERT</label><br>";
        form += "<input type=\"radio\" id=\"huerotate\" name=\"tipoFiltro\" value=\"HUEROTATE\">";
        form += "<label for=\"huerotate\">HUEROTATE</label><br>";
        form += "<input type=\"radio\" id=\"opacity\" name=\"tipoFiltro\" value=\"OPACITY\">";
        form += "<label for=\"opacity\">OPACITY</label><br>";
        form += "<input type=\"radio\" id=\"contrast\" name=\"tipoFiltro\" value=\"CONTRAST\">";
        form += "<label for=\"contrast\">CONTRAST</label><br>";
        form += "<input type=\"submit\" value=\"Filtrar\"></form>";
        return form;
    }
}
