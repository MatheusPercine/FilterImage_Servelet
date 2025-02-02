//Nome:Dhener Rosemiro Silva                      DRE:121043412
//Nome:Matheus da Cruz Percine Pinto              DRE:121068501
//Nome:Cássio Emanuel Ferreira da Silva           DRE:120154812
//Nome:Lucas Cavalcante Nascimento Silva          DRE:121056863

package com.example.teste;

import javax.ws.rs.*;

@Path("/resultadodaescolha")
public class ResultadoDaEscolhaResource {
    public static String filtroGlobal;
    public static String resultado;
    @GET
    @Produces("text/html")
    public String resultado(@QueryParam("tipoFiltro") @DefaultValue("") String filtro) {
        filtroGlobal = filtro;
        String imagem = SelecionarFiltroResource.ImagemGlobal;
        String html;
        String background = "https://wallpaperaccess.com/full/358836.jpg";
        //img = "http://4.bp.blogspot.com/-3YwFT7wiDnE/VT5NLGC20qI/AAAAAAABC8Y/tQcMBoQkbEk/s1600/adffb142a07755f9fc4e1400e3491ae32.jpg";
        if(filtro.equals("GRAYSCALE")){
            resultado = FiltrosApplication.grayscale();
        }else if (filtro.equals("BLUR")){
            resultado = FiltrosApplication.blur();
        }else if (filtro.equals("BRIGHTNESS")){
            resultado = FiltrosApplication.brightness();
        }else if(filtro.equals("SEPIA")){
            resultado = FiltrosApplication.sepia();
        }else if(filtro.equals("INVERT")){
            resultado = FiltrosApplication.invert();
        }else if(filtro.equals("HUEROTATE")){
            resultado = FiltrosApplication.huerotate();
        }else if(filtro.equals("OPACITY")){
            resultado = FiltrosApplication.opacity();
        }else if(filtro.equals("CONTRAST")){
            resultado = FiltrosApplication.contrast();
        }else{
            resultado = "<p> Nenhum filtro foi selecionado </p>";
        }
        html = "<html><head><meta charset=\"UTF-8\"><title>Imagem Filtrada</title></head>";
        html += "<body style=\"background-image: url(" + background + ");\"><h2>Imagem Filtrada</h2>";
        html += "<img src=\""+imagem+"\"width=\"359px\" height=\"205px\">";
        html += "<p><a style=\"text-decoration: none; border: 1px solid black; color: red; padding: 3px; border-radius: 3px;\"href=\"zoom\">Clique aqui para ampliar</a></p><br>";
        html += "<img style=\""+resultado+"\" src=\""+imagem+"\"width=\"359px\" height=\"205px\">";
        html += "<p><a style=\"text-decoration: none; border: 1px solid black; color: red; padding: 3px; border-radius: 3px;\"href=\"zoomimagemfiltrada\">Clique aqui para ampliar</a></p>";
        html += "<p><a href=\"filtro?imagem="+imagem+"\">Cancelar</a></p>";
        html += "</body></html>";
        return html;
    }
}