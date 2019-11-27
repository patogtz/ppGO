from Memory import Memory
import sys
import math
class VirtualMachine:
    def __init__(self, cuadruplos, localMemory, temporalMemory, globalMemory, constantMemory, funcTable, paramTable, varTable, apMemory):
        self.cuadruplos = cuadruplos
        self.localMemory = localMemory
        self.temporalMemory = temporalMemory 
        self.globalMemory = globalMemory
        self.constantMemory = constantMemory
        self.currentIndex = 0
        self.funcTable = funcTable
        self.localMemoryStack = [localMemory]
        self.tempMemoryStack = [temporalMemory]
        self.currentFunc = 0
        self.cuadAux = []
        self.paramTable = paramTable
        self.varTable = varTable
        self.apMemory = apMemory
        self.newLocalMemory = Memory
        self.newTempMemory = Memory
        self.output = []
        self.error = False
    def execute(self):
        while self.currentIndex < len(self.cuadruplos):
            operand = self.cuadruplos[self.currentIndex][0]
            leftOper = self.cuadruplos[self.currentIndex][1]
            rightOper = self.cuadruplos[self.currentIndex][2]
            result = self.cuadruplos[self.currentIndex][3]
            #Checa Relop
            if operand == '<':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue < rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '>':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue > rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '==':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue == rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '<>':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue != rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '<=':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue <= rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '>=':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue >= rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            #Suma,Resta, Division, Multiplicacion y asignacion
            elif operand == '+':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue + rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '-':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue - rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '/':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                if rightValue == 0: sys.exit("Error: Cant divide by 0")
                valueResult = leftValue / rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '*':
                if rightOper > 15999:
                    rightOper = self.getMemoryValue(rightOper)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                
                valueResult = leftValue * rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '=':
                if result > 15999:
                    result = self.getMemoryValue(result)
                if leftOper > 15999:
                    leftOper = self.getMemoryValue(leftOper)
                
                leftValue = self.getMemoryValue(leftOper)
                self.setMemoryValue(result, leftValue)
                self.currentIndex += 1
            #Goto y GotoF
            elif operand == 'Goto':
                self.currentIndex = result
            elif operand == 'Gotof':
                leftValue = self.getMemoryValue(leftOper)
                if(leftValue == False):
                    self.currentIndex = result
                else:
                    self.currentIndex += 1
            #print
            elif operand == 'ERA':
                self.newLocalMemory = Memory(4000)
                self.newTempMemory = Memory(12000)
                self.currentFunc = result
                self.currentIndex += 1
                
            elif operand == 'PARAMETER':
                leftOperVal =  self.getMemoryValue(leftOper)
                memoria = self.paramTable[self.currentFunc][result-1]['dirMemoria']
                self.setMemoryValue(memoria, leftOperVal, True)
                self.currentIndex += 1

            elif operand == 'GOSUB':
                self.tempMemoryStack.append(self.newTempMemory)
                self.localMemoryStack.append(self.newLocalMemory)
                self.cuadAux.append(self.currentIndex)
                self.currentIndex = result
            elif operand == 'endproc':
                self.localMemoryStack.pop()
                self.tempMemoryStack.pop()
                self.currentIndex = self.cuadAux.pop() + 1
 
            elif operand == 'PRINT':
                if result > 15999:
                    pointer = self.getMemoryValue(result)
                    resultValue = self.getMemoryValue(pointer)
                else:
                    resultValue = self.getMemoryValue(result)
                self.output.append(resultValue)
                self.currentIndex += 1
                print(resultValue)

            elif operand == 'RETURN':
                resultValue = self.getMemoryValue(result)
                d = next(item for item in self.varTable['global'] if item['name'] == self.currentFunc)
                currentFuncSpace = d["dirMemoria"]
                self.setMemoryValue(currentFuncSpace, resultValue)
                self.currentIndex = self.cuadAux.pop() + 1
                self.localMemoryStack.pop()
                self.tempMemoryStack.pop()
            elif operand == 'VER':
                index = self.getMemoryValue(leftOper)
                if index < 0 or index > result:
                    sys.exit("Error: Index out of bounds")
                self.currentIndex += 1
            elif operand == 'ppgo':
                index = self.getMemoryValue(leftOper)
                newIndex = index + rightOper
                self.setMemoryValue(result, newIndex)
                self.currentIndex += 1
            #caso para matrices de dos dimensiones
            elif operand == '**':
                leftValue = self.getMemoryValue(leftOper)
                tempVal = leftValue * rightOper
                self.setMemoryValue(result, tempVal)
                self.currentIndex += 1
        #@@@@@@@@@@@@FUNCIONES ESPECIALES@@@@@@@@@@@@@@@@@@@@@
            elif operand == 'midpoint':
                memoryX1 = leftOper[0]
                memoryY1 = leftOper[1]
                memoryX2 = rightOper[0]
                memoryY2 = rightOper[1]
                x1 = self.getMemoryValue(memoryX1)
                y1 = self.getMemoryValue(memoryY1)
                x2 = self.getMemoryValue(memoryX2)
                y2 = self.getMemoryValue(memoryY2)
                self.midpoint(x1,y1,x2,y2)
                self.currentIndex += 1
            elif operand == 'distance':
                memoryX1 = leftOper[0]
                memoryY1 = leftOper[1]
                memoryX2 = rightOper[0]
                memoryY2 = rightOper[1]
                x1 = self.getMemoryValue(memoryX1)
                y1 = self.getMemoryValue(memoryY1)
                x2 = self.getMemoryValue(memoryX2)
                y2 = self.getMemoryValue(memoryY2)
                distance = self.distance(x1,y1,x2,y2)
                self.setMemoryValue(result, distance)
                self.currentIndex += 1

            elif operand == 'power':

                x = self.getMemoryValue(leftOper)
                power = self.getMemoryValue(rightOper)
                res = x **power
                self.setMemoryValue(result, res)
                self.currentIndex += 1
            elif operand == 'sqrt':
                x = self.getMemoryValue(leftOper)
                resultValue = math.sqrt(x)
                self.setMemoryValue(result, resultValue)
                self.currentIndex += 1

            else:
                self.currentIndex += 1
        return self.output


    def getMemoryValue(self, memorySpace):
        #Global Memory
        if memorySpace >= 0 and memorySpace < 4000:
            return self.globalMemory.getMemory(memorySpace)

        #Local Memory
        elif memorySpace >= 4000 and memorySpace < 8000:
            return self.localMemoryStack[-1].getMemory(memorySpace)
        
        #Constant Memory
        elif memorySpace >= 8000 and memorySpace < 12000:
            return self.constantMemory.getMemory(memorySpace)

        #Constant Memory
        elif memorySpace >= 12000 and memorySpace < 16000:
            return self.tempMemoryStack[-1].getMemory(memorySpace)
        elif memorySpace >= 16000 and memorySpace < 20000:
            return self.apMemory.getMemory(memorySpace)

    def setMemoryValue(self, memorySpace, value, param = False):
        #Global Memory
        if memorySpace >= 0 and memorySpace < 4000:
            return self.globalMemory.setMemory(memorySpace, value)

        #Local Memory
        elif memorySpace >= 4000 and memorySpace < 8000:
            if param:
                return self.newLocalMemory.setMemory(memorySpace, value)
            return self.localMemoryStack[-1].setMemory(memorySpace, value)
        
        #Constant Memory
        elif memorySpace >= 8000 and memorySpace < 12000:
            return self.constantMemory.setMemory(memorySpace, value)

        #Constant Memory
        elif memorySpace >= 12000 and memorySpace < 16000:
            if param:
                return self.newTempMemory.setMemory(memorySpace, value)
            return self.tempMemoryStack[-1].setMemory(memorySpace, value)
        else:
            return self.apMemory.setMemory(memorySpace, value)


    #@@@@@@@@@@@@@@@@@FUNCIONES ESPECIALES@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    def midpoint(self, x1, y1, x2 ,y2):
        xRes = (x1 + x2) / 2
        yRes = (y1 + y2) / 2
        result = "The midpoint of (" + str(x1) + ", " +   str(y1) + ")" + " and " + "(" + str(x2) + ", " +   str(y2) +") is: (" +str(xRes) + ", "+ str(yRes) + ")"
        self.output.append(result)
        print(result)
    
    def distance(self, x1, y1, x2 ,y2):
        distance = math.sqrt( ((x2-x1)**2)+((y2-y1)**2) )
        return distance
    
    
    
