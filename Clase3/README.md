# Diagrama UML

Este diagrama UML esta orientado a explicar las relaciones entre los personajes, jugadores, enemigos, ataques y el gameManager.

## Personaje

| Atributo/Metodo | Tipo   | Descripcion                                        |
| --------------- | ------ | -------------------------------------------------- |
| nombre          | string | Es el nombre asignado al personaje                 |
| vida            | int    | Es la cantidad de vida restante del personaje      |
| mana            | int    | Es la cantidad de mana restante del personaje      |
| movimiento      |        | Es la funcionalidad para mover un personaje        |
| ataque          | ataque | Es la funcionalidad para atacar con un personaje   |
| bloqueo         |        | Es la funcionalidad para bloquear con un personaje |

## Jugadores

| Atributo/Metodo | Tipo   | Descripcion                          |
| --------------- | ------ | ------------------------------------ |
| inputDetector   | string | Es el dato que recibe desde el input |
| handleInput     | input  | Es la forma de controlar los inputs  |

## Enemigos

| Atributo/Metodo | Tipo   | Descripcion                               |
| --------------- | ------ | ----------------------------------------- |
| iaControlador   | string | Es el dato que envia la id desde el input |
| handleInput     | input  | Es la forma de controlar los inputs       |

## Ataques

| Atributo/Metodo | Tipo   | Descripcion                        |
| --------------- | ------ | ---------------------------------- |
| nombre          | string | Es el nombre relacionado al ataque |
| daño            | int    | Es el daño que da cada ataque      |
| tipo            | string | Es el tipo de cada ataque          |
| ejecutar        |        | Es la forma de utilizar el ataque  |

## GameManager

| Atributo/Metodo | Tipo      | Descripcion                                        |
| --------------- | --------- | -------------------------------------------------- |
| roundActual     | int       | Es el numero del round actual del combate          |
| jugador1        | personaje | Es la forma de manejar datos generales del jugador |
| jugador2        | personaje | Es la forma de manejar datos generales del jugador |
| iniciarJuego    |           | Es la forma en que arranca el juego                |
| actualizarJuego |           | Es la forma en que se actualiza el juego           |
