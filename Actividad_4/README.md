# Actividad 4

Matricula: al03027216
Seed: EW2X7KR


Se construyo un Árbol Binario de Búsqueda, que era capaz de eliminar nodos con 3 casos principales de remoción: hoja, un solo hijo y dos hijos.
El caso de dos hijos se resolvía encontrando el nodo sucesor inorden (mínimo del subárbol derecho) y reemplazándolo con ese valor, y luego eliminando el sucesor inorden.
Además se implementaron los métodos de recorrido Inorden, Preorden y Postorden.

En el archivo main, se ejecutaro las instrucciones dictadas para el correcto funcionamiento del programa y se obtuvieron los siguientes resultados:

Inorden: 3,13,16,24,25,28,43,45,47,49,53,55,57,61,65,69,73,78,85,93,96,99,100
Preorden: 45,25,16,13,3,24,43,28,49,47,53,65,61,55,57,78,69,73,96,85,93,99,100
Postorden: 3,13,24,16,28,43,25,47,57,55,61,73,69,93,85,100,99,96,78,65,53,49,45

Inorden: 13,16,24,28,45,47,49,53,55,57,61,65,69,73,78,85,93,96,99,100
Preorden: 45,28,16,13,24,49,47,53,65,61,55,57,78,69,73,96,85,93,99,100
Postorden: 13,24,16,28,47,57,55,61,73,69,93,85,100,99,96,78,65,53,49,45

Lost arboles binarios son utiles para mantener la estructura de largos conjuntos de datos donde se busca mantener un orden y acceso rapido a los datos.