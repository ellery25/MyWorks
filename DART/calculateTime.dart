//Dos Atletas recorren la misma distancia y se registra sus tiempos en minutos y segundos.
// Se desea saber el tiempo total utilizando por ambos atletas en horas, minutos y segundos. 

void main() {
    
  int timeAtlete1M = 15; // Minutos atleta 1
  int timeAtlete1S = 32; // Segundos atleta 1
  int timeAtlete2M = 13; // Minutos atleta 2
  int timeAtlete2S = 15; // Segundos atleta 2
  
  time(timeAtlete1S, timeAtlete1M, timeAtlete2S, timeAtlete2M);

}

void time(num timeAtlete1S, num timeAtlete1M, num timeAtlete2S, num timeAtlete2M){

  num  totalSeconds = timeAtlete1S + timeAtlete2S + (timeAtlete1M + timeAtlete2M) * 60;
  num hours = totalSeconds ~/ 3600;
  num minutes = (totalSeconds % 3600) ~/ 60;
  num seconds = totalSeconds % 60;

  return print('Tiempo total: $hours:$minutes:$seconds');

}





