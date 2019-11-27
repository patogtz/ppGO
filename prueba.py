import sys
from antlr4 import *
from ppGOLexer import ppGOLexer
from ppGOParser import ppGOParser
from antlr4.tree.Trees import Trees
from ppGOListener import ppGOListener
from semanticCube import cuboSemantico
from flask import Flask, request, Response
import json
from flask_cors import CORS, cross_origin
prueba = Flask(__name__)
cors = CORS(prueba)

@prueba.route('/compile' , methods = ['POST'])
def compile():
    program = request.get_data()
    data = main(program.decode("utf-8")) 
    jsonData = json.dumps(data)
    return Response (jsonData)
@prueba.route('/hello')
def helloIndex():
    return 'Hello World from Python Flask!'

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
    return printer.outputs
  return ["Syntax error: Please check your syntax!"]
  

if __name__ == '__main__':
    prueba.run()























""" import sys
from antlr4 import *
from ppGOLexer import ppGOLexer
from ppGOParser import ppGOParser
from antlr4.tree.Trees import Trees
from ppGOListener import ppGOListener
from semanticCube import cuboSemantico

def main(argv):
  input_stream = FileStream(argv[1])
  lexer = ppGOLexer(input_stream)
  stream = CommonTokenStream(lexer)
  parser = ppGOParser(stream)
  
  tree = parser.program()
  if parser.getNumberOfSyntaxErrors() > 1:
    sys.exit("Error in syntaxis")
  printer = ppGOListener()
  walker = ParseTreeWalker()
  walker.walk(printer, tree)

  if parser.getNumberOfSyntaxErrors() == 0:
    print("PROGRAMA CORRECTO")
    


if __name__ == '__main__':
    main(sys.argv) """