/*
Una Olimpiada de tiro al blanco se llega a un acuerdo entre los participantes para que el puntaje obtenido sea calculado en base al puntaje original
 ( 0 a 10 ) alcanzando en el tiro efectuado, multiplicado por un factor según la siguiente tabla: 
 .
 .
 .
 .
Para un tiro realizado determine el puntaje alcanzado aplicando el factor que le corresponde. 


*/

import 'dart:io';

void main(){

  print('Ingresa tu puntaje:');
  int score = int.parse(stdin.readLineSync()!);
  Score(score);

}

void Score(int score){

  if(score == 0){
    score *= 0;
  } else if(score >= 1 && score <= 5){
    score *= 6;
  } else if(score >= 6 && score <= 8){
    score *= 9;
  } else if(score >= 9 && score <= 10){
    score *= 10;
  }

  return print('Tu puntaje es : $score');
}