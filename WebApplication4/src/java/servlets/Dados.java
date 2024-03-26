/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;
import org.json.JSONObject;

/**
 *
 * @author dange
 */
public class Dados extends JSONObject {
    private final String Nome = "Felipe de Freitas Fernandes";
    private final String RA = "1290482122029";
    private final String[] Disciplinas = 
    {"Banco de Dados",
     "Engenharia de Software III",
     "Programação Orientada a Objetos",
     "Linguagem de Programação IV - INTERNET",
     "Sistemas Operacionais II",
     "Inglês IV",
     "Metodologia da Pesquisa Científico-Tecnológica"};
    
    public String toString(){
        String Pacote = 
                "Nome: "+Nome
                +"\nRA: "+RA
                +"\n\nDisciplinas:"
                +Disciplinas[0]
                +"\n"+Disciplinas[1]
                +"\n"+Disciplinas[2]
                +"\n"+Disciplinas[3]
                +"\n"+Disciplinas[4]
                +"\n"+Disciplinas[5]
                +"\n"+Disciplinas[6];
                
    return Pacote;
}
}


