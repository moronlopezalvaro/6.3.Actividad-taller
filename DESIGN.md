```mermaid
classDiagram
    class Especialista {
        <<interface>>
        +reparar(Reparacion r) void
    }

    class Mecanico {
        -String nombre
        +reparar(Reparacion r) void
    }

    class Cliente {
        -String nombre
        -List~Vehiculo~ vehiculos
    }

    class Vehiculo {
        <<abstract>>
        #String matricula
        #String modelo
        #List~Reparacion~ historial
    }

    class Coche {
        -int numPuertas
    }

    class Moto {
        -boolean tieneSidecar
    }

    class Reparacion {
        -String descripcion
        -double coste
    }

    class Taller {
        -String nombre
        +asignarReparacion(Vehiculo v, Reparacion r) void
    }

    %% Realización
    Especialista <|.. Mecanico : Implementa

    %% Herencia
    Vehiculo <|-- Coche : Herencia
    Vehiculo <|-- Moto : Herencia

    %% Asociación Cliente → Vehiculo
    Cliente "1" --> "1..*" Vehiculo : posee

    %% Composición Vehiculo → Reparacion
    Vehiculo "1" *-- "0..*" Reparacion : historial

    %% Dependencia Taller → Mecanico
    Taller ..> Mecanico : usa
    ```