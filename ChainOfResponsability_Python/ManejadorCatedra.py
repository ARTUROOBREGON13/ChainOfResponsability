import Manejador

class ManejadorCatedra(Manejador):
    def __init__(self, sucesor):
        self.sucesor=sucesor

    # Abstract
    def operacionManejador(self, opc):
        if opc==1:
            print("Este es el manejador de catedra")
        else:
            sucesor.operacionManejador()
