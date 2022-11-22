# Martes 22/11/2022 Quinta clase

## Compilador
Sintaxis - Codigo bien escrito, palabras reservadas

Semantico - Sentido de lo que se escribe

## Métodos 
- retornan valor "funcion"
- no retorna valor "procedimiento"

---

## Forma archivo
- Archivo: Hola.java
- public class "Nombre del archivo".
- estandar codif: camelcase 

nombreCompletoApellido   nombre_Completo

```
public class Hola {
    public static void main(String[] args) {
        String nombre; <-----Declaracion
        nombre = "gabo";  <----- inicializacion
        System.out.println("Hello " + "nombre");
    }
}
```
- () --> parametros
- "  " --> variables (Tipo de dato);
  Propiedades < Ambito > < tipo de chats.> < nombreVariable >
- main --> Donde empieza la ejecucion
- void --> No retorna valores
- static --> Este bloque de codigo esta fijo
- public --> Todas las personas pueden ver lo que se hace

### Deber: Revisar tipos de datos orginarios y por creacion de objetos. EJ. String, Integer, int,.. etc.

## Nombrar variable
Siempre al inicio
1. Std. camelcase
2. nombre asociado
3. declaracion (decirle al programa que eres) , inicializacion

## Parametro
Son obligatorios y aveces no 
deben tener "tipo de dato" + "nombre"
public static void main (**String argumento**)

