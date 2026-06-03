void fat() { // void quer dizer que não haverá retorno
 
    fatorial = 1;
    for (int contador = 1; contador <= numero; contador++)
        fatorial = fatorial * contador; 
}    
    
void main() { // programa principal
    
    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    fat(); // chamada da subrotina (um procedimento)
    IO.println("O fatorial de " + numero + " é: " + fatorial);
    
}