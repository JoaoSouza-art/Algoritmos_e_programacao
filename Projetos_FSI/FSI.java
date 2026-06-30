void main () {

    int seguro = Integer.parseInt(IO.readln("Informe o valor do seguro: "));
    int idade = Integer.parseInt(IO.readln("Informe a idade do condutor: "));
    int fidelidade = Integer.parseInt(IO.readln("Informe o tempo de fidelidade, em anos, do condutor: "));

    double desconto1 = seguro - (seguro * 10.0/100);
    double desconto2 = seguro - (seguro * (fidelidade * 2.0/100));
    double desconto3 = seguro - (seguro * 20.0/100);

   //  Quando o condutor principal tiver entre 18 e 25, o preço do seguro será sem descontos (tabela cheia)
        if (idade < 25 && idade >=18) {
            IO.println("Seguro sem desconto " + seguro + " R$");
        }

        
        // Se for uma nova contratação, o cliente terá 10% de desconto.
            else 
                if (idade >=25 && fidelidade == 0) {
                    IO.println("Nova contratação. O valor do seguro é: " + desconto1 + " R$");
                }
        
            // Se o condutor for maior de 25 anos e já for cliente da empresa, terá 2% de desconto para cada ano de fidelidade até 20% de desconto.
                else 
                    if (idade >=25 && fidelidade >=1 && fidelidade <=10) {
                        IO.println("O valor do seguro é: " + desconto2 + "R$"); 
                    }
                    
                    else 
                        if (idade >=25 && fidelidade >10) {
                            IO.println("Desconto máximo! O valor do seguro é: " + desconto3 + " R$");
                        }

}