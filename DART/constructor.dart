//Es importante enunciar que, el manejo de los constructores con nombre, se usa para el uso de datos proveniente de los apis con formato Json​

import 'dart:convert';

class Heroe {
  String nombre ='';
  String poder = '';

  Heroe(this.nombre, this.poder);

  Heroe.fromJson(parsedJson){
    nombre = parsedJson['nombre'];
    poder = parsedJson['poder'];
  }

}

void main() {

  final rawjson = Heroe('logan','regeneración');

  final parsedJson = json.decode(rawjson.nombre);
  final heroe = new Heroe.fromJson(parsedJson);

}