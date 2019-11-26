from Memory import Memory
import sys
class VirtualMachine:
    def __init__(self, cuadruplos, localMemory, temporalMemory, globalMemory, constantMemory, funcTable, paramTable, varTable, apMemory):
        self.cuadruplos = cuadruplos
        self.localMemory = localMemory
        self.temporalMemory = temporalMemory 
        self.globalMemory = globalMemory
        self.constantMemory = constantMemory
        self.currentIndex = 0
        self.funcTable = funcTable
        self.localMemoryStack = []
        self.tempMemoryStack = []
        self.currentFunc = 0
        self.cuadAux = []
        self.paramTable = paramTable
        self.varTable = varTable
        self.apMemory = apMemory

    def execute(self):
        
        while self.currentIndex < len(self.cuadruplos):
            
            operand = self.cuadruplos[self.currentIndex][0]
            leftOper = self.cuadruplos[self.currentIndex][1]
            rightOper = self.cuadruplos[self.currentIndex][2]
            result = self.cuadruplos[self.currentIndex][3]
            #Checa Relop
            if operand == '<':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue < rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '>':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue > rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '==':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue == rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '<>':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue != rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '<=':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue <= rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '<=':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue <= rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            #Suma,Resta, Division, Multiplicacion y asignacion
            elif operand == '+':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue + rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '-':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue - rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '/':
                leftValue = self.getMemoryValue(leftOper)
                rightValue = self.getMemoryValue(rightOper)
                valueResult = leftValue / rightValue
                self.setMemoryValue(result, valueResult)
                self.currentIndex += 1
            elif operand == '*':
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
                self.currentFunc = result
                self.currentIndex += 1
                
            elif operand == 'PARAMETER':
                leftOperVal =  self.getMemoryValue(leftOper)
                newLocalMemory = Memory(4000)
                self.localMemoryStack.append(newLocalMemory)
                memoria = self.paramTable[self.currentFunc][result-1]['dirMemoria']
                self.setMemoryValue(memoria, leftOperVal)
                self.currentIndex += 1

            elif operand == 'GOSUB':
                self.cuadAux.append(self.currentIndex)
                self.currentIndex = result
            elif operand == 'endproc':
                self.localMemoryStack.pop()
                self.currentIndex = self.cuadAux.pop() + 1
 
            elif operand == 'PRINT':
                if result > 15999:
                    pointer = self.getMemoryValue(result)
                    resultValue = self.getMemoryValue(pointer)
                else:
                    resultValue = self.getMemoryValue(result)
                print(resultValue)
                self.currentIndex += 1
            elif operand == 'RETURN':
                resultValue = self.getMemoryValue(result)
                d = next(item for item in self.varTable['global'] if item['name'] == self.currentFunc)
                currentFuncSpace = d["dirMemoria"]
                self.setMemoryValue(currentFuncSpace, resultValue)
                self.currentIndex = self.cuadAux.pop() + 1
                self.localMemoryStack.pop()
            elif operand == 'VER':
                index = self.getMemoryValue(leftOper)
                if index < 1 or index > result:
                    sys.exit("Error: Index out of bounds")
                self.currentIndex += 1
            elif operand == 'ppgo':
                index = self.getMemoryValue(leftOper)
                newIndex = index + rightOper
                self.setMemoryValue(result, newIndex)
                self.currentIndex += 1
            
            else:
                self.currentIndex += 1

            
            
           
            
            


            
    def getMemoryValue(self, memorySpace):
        #Global Memory
        if memorySpace >= 0 and memorySpace < 4000:
            return self.globalMemory.getMemory(memorySpace)

        #Local Memory
        elif memorySpace >= 4000 and memorySpace < 8000:
            return self.localMemory.getMemory(memorySpace)
        
        #Constant Memory
        elif memorySpace >= 8000 and memorySpace < 12000:
            return self.constantMemory.getMemory(memorySpace)

        #Constant Memory
        elif memorySpace >= 12000 and memorySpace < 16000:
            return self.temporalMemory.getMemory(memorySpace)
        elif memorySpace >= 16000 and memorySpace < 20000:
            return self.apMemory.getMemory(memorySpace)

    def setMemoryValue(self, memorySpace, value):
        #Global Memory
        if memorySpace >= 0 and memorySpace < 4000:
            return self.globalMemory.setMemory(memorySpace, value)

        #Local Memory
        elif memorySpace >= 4000 and memorySpace < 8000:
            return self.localMemory.setMemory(memorySpace, value)
        
        #Constant Memory
        elif memorySpace >= 8000 and memorySpace < 12000:
            return self.constantMemory.setMemory(memorySpace, value)

        #Constant Memory
        elif memorySpace >= 12000 and memorySpace < 16000:
            return self.temporalMemory.setMemory(memorySpace, value)
        else:
            return self.apMemory.setMemory(memorySpace, value)
    
    
