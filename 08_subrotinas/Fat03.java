float fat(int num){ // as funções possuem tipo que não é void e sim o tipo do valor que retornam
    float fator=1;
    for (int contador = 1; contador <= num; contador++)
        fator = fator * contador;
    return fator; // no fim o valor do cálculo irá retornar como resposta da função
}    

void main() {
    
    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    float fatorial = fat(numero);
    IO.println("O fatorial de " + numero + " é: " + fatorial);

}