
public class App {
    public static void main(String[] args) throws Exception {   
    
//Regras para voto obrigatório:
//menor de 16 anos não vota
// 16 anos e menos de 18 anos vota mais não é obrigatório
//18 anos ou mais é obrigatório 
// mais de 64 não é mais obrigatório votar
/*
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

//Manipulação de Strings

//comparação

String id = "zxcv11";
String idOu = "Zxcv11";

String comparePR = id == idOu?"id já existe":"id não existe";
System.out.println(comparePR);

String compareEx = id.equalsIgnoreCase(idOu)?"id já existe":"id não existe";
System.out.println(compareEx);

String compare = id.equalsIgnoreCase(idOu)?"id já existe":"id não existe";
System.out.println(compare);


//metodos de Strings

String name = "Rodolfo";

System.out.println(name.replace("o","a"));

System.out.println(name.contains("R"));

*/

String[] nomes = {"Darci", "Cris", "Alex", "Juraci"};

System.out.println(nomes[0]);



    }
}

