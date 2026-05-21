void main() {

    float lote1 = Float.parseFloat(IO.readln("Peças defeituosas do lote 1: "));
    float lote2 = Float.parseFloat(IO.readln("Peças defeituosas do lote 2: "));
    float lote3 = Float.parseFloat(IO.readln("Peças defeituosas do lote 3: "));
    float lote4 = Float.parseFloat(IO.readln("Peças defeituosas do lote 4: "));

    float media = (lote1 + lote2 + lote3 + lote4) / 4;

    if (media <= 2)
        IO.println("Máquina regulada (excelente)");

        else 
            if (media < 5)
                IO.println("Alerta: necessita de Manutenção Preventiva ");

                else 
                IO.println("Paragem crítica: máquina danificada");

 }