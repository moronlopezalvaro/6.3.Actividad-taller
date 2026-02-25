# ¿Por qué uso composición entre Vehículo y Reparación?
He usado composición porque una reparación no tiene sentido por sí sola, solo existe porque está asociada a un vehículo.

Esto significa que:
    - Una reparación no puede existir de manera independiente.
    - Su vida depende totalmente del vehículo.
    - Si el vehículo se elimina del sistema, todas sus reparaciones deben desaparecer.

# Ventajas de usar la interfaz Especialista
La interfaz Especialista permite definir el comportamiento “reparar” sin depender de cómo se implementa. Esto aporta varias ventajas:

Desacopla el Taller del tipo concreto de especialista que repara, es decir, el taller solo sabe que alguien es capaz de reparar, no quién es ni cómo lo hace.

Permite usar diferentes tipos de especialistas sin cambiar el código:
    - un mecánico
    - un robot
    - un servicio externo
    - cualquier otro que implemente la interfaz

Facilita las pruebas del programa, porque podemos crear especialistas falsos para testear sin usar un mecánico real.