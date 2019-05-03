package org.umssdiplo.automationv01.core.managepage.Hoteles;

import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends BasePage {
    private List<String> lista = new ArrayList<>();
    public void AgregarList(String dato){
        lista.add(dato);
    }
    public void getLista(){
        for (String lis:lista) {
            System.out.print(lis);
        }
    }
}
