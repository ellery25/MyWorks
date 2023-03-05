/*
a) Realizar una clase que herede los comportamientos de un vehículo, los atributos y métodos son los que usted decida que esta deba tener​
b) Realizar una función Async - Await​ que permita mostrar un conteo regresivo al final deberá mostrar un mensaje de sorpresa ​.
*/

import 'dart:async';

abstract class vehiculo {

  final String marca;

  vehiculo(this.marca);

  String get marcaVehiculo => '$marca';

  void informacion();
  void encendido();
  void apagado();
  void pitar();

}

class carro extends vehiculo {

  String traccion;
  String tipo;

  carro({
    required String marca,
    required this.traccion,
    required this.tipo,
  }) : super(marca);

  String get traccionI => traccion;

  void informacion() => print('Marca: $marca, Tracción: $traccion, Tipo: $tipo');
  void encendido() => print('brrum');
  void apagado() => print('----');
  void pitar() => print('πππππππππππππππππ');

}

Future<String> countdown(String Url) async{
  for(var i = 5; i >= 1; i--){
    print(i);
    await Future.delayed(Duration(seconds: 1));
  }
  await Future.delayed(Duration(seconds: 2),(){
    print('Información del vehículo: ');
  });

  return '';
}


void main(List<String> args) async {

  
  final Toyota = carro(
    marca: 'Toyota',
    traccion: '4x4',
    tipo: 'Camioneta');

  

  await countdown('http//api.algo.com/datos');
  Toyota.informacion();

}
