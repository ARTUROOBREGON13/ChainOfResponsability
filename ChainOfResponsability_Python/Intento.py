""" Cadena de Responsabilidad: Permite establecer una Cadena de objetos receptores a través de los cuales se pasa una petición
"""

class ManejadorNomina:
    # Define un método para tratar las peticiones, Implementa el enlace al sucesor
    def __init__(self, opc):
        self.__opc=opc;
    def ManejadorNominaPeticion(self):
        ManejadorPlanta(opc).ManejadorNominaPeticion()

class ManejadorPlanta(ManejadorNomina):
    # Trata la petición de la cual es responsable
    def __init__(self, opc):
        self.__opc=opc;
    def ManejadorNominaPeticion(self):
        # Si puede manejar la petición, lo hace, en caso contrario la reenvía a su sucesor.
        if(opc==1):
            print("Este manejador de nomina en la liquidación para docentes de Planta")
        else:
            ManejadorCatedra(opc).ManejadorNominaPeticion()

class ManejadorCatedra(ManejadorNomina):
    def __init__(self, opc):
        self.__opc=opc;
    def ManejadorNominaPeticion(self):
        if(opc==2):
            print("Este manejador de nomina en la liquidación para docentes de Catedra")
        else:
            #ManejadorDefault(opc).ManejadorNominaPeticion()
            ManejadorPrueba(opc).ManejadorNominaPeticion()

class ManejadorPrueba(ManejadorNomina):
    def __init__(self, opc):
        self.__opc=opc;
    def ManejadorNominaPeticion(self):
        if(opc==3):
            print("Este manejador fue adicionado después, como prueba.")
        else:
            ManejadorDefault(opc).ManejadorNominaPeticion()

class ManejadorDefault(ManejadorNomina):
    def __init__(self, opc):
        self.__opc=opc;
    def ManejadorNominaPeticion(self):
        print("Este manejador de nomina en la liquidación para otros docentes ")


# Cliente: Inicializa la petición, Conoce a un manejador que es el que lanza la petición a la cadena hasta que alguien la recoge.
print("Ingrese un número para indicar el manejador de la nomina para un tipo de Docente")

try:
    opc=int(input())
    ManejadorNomina(opc).ManejadorNominaPeticion()
except:
    print("Por favor ingrese un valor valido")
