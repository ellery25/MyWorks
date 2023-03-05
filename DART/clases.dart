class Heroe {
  String nombre = '';
  String poder = '';
  
  Heroe(String nombre, String poder){
    this.nombre = nombre;
    this.poder = poder;
  }

}

class Person {

  String firstName;
  String lastName;

  Person(this.firstName, this.lastName);

}

void main(){

  final heroe = Heroe('NightWing','Agilidad');
  final me = Person('Ellery', 'Ricaurte');
  print(heroe.nombre);
  print('Hola ' + me.firstName);

}