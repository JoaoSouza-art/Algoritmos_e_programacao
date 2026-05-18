jurosForn() {

    IO.readln("=== Simulador de investimento ===");

    double depositoMensal = Double.parseDouble(IO.readln("Valor do depósito mensal: "));
    double taxaJuros = Double.parseDouble(IO.readln("Taxa de juros mensal (em%): ")) /100;
    int tempoMeses = Integer.parseInt(IO.readln("Quantidade de meses: "));

    double saldoTotal = 0;

    for (int mes = 1; mes <= tempoMeses; mes++) {

        saldoTotal = (saldoTotal + depositoMensal) * (1 + taxaJuros);

        System.out.printf("Mês %d | Soldo acumulado: %.2f%n", mes, saldoTotal);

  }
    IO.readln("------------------------------");
        System.out.printf("Resultado final após %d meses: R$ %.2f%n" , tempoMeses, saldoTotal);

}