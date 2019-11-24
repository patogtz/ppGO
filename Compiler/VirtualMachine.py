class VirtualMachine:
    def __init__(self, cuadruplos, localMemory, temporalMemory, globalMemory, constantMemory):
        self.cuadruplos = cuadruplos
        self.localMemory = localMemory
        self.temporalMemory = temporalMemory 
        self.globalMemory = globalMemory
        self.constantMemory = constantMemory
        self.currentIndex = 0

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
                leftValue = self.getMemoryValue(leftOper)
                valueResult = leftValue
                self.setMemoryValue(result, valueResult)
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
            elif operand == 'PRINT':
                resultValue = self.getMemoryValue(result)
                print(resultValue)
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

    def setMemoryValue(self, memorySpace, value):
        #Global Memory
        if memorySpace >= 0 and memorySpace < 4000:
            self.globalMemory.setMemory(memorySpace, value)

        #Local Memory
        elif memorySpace >= 4000 and memorySpace < 8000:
            return self.localMemory.setMemory(memorySpace, value)
        
        #Constant Memory
        elif memorySpace >= 8000 and memorySpace < 12000:
            return self.constantMemory.setMemory(memorySpace, value)

        #Constant Memory
        elif memorySpace >= 12000 and memorySpace < 16000:
            return self.temporalMemory.setMemory(memorySpace, value)


    
    