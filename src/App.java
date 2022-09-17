import java.lang.reflect.Array;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {   
    
//Regras para voto obrigatório:
//menor de 16 anos não vota
// 16 anos e menos de 18 anos vota mais não é obrigatório
//18 anos ou mais é obrigatório 
// mais de 64 não é mais obrigatório votar
String porteiro;
int idadePessoa = 65;

if(idadePessoa < 16){
    porteiro = "Não tem direito ao voto";
}
else if(idadePessoa <=16 && idadePessoa > 18){
porteiro="Voto não obrigatório";
}
else if(idadePessoa >= 18 && idadePessoa <= 64){
porteiro="Você é obrigado à votar";
}
else{
    porteiro="Voto opcional";
}


System.out.println(porteiro);




    }
}

