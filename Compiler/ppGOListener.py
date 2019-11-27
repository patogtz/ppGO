# Generated from ppGO.g4 by ANTLR 4.7.2
from Memory import Memory
from antlr4 import *
import re
if __name__ is not None and "." in __name__:
    from .ppGOParser import ppGOParser
else:
    from ppGOParser import ppGOParser
from semanticCube import cuboSemantico
from VirtualMachine import VirtualMachine
import sys
# This class defines a complete listener for a parse tree produced by ppGOParser.


class ppGOListener(ParseTreeListener):
    def __init__(self):
        self.funcName = "global"
        self.symbolTable = {"global": []}
        self.functionTable = []
        self.cosntantTable = []
        self.tempTable = {}
        self.expressionParent = ["d"]
        self.elseExists = []
        self.elifExists = []
        self.globalMemory = Memory(0)
        self.localMemory = Memory(4000)
        self.constantMemory = Memory(8000)
        self.temporalMemory = Memory(12000)
        self.apMemory = Memory(16000)
        self.outputs = []
        # Pila de operaciones para generar cuadruplo
        self.pOper = []
        # Pila de operadores para generar cuadruplo
        self.pilaOper = []
        # Pila de saltos para llenar los GoTos de los cuadruplos
        self.pilaSaltos = []
        self.cuadruplos = []
        self.pilaTypes = []
        self.tablaParametro = {}
        self.temps = 1
        self.k  = 0
        self.funcNameAUX = ""
        self.arrayName = ""
    # Enter a parse tree produced by ppGOParser#program.

    def enterProgram(self, ctx: ppGOParser.ProgramContext):
        self.cuadruplos.append(["Goto","main","",""])
        pass

    # Exit a parse tree produced by ppGOParser#program.
    def exitProgram(self, ctx: ppGOParser.ProgramContext):
        i = 0
        """ print("TABLA vars: ", self.symbolTable)
        print("TABLA const: ", self.cosntantTable)
        for c in self.cuadruplos:
            print(i, " ", *c)
            i+=1 """
        print(self.pilaOper, self.pilaSaltos, self.pilaTypes)
        vm = VirtualMachine(self.cuadruplos, self.localMemory, self.temporalMemory, self.globalMemory, self.constantMemory, self.functionTable, self.tablaParametro, self.symbolTable, self.apMemory)
        self.outputs = vm.execute()

       
    # Enter a parse tree produced by ppGOParser#main.
    def enterMain(self, ctx: ppGOParser.MainContext):
        self.cuadruplos[0][3] = len(self.cuadruplos)
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
            memory = self.globalMemory.addToMemory(ctx.tipo().getText(), 1)
            self.funcName = str(ctx.getChild(2))
            self.functionTable.append(
                {"name": self.funcName, "type": ctx.tipo().getText(), "numberOfArguments": numArguments, "arguments": arguments, "currentCuadruple": len(self.cuadruplos), "memory": memory })
            
            self.symbolTable['global'].append({"name": self.funcName, "type": ctx.tipo().getText(), "scope": "g", "dirMemoria": memory, "asignado": True})
        else:
            self.funcName = str(ctx.getChild(1))
            self.functionTable.append({"name": self.funcName, "type": "void", "numberOfArguments": numArguments, "arguments": arguments, "currentCuadruple": len(self.cuadruplos), "memory": "NULL"})
        self.tempTable[self.funcName] = []

    # Exit a parse tree produced by ppGOParser#modulo.
    def exitModulo(self, ctx: ppGOParser.ModuloContext):
        self.cuadruplos.append(["endproc","","",""])
        

    # Enter a parse tree produced by ppGOParser#tipo.
    def enterTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Exit a parse tree produced by ppGOParser#tipo.
    def exitTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Enter a parse tree produced by ppGOParser#args.
    def enterArgs(self, ctx: ppGOParser.ArgsContext):
        self.expressionParent.append("args")
        x = ctx.getText().split(',')
        if x[0] == '':x.pop()
        count = 0
        self.tablaParametro[self.funcName] = []
        if len(x) != 0:
            for i in x:
                """ FALTA RESERVAR ESPACIOS DE MEMORIA CUANDO LOS PARAMETROS SON ARREGLOS"""
                if(ctx.tipo()[count].getText() == "int"): memoriaTabla = self.localMemory.addToMemory("int", 1)
                elif(ctx.tipo()[count].getText() == "float"): memoriaTabla = self.localMemory.addToMemory("float", 1)
                elif(ctx.tipo()[count].getText() == "string"): memoriaTabla = self.localMemory.addToMemory("string", 1)
                elif(ctx.tipo()[count].getText() == "bool"): memoriaTabla = self.localMemory.addToMemory("bool", 1)
                if count == 0:
                    self.symbolTable[self.funcName] = [{"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": True, "dim": 0, "cap1": "None" ,"cap2": "None"}]
                    self.tablaParametro[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla})
                else:
                    self.symbolTable[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": True, "dim": 0, "cap1": "None" ,"cap2": "None"})
                    self.tablaParametro[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla})

                count+=1

    # Exit a parse tree produced by ppGOParser#args.
    def exitArgs(self, ctx: ppGOParser.ArgsContext):
        self.expressionParent.pop()
        pass

    # Enter a parse tree produced by ppGOParser#body.
    def enterBody(self, ctx: ppGOParser.BodyContext):
        pass

    # Exit a parse tree produced by ppGOParser#body.
    def exitBody(self, ctx: ppGOParser.BodyContext):
        pass

    # Enter a parse tree produced by ppGOParser#block.
    def enterBlock(self, ctx: ppGOParser.BlockContext):
        if self.expressionParent:
            if self.expressionParent[-1] == 'if' or self.expressionParent[-1] == 'loop' :
                expType = self.pilaTypes.pop()
                if(expType != 'bool'): sys.exit("Error: Type mismatch in if statement.")
                else:
                    result = self.pilaOper.pop()
                    self.cuadruplos.append(["Gotof", result, "", "placeholder"])
                    self.pilaSaltos.append(len(self.cuadruplos)-1)
            elif self.expressionParent[-1] == 'elseif':
                expType = self.pilaTypes.pop()
                if(expType != 'bool'): sys.exit("Error: Type mismatch in if statement.")
                else:
                    result = self.pilaOper.pop()
                    self.cuadruplos.append(["Gotof", result, "", "placeholder"])
                    self.pilaSaltos.append(len(self.cuadruplos)-1)

    # Exit a parse tree produced by ppGOParser#block.
    def exitBlock(self, ctx: ppGOParser.BlockContext):
        if self.expressionParent:
            self.expressionParent.pop()

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
        currentKeyValue = []
        key = str(self.funcName)
        if key in self.symbolTable.keys():
            currentKeyValue = self.symbolTable[key]
        if self.funcName == "global":
            scope = "g"
        else:
            scope = "l"
        #Agrega las variables int a la tabla de variables
        dim = 0
        cap1 = "None"
        cap2 = "None"
        memorySpace = 1
        for item in ctx.LITERAL():
            #Verifica si es un arreglo
            if ctx.LEFT_SBRACKET():
                dim = len(ctx.LEFT_SBRACKET())
                cap1 = int(ctx.VAR_INT()[0].getText())
                memorySpace = cap1
                if len(ctx.VAR_INT()) == 2: 
                    cap2 = int(ctx.VAR_INT()[1].getText())
                    memorySpace = cap1 * cap2

                    
            x = item.getText()
            #Mete cada variable de la linea a la tabla
            #Checa si ya existe la variable en el scope, en caso de que si regresa un error
            if  self.funcName in self.symbolTable:
                d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                varExist = x in d
                if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
            if scope == "g":
                memoriaTabla = self.globalMemory.addToMemory(ctx.tipo().getText() , memorySpace)
                currentKeyValue.append(
                    {"name": x, "type": ctx.tipo().getText(), "scope": scope, "dirMemoria": memoriaTabla, "asignado": False, "dim": dim, "cap1": cap1 ,"cap2": cap2})
                self.symbolTable[self.funcName] = currentKeyValue
            else:
                memoriaTabla = self.localMemory.addToMemory(ctx.tipo().getText(), memorySpace)
                currentKeyValue.append(
                    {"name": x, "type": ctx.tipo().getText(), "scope": scope, "dirMemoria": memoriaTabla, "asignado": False, "dim": dim, "cap1":cap1 ,"cap2":cap2})
                self.symbolTable[self.funcName] = currentKeyValue
           
    # Exit a parse tree produced by ppGOParser#varsDec.

    def exitVarsDec(self, ctx: ppGOParser.VarsDecContext):
        if self.functionTable:
            d = next(item for item in self.functionTable if item['name'] == self.funcName)
            d['currentCuadruple'] = len(self.cuadruplos)

    def enterArray(self, ctx: ppGOParser.VarsDecContext):
        self.pOper.append('(')
        pass
    def exitArray(self, ctx: ppGOParser.VarsDecContext):
        if len(ctx.RIGHT_SBRACKET()) == 1:
            index = self.pilaOper.pop()
            self.pilaTypes.pop()
            varTableAux = next(item for item in self.symbolTable[self.funcName] if item['name'] == ctx.LITERAL().getText())
            memBase = varTableAux['dirMemoria']
            tipo = varTableAux['type']
            limSup = varTableAux["cap1"] - 1
            self.cuadruplos.append(["VER", index, 0, limSup])
            temp = self.apMemory.addToMemory(tipo, 1)
            self.cuadruplos.append(["ppgo", index, memBase, temp])
            self.pilaOper.append(temp)

        elif len(ctx.RIGHT_SBRACKET()) == 2:
            index2 = self.pilaOper.pop()
            self.pilaTypes.pop()
            index = self.pilaOper.pop()
            self.pilaTypes.pop()
            varTableAux = next(item for item in self.symbolTable[self.funcName] if item['name'] == ctx.LITERAL().getText())
            dim2 = varTableAux['cap2']
            memBase = varTableAux['dirMemoria']
            tipo = varTableAux['type']
            limSupDim1 = varTableAux["cap1"] - 1
            limSupDim2 = varTableAux["cap2"] - 1
            self.cuadruplos.append(["VER", index, 0, limSupDim1])
            self.cuadruplos.append(["VER", index2, 0, limSupDim2])
            temp1 = self.temporalMemory.addToMemory(tipo, 1)
            temp2 = self.temporalMemory.addToMemory(tipo, 1)
            apTemp = self.apMemory.addToMemory(tipo, 1)
            self.cuadruplos.append(['**', index , dim2, temp1 ])
            self.cuadruplos.append(['+', temp1 , index2, temp2 ])
            self.cuadruplos.append(["ppgo", temp2, memBase, apTemp])
            self.pilaOper.append(apTemp)
        self.pOper.pop()
       



    # Enter a parse tree produced by ppGOParser#assigment.
    def enterAssigment(self, ctx: ppGOParser.AssigmentContext):
            #Checa si es un arreglo y saca el nombre
            if ctx.LITERAL():
                name = ctx.LITERAL().getText()                
            elif ctx.array:
                name = ctx.array().LITERAL().getText()
            function = self.funcName        
            self.pOper.append("=")
            if not self.symbolTable: sys.exit("Error: You cannot assign without variable declaration.")
            d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
            varExist = name in d
            if not varExist:
                d = dict((i['name'], i['type']) for i in self.symbolTable['global'])
                varExist = name in d
                if not varExist:
                    sys.exit("Error: Can't assign a value to a variable that doesn't exist!")
                else:
                    function = 'global'
            dAux = next(item for item in self.symbolTable[function] if item['name'] == name)
            dAux['asignado'] = True
            memory = next(item for item in self.symbolTable[function] if item["name"] == name)['dirMemoria']
            
            self.pilaOper.append(memory)
            self.pilaTypes.append(d[name])
            
            

    # Exit a parse tree produced by ppGOParser#assigment.
    def exitAssigment(self, ctx: ppGOParser.AssigmentContext):

        if(self.pilaTypes.pop() == self.pilaTypes.pop()):
                leftOperand = self.pilaOper.pop()
                result = self.pilaOper.pop()
                operator = self.pOper.pop()
                self.cuadruplos.append([operator, leftOperand, " ", result])
        else:
            sys.exit("Error: Los types no coinciden en asignacion")
        pass


    # Enter a parse tree produced by ppGOParser#condition.

    def enterCondition(self, ctx: ppGOParser.ConditionContext):
        self.expressionParent.append('if')
        pass

    # Exit a parse tree produced by ppGOParser#condition.
    def exitCondition(self, ctx: ppGOParser.ConditionContext):
        end = self.pilaSaltos.pop()
        self.cuadruplos[end][3] = len(self.cuadruplos)

        pass
        
    # Enter a parse tree produced by ppGOParser#elseif.
    def enterElseif(self, ctx: ppGOParser.ElseifContext):
        self.expressionParent.append("elseif")
        
        
        pass

    # Exit a parse tree produced by ppGOParser#elseif.
    def exitElseif(self, ctx: ppGOParser.ElseifContext):
        end = self.pilaSaltos.pop()
        self.cuadruplos[end][3] = len(self.cuadruplos)
        pass        
    # Enter a parse tree produced by ppGOParser#elsee.
    def enterElsee(self, ctx: ppGOParser.ElseeContext):
        self.expressionParent.append("else")
        self.cuadruplos.append(["Goto", "", "", ""])
        false = self.pilaSaltos.pop()
        self.pilaSaltos.append(len(self.cuadruplos) - 1)
        self.cuadruplos[false][3] = len(self.cuadruplos)
  

    def exitElsee(self, ctx: ppGOParser.ElseeContext):
        pass

    # Enter a parse tree produced by ppGOParser#expression.
    def enterExpression(self, ctx: ppGOParser.ExpressionContext):
        if ctx.OR():
            self.pOper.append(ctx.OR().getText())
        elif ctx.AND():
            self.pOper.append(ctx.AND().getText())

        pass

    # Exit a parse tree produced by ppGOParser#expression.
    def exitExpression(self, ctx: ppGOParser.ExpressionContext):
        if(self.expressionParent):
            if(self.expressionParent[-1] == "funccall" ) :
                argument = self.pilaOper.pop()
                argType = self.pilaTypes.pop()
                function = self.funcNameAUX
                argDecType = self.tablaParametro[function][self.k]["type"]
                if argDecType != argType: sys.exit("Error: Type mismatch when calling the function: "+ function + ".")
                self.cuadruplos.append(["PARAMETER", argument, "", self.k + 1])
                self.k += 1
            if self.expressionParent[-1] == "funccallExp":
                argument = self.pilaOper.pop()
                argType = self.pilaTypes.pop()
                function = self.funcNameAUX
                argDecType = self.tablaParametro[function][self.k]["type"]
                
                if argDecType != argType: sys.exit("Error: Type mismatch when calling the function: "+ function + ".")
                self.cuadruplos.append(["PARAMETER", argument, "", self.k + 1])
                self.k += 1
                if self.k == len(self.tablaParametro[function]):
                    self.expressionParent.pop()
                    direccionMemFuncion = next(item for item in self.symbolTable['global'] if item['name'] == self.funcNameAUX)["dirMemoria"]
                    function = self.funcNameAUX
                    d = next(item for item in self.functionTable if item['name'] == function)
                    initAddress = d["currentCuadruple"]
                    typeFuncion = next(item for item in self.functionTable if item['name'] == self.funcNameAUX)["type"]
                    self.cuadruplos.append(["GOSUB", self.funcNameAUX," ", initAddress])
                    temp = self.temporalMemory.addToMemory(typeFuncion, 1)
                    self.cuadruplos.append(['=', direccionMemFuncion, "", temp])
                    self.pilaOper.append(temp)
                    self.pilaTypes.append(typeFuncion)
                    self.k = 0
        if self.pOper:
            if self.pOper[-1] == 'AND' or self.pOper[-1] == 'OR':
                rightOperand = self.pilaOper.pop()
                rightType = self.pilaTypes.pop()
                leftOperand = self.pilaOper.pop()
                leftType = self.pilaTypes.pop()
                operator = self.pOper.pop()
                if(leftType == "bool" and  rightType == "bool"):
                    temporal = "t" + str(self.temps)
                    self.temps += 1
                    tempMemory = self.temporalMemory.addToMemory('bool', 1)
                    self.tempTable[self.funcName].append({"name": temporal, "type": 'bool', 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append('bool')
                    tempMemory = self.temporalMemory.addToMemory('bool', 1)
                    self.tempTable[self.funcName].append({"name": temporal, "type": 'bool', 'memory': tempMemory})
                else:
                    sys.exit("Error: And/Or operands must be type bool")
    
            
        

           


    # Enter a parse tree produced by ppGOParser#expression1.
    def enterExpression1(self, ctx: ppGOParser.Expression1Context):
        if ctx.NOT_EQUAL():
            self.pOper.append(ctx.NOT_EQUAL().getText())
        elif ctx.EQUAL_RELOP():
            self.pOper.append(ctx.EQUAL_RELOP().getText())
        
        elif ctx.GREATER_THAN():
            self.pOper.append(ctx.GREATER_THAN().getText())

        elif ctx.LESS_THAN():
            self.pOper.append(ctx.LESS_THAN().getText())
        
        elif ctx.GREATER_EQUAL():
            self.pOper.append(ctx.GREATER_EQUAL().getText())
        
        elif ctx.LESS_EQUAL():
            self.pOper.append(ctx.LESS_EQUAL().getText())
        pass

    # Exit a parse tree produced by ppGOParser#expression1.
    def exitExpression1(self, ctx: ppGOParser.Expression1Context):
        if self.pOper:
            if self.pOper[-1] == '<' or self.pOper[-1] == '>' or self.pOper[-1] == '==' or self.pOper[-1] == '<>' or self.pOper[-1] == '<=' or self.pOper[-1] == '>=':
                rightOperand = self.pilaOper.pop()
                rightType = self.pilaTypes.pop()
                leftOperand = self.pilaOper.pop()
                leftType = self.pilaTypes.pop()
                operator = self.pOper.pop()
                resultType = cuboSemantico().cube[leftType][operator][rightType]
                if(resultType[0:5] != "Error"):
                    temporal = "t" + str(self.temps)
                    self.temps += 1
                    tempMemory = self.temporalMemory.addToMemory(resultType, 1)
                    self.tempTable[self.funcName].append({"name": temporal, "type": resultType, 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append(resultType)
                    
                else:
                    sys.exit(resultType)

    # Enter a parse tree produced by ppGOParser#exp.
    def enterExp(self, ctx: ppGOParser.ExpContext):
        if(ctx.PLUS()):
            self.pOper.append(ctx.PLUS().getText())
        elif(ctx.MINUS()):
            self.pOper.append(ctx.MINUS().getText())
        
        

    # Exit a parse tree produced by ppGOParser#exp.
    def exitExp(self, ctx: ppGOParser.ExpContext):
        if self.pOper:
            if self.pOper[-1] == '+' or self.pOper[-1] == '-':
                rightOperand = self.pilaOper.pop()
                rightType = self.pilaTypes.pop()
                leftOperand = self.pilaOper.pop()
                leftType = self.pilaTypes.pop()
                operator = self.pOper.pop()
                resultType = cuboSemantico().cube[leftType][operator][rightType]
                if(resultType[0:5] != "Error"):
                    temporal = "t" + str(self.temps)
                    self.temps += 1
                    tempMemory = self.temporalMemory.addToMemory(resultType, 1)
                    self.tempTable[self.funcName].append({"name": temporal, "type": resultType, 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append(resultType)
                else:
                    sys.exit(resultType)
            
        pass

    # Enter a parse tree produced by ppGOParser#term.
    def enterTerm(self, ctx: ppGOParser.TermContext):
        if(ctx.TIMES()):
            self.pOper.append(ctx.TIMES().getText())
        elif(ctx.DIVISION()):
            self.pOper.append(ctx.DIVISION().getText())

    # Exit a parse tree produced by ppGOParser#term.
    def exitTerm(self, ctx: ppGOParser.TermContext):
        if self.pOper:
            if(self.pOper[-1] == '*' or self.pOper[-1] == '/'): 
                rightOperand = self.pilaOper.pop()
                rightType = self.pilaTypes.pop()
                leftOperand = self.pilaOper.pop()
                leftType = self.pilaTypes.pop()
                operator = self.pOper.pop()
                resultType = cuboSemantico().cube[leftType][operator][rightType]
                if(resultType[0:5] != "Error"):
                    temporal = "t" + str(self.temps)
                    self.temps += 1
                    tempMemory = self.temporalMemory.addToMemory(resultType, 1)
                    self.tempTable[self.funcName].append({"name": temporal, "type": resultType, 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append(resultType)
                    self.pilaTypes.append(resultType)
                else:
                    sys.exit(resultType)

        pass

    # Enter a parse tree produced by ppGOParser#factor.
   # Enter a parse tree produced by ppGOParser#factor.
    def enterFactor(self, ctx: ppGOParser.FactorContext):
        if ctx.VAR_INT():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = int(ctx.getText()) in d
            if not constExist:
                memory = self.constantMemory.addToMemory("int", 1)
                self.cosntantTable.append({"value": int(ctx.getText()), "memory": memory, "type" : "int"})
            else: 
                d = next(item for item in self.cosntantTable if item['value'] == int(ctx.VAR_INT().getText()))
                memory = d['memory']
            self.constantMemory.setMemory(memory, int(ctx.getText()))
            self.pilaOper.append(memory)
            self.pilaTypes.append("int")
        elif ctx.VAR_STRING():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = ctx.getText() in d
            if not constExist:
                memory = self.constantMemory.addToMemory("string", 1)
                self.constantMemory.setMemory(memory, ctx.getText())
                self.cosntantTable.append({"value": ctx.getText(), "memory": memory, "type" : "string"})
            else: 
                d = next(item for item in self.cosntantTable if item['value'] == ctx.VAR_STRING().getText())
                memory = d['memory']
            self.pilaOper.append(memory)
            self.pilaTypes.append("string")
        elif ctx.VAR_FLOAT():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = float(ctx.getText()) in d
            if not constExist:
                memory = self.constantMemory.addToMemory("float", 1)
                self.constantMemory.setMemory(memory, float(ctx.getText()))
                self.cosntantTable.append({"value": float(ctx.getText()), "memory": memory, "type" : "float"})
            else: 
                d = next(item for item in self.cosntantTable if item['value'] == int(ctx.VAR_FLOAT().getText()))
                memory = d['memory']
            self.pilaOper.append(memory)
            self.pilaTypes.append("float")
        elif ctx.VAR_BOOL():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = ctx.getText() in d
            if not constExist:
                memory = self.constantMemory.addToMemory("bool", 1)
                self.constantMemory.setMemory(memory, ctx.getText())
                self.cosntantTable.append({"value": ctx.getText(), "memory": memory, "type" : "bool"})
            else: 
                d = next(item for item in self.cosntantTable if item['value'] == ctx.VAR_FLOAT().getText())
                memory = d['memory']
            self.pilaOper.append(memory)
            self.pilaTypes.append("bool")
        elif(ctx.LITERAL()):
            #Si es un literal seguido de un parenthesis es una funcion)
            
            if ctx.LEFT_PAR():
                d = next(item for item in self.functionTable if item['name'] == ctx.LITERAL().getText())
                self.funcNameAUX = d["name"]
                self.cuadruplos.append(["ERA", " ", " ", self.funcNameAUX])
                self.expressionParent.append("funccallExp")
            else: 
                function = self.funcName
                d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                varExist = ctx.LITERAL().getText() in d
                if not varExist: 
                    d = dict((i['name'], i['type']) for i in self.symbolTable['global'])
                    varExist = ctx.LITERAL().getText() in d
                    if not varExist: 
                        sys.exit("Error: " + ctx.LITERAL().getText() +" is undeclared in " + self.funcName  +"!")
                    else:
                        function = 'global'
                d = next(item for item in self.symbolTable[function] if item['name'] == ctx.LITERAL().getText())
                memory = d['dirMemoria']
                self.pilaOper.append(memory)
                if self.expressionParent:
                    if self.expressionParent[-1] != 'args':
                            self.checIfAssigned(ctx.LITERAL().getText(), function, False)
                    else:
                        self.checIfAssigned(ctx.LITERAL().getText(), function, True)
                typeX = next(item for item in self.symbolTable[function] if item["name"] == ctx.LITERAL().getText())['type']
                self.pilaTypes.append(typeX)
        if(ctx.LEFT_PAR()):
            self.pOper.append('(')
       


    # Exit a parse tree produced by ppGOParser#factor.
    def exitFactor(self, ctx: ppGOParser.FactorContext):
        if(ctx.RIGHT_PAR()):
            self.pOper.pop()



        

           
                
        

    # Enter a parse tree produced by ppGOParser#loop.
    def enterLoop(self, ctx: ppGOParser.LoopContext):
        self.expressionParent.append("loop")
        self.pilaSaltos.append(len(self.cuadruplos))

    # Exit a parse tree produced by ppGOParser#loop.
    def exitLoop(self, ctx: ppGOParser.LoopContext):
        end = self.pilaSaltos.pop()
        ret = self.pilaSaltos.pop()
        self.cuadruplos.append(
                ["Goto", "", "", ret])
        self.cuadruplos[end][3] = len(self.cuadruplos)

    # Enter a parse tree produced by ppGOParser#funcCall.

    def enterFuncCall(self, ctx: ppGOParser.FuncCallContext):
        self.expressionParent.append("funccall")
        #Checa si existe en la tabla de funciones.
        self.funcNameAUX = ctx.LITERAL().getText()
        x = ctx.LITERAL().getText()
        d = dict((i['name'], i['type']) for i in self.functionTable)
        funcExists = x in d
        if not funcExists: sys.exit("Error: Function " + x +" is undeclared in ! ")
        d = next(item for item in self.functionTable if item['name'] == ctx.LITERAL().getText())
        self.cuadruplos.append(["ERA", " ", " ", ctx.LITERAL().getText()])
        paramsInCall = len(ctx.expression())
        paramsInDec = len(self.tablaParametro[x])
        if paramsInCall != paramsInDec: sys.exit("Error: Number of parameters in function call: "+ x +"." )
        
       
    # Exit a parse tree produced by ppGOParser#funcCall.
    def exitFuncCall(self, ctx: ppGOParser.FuncCallContext):
        function = ctx.LITERAL().getText()
        d = next(item for item in self.functionTable if item['name'] == function)
        initAddress = d["currentCuadruple"]
        self.cuadruplos.append(["GOSUB", ctx.LITERAL().getText()," ", initAddress])
        self.k = 0
        pass

    # Enter a parse tree produced by ppGOParser#read.
    def enterRead(self, ctx: ppGOParser.ReadContext):
        pass

    # Exit a parse tree produced by ppGOParser#read.
    def exitRead(self, ctx: ppGOParser.ReadContext):
        pass

    # Enter a parse tree produced by ppGOParser#print2.
    def enterPrint2(self, ctx: ppGOParser.Print2Context):
        pass

    # Exit a parse tree produced by ppGOParser#print2.
    def exitPrint2(self, ctx: ppGOParser.Print2Context):
        self.pilaTypes.pop()
        self.cuadruplos.append(["PRINT"," ", " ", self.pilaOper.pop()])
        

    # Enter a parse tree produced by ppGOParser#return2.
    def enterReturn2(self, ctx: ppGOParser.Return2Context):
        
        pass

    # Exit a parse tree produced by ppGOParser#return2.
    def exitReturn2(self, ctx: ppGOParser.Return2Context):
        self.pilaTypes.pop()
        self.cuadruplos.append(["RETURN", " ", " ",self.pilaOper.pop()])
        self.localMemory.eraseMemory()
        self.temporalMemory.eraseMemory()
        pass


    
    #Checa si el operando es una varible, constante o temporal
    def checIfAssigned(self,x , function, flag):
        dAux2 = next(item for item in self.symbolTable[function] if item['name'] == x)
        #Checa si esta asignada la variable
        if flag == False:
            if dAux2['asignado'] == False:
                sys.exit("Error: "+ x +" doesn't have a value assigned in "+ self.funcName +"!")


          
           
        
            

