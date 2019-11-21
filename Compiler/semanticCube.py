class cuboSemantico():
    def __init__(self):
        self.cube = {
            #########################  INT  #############################
            "int": {
                "*" : {
                    "int": "int",
                    "float": "float",
                    "bool": "Error: Can't multiply int with bool",
                    "string": "Error: Can't multiply int with string"
                },
                "/" : {
                    "int": "float",
                    "float": "float",
                    "bool": "Error: Can't divide int with bool",
                    "string": "Error: Can't divide int with string"
                },
                "+" : {
                    "int": "int",
                    "float": "float",
                    "bool": "Error: Can't sum int with bool",
                    "string": "Error: Can't sum int with string"
                },
                "-" : {
                    "int": "int",
                    "float": "float",
                    "bool": "Error: Can't substract int with bool",
                    "string": "Error: Can't substract int with string"
                },
                "<" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare int with bool",
                    "string": "Error: Can't compare int with string"
                },
                ">" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare int with bool",
                    "string": "Error: Can't compare int with string"
                },
                ">=" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare int with bool",
                    "string": "Error: Can't compare int with string"
                },
                "==" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare int with bool",
                    "string": "Error: Can't compare int with string"
                },
                "<>" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare int with bool",
                    "string": "Error: Can't compare int with string"
                }
            },
            ######################### FLOAT #############################
            "float" : {
                "*" : {
                    "int": "float",
                    "float": "float",
                    "bool": "Error: Can't multiply float with bool",
                    "string": "Error: Can't multiply float with string"
                },
                "/" : {
                    "int": "float",
                    "float": "float",
                    "bool": "Error: Can't divide float with bool",
                    "string": "Error: Can't divide float with string"
                },
                "+" : {
                    "int": "float",
                    "float": "float",
                    "bool": "Error: Can't sum float with bool",
                    "string": "Error: Can't sum float with string"
                },
                "-" : {
                    "int": "float",
                    "float": "float",
                    "bool": "Error: Can't substract float with bool",
                    "string": "Error: Can't substract float with string"
                },
                "<" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare float with bool",
                    "string": "Error: Can't compare float with string"
                },
                ">" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare float with bool",
                    "string": "Error: Can't compare float with string"
                },
                ">=" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare float with bool",
                    "string": "Error: Can't compare float with string"
                },
                "==" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare float with bool",
                    "string": "Error: Can't compare float with string"
                },
                "<>" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "Error: Can't compare float with bool",
                    "string": "Error: Can't compare float with string"
                }
            },
            ######################### BOOL #############################
            "bool": {
                "*" : {
                    "int": "Error: Error: Can't multiply with bool.",
                    "float": "Error: Error: Can't multiply with bool.",
                    "bool": "Error: Can't multiply with bool.",
                    "string":  "Error: Can't multiply with bool."
                },
                "/" : {
                    "int": "Error: Can't divide with bool.",
                    "float": "Error: Can't divide with bool.",
                    "bool": "Error: Can't divide with bool.",
                    "string": "Error: Can't divide with bool."
                },
                "+" : {
                    "int": "Error: Cannot sum with bool",
                    "float": "Error: Cannot sum with bool",
                    "bool": "Error: Cannot sum with bool",
                    "string": "Error: Cannot sum with bool"
                },
                "-" : {
                    "int": "Error: Cannot substract with bool.",
                    "float": "Error: Cannot substract with bool.",
                    "bool": "Error: Cannot substract with bool.",
                    "string": "Error: Cannot substract with bool."
                },
                "<" : {
                    "int": "Error: Can't compare a bool this way.",
                    "float": "Error: Can't compare a bool this way.",
                    "bool": "Error: Can't compare a bool this way.",
                    "string": "Error: Can't compare a bool this way."
                },
                ">" : {
                    "int": "Error: Can't compare a bool this way.",
                    "float": "Error: Can't compare a bool this way.",
                    "bool": "Error: Can't compare a bool this way.",
                    "string": "Error: Can't compare a bool this way."
                },
                ">=" : {
                    "int": "Error: Can't compare a bool this way.",
                    "float": "Error: Can't compare a bool this way.",
                    "bool": "Error: Can't compare a bool this way.",
                    "string": "Error: Can't compare a bool this way."
                },
                "==" : {
                    "int": "Error: Can't compare bool with int",
                    "float": "Error: Can't compare bool with float",
                    "bool": "bool",
                    "string": "Error: Can't compare bool with string"
                },
                "<>" : {
                    "int": "Error: Can't compare bool with int",
                    "float": "Error: Can't compare bool with float",
                    "bool": "bool",
                    "string": "Error: Can't compare bool with string"
                }
            },
              ######################### STRING #############################
        
            "string": {
                "*" : {
                    "int": "Error: Can't multiply a string.",
                    "float": "Error: Can't multiply a string.",
                    "bool": "Error: Can't multiply a string.",
                    "string": "Error: Can't multiply a string."
                },
                "/" : {
                    "int": "Error: Can't divide a string.",
                    "float": "Error: Can't divide a string.",
                    "bool": "Error: Can't divide a string.",
                    "string": "Error: Can't divide a string."
                },
                "+" : {
                    "int": "Error: Can't sum a string with int.",
                    "float": "Error: Can't sum a string with float.",
                    "bool": "Error: Can't sum a string with bool.",
                    "string": "string"
                },
                "-" : {
                    "int": "Error: Can't substract a string with int.",
                    "float": "Error: Can't substract a string float.",
                    "bool": "Error: Can't substract a string bool.",
                    "string": "Error: Can't substract a string string."
                },
                "<" : {
                    "int": "Error: Can't compare a string.",
                    "float": "Error: Can't compare a string.",
                    "bool": "Error: Can't compare a string.",
                    "string": "Error: Can't compare a string."
                },
                ">" : {
                    "int": "Error: Can't compare a string.",
                    "float": "Error: Can't compare a string.",
                    "bool": "Error: Can't compare a string.",
                    "string": "Error: Can't compare a string."
                },
                ">=" : {
                    "int": "Error: Can't compare a string",
                    "float": "Error: Can't compare a string",
                    "bool": "Error: Can't compare a string",
                    "string": "Error: Can't compare a string"
                },
                "==" : {
                    "int": "Error: Can't compare a string with int.",
                    "float": "Error: Can't compare a string with float.",
                    "bool": "Error: Can't compare a string with bool.",
                    "string": "bool"
                },
                "<>" : {
                    "int": "Error: Can't compare a string with int.",
                    "float": "Error: Can't compare a string with float.",
                    "bool": "Error: Can't compare a string with bool.",
                    "string": "bool"
                }
            }
        }

        self.idOfOper = {
            '*' : 0,
            '/' : 1,
            '+' : 2,
            '-' : 3,
            '=' : 4,
            '<' : 5,
            '>' : 6,
            '<>' : 7,
            '==' : 8,
            '>=' : 9,
            '<=' : 10,
            'AND' : 11,
            'OR' : 12,
            'Goto' : 13,
            'GotoV' : 14,
            'GotoF' : 15
        }
        