/*
En una playa de estacionamiento cobran S/. 2.00 por hora o fracción los días Lunes, 
Martes y Miércoles, S/. 2.50 los días jueves y viernes, S/. 3.00 los días sábado y Domingo. 
Se considera fracción de hora cuando haya pasado de 5 minutos. Diseñe un programa que determine cuánto debe pagar un cliente por su estacionamiento
 en un solo día de la semana. Si el tiempo ingresado es incorrecto imprima un mensaje de error.
*/

import 'dart:io';
 
void main() {
  print('Ingresa un dia de la semana:  (lunes,martes,miercoles,jueves,viernes,sabado o domingo)');
  String weekDay = stdin.readLineSync()!;
  print('Ingresa las horas en las que estuvo el carro en el parqueo: ');
  int hours = int.parse(stdin.readLineSync()!); 
  print('Ingresa los minutos');
  int minutes = int.parse(stdin.readLineSync()!); 

  value(weekDay, hours, minutes);

}

void value(String weekDay, int hours, int minutes){

  double cost = 0;
  if (weekDay == 'lunes' || weekDay == 'martes' || weekDay == 'miércoles' || weekDay == 'jueves' || weekDay == 'viernes' || weekDay == 'sábado' || weekDay == 'domingo') {

    double fractionTimeHour = hours + (minutes / 60);

    if (weekDay == 'lunes' || weekDay == 'martes' || weekDay == 'miércoles') {
      cost = fractionTimeHour * 2;
    } else if (weekDay == 'jueves' || weekDay == 'viernes') {
      cost = fractionTimeHour * 2.5;
    } else if (weekDay == 'sábado' || weekDay == 'domingo') {
      cost = fractionTimeHour * 3;
    }

    return print('El costo total de estacionamiento es de S/$cost.');

  } else {
    return print('El día de la semana ingresado es inválido.');
  }

}