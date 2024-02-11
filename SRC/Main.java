package JAVA.SRC;

public class Main {


    public static void main(String[] args){
        System.out.println("Meu primeiro programa em java!");

        //variaveis
        int idade = 24;
        System.out.println("Minha idade é: "+idade);

        //Tipos de variaveis
        int numero = 24;
        String frase = "Olá mundo!";
        boolean var = false;
        char var2 = 'a';
        double var3 = 24.9;
        float var4 = 243334;

        System.out.println(numero);
        System.out.println(frase);
        System.out.println(var);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        //Constantes - valor não pode ser alterado
        final int vida_maxima = 10;

        System.out.println(vida_maxima);

        //Arrys - arranjos
        String[] nome = new String[5];
        nome[0] = "Rafaela";
        nome[1] = "Maria";
        System.out.println("O nome é: "+nome[0]);

        //Arry MultiDimensional
        String[][] var5 = new String[5][5];
        var5[0][0] = "Rafaela";
        System.out.println(var5[0][0]);

        //Condições - maior >| menor < | igual == | maior igual >= | menor igual<=
        int vida = 101;
        if(vida >= 100){
            vida+=100;
            System.out.println("Minha vida é Maior que 100!");
        }else{
            System.out.println("Minha vida NÃO é igual  100!");
        }

        String nome1 = "Rafaela";
        if(nome1 == "Rafaela"){
            System.out.println("Nome é igual a " + nome1);
        }else if(nome1 == "Maria"){
            System.out.println("Nome é igual a " + nome1);
        }else if(nome1 == "João"){
            System.out.println("Nome é igual a " + nome1);
        }else{

        }


        if(nome1 != "João")
            System.out.println("O nome é diferente de João!");
       
        
        boolean var6 = true;
        if (var6 == true) 
            System.out.println("Verdade");
        
        // Switch e case
        int vida1 = 100;

        switch (vida1) {
            case 60:
                //Execute essa condição
                System.out.printf("Quero que meu personagem corra mais rapido.");
                break;
            case 90:
                //Execute essa condição
                System.out.printf("Minha vida é igual a 90!.");
                break;
            default:
            System.out.printf("Nenhuma condição bateu! Eu tenho 100 d vida!");
                break;
        }

        //operações avançadas e operações matématicas
        int vida_1 = 100;
        int vida_2 = 100;
        int vida_3= 200;
        int vida_final = vida_1+vida_2+ vida_3;

        System.out.println(vida_1+vida_2);
        System.out.println(vida_final);

        int vida_final2 = ((vida_1+ vida_2) / 2)*2;
        System.out.println(vida_final2);

        String nome_jogador = "Rafaela";
        int skill = 100;
        //operador &&
        
        if(/*verdadeiro*/(nome_jogador == "Rafaela" && skill == 100) && skill <= 90/*falsa*/){
        //pode executar esse codigo
            System.out.println("Verdade");
        }else{
            System.out.println("Entramos no else- condição deu falso");
        }

        //operador ou || - basta ter uma codição verdadeira
        if(nome_jogador == "Rafaela" || nome_jogador == "Maria")
            System.out.println("Comece o jogo!");
        
        if((nome_jogador == "Rafaela" || nome_jogador == "Maria") && skill >= 100)
            System.out.println("Comece o jogo!");

        //Loopings
        int contador = 0;

        while(contador < 10){
            System.out.println("Olá, agora o contador está em: "+contador);
            contador++;//é necessario para quebrar o loop infinito.
        }

        for(int i=0; i<10; i++){
            System.out.println("Olá, agora o contador está em: "+contador);
        }

        do{
            //primeiro executa depois faz a verificação! - usados em caso expecificos
            System.out.println(contador);
            contador++;
        }while(contador < 3);

    }
}