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
        self.pilaTypes = []
        self.tablaParametro = {}
        self.temps = 1
        self.k  = 0
    # Enter a parse tree produced by ppGOParser#program.

    def enterProgram(self, ctx: ppGOParser.ProgramContext):
        self.cuadruplos.append(["goto","main","",""])
        pass

    # Exit a parse tree produced by ppGOParser#program.
    def exitProgram(self, ctx: ppGOParser.ProgramContext):
        i = 0
        print("TABLA CONSTANTES: ", self.cosntantTable, '\n')
        print("TABLA Variables: ", self.symbolTable, '\n')
        print("TABLA Temporales: ", self.tempTable)
        """for c in self.cuadruplos:
            print(i, " ", *c)
            i+=1 """
        vm = VirtualMachine(self.cuadruplos, self.localMemory, self.temporalMemory, self.globalMemory, self.constantMemory)
        vm.execute()
       
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
            self.funcName = str(ctx.getChild(2))
            self.functionTable.append(
                {"name": self.funcName, "type": str(ctx.getChild(0)), "numberOfArguments": numArguments, "arguments": arguments, "currentCuadruple": len(self.cuadruplos)})
        else:
            self.funcName = str(ctx.getChild(1))
            self.functionTable.append({"name": self.funcName, "type": "void", "numberOfArguments": numArguments, "arguments": arguments, "currentCuadruple": len(self.cuadruplos)})
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
        if x[0] == '':x.pop()
        count = 0
        self.tablaParametro[self.funcName] = []
        if len(x) != 0:
            for i in x:
                if(ctx.tipo()[count].getText() == "int"): memoriaTabla = self.localMemory.addToMemory("int")
                elif(ctx.tipo()[count].getText() == "float"): memoriaTabla = self.localMemory.addToMemory("float")
                elif(ctx.tipo()[count].getText() == "string"): memoriaTabla = self.localMemory.addToMemory("string")
                elif(ctx.tipo()[count].getText() == "bool"): memoriaTabla = self.localMemory.addToMemory("bool")
                if count == 0:
                    self.symbolTable[self.funcName] = [{"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": False}]
                    self.tablaParametro[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla})
                else:
                    self.symbolTable[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla, "asignado": False})
                    self.tablaParametro[self.funcName].append({"name": ctx.LITERAL()[count].getText(), "type": ctx.tipo()[count].getText(), "scope": "l", "dirMemoria": memoriaTabla})

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
        for item in ctx.LITERAL():
            x = item.getText()
            #Mete cada variable de la linea a la tabla
            #Checa si ya existe la variable en el scope, en caso de que si regresa un error
            if  self.funcName in self.symbolTable:
                d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
                varExist = x in d
                if varExist: sys.exit("Error: Can't declare variables with the same name within the same scope!")
            if scope == "g":
                memoriaTabla = self.globalMemory.addToMemory(ctx.tipo().getText())
                currentKeyValue.append(
                    {"name": x, "type": ctx.tipo().getText(), "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                self.symbolTable[self.funcName] = currentKeyValue
            else:
                memoriaTabla = self.localMemory.addToMemory(ctx.tipo().getText())
                currentKeyValue.append(
                    {"name": x, "type": ctx.tipo().getText(), "scope": scope, "dirMemoria": memoriaTabla, "asignado": False})
                self.symbolTable[self.funcName] = currentKeyValue
           
    # Exit a parse tree produced by ppGOParser#varsDec.

    def exitVarsDec(self, ctx: ppGOParser.VarsDecContext):
        if self.functionTable:
            d = next(item for item in self.functionTable if item['name'] == self.funcName)
            d['currentCuadruple'] = len(self.cuadruplos)

    # Enter a parse tree produced by ppGOParser#assigment.
    def enterAssigment(self, ctx: ppGOParser.AssigmentContext):
        function = self.funcName
        self.pOper.append(ctx.EQUAL().getText())
        if not self.symbolTable: sys.exit("Error: You cannot assign without variable declaration.")
        d = dict((i['name'], i['type']) for i in self.symbolTable[self.funcName])
        varExist = ctx.LITERAL().getText() in d
        if not varExist:
            d = dict((i['name'], i['type']) for i in self.symbolTable['global'])
            varExist = ctx.LITERAL().getText() in d
            if not varExist:
                sys.exit("Error: Can't assign a value to a variable that doesn't exist!")
            else:
                function = 'global'
        dAux = next(item for item in self.symbolTable[function] if item['name'] == ctx.LITERAL().getText())
        dAux['asignado'] = True
        memory = next(item for item in self.symbolTable[function] if item["name"] == ctx.LITERAL().getText())['dirMemoria']
        self.pilaOper.append(memory)
        self.pilaTypes.append(d[ctx.LITERAL().getText()])

        pass
    # Exit a parse tree produced by ppGOParser#assigment.
    def exitAssigment(self, ctx: ppGOParser.AssigmentContext):
        if(self.pilaTypes.pop() == self.pilaTypes.pop()):
            leftOperand = self.pilaOper.pop()
            result = self.pilaOper.pop()
            operator = self.pOper.pop()
            self.cuadruplos.append([operator, leftOperand, " ", result])
        else:
            sys.exit("Error: Los tipos no coinciden en asignacion")
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
                    tempMemory = self.temporalMemory.addToMemory('bool')
                    self.tempTable[self.funcName].append({"name": temporal, "type": 'bool', 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append('bool')
                    tempMemory = self.temporalMemory.addToMemory('bool')
                    self.tempTable[self.funcName].append({"name": temporal, "type": 'bool', 'memory': tempMemory})
                else:
                    sys.exit("Error: And/Or operands must be type bool")
        if(self.expressionParent):
            if(self.expressionParent[-1] == "funccall" ) :          
                    argument = self.pilaOper.pop()
                    argType = self.pilaTypes.pop()
                    function = ctx.parentCtx.LITERAL().getText()
                    argDecType = self.tablaParametro[function][self.k]["type"]
                    if argDecType != argType: sys.exit("Error: Type mismatch when calling the function: "+ function + ".")
                    self.cuadruplos.append(["PARAMETER", argument, "", self.k + 1])
                    self.k += 1

                    
        pass

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
            self.pOper.append(ctx.L_EQUAL().getText())
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
                    tempMemory = self.temporalMemory.addToMemory(resultType)
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
                    tempMemory = self.temporalMemory.addToMemory(resultType)
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
                    tempMemory = self.temporalMemory.addToMemory(resultType)
                    self.tempTable[self.funcName].append({"name": temporal, "type": resultType, 'memory': tempMemory})
                    self.cuadruplos.append([operator, leftOperand, rightOperand, tempMemory])
                    self.pilaOper.append(tempMemory)
                    self.pilaTypes.append(resultType)
                    self.pilaTypes.append(resultType)
                    
                else:
                    sys.exit(resultType)

        pass

    # Enter a parse tree produced by ppGOParser#factor.
    def enterFactor(self, ctx: ppGOParser.FactorContext):
        if ctx.VAR_INT():
            d = dict((i['value'], i['memory']) for i in self.cosntantTable)
            constExist = int(ctx.getText()) in d
            if not constExist:
                memory = self.constantMemory.addToMemory("int")
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
                memory = self.constantMemory.addToMemory("string")
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
                memory = self.constantMemory.addToMemory("float")
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
                memory = self.constantMemory.addToMemory("bool")
                self.constantMemory.setMemory(memory, ctx.getText())
                self.cosntantTable.append({"value": ctx.getText(), "memory": memory, "type" : "bool"})
            else: 
                d = next(item for item in self.cosntantTable if item['value'] == ctx.VAR_FLOAT().getText())
                memory = d['memory']
            self.pilaOper.append(memory)
            self.pilaTypes.append("bool")
        elif(ctx.LITERAL()):
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
            self.checIfAssigned(ctx.LITERAL().getText(), function)
            tipoX = next(item for item in self.symbolTable[function] if item["name"] == ctx.LITERAL().getText())['type']
            self.pilaTypes.append(tipoX)
        elif(ctx.LEFT_PAR()):
            self.pOper.append('(')
        pass

    # Exit a parse tree produced by ppGOParser#factor.
    def exitFactor(self, ctx: ppGOParser.FactorContext):
        if(ctx.RIGHT_PAR()):
            self.pOper.pop()
        pass

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
        x = ctx.LITERAL().getText()
        d = dict((i['name'], i['type']) for i in self.functionTable)
        funcExists = x in d
        self.cuadruplos.append(["ERA", " ", " ", " "])
        if not funcExists: sys.exit("Error: Function " + x +" is undeclared in ! ")
        paramsInCall = len(ctx.expression())
        paramsInDec = len(self.tablaParametro[x])
        if paramsInCall != paramsInDec: sys.exit("Error: Number of parameters in function call: "+ x +"." )
        




       
    # Exit a parse tree produced by ppGOParser#funcCall.
    def exitFuncCall(self, ctx: ppGOParser.FuncCallContext):
        function = ctx.LITERAL().getText()
        d = next(item for item in self.functionTable if item['name'] == function)
        initAddress = d["currentCuadruple"]
        self.cuadruplos.append(["GOSUB", ctx.LITERAL().getText()," ", initAddress])
        self.expressionParent.pop()
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
        self.expressionParent.append("print")


    # Exit a parse tree produced by ppGOParser#print2.
    def exitPrint2(self, ctx: ppGOParser.Print2Context):
        self.expressionParent.pop()
        self.cuadruplos.append(["PRINT"," ", " ", self.pilaOper.pop()])
        

    # Enter a parse tree produced by ppGOParser#return2.
    def enterReturn2(self, ctx: ppGOParser.Return2Context):
        pass

    # Exit a parse tree produced by ppGOParser#return2.
    def exitReturn2(self, ctx: ppGOParser.Return2Context):
        pass


    
    #Checa si el operando es una varible, constante o temporal
    def checIfAssigned(self,x , function):
        dAux2 = next(item for item in self.symbolTable[function] if item['name'] == x)
        #Checa si esta asignada la variable
        if dAux2['asignado'] == False:
            sys.exit("Error: "+ x +" doesn't have a value assigned in "+ self.funcName +"!")


          
           
        
            

