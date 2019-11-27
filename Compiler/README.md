# Manual de usuario
## Template
todo programa hecho con ppGO debe de comenzar con:

```
program Ejemplo:
```
seguido de la funcion principal, donde se ejecutarán las instrucciones.
ejemplo de función principal:

```
func main(){

}
```

ejemplo de "Hola mundo!"
```
programa HolaMundo:

func main(){
  print("Hola mundo!")
}
```

## Declaración de variables
En ppGO existen cuatro tipos de variables:
- Int
- Float
- Bool
- String

las variables se declaran especificando el tipo de dato que va a almacenar seguido del nombre de la variable. Si se van a
declarar mas de una variable del mismo tipo, estas se pueden declarar sobre la misma linea usando una coma (,).

```
func main(){
float f1
int i1, i2, i3, i4
}
```

es importante saber que no puede haber mas de una variable con el mismo nombre, además de que este no puede comenzar con un numero.

## Asignación de variables
Se les puede asignar un valor a una variable SIEMPRE Y CUANDO la variable esté declarada y los tipos de datos coincidan.
Al asignarle un dato a una variable, la linea de código debe de terminar con ";".
Ejemplo:
```
int a
a = 5;
```
Tambien se pueden usar expresiones como valor a asignar.
```
int a
a = (4*8)+5;
```
incluso se pueden usar los datos almacenados en variables, siempre y cuando ésta variable esté declarada y ya cuente con un valor
asignado, de otra forma, el programa no compilará.
```
int a, b
b = 16;
a = 16 + 4;
print(a)
```
el resultado de imprimir "a" es 20.

##Declaración de funciones
en ppGO es posible crear funciones con parametrización opcional. Estas deben de ser declaradas antes de la funcion main() en el
programa. Se les puede especificar un tipo si es que se desea que la función retorne un valor:
```
int func uno(int a, intb){
int c
c = a + b;
return c
}
```
o también se puede no especificar un tipo de dato, haciendo que la función sea void automáticamente para que la función no retorne
ningún valor.
```
func dos(int x){

}
```
Para usar las funciones, simplemente se les debe de llamar desde el programa main, siempre y cuando la función esté declarada
y se le pase la cantidad correcta de parámetros.
```
int func uno(int a, int b){
  int c
  c = a + b;
  return c
}
func main(){
  int x, y
  x = 5;
  y = 20;
  uno(x, y)
}
```
## Variables globales
en ppGO también existen las variables globales, que son como cualquier otra variable, solo que éstas pueden ser usadas por todas
las funciones. Simplemente se deben de declarar antes de la primera función en el programa.
## Funciones especiales
ppGO cuenta con una extensa cantidad de funciones especiales para arreglos, matrices y algunas para coordenadas.
```
length(arr): imprime la capacidad del arreglo.
sort(arr): imprime el arreglo con los valores de las casillas ordenados de menor a mayor.
find(arr,x): imprime el índice de donde se encuentra x si es que existe dentro del arreglo.
midpoint(x1,x2,y1,y2): imprime la tupla del punto medio de las 2 coordenadas como parametros.
distance(x1,x2,y1,y2): imprime la distancia entre 2 puntos.
power(x,y): regresa el valor de un numero x elevado a la potencia y.
sqrt(x): regresa el valor de la raíz cuadrada de x.
trans(mat): imprime la matriz transversa de una matriz pasada como arreglo.
matmul(mat1,mat2): imprime la matriz resultante de la multiplicación entre la matriz 1 y 2 pasadas como parámetros.
matsum(mat1,mat2): imprime la matriz resultante de la suma entre la matriz 1 y 2 pasadas como parámetros.
matsubs(mat1,mat2): imprime la matriz resultante de la suma entre la matriz 1 y 2 pasadas como parámetros.
matSin(mat): imprime los senos de los valores en las casillas de la matriz pasada como parámetro.
matCos(mat): imprime los cosenos de los valores en las casillas de la matriz pasada como parámetro.
inverse(mat): imprime la matriz inversa resultante de la matriz pasada como parámetro.
```
