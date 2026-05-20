void main () {

        int tamanho=10;
        var num = new int[tamanho];

        for (int cont=0;cont<tamanho;cont++)
                num [cont] = Integer.parseInt(IO.readln("Digite o " + (cont+1) + "O número:"));

        IO.println("Estes foram os números digitados: ");
        
        for (int cont=0;cont<tamanho;cont++)
            IO.println("Posição " + (cont) + " número: " + num[cont]);
}
    

