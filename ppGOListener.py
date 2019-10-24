# Generated from ppGO.g4 by ANTLR 4.7.2
from antlr4 import *

# This class defines a complete listener for a parse tree produced by ppGOParser.


class ppGOListener(ParseTreeListener):
    def __init__(self):
        self.funcName = "global"
        self.symbolTable = {"global": []}
        self.functionTable = []
        self.pOper = []
        self.pilaOper = []
        self.pilaSaltos = []
    # Enter a parse tree produced by ppGOParser#program.

    def enterProgram(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#program.
    def exitProgram(self, ctx):
        print(self.symbolTable)
        print(self.functionTable)
        pass
    # Enter a parse tree produced by ppGOParser#main.

    def enterMain(self, ctx):
        self.funcName = "main"
        self.functionTable.append({"name": self.funcName, "type": "void"})
    # Exit a parse tree produced by ppGOParser#main.

    def exitMain(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#modulo.

    def enterModulo(self, ctx):
        # Get function name for the symbols table
        if str(ctx.getChild(1)) == "func":
            self.funcName = str(ctx.getChild(2))
            self.functionTable.append({"name": self.funcName, "type": str(ctx.getChild(0))})
            
        else:
            self.funcName = str(ctx.getChild(1))
            self.functionTable.append({"name": self.funcName, "type": "void"})

    # Exit a parse tree produced by ppGOParser#modulo.
    def exitModulo(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#tipo.

    def enterTipo(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#tipo.
    def exitTipo(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#args.

    def enterArgs(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#args.
    def exitArgs(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#body.

    def enterBody(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#body.
    def exitBody(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#block.

    def enterBlock(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#block.
    def exitBlock(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#varsDec.

    def enterVarsDec(self, ctx):
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
                    currentKeyValue.append({"name": x, "type": "int", "scope": scope})
                    self.symbolTable[self.funcName] = currentKeyValue
            else:
                name = ctx.getText()[3:]
                currentKeyValue.append({"name": name, "type": "int", "scope": scope})
                self.symbolTable[self.funcName] = currentKeyValue

        elif (type == "flo"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[5:].split(',')
                for x in vars:
                   currentKeyValue.append({"name": x, "type": "float", "scope": scope})
                   self.symbolTable[self.funcName] = currentKeyValue
            else:
                currentKeyValue.append({"name": str(ctx.getText()[5:]), "type": "float", "scope": scope})
                self.symbolTable[self.funcName] = currentKeyValue

        elif (type == "boo"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[4:].split(',')
                for x in vars:
                    currentKeyValue.append({"name": x, "type": "bool", "scope": scope})
                    self.symbolTable[self.funcName] = currentKeyValue
            else:
                currentKeyValue.append({"name": str(ctx.getText()[4:]), "type": "float", "scope": scope})
                self.symbolTable[self.funcName] = currentKeyValue

        elif (type == "str"):
            if (',' in ctx.getText()):
                vars = ctx.getText()[6:].split(',')
                for x in vars:
                   currentKeyValue.append({"name": x, "type": "bool", "scope": scope})
                   self.symbolTable[self.funcName] = currentKeyValue
            else:
                currentKeyValue.append({"name": str(ctx.getText()[6:]), "type": "float", "scope": scope})
                self.symbolTable[self.funcName] = currentKeyValue

    # Exit a parse tree produced by ppGOParser#varsDec.

    def exitVarsDec(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#assigment.

    def enterAssigment(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#assigment.
    def exitAssigment(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#condition.

    def enterCondition(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#condition.
    def exitCondition(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#expression.

    def enterExpression(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#expression.
    def exitExpression(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#expression1.

    def enterExpression1(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#expression1.
    def exitExpression1(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#exp.

    def enterExp(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#exp.
    def exitExp(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#term.

    def enterTerm(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#term.
    def exitTerm(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#factor.

    def enterFactor(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#factor.
    def exitFactor(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#var_cte.

    def enterVar_cte(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#var_cte.
    def exitVar_cte(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#loop.

    def enterLoop(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#loop.
    def exitLoop(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#funcCall.

    def enterFuncCall(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#funcCall.
    def exitFuncCall(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#read.

    def enterRead(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#read.
    def exitRead(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#print2.

    def enterPrint2(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#print2.
    def exitPrint2(self, ctx):
        pass

    # Enter a parse tree produced by ppGOParser#return2.

    def enterReturn2(self, ctx):
        pass

    # Exit a parse tree produced by ppGOParser#return2.
    def exitReturn2(self, ctx):
        pass
