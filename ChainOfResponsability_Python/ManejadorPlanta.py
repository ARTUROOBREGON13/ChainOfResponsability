import Manejador

class ManejadorPlanta(Manejador):
    def __init__(self, objManejador):
        self.sucesor=objManejador

    # Abstract
    def operacionManejador(self, opc):
        if opc==2:
            print("Este es el manejador de Planta")
        else:
            sucesor.operacionManejador()
