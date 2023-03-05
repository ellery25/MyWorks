import 'dart:io';

//Dado el año de nacimiento determinar si una persona es mayor de edad o es menor de edad //

void main(){
   print("Ingresa tu año de nacimiento:");
   int bornAge = int.parse(stdin.readLineSync()!);
   older(bornAge);
}

void older(int bornAge){
    int age = 2023 - bornAge;
    if(age >= 18){
      return print("Eres mayor de edad");
    } else{
      return print("Eres menor de edad");
    }
}