class Manejador():
    def __init__(self, opc):
        self.sucesor = Manejador()
        self.opc=opc

    # Abstract
    def operacionManejador(self):
        return None

    def getSucesor(self):
        return self.sucesor

    def setSucesor(self, sucesor):
        self.sucesor=sucesor
