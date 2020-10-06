# Operacion Quasar

###Desafío

Como jefe de comunicaciones rebelde, tu misión es crear un programa en Golang que retorne
la fuente y contenido del mensaje de auxilio. Para esto, cuentas con tres satélites que te
permitirán triangular l a posición, ¡pero cuidado! el mensaje puede no l legar completo a cada
satélite debido al campo de asteroides frente a la nave.
Posición de los satélites actualmente en servicio

- Kenobi: [-500, -200]
- Skywalker: [100, -100]
- Sato: [500, 100]

### Nivel 1 

Se utiliza el método matemático trilateración para realizar la geolocalización de la nave en cuestión.
Elcódigo se obtiene de la aplicación del concepto de tres puntos en un plano 2D.
En el caso del mensaje se superpone los mensajes tratandolos con arreglos y realizando una comparación de las posiciones.

###Nivel 2

En este nivel se generan servicios Rest que se publican en ContextRoot /top_secret/ al cual se enviaran collecciones JSON que definirán la distancia y el mensaje hacia los diferentes satelites para determinar la posición de la nave que envía el mesnsaje.

###Nivel 3

No completado
