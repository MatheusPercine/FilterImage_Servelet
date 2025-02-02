//Nome:Dhener Rosemiro Silva                      DRE:121043412
//Nome:Matheus da Cruz Percine Pinto              DRE:121068501
//Nome:Cássio Emanuel Ferreira da Silva           DRE:120154812
//Nome:Lucas Cavalcante Nascimento Silva          DRE:121056863

package com.example.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/selecionar")
public class SelecionarImagemResource {
    public SelecionarImagemResource() {}

    @GET
    @Produces({"text/html"})

    public String listar() {
        String img1 = "https://c4.wallpaperflare.com/wallpaper/500/442/354/outrun-vaporwave-hd-wallpaper-preview.jpg";
        String img2 = "https://eskipaper.com/images/peacock-feather-wallpaper-5.jpg";
        String img3 = "https://i.pinimg.com/originals/15/f6/a3/15f6a3aac562ee0fadbbad3d4cdf47bc.jpg";
        String img4 = "https://4.bp.blogspot.com/-WfcC1NGTb-U/XFUltHoGh4I/AAAAAAAABz0/xDiu8gIgq7EIBtbK3fI__lcfuWgJSxhgQCKgBGAs/w2880-h1800-c/autumn-trees-nature-scenery-123-18-4K.jpg";
        String img5 = "https://cdn.wallpapersafari.com/75/62/BwhS1M.jpg";
        String img6 = "https://wallpaperaccess.com/full/7316.jpg";

        String background = "https://wallpaperaccess.com/full/358836.jpg";
        String html = "<html><head><meta charset=\"UTF-8\"><title>Filtros de Imagem</title></head>";
        html = html + "<body style=\"background-image: url(" + background + ");\"><h2 style=\"font-size: 30px; color: blue;\">Filtros de Imagem</h2>";
        html = html + "<span style=\"font-size: 20px; font-style: italic; color: black;\">Insira um link de uma imagem JPG ou PNG ou </span><br>";
        html = html + "<span style=\"font-size: 20px; font-style: italic; color: black;\">selecione uma imagem já pré-estabelecida na biblioteca de imagens </span><br><br><br>";
        html = html + "<span style=\"font-size: 30px; color: black;\">Coloque o link na caixa abaixo</span><br>";
        html = html + "$formInserirLink<br>";
        html = html.replace("$formInserirLink", this.htmlForm());

        html = html + "<p style=\"font-size: 30px; color: black;\">Biblioteca de imagens:</p>";
        html = html + "<a href=\"filtro?imagem="+img1+"\"> <img src ="+img1+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "<a href=\"filtro?imagem="+img2+"\"> <img src ="+img2+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "<a href=\"filtro?imagem="+img3+"\"> <img src ="+img3+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "<a href=\"filtro?imagem="+img4+"\"> <img src ="+img4+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "<a href=\"filtro?imagem="+img5+"\"> <img src ="+img5+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "<a href=\"filtro?imagem="+img6+"\"> <img src ="+img6+" width = \"359px\" height = \"205px\"> </a>";
        html = html + "</body></html>";
        return html;
    }

    private String htmlForm() {
        String formhtml = "<form method=\"GET\"action=\"filtro\">";
        formhtml = formhtml + "<input type=\"text\" name=\"imagem\"></input>";
        formhtml = formhtml + "<input type=\"submit\" value=\"Inserir Link\"></input></form>";
        return formhtml;
    }
}