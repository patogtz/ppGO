# Generated from ppGO.g4 by ANTLR 4.7.2
from antlr4 import *
import re
if __name__ is not None and "." in __name__:
    from .ppGOParser import ppGOParser
else:
    from ppGOParser import ppGOParser
from Memory import Memory

# This class defines a complete listener for a parse tree produced by ppGOParser.


class ppGOListener(ParseTreeListener):
    def __init__(self):
        self.funcName = "global"
        self.symbolTable = {"global": []}
        self.functionTable = []
        self.expressionParent = ""
        self.dirMemoriaInt = 0
        self.dirMemoriaFloat = 1000
        self.dirMemoriaString = 2000
        self.dirMemoriaBool = 3000
        self.globalMemory = Memory(0)
        self.localMemory = Memory(4000)
        self.constantMemory = Memory(8000)
        # Pila de operaciones para generar cuadruplo
        self.pOper = []
        # Pila de operadores para generar cuadruplo
        self.pilaOper = []
        # Pila de saltos para llenar los GoTos de los cuadruplos
        self.pilaSaltos = []
        self.cuadruplos = []


    # Enter a parse tree produced by ppGOParser#program.
    def enterProgram(self, ctx: ppGOParser.ProgramContext):
        pass

    # Exit a parse tree produced by ppGOParser#program.
    def exitProgram(self, ctx: ppGOParser.ProgramContext):
        """ for c in self.cuadruplos:
            print(*c) """
        print(self.globalMemory.memoryContent)
        print(self.localMemory.memoryContent)

    # Enter a parse tree produced by ppGOParser#main.
    def enterMain(self, ctx: ppGOParser.MainContext):
        self.funcName = "main"
        self.functionTable.append({"name": "main", "type": "void"})
        pass

    # Exit a parse tree produced by ppGOParser#main.
    def exitMain(self, ctx: ppGOParser.MainContext):
        pass

    # Enter a parse tree produced by ppGOParser#modulo.
    def enterModulo(self, ctx: ppGOParser.ModuloContext):
        # Get function name for the symbols table
        if str(ctx.getChild(1)) == "func":
            self.funcName = str(ctx.getChild(2))
            self.functionTable.append({"name": self.funcName, "type": str(ctx.getChild(0))})
        else:
            self.funcName = str(ctx.getChild(1))
            self.functionTable.append({"name": self.funcName, "type": "void"})

    # Exit a parse tree produced by ppGOParser#modulo.
    def exitModulo(self, ctx: ppGOParser.ModuloContext):
        pass

    # Enter a parse tree produced by ppGOParser#tipo.
    def enterTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Exit a parse tree produced by ppGOParser#tipo.
    def exitTipo(self, ctx: ppGOParser.TipoContext):
        pass

    # Enter a parse tree produced by ppGOParser#args.
    def enterArgs(self, ctx: ppGOParser.ArgsContext):
        pass

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
        pass

    # Enter a parse tree produced by ppGOParser#varsDec.
    def enterVarsDec(self, ctx: ppGOParser.VarsDecContext):
        if(self.dirMemoriaInt > 999): return "Error: Int Memory Exceeded"
        if(self.dirMemoriaFloat > 1999): return "Error: Float Memory Exceeded"
        if(self.dirMemoriaString > 2999): return "Error: String Memory Exceeded"
        if(self.dirMemoriaBool > 3999): return "Error: Bool Memory Exceeded"    
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
        if(type == "int"):
            if(',' in ctx.getText()):
                vars = ctx.getText()[3:].split(',')
                for x in vars:
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("int")
                        currentKeyValue.append({"name": x, "type": "int", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaInt += 1
                    else:
                        memoriaTabla = self.localMemory.addToMemory("int")
                        currentKeyValue.append({"name": x, "type": "int", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaInt += 1

            else:
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("int")
                    name = ctx.getText()[3:]
                    currentKeyValue.append({"name": name, "type": "int", "scope": scope, "dirMemoria": memoriaTabla})
                    self.symbolTable[self.funcName] = currentKeyValue
                    self.dirMemoriaInt += 1
                else:
                    memoriaTabla = self.localMemory.addToMemory("int")
                    name = ctx.getText()[3:]
                    currentKeyValue.append({"name": name, "type": "int", "scope": scope, "dirMemoria": memoriaTabla})
                    self.symbolTable[self.funcName] = currentKeyValue
                    self.dirMemoriaInt += 1
                

        elif (type == "flo"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[5:].split(',')
                for x in vars:
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("float")
                        currentKeyValue.append({"name": x, "type": "float", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaFloat += 1
                    else:
                        memoriaTabla = self.localMemory.addToMemory("float")
                        currentKeyValue.append({"name": x, "type": "float", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaFloat += 1
            else:
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("float")
                        currentKeyValue.append({"name": str(ctx.getText()[5:]), "type": "float", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaFloat += 1
                    else:
                        memoriaTabla = self.localMemory.addToMemory("float")
                        currentKeyValue.append({"name": str(ctx.getText()[5:]), "type": "float", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaFloat += 1
        elif (type == "boo"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[4:].split(',')
                for x in vars:
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("bool")
                        currentKeyValue.append({"name": x, "type": "bool", "scope": scope, "dirMemoria": memoriaTabla })
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaBool += 1
                    else:
                        memoriaTabla = self.localMemory.addToMemory("bool")
                        currentKeyValue.append({"name": x, "type": "bool", "scope": scope, "dirMemoria": memoriaTabla })
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaBool += 1
            else:
                if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("bool")
                        currentKeyValue.append({"name": str(ctx.getText()[4:]), "type": "bool", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaBool += 1
                else:
                        memoriaTabla = self.localMemory.addToMemory("bool")
                        currentKeyValue.append({"name": str(ctx.getText()[4:]), "type": "bool", "scope": scope, "dirMemoria": memoriaTabla})
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaBool += 1

        elif (type == "str"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[6:].split(',')
                for x in vars:
                    if scope == "g":
                        memoriaTabla = self.globalMemory.addToMemory("string")
                        currentKeyValue.append({"name": x, "type": "string", "scope": scope, "dirMemoria": memoriaTabla })
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaString += 1
                    else:
                        memoriaTabla = self.localMemory.addToMemory("string")
                        currentKeyValue.append({"name": x, "type": "string", "scope": scope, "dirMemoria": memoriaTabla })
                        self.symbolTable[self.funcName] = currentKeyValue
                        self.dirMemoriaString += 1
            else:
                if scope == "g":
                    memoriaTabla = self.globalMemory.addToMemory("string")
                    currentKeyValue.append({"name": str(ctx.getText()[6:]), "type": "string", "scope": scope, "dirMemoria": memoriaTabla })
                    self.symbolTable[self.funcName] = currentKeyValue
                    self.dirMemoriaString += 1
                else:
                    memoriaTabla = self.localMemory.addToMemory("string")
                    currentKeyValue.append({"name": str(ctx.getText()[6:]), "type": "string", "scope": scope, "dirMemoria": memoriaTabla })
                    self.symbolTable[self.funcName] = currentKeyValue
                    self.dirMemoriaString += 1
    # Exit a parse tree produced by ppGOParser#varsDec.
    def exitVarsDec(self, ctx: ppGOParser.VarsDecContext):
        pass

    # Enter a parse tree produced by ppGOParser#assigment.
    def enterAssigment(self, ctx: ppGOParser.AssigmentContext):
        assig = ctx.getText()[:-1]
        splitAssig = [
        ]
        temps = 1
        # Split the assigment in to tokenns.
        splitAssig = re.split("([-/(*=+)])",assig)
        # Remove random "" generated by the split
        while "" in splitAssig: splitAssig.remove("")
        # Appends the first element of the new splitted list to pilaOper
        self.pilaOper.append(splitAssig[0])
        del splitAssig[0]
        for i in range(len(splitAssig)):
            x = splitAssig[i]
            if(x == "=" or x == "+" or x == "-" or x == "*" or x == "/" or x == "("):
                self.pOper.append(x)
            elif x== ")":
                while self.pOper[-1] != "(":
                    temporal = "t" + str(temps)
                    self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                    self.pilaOper.append(temporal)
                    temps = temps + 1
                del self.pOper[-1]
            else:
                self.pilaOper.append(x)
                if i + 1 < len(splitAssig):
                    nxt = splitAssig[i + 1]
                    if not self.pOper:
                        pass
                    else:
                        if self.pOper[len(self.pOper) - 1] == "=":
                            if (nxt == "+" or x == "-" or x == "*" or x == "/"):
                                pass
                            else:
                                self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), " ", self.pilaOper.pop()])
                        if (self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "-"):
                            if (nxt == "*" or x == "/"):
                                pass
                            else:
                                temporal = "t" + str(temps)
                                self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                                self.pilaOper.append(temporal)
                                temps = temps + 1
                        if (self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/"):
                            temporal = "t" + str(temps)
                            self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                            self.pilaOper.append(temporal)
                            temps = temps + 1
                else:
                    while self.pilaOper:
                        if self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/" or self.pOper[len(self.pOper) - 1] == "-":
                            temporal = "t" + str(temps)
                            self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                            self.pilaOper.append(temporal)
                            temps = temps + 1
                        if self.pOper[len(self.pOper) - 1] == "=":
                            self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), " ", self.pilaOper.pop()])
                            temps = temps + 1

    # Exit a parse tree produced by ppGOParser#assigment.
    def exitAssigment(self, ctx:ppGOParser.AssigmentContext):
        self.pilaOper[:] = []
        self.pOper[:] = []



    # Enter a parse tree produced by ppGOParser#condition.
    def enterCondition(self, ctx:ppGOParser.ConditionContext):
        self.expressionParent = "if"
        expr = ctx.expression().getText()
        self.getQuadruples(expr)
        self.pilaOper[:] = []
        self.pOper[:] = []
        
        pass

    # Exit a parse tree produced by ppGOParser#condition.
    def exitCondition(self, ctx:ppGOParser.ConditionContext):
        self.cuadruplos.append(["Goto", "", "", "numero de cuadruplo si es que existe un else/elsif"])
        
        pass


    # Enter a parse tree produced by ppGOParser#elseif.
    def enterElseif(self, ctx:ppGOParser.ElseifContext):
        self.expressionParent = "elseif"
        expr = ctx.expression().getText()
        self.getQuadruples(expr)
        self.pilaOper[:] = []
        self.pOper[:] = []
        pass

    # Exit a parse tree produced by ppGOParser#elseif.
    def exitElseif(self, ctx:ppGOParser.ElseifContext):
        pass


    # Enter a parse tree produced by ppGOParser#elsee.
    def enterElsee(self, ctx:ppGOParser.ElseeContext):
        self.expressionParent = "else"
        pass

    # Exit a parse tree produced by ppGOParser#elsee.
    def exitElsee(self, ctx:ppGOParser.ElseeContext):
        pass


    # Enter a parse tree produced by ppGOParser#expression.
    def enterExpression(self, ctx:ppGOParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ppGOParser#expression.
    def exitExpression(self, ctx:ppGOParser.ExpressionContext):
        self.expressionParent  = ""


    # Enter a parse tree produced by ppGOParser#expression1.
    def enterExpression1(self, ctx:ppGOParser.Expression1Context):
        pass

    # Exit a parse tree produced by ppGOParser#expression1.
    def exitExpression1(self, ctx:ppGOParser.Expression1Context):
        pass


    # Enter a parse tree produced by ppGOParser#exp.
    def enterExp(self, ctx:ppGOParser.ExpContext):
        pass

    # Exit a parse tree produced by ppGOParser#exp.
    def exitExp(self, ctx:ppGOParser.ExpContext):
        pass


    # Enter a parse tree produced by ppGOParser#term.
    def enterTerm(self, ctx:ppGOParser.TermContext):
        pass

    # Exit a parse tree produced by ppGOParser#term.
    def exitTerm(self, ctx:ppGOParser.TermContext):
        pass


    # Enter a parse tree produced by ppGOParser#factor.
    def enterFactor(self, ctx:ppGOParser.FactorContext):
        pass

    # Exit a parse tree produced by ppGOParser#factor.
    def exitFactor(self, ctx:ppGOParser.FactorContext):
        pass


    # Enter a parse tree produced by ppGOParser#var_cte.
    def enterVar_cte(self, ctx:ppGOParser.Var_cteContext):
        pass

    # Exit a parse tree produced by ppGOParser#var_cte.
    def exitVar_cte(self, ctx:ppGOParser.Var_cteContext):
        pass


    # Enter a parse tree produced by ppGOParser#loop.
    def enterLoop(self, ctx:ppGOParser.LoopContext):
        self.expressionParent = "loop"
        expr = ctx.expression().getText()
        self.getQuadruples(expr)

    # Exit a parse tree produced by ppGOParser#loop.
    def exitLoop(self, ctx:ppGOParser.LoopContext):
        self.cuadruplos.append(["Goto", "", "", "begining of loop"])
        


    # Enter a parse tree produced by ppGOParser#funcCall.
    def enterFuncCall(self, ctx:ppGOParser.FuncCallContext):
        pass

    # Exit a parse tree produced by ppGOParser#funcCall.
    def exitFuncCall(self, ctx:ppGOParser.FuncCallContext):
        pass


    # Enter a parse tree produced by ppGOParser#read.
    def enterRead(self, ctx:ppGOParser.ReadContext):
        pass

    # Exit a parse tree produced by ppGOParser#read.
    def exitRead(self, ctx:ppGOParser.ReadContext):
        pass


    # Enter a parse tree produced by ppGOParser#print2.
    def enterPrint2(self, ctx:ppGOParser.Print2Context):
        pass

    # Exit a parse tree produced by ppGOParser#print2.
    def exitPrint2(self, ctx:ppGOParser.Print2Context):
        pass


    # Enter a parse tree produced by ppGOParser#return2.
    def enterReturn2(self, ctx:ppGOParser.Return2Context):
        pass

    # Exit a parse tree produced by ppGOParser#return2.
    def exitReturn2(self, ctx:ppGOParser.Return2Context):
        pass

    def getQuadruples(self, expr):
        temps = 1
        splittedExpr = re.split(r'(["AND"]+|["OR"]+|\W+)', expr)
        while "" in splittedExpr: splittedExpr.remove("")
        while splittedExpr[0] == "(":
            self.pOper.append(splittedExpr[0])
            del splittedExpr[0]
        self.pilaOper.append(splittedExpr[0])
        del splittedExpr[0]
        for i in range(len(splittedExpr)):
            x = splittedExpr[i]
            if(x == "AND" or x == "OR" or x == "<" or x == ">" or x == "<=" or x == ">=" or x == "==" or x == "<>" or x == "+" or x == "-" or x == "*" or x == "/" or x == "("):
                self.pOper.append(x)
            elif x== ")":
                while self.pOper[-1] != "(":
                    temporal = "t" + str(temps)
                    self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                    self.pilaOper.append(temporal)
                    temps = temps + 1
                del self.pOper[-1]
            else:
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
                                temporal = "t" + str(temps)
                                self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal] )
                                self.pilaOper.append(temporal)
                                temps = temps + 1
                        elif (self.pOper[len(self.pOper) - 1] == "+" or self.pOper[len(self.pOper) - 1] == "-"):
                            if (nxt == "*" or x == "/"):
                                pass
                            else:
                                temporal = "t" + str(temps)
                                self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                                self.pilaOper.append(temporal)
                                temps = temps + 1
                        elif (self.pOper[len(self.pOper) - 1] == "*" or self.pOper[len(self.pOper) - 1] == "/"):
                            temporal = "t" + str(temps)
                            self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                            self.pilaOper.append(temporal)
                            temps = temps + 1
                else:
                    while self.pilaOper:
                        if(len(self.pOper) == 0):
                            self.cuadruplos.append(["GotoF", self.pilaOper.pop(), " ", "donde acaba el if/while"])
                            self.pilaSaltos.append(len(self.cuadruplos))
                        else:
                            temporal = "t" + str(temps)
                            self.cuadruplos.append([self.pOper.pop(), self.pilaOper.pop(), self.pilaOper.pop(), temporal])
                            self.pilaOper.append(temporal)
                            temps = temps + 1

