import sys
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
#   print(Trees.toStringTree(tree, None, parser))
  printer = ppGOListener()
  walker = ParseTreeWalker()
  walker.walk(printer, tree)

  if parser.getNumberOfSyntaxErrors() == 0:
    print("PROGRAMA CORRECTO")


if __name__ == '__main__':
    main(sys.argv)
    cubo = cuboSemantico().cube
    cubo["int"]["*"]["float"]
    print(cubo["int"]["*"]["float"])