//Los Async nos ayuda a convertir una función en una tarea asíncrona – Await nos permite esperar hasta que se resuelva la petición ​

Future<String> httpGet(String Url){
  return Future.delayed(new Duration(seconds: 4), (){
    return 'Hola mundo';
  });

}

void main(List<String> args) async {
  
  print('Vamos a pedir datos');

  String data = await httpGet('http//api.algo.com/datos');

  print(data);

  print('Esta linea se ejecuta luego de la anterior');

}