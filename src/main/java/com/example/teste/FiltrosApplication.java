//Nome:Dhener Rosemiro Silva                      DRE:121043412
//Nome:Matheus da Cruz Percine Pinto              DRE:121068501
//Nome:Cássio Emanuel Ferreira da Silva           DRE:120154812
//Nome:Lucas Cavalcante Nascimento Silva          DRE:121056863

package com.example.teste;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class FiltrosApplication extends Application {
    private static String style;
    protected static String grayscale(){
        style = "-webkit-filter: grayscale(100%); filter: grayscale(100%)";
        return style;
    }
    protected static String blur(){
        style = "-webkit-filter: blur(5px); filter: blur(5px);";
        return style;
    }
    protected static String brightness(){
        style = "-webkit-filter: brightness(150%); filter: brightness(150%);";
        return style;
    }
    protected static String sepia(){
        style = "-webkit-filter: sepia(100%); filter: sepia(100%);";
        return style;
    }
    protected static String invert(){
        style = "-webkit-filter: invert(100%); filter: invert(100%);";
        return style;
    }
    protected static String huerotate(){
        style = "-webkit-filter: hue-rotate(100deg); filter: hue-rotate(100deg);";
        return style;
    }
    protected static String opacity(){
        style = "-webkit-filter: opacity(60%); filter: opacity(60%);";
        return style;
    }
    protected static String contrast(){
        style = "-webkit-filter: contrast(250%); filter: contrast(250%);";
        return style;
    }
}