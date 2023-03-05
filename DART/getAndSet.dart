class Personas {

  String _nombre = "";

  set nombre(String nombre){

    if(nombre == ""){
      throw('El nombre está vacío');
    }
    _nombre = nombre;

  }

  String get nombre => _nombre;

}

void main(List<String> args) {
  
  final Personas person = Personas();

  person.nombre = "Ellery";
  print('Hola ' + person.nombre);


}
