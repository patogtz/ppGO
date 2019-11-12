import sys
from antlr4 import *
from ppGOLexer import ppGOLexer
from ppGOParser import ppGOParser
from antlr4.tree.Trees import Trees
from ppGOListener import ppGOListener
from semanticCube import cuboSemantico
from flask import Flask, request
from flask_cors import CORS, cross_origin
prueba = Flask(__name__)
cors = CORS(prueba)

@prueba.route('/compile' , methods = ['POST'])
def compile():
    program = request.get_data()
    print(program)
    main(program.decode("utf-8")) 
    return "okay"

def main(f):
  input_stream = InputStream(f)
  lexer = ppGOLexer(input_stream)
  stream = CommonTokenStream(lexer)
  parser = ppGOParser(stream)
  tree = parser.program()
  printer = ppGOListener()
  walker = ParseTreeWalker()
  walker.walk(printer, tree)
  if parser.getNumberOfSyntaxErrors() == 0:
    print("PROGRAMA CORRECTO")

if __name__ == '__main__':
    prueba.run()
    cubo = cuboSemantico().cube
    cubo["int"]["*"]["float"]
    print(cubo["int"]["*"]["float"])