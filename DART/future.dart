Future<String> httpGet(String Url){

  return Future.delayed(new Duration(seconds: 4), () {
    return 'Hola mundo';
  });

}

void main(List<String> args) {

  print('Vamos a pedir datos');

  httpGet('http//api.algo.com/datos').then((data){
    print(data);
  });

  print('Esta línea se ejecuta sin depender de la anterior');

}

//Los Futures son  tareas a destiempo que nos notifica cuando se resuelva la petición​