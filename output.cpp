#include <iostream>
using namespace std;

int main() {
string nombre ;
int x ;
int i ;
bool y = false ;
string xd ;
xd="holam";cout << "Programa Ejemplo" << endl;
for (i = 0; i <= 10; i = i + 1) {
cout << "Hola Mundo número: " << i << endl;
}
cout << "Dame tu nombre" << endl;
cin >> nombre;
cout << "Cuántas veces quieres que se imprima?" << endl;
cin >> x;
for (i = 0; i < x; i = i + 1) {
cout << nombre << " " << i << endl;
}
    return 0;
}
