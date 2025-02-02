//Nome:Dhener Rosemiro Silva                      DRE:121043412
//Nome:Matheus da Cruz Percine Pinto              DRE:121068501
//Nome:Cássio Emanuel Ferreira da Silva           DRE:120154812
//Nome:Lucas Cavalcante Nascimento Silva          DRE:121056863

package com.example.teste;

import javax.ws.rs.*;

@Path("/zoomimagemfiltrada")
public class ZoomImagemFiltradaResource {
    @GET
    @Produces("text/html")
    public String zoomImagemFiltrada() {
        String html,img,filtro;
        img = SelecionarFiltroResource.ImagemGlobal;
        filtro = ResultadoDaEscolhaResource.filtroGlobal;
        String teste = "<p>" +img+"</p>";
        String background = "https://wallpaperaccess.com/full/358836.jpg";
        html = "<html><head><meta charset=\"UTF-8\"><title>Imagem Ampliada</title></head>";
        html += "<body style=\"background-image: url(" + background + ");\"><h2>Imagem Ampliada</h2>";
        html += "<img style=\""+ResultadoDaEscolhaResource.resultado+"\" src=\""+img+"\"width=\"850px\" height=\"510px\">";
        html += "<p><a href=\"resultadodaescolha?tipoFiltro="+filtro+"\">Voltar</a></p>";
        html += "</body></html>";
        return html;
    }
}