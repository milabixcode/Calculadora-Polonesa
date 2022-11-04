import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


class Questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c, x1, x2;
        System.out.println("Digite o a: ");
        a = teclado.nextFloat();
        System.out.println("Digite o b: ");
        b = teclado.nextFloat();
        System.out.println("Digite o c: ");
        c = teclado.nextFloat();
        float raiz_delta = (float) Math.sqrt((b * b) - (4 * a * c));
        x1 = ((-b) + raiz_delta) / (2 * a);
        x2 = ((-b) - raiz_delta) / (2 * a);
        System.out.println("As raízes da equação são: " + x1 + " " + x2);
        teclado.close();
    }
}

class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x1, x2, y1, y2, z1, z2, distancia;
        System.out.println("Digite o ponto x1: ");
        x1 = teclado.nextFloat();
        System.out.println("Digite o ponto x2: ");
        x2 = teclado.nextFloat();
        System.out.println("Digite o ponto y1: ");
        y1 = teclado.nextFloat();
        System.out.println("Digite o ponto y2: ");
        y2 = teclado.nextFloat();
        System.out.println("Digite o ponto z1: ");
        z1 = teclado.nextFloat();
        System.out.println("Digite o ponto z2: ");
        z2 = teclado.nextFloat();
        distancia = (float) Math.sqrt((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1) + ((z2 - z1) * (z2 - z1)));
        System.out.println("A distância entre os pontos é " + distancia);

        teclado.close();
    }
}

class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();

        distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
        System.out.println("A distância é: " + distancia);

        teclado.close();
    }
}

class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        float preco, valor_total;
        int qtd;
        System.out.println("Informe o nome do produto: ");
        nome = teclado.nextLine();
        System.out.println("Informe o preço: ");
        preco = teclado.nextFloat();
        System.out.println("Informe a quantidade: ");
        qtd = teclado.nextInt();
        if (qtd <= 10) {
            valor_total = qtd*preco;
            System.out.println("Produto: " +nome +valor_total +" valor_total:");
        } else if (qtd >= 11 && qtd <= 20) {
            valor_total = qtd*(preco * 1.1f);
            System.out.println("Produto: " +nome +valor_total +" valor_total:");
        } else if (qtd > 21 && qtd <= 50) {
            valor_total = qtd*(preco * 1.2f);
            System.out.println("Produto: " +nome  +" valor_total:"+valor_total);
        } else if (qtd > 50) {
            valor_total = qtd*(preco * 1.25f);
            System.out.println("Produto: " + nome + valor_total + " valor_total:");
        }
        teclado.close();
    }
}

class Questao5 {
    public static void main(String[] args) {
        int i, j, resultado;
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                resultado = i*j;
                System.out.println(i + "x" + j + "=" + resultado);
            }
        }
    }
}

class Questao6{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String numero;
        System.out.println("Digite o número: ");
        numero = teclado.nextLine();
        System.out.println("Quantidade de dígitos:" + numero.length());
        teclado.close();
    }
}

class Questao7{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int codigo;

        /*System.out.println("Informe o código: ");
        codigo = teclado.nextInt();
        while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();*/

        do {
            System.out.print("Informe o código: ");
            codigo = teclado.nextInt();
            if(codigo ==-1){
                break;
            }
            System.out.println("Código: " + codigo);
        } while (codigo != -1);  
        teclado.close();
    }    
}

