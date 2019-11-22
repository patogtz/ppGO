class Memory:
    def __init__(self, startAddress):
        self.memoryInt = 0 + startAddress
        self.memoryFloat = 1000 + startAddress
        self.memoryString = 2000 + startAddress
        self.memoryBool = 3000 + startAddress
        self.startAddress = startAddress
        self.memoryContent = {}

    def eraseMemory(self):
        self.memoryInt = 0 + self.startAddress
        self.memoryFloat = 1000 + self.startAddress
        self.memoryString = 2000 + self.startAddress
        self.memoryBool = 3000 + self.startAddress
        self.memoryContent.clear()

    def addToMemory(self, type):
            if (type == "int"):
                currentMemoryInt = self.memoryInt
                self.memoryInt += 1
                self.memoryContent[currentMemoryInt] = "VALOR DE VARIABLE int"
                return currentMemoryInt
            elif (type == "float"):
                currentMemoryFloat= self.memoryFloat
                self.memoryContent[currentMemoryFloat] = "VALOR DE VARIABLE float"
                self.memoryFloat += 1
                return currentMemoryFloat
            elif (type == "string"):
                currentMemoryString = self.memoryString
                self.memoryContent[currentMemoryString] = "VALOR DE VARIABLE sttring"
                self.memoryString += 1
                return currentMemoryString
            else:
                currentMemoryBool = self.memoryBool
                self.memoryContent[currentMemoryBool] = "VALOR DE VARIABLE bool"
                self.memoryBool += 1
                return currentMemoryBool
        
    def writeMemory(self, memorySpace, content):
        self.memoryContent[memorySpace] = content

            


        



    