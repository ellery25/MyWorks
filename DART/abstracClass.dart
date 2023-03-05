abstract class InterPersona {

  void guardarPersona();

}

class Estudiantes implements InterPersona {

  String _nombre = "";

  set nombre(String nombre){
    if(nombre == ""){
      throw "dato vacío";
    }
  
  _nombre = nombre;

  }

  String get nombre => nombre;

  void guardarPersona() => print("datos guardados, $_nombre");

}

void main(List<String> args) {
  
  final Estudiantes estudiante = Estudiantes();

  estudiante.nombre = "Ellery";
  estudiante.guardarPersona();

}