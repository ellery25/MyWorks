/*Dadas dos tanques llenos de agua cuyas capacidades están dadas en litros y en yardas cúbicas.
 De la cantidad total de agua: el 75% se dedica al  consumo doméstico y el 25% se dedica al riego. Diseñe un programa que haga lo siguiente:  

Determine la cantidad total de agua expresada en metros 
cúbicos y en yardas cúbicas. 

Determine las cantidades de agua dedicada al riego y al 
consumo doméstico expresada en metros cúbicos y en 
pies cúbicos. Considere los siguientes factores de 
conversión: 

1 pie cúbico = 0.0283 metros cúbicos, 1 
metro cúbico = 1000 litros, 1 yarda cúbica = 27 
pies cúbicos. 
*/



void main(){

  double capacityTank1liter = 5000; // capacidad del tanque 1 en litros
  double capacityTank1CubeYards = 2.5; // capacidad del tanque 1 en yardas cúbicas
  double capacityTank2liter = 8000; // capacidad del tanque 2 en litros
  double capacityTank2CubeYards = 3.5; // capacidad del tanque 2 en yardas cúbicas

  WaterTank(capacityTank1liter, capacityTank1CubeYards, capacityTank2liter, capacityTank2CubeYards);

}

void WaterTank(double capacityTank1liter, double capacityTank1CubeYards, double capacityTank2liter, double capacityTank2CubeYards){

  double totalQuantityLiter = capacityTank1liter + capacityTank2liter;

  double totalQuantityCubicMeters = totalQuantityLiter / 1000;

  double totalQuantityCubeYards = totalQuantityCubicMeters * 1.308;

  double quantityDomesticConsumptionLiter = totalQuantityLiter * 0.75;

  double quantityDomesticConsumptionCubicMeters = quantityDomesticConsumptionLiter / 1000;

  double quantityDomesticConsumptionCubicFoots = quantityDomesticConsumptionCubicMeters / 0.0283;

  double quantityIrrigationLiters = totalQuantityLiter * 0.25;

  double quantityIrrigationCubicMeters = quantityIrrigationLiters / 1000;

  double quantityIrrigationCubicFoots = quantityIrrigationCubicMeters / 0.0283;

  print('Cantidad total de agua en metros cúbicos: $totalQuantityCubicMeters');
  print('Cantidad total de agua en yardas cúbicas: $totalQuantityCubeYards');
  print('Cantidad de agua dedicada al consumo doméstico en metros cúbicos: $quantityDomesticConsumptionCubicMeters');
  print('Cantidad de agua dedicada al consumo doméstico en pies cúbicos: $quantityDomesticConsumptionCubicFoots');
  print('Cantidad de agua dedicada al riego en metros cúbicos: $quantityIrrigationCubicMeters');
  print('Cantidad de agua dedicada al riego en pies cúbicos: $quantityIrrigationCubicFoots');

}