/*class Questao8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n, serie = 0;
        System.out.println("Digite o número: ");
        n = teclado.nextInt();
        for(int i = 0; i<=n; i++){
            serie = serie + i;
            System.out.println(serie);
        }
        System.out.println("O resultado da série de Fibonacci é: %d" + serie);
        teclado.close();
    }
}

/*Questao9*/
/*class Loop {
    public static void main(String[] args) {
        for (int i=2; i<=8; i=i+2) {
            for (int j=i; j<=4; j++) {
                for (int k=1; k<=j; k=k+i) {
                    System.out.println(i + ", " + j + ", " + k);
                }
            }
        }
    }
}

class Questao10 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quanto será investido esse mês? \n");
        double valor = teclado.nextDouble();
        System.out.println("Qual é a taxa de juros do mês? \n");
        double juros = teclado.nextDouble();
        double saldo = 0;
        char opcao;

        do
        {
            for(int i=1; i<=12; i++)
            {            
                double saldo_mes = valor*(1+(juros/100));
                saldo = saldo + saldo_mes;
            }
            System.out.println("Saldo do investimento após 1 ano: %d\n" + saldo);
            System.out.println("Deseja processar mais um ano? (s/n) \n");
            opcao = teclado.next().charAt(0);
            if(opcao == 's')
                continue;
            else if(opcao == 'n')
                break;
            else
            {
                System.out.println("Comando Inválido!");
            }
    } while(true);
        
    teclado.close();
    }
}

class Questao11 
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro:\n");
        int numero = teclado.nextInt();
        double raiz_quadrada = Math.sqrt(numero);
        System.out.println("Informe quantas casas decimais deseja: \n");
        int casas_decimais = teclado.nextInt();
        raiz_quadrada = ((int)(raiz_quadrada * Math.pow(10,casas_decimais)))/Math.pow(10,casas_decimais);
        System.out.println("A raiz quadrada do número é: " + raiz_quadrada);

    teclado.close();
    } 
}

class Questao12
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual posição da linha deve ser jogada para ganhar?");
        System.out.println("Qual posição da coluna deve ser jogada para ganhar?");
        int linha = teclado.nextInt();
        int coluna = teclado.nextInt();
        int jogada, jogador, l, c;
        Random chance = new Random();
        int aleatorio = chance.nextInt(100);    
        int[][] tabuleiro = new int[3][3];
        for(jogada=0; jogada<=8;jogada++)
        {
            if(jogada%2==0)
            jogador = 1;
            else   
            jogador=0;
            for(l=0;l<=3;l++){
                for(c=0;l<=3;l++){
                    tabuleiro[l][c] = jogador; 
                }
            }
            if(jogada = 3 && tabuleiro[1] )       
        }
    teclado.close();    
    }    
}
*/
//Ordene um vetor de 100 números inteiros gerados aleatoriamente.
class Questao13
{
    public static void main(String[] args){
        int aux;
        Boolean troca = false;
        Random numeros = new Random();
        
        int [] vetor = new int [100];
        for(int i = 0; i < 100; i++)
        {
            int aleatorio = numeros.nextInt(100);
            vetor[i] = aleatorio;
        }
        for(int i=0; i<99;i++){
            System.out.println("Vetor antes da ordenação: "+ vetor[i]);
        }

        //ordenar o vetor
        do{
            troca=false;
            //percorre todo o vetor comparando o elemnto i com o i+1
            for(int i=0; i<99;i++){
                if(vetor[i]>vetor[i+1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        } while(troca);
        for(int i=0;i<100; i++){
            System.out.println("O vetor ordenado é: "+vetor[i]);
        }
    }
}

/*Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene cada vetor
individualmente, e combine os dois vetores gerando um novo vetor de 100 posições, de
forma que esse novo vetor já seja criado ordenado.*/
class Questao14
{
    public static void main(String[] args)
    {
        int aux1, aux2, i, j;
        Random numeros = new Random();
        int [] vetor1 = new int[50];
        int [] vetor2 = new int[50];
        int [] vetor_final = new int [100];
                
        for(i = 0; i<50; i++){
            int aleatorio = numeros.nextInt(50);
            vetor1[i]=aleatorio;
        }
        for(i=0;i<49;i++){
            if(vetor1[i]>vetor1[i+1]){
                aux1=vetor1[i];
                vetor1[i]=vetor1[i+1];
                vetor1[i+1]=aux1;
            }
        }
        for(i=0; i<50;i++){
            System.out.println("Vetor 1 ordenado "+ vetor1[i]);
        }
        for(i=0;i<50; i++){
            int aleatorio = numeros.nextInt(50);
            vetor2[i]=aleatorio;
        }
        for(i=0;i<49;i++){
            if(vetor2[i]>vetor2[i+1]){
                aux2=vetor2[i];
                vetor2[i]=vetor2[i+1];
                vetor2[i+1]=aux2;
            }
        }
        for(i=0; i<50;i++){
            System.out.println("Vetor 2 ordenado "+ vetor2[i]);
        }
        for(i=0;i<50;i++){ 
            j=0;         
            if(vetor1[i]<vetor2[i]){
                vetor_final[j] = vetor1[i];
                vetor_final[j+1] = vetor2[i];
                j++;                              
            } 
            else if(vetor2[i]<vetor1[i]){
                vetor_final[j] = vetor2[i];
                vetor_final[j+1] = vetor1[i];
                j++;                 
            }
            
        }
        for(j=0; j<100;j++){
            System.out.println("Vetor final ordenado "+ vetor_final[j]);
        }
    }
}

class Questao15{
    public static void main(String[]args){
        double p1, p2, relatorio, apresentacao, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da P1: ");
        p1 = teclado.nextDouble();
        System.out.println("Digite a nota da P2: ");
        p2 = teclado.nextDouble();
        System.out.println("Digite a nota do Relatório: ");
        relatorio = teclado.nextDouble();
        System.out.println("Digite a nota da Apresentação: ");
        apresentacao = teclado.nextDouble();

        media = media(p1, p2, relatorio, apresentacao);

        teclado.close();


    }
    public static double media(double p1, double p2, double relat, double apresent){
        double media_avaliacoes = (p1+p2)/2;
        double media_projeto = (relat + apresent)/2;
        double media = (6*media_avaliacoes + 4*media_projeto)/10;

        if(media >= 6.0){
            System.out.println("Aprovado");
        }
        else if(media < 4.0){
            System.out.println("Reprovado");
        }
        else if(4.0 <= media && media < 6.0){
            System.out.println("VS");
        }
        return media;
    } 
}

class Questao16 {
    public static void main(String[] args){
        int segundos = leitura();
        int horas = hora(segundos);
        int min = minuto(segundos);
        int seg = segundo(segundos);
        imprime(horas, min, seg);        
    }

    public static int leitura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o tempo em segundos: ");
        int seg = teclado.nextInt();
        teclado.close();
        return seg;

    }
    public static void imprime(int horas, int min, int seg){
        System.out.println("O tempo em horas, minutos e segundos é: "
        + horas + "h " + min + "min "+ seg + "s ");
    }

    public static int hora(int seg){
        int horas = seg/3600;
        return horas;
    }
    public static int minuto(int seg){
        int min = (seg % 3600)/60;
        return min;
    }
    public static int segundo(int seg){
        int segundos = (seg % 3600) % 60;
        return segundos;
    }
}

class Questao17{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);  
        int i, j=0, numero, caracteres; 
        System.out.println("Digite um número decimal de até 3 dígitos:\n "); 
        numero = teclado.nextInt();
        char [] romanos = {'I', 'V', 'X', 'L', 'C', 'D'};
        int [] decimais = {1, 5, 10, 50, 100, 500};
        char [] convertido = {};

        for(i=5;i>0;i++){
            caracteres = numero/decimais[i];
            numero = numero%decimais[i];
            while(caracteres!=0){
                convertido[i]=romanos[i];
            }
        }  
        for(caracteres = 4; caracteres)       
        teclado.close();
    }
}

class Questao18{
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int n;
            String[] extenso = {"Duzentos","Cem","Noventa","Oitenta","Setenta","Sessenta","Cinquenta","Quarenta","Trinta","Vinte","Dez","Nove","Oito","Sete","Seis","Cinco","Quatro","Três","Dois","Um"};
            int[] numeros = {200, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
               
            do{
                System.out.println("Digite um número de até 9 digitos: ");
                n = teclado.nextInt();
                int i = 0;
    
                while(n>0){
                    if(n >= numeros[i] && n <= 100){
                        System.out.printf(extenso[i]);
                        n -= numeros[i];
                    } else if(n >= 100){
                        System.out.printf(extenso[i]);
                        n -= numeros[i];
                    }else{
                        i++;
                    }
                }
                System.out.println("\n");
            }while(n != -1);
            
            teclado.close();
    }    
}

