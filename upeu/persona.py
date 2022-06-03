class persona:
    nombre:str
    genero:str
    ocupacion:str

    def __init__(self):
        pass
    def __init__(self,nombre):
        self.nombre=obtenerNombre

    def __init__(self,nombre,genero,ocupacion):
        self.nombre=nombre
        self.genero=genero
        self.ocupacion=ocupacion

    def obtenerNombre(self):
        return self.nombre
    def obtenerGenero(self):
        return self.genero
    def obtenerOcupacion(self):
         return self.ocupacion


    def modifiacarNombre(self,nombre):
        self.nombre=nombre
    def modifiacarGenero(self,nombre):
        self.genero=genero
    def modifiacarOcupacion(self,nombre):
        self.ocupacion=ocupacion





    def obtenerNombre(self):
        return self.nombre
    def obtenerGenero(self):
        return self.genero
    def obtenerOcupacion(self):
        return self.ocupacion
    def modifiacarNombre(self, nombre):
        self.nombre=nombre
    def modifiacarGenero(self,genero):
        self.genero=genero
    def modifiacarOcupacion(self,ocupacion):
        self.ocupacion=ocupacion

myobj=persona("persona","M", "ing.civil")
print(myobj.obtenerNombre())
print(myobj.obtenerGenero())
print(myobj.obtenerOcupacion())

'''myobj=persona()
myobj.nombre="David"
print(myobj.nombre)
myobj .modifiacarNombre("Raul")
print(myobj.nombre)
print(myobj.obtenerNombre())
'''


    