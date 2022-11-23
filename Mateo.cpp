
using namespace std;

int main() {
  int perros, gatos, iguanas, cocodrilos, aves; //Se asigna variables antes de las operaciones con una "s" de diferencia//
  double Pperro, Pgato, Piguana, Pcocodrilo, Pave;
  cout << "Ingresa el número de perros:" << endl;
    cin >> perros;
  cout << "Ingresa el peso de cada perro: " << endl;
    cin >> Pperro;
  cout << "Ingresa el número de gatos:" << endl;
    cin >> gatos;
  cout << "Ingresa el peso de cada gato: " << endl;
    cin >> Pgato;
  cout << "Ingresa el número de iguanas: " << endl;
    cin >> iguanas;
  cout << "Ingresa el peso de cada iguana:  " << endl;
    cin >> Piguana;
  cout << "Ingresa el número de cocodrilos:" << endl;
    cin >> cocodrilos;
  cout << "Ingresa el peso de cada cocodrilo" << endl;
    cin >> Pcocodrilo;
  cout << "Ingresa el número de aves" << endl;
    cin >> aves;
  cout << "Ingresa el peso de cada ave" << endl;
    cin >>Pave;
double Pperros, Pgatos, Piguanas, Pcocodrilos, Paves, Arca; //Se calculan los pesos completos con los datos recolectados//
  Pperros = perros * Pperro;
  Pgatos = gatos * Pgato;
  Piguanas = iguanas * Piguana;
  Pcocodrilos = cocodrilos * Pcocodrilo;
  Paves = aves * Pave;
  Arca = Pperros + Pgatos + Piguanas + Pcocodrilos + Paves;

  cout << "El peso del arca es: " << Arca << endl;
  


  return 0;
  
      
}