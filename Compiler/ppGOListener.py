# Generated from ppGO.g4 by ANTLR 4.7.2
from Memory import Memory
from antlr4 import *
import re
if __name__ is not None and "." in __name__:
    from .ppGOParser import ppGOParser
else:
    from ppGOParser import ppGOParser
from semanticCube import cuboSemantico
import sys
# This class defines a complete listener for a parse tree produced by ppGOParser.


class ppGOListener(ParseTreeListener):
    def __init__(self):
        self.funcName = "global"
        self.symbolTable = {"global": []}
        self.functionTable = []
        self.cosntantTable = []
        self.tempTable = {}
        self.expressionParent = []
        self.elseExists = []
        self.elifExists = []
        self.globalMemory = Memory(0)
        self.localMemory = Memory(4000)
        self.constantMemory = Memory(8000)
        self.temporalMemory = Memory(12000)
        # Pila de operaciones para generar cuadruplo
        self.pOper = []
        # Pila de operadores para generar cuadruplo
        self.pilaOper = []
        # Pila de saltos para llenar los GoTos de los cuadruplos
        self.pilaSaltos = []
        self.cuadruplos = []
        self.temps = 1
    # Enter a parse tree produced by ppGOParser#program.

    def enterProgram(self, ctx: ppGOParser.ProgramContext):
        self.cuadruplos.append(["goto","main","",""])
        pass

    # Exit a parse tree produced by ppGOParser#program.
    def exitProgram(self, ctx: ppGOParser.ProgramContext):
        i = 0
        for c in self.cuadruplos:
            print(i, " ", *c)
            i+=1
       
    # Enter a parse tree produced by ppGOParser#main.
    def enterMain(self, ctx: ppGOParser.MainContext):

        self.temps = 1
        self.funcName = "main"
        self.tempTable[self.funcName] = []
        self.functionTable.append({"name": "main", "type": "void",  "numberOfArguments":0, "arguments":[]})
        pass

    # Exit a parse tree produced by ppGOParser#main.
    def exitMain(self, ctx: ppGOParser.MainContext):
        self.cuadruplos.append(["END","","",""])
        pass

    # Enter a parse tree produced by ppGOParser#modulo.
    def enterModulo(self, ctx: ppGOParser.ModuloContext):
        self.temps = 1
        # Get function name for the symbols table
        arguments = ctx.args().getText().split(',')
        if arguments[0] == '': numArguments = 0
        else: numArguments = len(arguments)
        if str(ctx.getChild(1)) == "func":
            self.funcName = str(ctx.getChild(2))
            self.functionTable.append(
                {"name": self.funcName, "type": str(ctx.getChild(0)), "numberOfArguments": numArguments, "arguments": arguments})
        else:
            self.funcName = str(ctx.getChild(1))
            self.functionTable.append({"name": self.funcName, "type": "void", "numberOfArguments": numArguments, "arguments": arguments})
        self.tempTable[self.funcName] = []
        self.localMemory.eraseMemory()

    # Exit a parse tree produced by ppGOParser#modulo.
    def exitModulo(self, ctx: ppGOParser.ModuloContext):
        self.cuadruplos.append(["endproc","","",""])
        self.localMemory.eraseMemory()

    # Enter a parse tree produced by ppGOParser#tipo.
    def enterTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Exit a parse tree produced by ppGOParser#tipo.
    def exitTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Enter a parse tree produced by ppGOParser#args.
    def enterArgs(self, ctx: ppGOParser.ArgsContext):
        x = ctx.getText().split(',')
        count = 0
        for i in x:
            if(ctx.tipo()[count].getText() == "int"): memoriaTabla = self.localMemory.addToMemory("int")
            elif(ctx.tipo()[count].getText() == "float"): memoriaTabla = self.localMemory.addToMemory("float")
            elif(ctx.tipo()[count].getText() == "string"): memoriaTabla = self.localMemory.addToMemory("string")
            elif(ctx.tipo()[count].getText() == "bool"): memoriaTabla = self.localMemory.addToMemory("bool")
            if count == 0:
                self.symbolTable[self.funcName] = [{"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": False}]
            else:
                self.symbolTable[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": False})


            count+=1

    # Exit a parse tree produced by ppGOParser#args.
    def exitArgs(self, ctx: ppGOParser.ArgsContext):
        pass

    # Enter a parse tree produced by ppGOParser#body.
    def enterBody(self, ctx: ppGOParser.BodyContext):
        pass

    # Exit a parse tree produced by ppGOParser#body.
    def exitBody(self, ctx: ppGOParser.BodyContext):
        pass

    # Enter a parse tree produced by ppGOParser#block.
    def enterBlock(self, ctx: ppGOParser.BlockContext):
        pass

    # Exit a parse tree produced by ppGOParser#block.
    def exitBlock(self, ctx: ppGOParser.BlockContext):
        #Llena los gotof del if
        if not self.expressionParent: pass
        elif self.expressionParent[len(self.expressionParent)-1] == "if":
            #Sacas punto donde se encuentra el GotoF del if
            fJump = self.pilaSaltos.pop()
            if(self.elifExists[-1] or self.elseExists):
                #Sacas punto donde se encuentra el GotoF del if
                self.cuadruplos.append(["Goto","", "", "placeholder"])
                self.cuadruplos[fJump][3] = len(self.cuadruplos)
                self.pilaSaltos.append(len(self.cuadruplos) - 1)
            else:
                self.cuadruplos[fJump][3] = len(self.cuadruplos)
            self.expressionParent.pop()
        #Llena los gotof del elseif
        elif self.expressionParent[len(self.expressionParent)-1]  == "elseif":
            self.elifExists[-1].pop()
            fJump = self.pilaSaltos.pop()
            
            if(self.elifExists[-1] or self.elseExists):
                #Sacas punto donde se encuentra el GotoF del if
                self.cuadruplos.append(["Goto","", "", "placeholder"])
                self.cuadruplos[fJump][3] = len(self.cuadruplos)
                self.pilaSaltos.append(len(self.cuadruplos) - 1)
            else:
                self.cuadruplos[fJump][3] = len(self.cuadruplos)
            self.expressionParent.pop()
        elif(self.expressionParent[len(self.expressionParent)-1]  == "loop"):
            pass
            

    # Enter a parse tree produced by ppGOParser#varsDec.
    def enterVarsDec(self, ctx: ppGOParser.VarsDecContext):
        """  if(self.dirMemoriaInt > 999):
            return "Error: Int Memory Exceeded"
        if(self.dirMemoriaFloat > 1999):
            return "Error: Float Memory Exceeded"
        if(self.dirMemoriaString > 2999):
            return "Error: String Memory Exceeded"
        if(self.dirMemoriaBool > 3999):
            return "Error: Bool Memory Exceeded" """
        name = ""
        currentKeyValue = []
        key = str(self.funcName)
        if key in self.symbolTable.keys():
            currentKeyValue = self.symbolTable[key]
        type = ctx.getText()[:3]
        if self.funcName == "global":
            scope = "g"
        else:
            scope = "l"
        #Agrega las variables int a la tabla de variables
        if(type == "int"):
            #Detecta si estan en la misma linea
            if(',' in ctx.getText()):
                vars = ctx.getText()[3:].split(',')
                #Mete cada variable de la linea a la tabla
                for x in vars:
                    #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                    if  self.funcName in self.symbolTable:
                        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                        varExist = x in d
                        if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("int")
                        currentKeyValue.append(
                            {"name": x, "type": "int", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
                    else:
                        memoriaTabla = self.localMemory.addToMemory("int")
                        currentKeyValue.append(
                            {"name": x, "type": "int", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
            #En caso de que solo haya una variable en la linea
            else:
                #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                if  self.funcName in self.symbolTable:
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = ctx.getText()[3:] in d
                    if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("int")
                    name = ctx.getText()[3:]
                    currentKeyValue.append(
                        {"name": name, "type": "int", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
                else:
                    memoriaTabla = self.localMemory.addToMemory("int")
                    name = ctx.getText()[3:]
                    currentKeyValue.append(
                        {"name": name, "type": "int", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
        #Agrega las variables float a la tabla de variables
        elif (type == "flo"):
            #Detecta si estan en la misma linea
            if (',' in ctx.getText()):
                vars = ctx.getText()[5:].split(',')
                #Mete cada variable a tabla 
                for x in vars:
                    #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                    if  self.funcName in self.symbolTable:
                        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                        varExist = x in d
                        if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("float")
                        currentKeyValue.append(
                            {"name": x, "type": "float", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
                    else:
                        memoriaTabla = self.localMemory.addToMemory("float")
                        currentKeyValue.append(
                            {"name": x, "type": "float", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
            #Si hay una variable en la fila
            else:
                #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                if  self.funcName in self.symbolTable:
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = ctx.getText()[5:] in d
                    if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("float")
                    currentKeyValue.append({"name": str(
                        ctx.getText()[5:]), "type": "float", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
                else:
                    memoriaTabla = self.localMemory.addToMemory("float")
                    currentKeyValue.append({"name": str(
                        ctx.getText()[5:]), "type": "float", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
        elif (type == "boo"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[4:].split(',')
                for x in vars:
                    #Valida que no exista esa variable en la tabla de variables
                    if  self.funcName in self.symbolTable:
                        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                        varExist = x in d
                        if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("bool")
                        currentKeyValue.append(
                            {"name": x, "type": "bool", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
                    else:
                        memoriaTabla = self.localMemory.addToMemory("bool")
                        currentKeyValue.append(
                            {"name": x, "type": "bool", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
            else:
                #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                if  self.funcName in self.symbolTable:
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = ctx.getText()[4:] in d
                    if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("bool")
                    currentKeyValue.append({"name": str(
                        ctx.getText()[4:]), "type": "bool", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
                else:
                    memoriaTabla = self.localMemory.addToMemory("bool")
                    currentKeyValue.append({"name": str(
                        ctx.getText()[4:]), "type": "bool", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
        elif (type == "str"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[6:].split(',')
                for x in vars:
                    #Valida que no exista esa variable en la tabla de variables
                    if  self.funcName in self.symbolTable:
                        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                        varExist = x in d
                        if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("string")
                        currentKeyValue.append(
                            {"name": x, "type": "string", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
                    else:
                        memoriaTabla = self.localMemory.addToMemory("string")
                        currentKeyValue.append(
                            {"name": x, "type": "string", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                        self.symbolTable[self.funcName] = currentKeyValue
            else:
                 #Checa si ya existe la variable en el scope, en caso de que si regresa un error
                if  self.funcName in self.symbolTable:
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = ctx.getText()[6:] in d
                    if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("string")
                    currentKeyValue.append({"name": str(ctx.getText()[
                                           6:]), "type": "string", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
                else:
                    memoriaTabla = self.localMemory.addToMemory("string")
                    currentKeyValue.append({"name": str(ctx.getText()[
                                           6:]), "type": "string", "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                    self.symbolTable[self.funcName] = currentKeyValue
    # Exit a parse tree produced by ppGOParser#varsDec.

    def exitVarsDec(self, ctx: ppGOParser.VarsDecContext):
        pass

    # Enter a parse tree produced by ppGOParser#assigment.
    def enterAssigment(self, ctx: ppGOParser.AssigmentContext):
        pass
    # Exit a parse tree produced by ppGOParser#assigment.
    def exitAssigment(self, ctx: ppGOParser.AssigmentContext):
        assig = ctx.getText()[:-1]
        splitAssig = [
        ]
        # Split the assigment in to tokenns.
        splitAssig = re.split("([-/(*=+)])", assig)
        # Remove random "" generated by the split
        while "" in splitAssig:
            splitAssig.remove("")
        #Checa si existe la variable
        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
        varExist = splitAssig[0] in d
        if not varExist: sys.exit("Error: Can't assign a value to a variable that doesn't exist!")
        # Appends the first element of the new splitted list to pilaOper
        assignedVar =  splitAssig[0]
        self.pilaOper.append(splitAssig[0])
        del splitAssig[0]
        for i in range(len(splitAssig)):
            x = splitAssig[i]
            if(x == "=" or x == "+" or x == "-" or x == "*" or x == "/" or x == "("):
                self.pOper.append(x)
            elif x == ")":
                while self.pOper[-1] != "(":
                    temporal = "t" + str(self.temps)
                    operador = self.pOper.pop()
                    operandoDer = self.pilaOper.pop()
                    operandoIzq = self.pilaOper.pop()
                    tipoOperDer = self.checkOperand(operandoDer)
                    tipoOperIzq = self.checkOperand(operandoIzq)
                    tipoTemporal = cuboSemantico().cube[tipoOperIzq][operador][tipoOperDer]
                    if tipoTemporal[0:5] == "Error": sys.exit(tipoTemporal)
                    """ self.cuadruplos.append(
                        [operador, operandoIzq , operandoDer, temporal]) """


                    
                    memory = self.temporalMemory.addToMemory(tipoTemporal)
                    self.tempTable[self.funcName].append({"name": temporal, "memory": memory, "type" : tipoTemporal})
                    memoryOperDer = self.getMemoryAddress(operandoDer)
                    memoryOperIzq = self.getMemoryAddress(operandoIzq)
                    memoryTemp = self.getMemoryAddress(temporal)
                    self.cuadruplos.append([operador, memoryOperIzq , memoryOperDer, memoryTemp])
                    self.pilaOper.append(temporal)
                    self.temps = self.temps + 1
                del self.pOper[-1]
            else: 
                self.checkIfVariable(x)               
                self.pilaOper.append(x)
                if i + 1 < len(splitAssig):
                    nxt = splitAssig[i + 1]
                    if not self.pOper:
                        pass
                    else:
                        if self.pOper[len(self.pOper) - 1] == "=":
                            if (nxt == "+" or nxt == "-" or nxt == "*" or nxt == "/"):
                                pass
                            else:
                                operador = self.pOper.pop()
                                operandoIzq = self.pilaOper.pop()
                                tipoOperIzq = self.checkOperand(operandoIzq)
                                resultado = self.pilaOper.pop()
                                tipoRes = self.checkOperand(resultado)
                                if tipoRes != tipoOperIzq: sys.exit("Error: The types do not match when making an assignation in: "+ self.funcName + "!" + ctx.getText())
                                """ self.cuadruplos.append(
                                    [operador, operandoIzq, " ", resultado]) """


                                memoryOperIzq = self.getMemoryAddress(operandoIzq)
                                memoryTemp = self.getMemoryAddress(temporal)
                                self.cuadruplos.append([operador, memoryOperIzq , "", memoryTemp])

                        if (self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "-"):
                            if (nxt == "*" or x == "/"):
                                pass
                            else:
                                temporal = "t" + str(self.temps)
                                operador = self.pOper.pop()
                                operandoDer = self.pilaOper.pop()
                                operandoIzq = self.pilaOper.pop()
                                tipoOperDer = self.checkOperand(operandoDer)
                                tipoOperIzq = self.checkOperand(operandoIzq)
                                tipoTemporal = cuboSemantico().cube[tipoOperIzq][operador][tipoOperDer]
                                if tipoTemporal[0:5] == "Error": sys.exit(tipoTemporal)
                                """ self.cuadruplos.append([operador, operandoIzq , operandoDer, temporal]) """
                                
                                
                                

                                memory = self.temporalMemory.addToMemory(tipoTemporal)
                                self.tempTable[self.funcName].append({"name": temporal, "memory": memory, "type" : tipoTemporal})
                                memoryOperDer = self.getMemoryAddress(operandoDer)
                                memoryOperIzq = self.getMemoryAddress(operandoIzq)
                                memoryTemp = self.getMemoryAddress(temporal)
                                self.cuadruplos.append([operador, memoryOperIzq , memoryOperDer, memoryTemp])
                                self.pilaOper.append(temporal)
                                self.temps = self.temps + 1
                        if (self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/"):
                            temporal = "t" + str(self.temps)
                            operador = self.pOper.pop()
                            operandoDer = self.pilaOper.pop()
                            operandoIzq = self.pilaOper.pop()
                            tipoOperDer = self.checkOperand(operandoDer)
                            tipoOperIzq = self.checkOperand(operandoIzq)
                            tipoTemporal = cuboSemantico().cube[tipoOperIzq][operador][tipoOperDer]
                            if tipoTemporal[0:5] == "Error": sys.exit(tipoTemporal)
                            """ self.cuadruplos.append([operador, operandoIzq , operandoDer, temporal]) """

                           

                            memory = self.temporalMemory.addToMemory(tipoTemporal)
                            self.tempTable[self.funcName].append({"name": temporal, "memory": memory, "type" : tipoTemporal})
                            memoryOperDer = self.getMemoryAddress(operandoDer)
                            memoryOperIzq = self.getMemoryAddress(operandoIzq)
                            memoryTemp = self.getMemoryAddress(temporal)
                            self.cuadruplos.append([operador, memoryOperIzq , memoryOperDer, memoryTemp])
                            self.pilaOper.append(temporal)
                            self.temps = self.temps + 1
                else:
                    while self.pilaOper:
                        if self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/" or self.pOper[len(self.pOper) - 1] == "-":
                            temporal = "t" + str(self.temps)
                            operador = self.pOper.pop()
                            operandoDer = self.pilaOper.pop()
                            operandoIzq = self.pilaOper.pop()
                            tipoOperDer = self.checkOperand(operandoDer)
                            tipoOperIzq = self.checkOperand(operandoIzq)
                            tipoTemporal = cuboSemantico().cube[tipoOperIzq][operador][tipoOperDer]
                            if tipoTemporal[0:5] == "Error": sys.exit(tipoTemporal)
                            """ self.cuadruplos.append([operador, operandoIzq , operandoDer, temporal]) """

                            

                            memory = self.temporalMemory.addToMemory(tipoTemporal)
                            self.tempTable[self.funcName].append({"name": temporal, "memory": memory, "type" : tipoTemporal})
                            memoryOperDer = self.getMemoryAddress(operandoDer)
                            memoryOperIzq = self.getMemoryAddress(operandoIzq)
                            memoryTemp = self.getMemoryAddress(temporal)
                            self.cuadruplos.append([operador, memoryOperIzq , memoryOperDer, memoryTemp])

                            self.pilaOper.append(temporal)
                            self.temps = self.temps + 1
                        if self.pOper[len(self.pOper) - 1] == "=":
                            operador = self.pOper.pop()
                            operandoIzq = self.pilaOper.pop()
                            tipoOperIzq = self.checkOperand(operandoIzq)
                            resultado = self.pilaOper.pop()
                            tipoRes = self.checkOperand(resultado)
                            print(tipoRes, tipoOperIzq)
                            if tipoRes != tipoOperIzq: sys.exit("Error: The types do not match when making an assignation in: "+ self.funcName + "!"+ ctx.getText())
                            """ self.cuadruplos.append(
                                [operador, operandoIzq, " ", resultado]) """

                            memoryOperIzq = self.getMemoryAddress(operandoIzq)
                            memoryTemp = self.getMemoryAddress(resultado)
                            self.cuadruplos.append([operador, memoryOperIzq , "", memoryTemp])

                            
        while self.pilaOper:
                if self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/" or self.pOper[len(self.pOper) - 1] == "-":
                    temporal = "t" + str(self.temps)
                    operador = self.pOper.pop()
                    operandoDer = self.pilaOper.pop()
                    operandoIzq = self.pilaOper.pop()
                    tipoOperDer = self.checkOperand(operandoDer)
                    tipoOperIzq = self.checkOperand(operandoIzq)
                    tipoTemporal = cuboSemantico().cube[tipoOperIzq][operador][tipoOperDer]
                    if tipoTemporal[0:5] == "Error": sys.exit(tipoTemporal)
                    """ self.cuadruplos.append([operador, operandoIzq , operandoDer, temporal]) """

                    

                    memory = self.temporalMemory.addToMemory(tipoTemporal)
                    self.tempTable[self.funcName].append({"value": temporal, "memory": memory, "type" : tipoTemporal})
                    memoryOperDer = self.getMemoryAddress(operandoDer)
                    memoryOperIzq = self.getMemoryAddress(operandoIzq)
                    memoryTemp = self.getMemoryAddress(resultado)
                    self.cuadruplos.append([operador, memoryOperIzq , memoryOperDer, memoryTemp])
                    self.pilaOper.append(temporal)
                    self.temps = self.temps + 1
                else:
                    operador = self.pOper.pop()
                    operandoIzq = self.pilaOper.pop()
                    tipoOperIzq = self.checkOperand(operandoIzq)
                    resultado = self.pilaOper.pop()
                    tipoRes = self.checkOperand(resultado)
                    if tipoRes != tipoOperIzq: sys.exit("Error: The types do not match when making an assignation in: "+ self.funcName + "!")
                    """ self.cuadruplos.append(
                        [operador, operandoIzq, " ", resultado]) """

                    memoryOperIzq = self.getMemoryAddress(operandoIzq)
                    memoryTemp = self.getMemoryAddress(resultado)
                    self.cuadruplos.append([operador, memoryOperIzq , "", memoryTemp])
        dAux = next(item for item in self.symbolTable[self.funcName] if item['name'] == assignedVar)
        dAux['asignado'] = True
        
        
        self.pilaOper[:] = []
        self.pOper[:] = []


    # Enter a parse tree produced by ppGOParser#condition.

    def enterCondition(self, ctx: ppGOParser.ConditionContext):
        self.expressionParent.append("if")
        self.pilaSaltos.append("(")
        expr = ctx.expression().getText()
        self.elifExists.append(ctx.elseif())
        self.elseExists = ctx.elsee()
        self.getQuadruples(expr)
        self.pilaOper[:] = []
        self.pOper[:] = []


    # Exit a parse tree produced by ppGOParser#condition.
    def exitCondition(self, ctx: ppGOParser.ConditionContext):
        while self.pilaSaltos[-1] != "(":
            salto = self.pilaSaltos.pop()
            self.cuadruplos[salto][3] = len(self.cuadruplos)
        self.pilaSaltos.pop()
        self.elifExists = self.elifExists[:-1]
        
    # Enter a parse tree produced by ppGOParser#elseif.
    def enterElseif(self, ctx: ppGOParser.ElseifContext):
        self.expressionParent.append("elseif")
        expr = ctx.expression().getText()
        self.getQuadruples(expr)
        self.pilaOper[:] = []
        self.pOper[:] = []
        pass

    # Exit a parse tree produced by ppGOParser#elseif.
    def exitElseif(self, ctx: ppGOParser.ElseifContext):
        pass        
    # Enter a parse tree produced by ppGOParser#elsee.
    def enterElsee(self, ctx: ppGOParser.ElseeContext):
        self.expressionParent.append("else")
  

    def exitElsee(self, ctx: ppGOParser.ElseeContext):
        self.expressionParent.pop() 
        pass

    # Enter a parse tree produced by ppGOParser#expression.
    def enterExpression(self, ctx: ppGOParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ppGOParser#expression.
    def exitExpression(self, ctx: ppGOParser.ExpressionContext):
        pass

    # Enter a parse tree produced by ppGOParser#expression1.
    def enterExpression1(self, ctx: ppGOParser.Expression1Context):
        pass

    # Exit a parse tree produced by ppGOParser#expression1.
    def exitExpression1(self, ctx: ppGOParser.Expression1Context):
        pass

    # Enter a parse tree produced by ppGOParser#exp.
    def enterExp(self, ctx: ppGOParser.ExpContext):
        pass

    # Exit a parse tree produced by ppGOParser#exp.
    def exitExp(self, ctx: ppGOParser.ExpContext):
        pass

    # Enter a parse tree produced by ppGOParser#term.
    def enterTerm(self, ctx: ppGOParser.TermContext):
        pass

    # Exit a parse tree produced by ppGOParser#term.
    def exitTerm(self, ctx: ppGOParser.TermContext):
        pass

    # Enter a parse tree produced by ppGOParser#factor.
    def enterFactor(self, ctx: ppGOParser.FactorContext):
        pass

    # Exit a parse tree produced by ppGOParser#factor.
    def exitFactor(self, ctx: ppGOParser.FactorContext):
        pass

    # Enter a parse tree produced by ppGOParser#var_cte.
    def enterVar_cte(self, ctx: ppGOParser.Var_cteContext):
        #Guarda las constantes en la memoria y el valor en la tabla de constantes
        if ctx.VAR_INT():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = int(ctx.getText()) in d
            if not constExist:
                memory = self.constantMemory.addToMemory("int")
                self.cosntantTable.append({"value": int(ctx.getText()), "memory": memory, "type" : "int"})
        elif ctx.VAR_STRING():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = ctx.getText() in d
            if not constExist:
                memory = self.constantMemory.addToMemory("string")
                self.cosntantTable.append({"value": ctx.getText(), "memory": memory, "type" : "string"})
        elif ctx.VAR_FLOAT():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = float(ctx.getText()) in d
            if not constExist:
                memory = self.constantMemory.addToMemory("float")
                self.cosntantTable.append({"value": float(ctx.getText()), "memory": memory, "type" : "float"})
        elif ctx.VAR_BOOL():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = ctx.getText() in d
            if not constExist:
                memory = self.constantMemory.addToMemory("bool")
                self.cosntantTable.append({"value": ctx.getText(), "memory": memory, "type" : "bool"})

    # Exit a parse tree produced by ppGOParser#var_cte.
    def exitVar_cte(self, ctx: ppGOParser.Var_cteContext):
        pass

    # Enter a parse tree produced by ppGOParser#loop.
    def enterLoop(self, ctx: ppGOParser.LoopContext):
        self.expressionParent.append("loop")
        self.pilaSaltos.append(len(self.cuadruplos))
        expr = ctx.expression().getText()
        self.getQuadruples(expr)

    # Exit a parse tree produced by ppGOParser#loop.
    def exitLoop(self, ctx: ppGOParser.LoopContext):
        end = self.pilaSaltos.pop()
        ret = self.pilaSaltos.pop()
        self.cuadruplos.append(
                ["Goto", "", "", ret])
        self.cuadruplos[end][3] = len(self.cuadruplos)
        """ self.pilaSaltos.append(len(self.cuadruplos)) """
        self.expressionParent.pop()

    # Enter a parse tree produced by ppGOParser#funcCall.

    def enterFuncCall(self, ctx: ppGOParser.FuncCallContext):
        self.expressionParent.append("funccall")
        #Append era a los cuadruplos.
        self.cuadruplos.append(["era", "","", ctx.LITERAL()])
        #Checa el numero de parametros en la llamada a funcion y valida con el numero de parametros en la declaracion.
        d = dict((i['name'], i['numberOfArguments']) for i in self.functionTable)
        if d[ctx.LITERAL().getText()] != len(ctx.expression()):
            sys.exit("Error: Diferent number of parameters in the call to the function  '" + ctx.LITERAL().getText() )
        #Por cada parametro en la llamada, appendea los cuadruplos.


        #Para checar que los tipos coincidan (declaracion y llamada)
        """ dAux = dict((i['name'], i['arguments']) for i in self.functionTable)
        for i in dAux[ctx.LITERAL().getText()]:
            print(ctx.LITERAL())
            print(i[0:3]) """




        for i in ctx.expression():
            x = re.split(r'(["AND"]+|["OR"]+|\W+)', i.getText())
            if len(x) > 1: self.getQuadruples(i.getText())
            elif len(x) == 1:
                if x[0] == 'true' or x[0] == 'false': isVariable = False
                else: isVariable = bool(re.match("[a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))*", x[0]))
                if isVariable:
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = x[0] in d
                    if not varExist: sys.exit("Error: Can't use an undeclared variable in as a parameter in the call to the function " +  ctx.LITERAL().getText())
                self.cuadruplos.append(
                                    ["parametros", i.getText(), " ", ""])
    # Exit a parse tree produced by ppGOParser#funcCall.
    def exitFuncCall(self, ctx: ppGOParser.FuncCallContext):
        self.cuadruplos.append(["gosub", "","", ctx.LITERAL()])
        self.expressionParent.pop()
        pass

    # Enter a parse tree produced by ppGOParser#read.
    def enterRead(self, ctx: ppGOParser.ReadContext):
        pass

    # Exit a parse tree produced by ppGOParser#read.
    def exitRead(self, ctx: ppGOParser.ReadContext):
        pass

    # Enter a parse tree produced by ppGOParser#print2.
    def enterPrint2(self, ctx: ppGOParser.Print2Context):
        self.expressionParent.append("print")
        x = re.split(r'(["AND"]+|["OR"]+|\W+)', ctx.expression().getText())
        if len(x) > 1: self.getQuadruples(ctx.expression().getText())
        elif len(x) == 1:  self.cuadruplos.append(
                                    ["print",  ctx.expression().getText(), " ", ""])

    # Exit a parse tree produced by ppGOParser#print2.
    def exitPrint2(self, ctx: ppGOParser.Print2Context):
        self.expressionParent.pop()
        

    # Enter a parse tree produced by ppGOParser#return2.
    def enterReturn2(self, ctx: ppGOParser.Return2Context):
        pass

    # Exit a parse tree produced by ppGOParser#return2.
    def exitReturn2(self, ctx: ppGOParser.Return2Context):
        pass

    def getQuadruples(self, expr):
        splittedExpr = re.split(r'(["AND"]+|["OR"]+|\W+)', expr)
        while "" in splittedExpr:
            splittedExpr.remove("")
        while splittedExpr[0] == "(":
            self.pOper.append(splittedExpr[0])
            del splittedExpr[0]
        #Checa si es una variable
        if splittedExpr[0] == 'true' or splittedExpr[0] == 'false': isVariable = False
        else: isVariable = bool(re.match("[a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))*", splittedExpr[0]))
        if isVariable: 
            #Checa si existe en la table de variables
            print(splittedExpr[0])
            if(not bool(re.match("t[0-9]+", splittedExpr[0]))):
                d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                varExist = splittedExpr[0] in d
                if not varExist: sys.exit("Error: " + splittedExpr[0] +" is undeclared in " + self.funcName  +"!")
                dAux2 = next(item for item in self.symbolTable[self.funcName] if item['name'] == splittedExpr[0])
                #Checa si esta asignada la variable
                if dAux2['asignado'] == False:
                    sys.exit("Error: "+ splittedExpr[0] +" doesn't have a value assigned in "+ self.funcName +"!")
        else:
            #Detecta si la expresion es un string
            if splittedExpr[0] == '"':
                splittedExpr[0:4] = [''.join(splittedExpr[0:4])]
        self.pilaOper.append(splittedExpr[0])
        del splittedExpr[0]
        for i in range(len(splittedExpr)):
            x = splittedExpr[i]
            if(x == "AND" or x == "OR" or x == "<" or x == ">" or x == "<=" or x == ">=" or x == "==" or x == "<>" or x == "+" or x == "-" or x == "*" or x == "/" or x == "("):
                self.pOper.append(x)
            elif x == ")":
                while self.pOper[-1] != "(":
                    temporal = "t" + str(self.temps)
                    operador = self.pOper.pop()
                    operandoDer = self.pilaOper.pop()
                    operandoIzq = self.pilaOper.pop()
                    self.cuadruplos.append(
                        [operador, operandoIzq, operandoDer, temporal])
                    self.pilaOper.append(temporal)
                    self.temps = self.temps + 1
                del self.pOper[-1]
            else:
                self.checkIfVariable(x)
                self.pilaOper.append(x)
                if i + 1 < len(splittedExpr):
                    nxt = splittedExpr[i + 1]
                    if not self.pOper:
                        pass
                    else:
                        if self.pOper[len(self.pOper) - 1] == "==" or self.pOper[len(self.pOper) - 1] == "<>" or self.pOper[len(self.pOper) - 1] == ">=" or self.pOper[len(self.pOper) - 1] == "<=" or self.pOper[len(self.pOper) - 1] == "<" or self.pOper[len(self.pOper) - 1] == ">":
                            if (nxt == "+" or x == "-" or x == "*" or x == "/"):
                                pass
                            else:
                                temporal = "t" + str(self.temps)
                                operador = self.pOper.pop()
                                operandoDer = self.pilaOper.pop()
                                operandoIzq = self.pilaOper.pop()
                                self.cuadruplos.append(
                                    [operador, operandoIzq , operandoDer, temporal])
                                self.pilaOper.append(temporal)
                                self.temps = self.temps + 1
                        elif (self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "-"):
                            if (nxt == "*" or x == "/"):
                                pass
                            else:
                                temporal = "t" + str(self.temps)
                                operador = self.pOper.pop()
                                operandoDer = self.pilaOper.pop()
                                operandoIzq = self.pilaOper.pop()
                                self.cuadruplos.append(
                                    [operador, operandoIzq , operandoDer, temporal])
                                self.pilaOper.append(temporal)
                                self.temps = self.temps + 1
                        elif (self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/"):
                            temporal = "t" + str(self.temps)
                            operador = self.pOper.pop()
                            operandoDer = self.pilaOper.pop()
                            operandoIzq = self.pilaOper.pop()
                            self.cuadruplos.append(
                                [operador, operandoIzq , operandoDer, temporal])
                            self.pilaOper.append(temporal)
                            self.temps = self.temps + 1
                else:
                    while self.pilaOper:
                        if(len(self.pOper) == 0):
                            if self.expressionParent[len(self.expressionParent)-1]  == "loop":
                                self.cuadruplos.append(
                                    ["GotoF", self.pilaOper.pop(), " ", "while"])
                                self.pilaSaltos.append(
                                    len(self.cuadruplos) - 1)
                            elif self.expressionParent[len(self.expressionParent)-1]  == "if" or self.expressionParent[len(self.expressionParent)-1]  == "elseif":
                                self.cuadruplos.append(
                                    ["GotoF", self.pilaOper.pop(), " ", "donde acaba el if/elif"])
                                self.pilaSaltos.append(
                                    len(self.cuadruplos) - 1)
                            elif self.expressionParent[len(self.expressionParent)-1]  == "funccall":
                                self.cuadruplos.append(
                                    ["parametros", self.pilaOper.pop(), "", ""])
                            elif self.expressionParent[len(self.expressionParent)-1]  == "print":
                                self.cuadruplos.append(
                                    ["print", self.pilaOper.pop(), " ", "" ])        
                        else:
                            temporal = "t" + str(self.temps)
                            operador = self.pOper.pop()
                            operandoDer = self.pilaOper.pop()
                            operandoIzq = self.pilaOper.pop()
                            self.cuadruplos.append(
                                [operador, operandoIzq , operandoDer, temporal])
                            self.pilaOper.append(temporal)
                            self.temps = self.temps + 1

    def checkIfVariable(self, x):
        #Checa si es una variable
            if x == 'true' or x == 'false': isVariable = False
            else: isVariable = bool(re.match("[a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))*", x))
            if isVariable: 
                #Checa si existe en la table de variables
                if(x[0] != 't'):
                    d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                    varExist = x in d
                    if not varExist: sys.exit("Error: " + x +" is undeclared in " + self.funcName  +"!")
                    dAux2 = next(item for item in self.symbolTable[self.funcName] if item['name'] == x)
                    #Checa si esta asignada la variable
                    if dAux2['asignado'] == False:
                        sys.exit("Error: "+ x +" doesn't have a value assigned in "+ self.funcName +"!")
    
    #Checa si el operando es una varible, constante o temporal
    def checkOperand(self, x):
        #si es temporal
        if(bool(re.match("t[0-9]+", x))):
            print(self.tempTable)
            tipoX = next(item for item in self.tempTable[self.funcName] if item["name"] == x)['type']
            return tipoX
        elif(bool(re.match("[a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))*", x))):
            if x != "true" and x != "false" :
                print("Variable:" , x)
                tipoX = next(item for item in self.symbolTable[self.funcName] if item["name"] == x)['type']
                return tipoX
            else:
                return "bool"
        else:
            if(bool(re.match("^\d+$", x))):
                print("es int", x)
                return "int"
            elif(bool(re.match("[+-]?([0-9]*[.])?[0-9]+", x))):
                print("es float", x)
                return "float"
            elif x == "false" or x == "true":
                return "bool"
            else:
                return "string"

    def getMemoryAddress(self, x):
        if(bool(re.match("t[0-9]+", x))):
            print(x)
            print(self.tempTable)
            memory = next(item for item in self.tempTable[self.funcName] if item["name"] == x)['memory']
            return memory
        elif(bool(re.match("[a-zA-Z]('_'?([a-zA-Z]|(DIGIT)))*", x))):
            if x != "true" and x != "false" :
                print("Variable:" , x)
                memory = next(item for item in self.symbolTable[self.funcName] if item["name"] == x)['dirMemoria']
                return memory
        else:
            print(self.cosntantTable)
            print(x)
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            if(bool(re.match("^\d+$", x))):
                return d[int(x)]
            elif(bool(re.match("[+-]?([0-9]*[.])?[0-9]+", x))):
                print("es float", x)
                return d[float(x)]
            else:
                return d[x]

           

          
           
        
            

