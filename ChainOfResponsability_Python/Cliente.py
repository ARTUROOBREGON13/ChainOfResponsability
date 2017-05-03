import ManejadorPlanta, ManejadorCatedra


opc=0
objManejador=ManejadorDefault()
objManejadorPlanta=ManejadorPlanta(objManejador)
objManejadorCatedra=ManejadorCatedra(objManejadorPlanta)


print("Ingrese un entero")
opc=int(input())
objManejadorCatedra=ManejadorCatedra()
objManejadorCatedra.operacionManejador(opc)
