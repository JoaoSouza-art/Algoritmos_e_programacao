 float fator = 1;
    for (int contador = 1; contador <= num; contador++)
        fator = fator * contador;
    fatorial[0] = fator;
    fatorial[1] = 400;
}    
    
 void main() {

    var fatorialPrincipal = new float[2];

    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    fat(numero, fatorialPrincipal);
    IO.println("O fatorial de " + numero + " é: " + fatorialPrincipal[0]);
    IO.println("Elemento 1 de fatorialPrincipal: " + fatorialPrincipal[1]);
}