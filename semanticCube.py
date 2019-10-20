class cuboSemantico():
    def __init__(self):
        self.cube = {
            #########################  INT  #############################
            "int": {
                "*" : {
                    "int": "int",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "/" : {
                    "int": "float",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "+" : {
                    "int": "int",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "-" : {
                    "int": "int",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "<" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                ">" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                ">=" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                "==" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                "<>" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                }
            },
            ######################### FLOAT #############################
            "float" : {
                "*" : {
                    "int": "float",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "/" : {
                    "int": "float",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "+" : {
                    "int": "float",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "-" : {
                    "int": "float",
                    "float": "float",
                    "bool": "error",
                    "string": "error"
                },
                "<" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                ">" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                ">=" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                "==" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                },
                "<>" : {
                    "int": "bool",
                    "float": "bool",
                    "bool": "error",
                    "string": "error"
                }
            },
            ######################### BOOL #############################
            "bool": {
                "*" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "/" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "+" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "-" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "<" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                ">" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                ">=" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "==" : {
                    "int": "error",
                    "float": "error",
                    "bool": "bool",
                    "string": "error"
                },
                "<>" : {
                    "int": "error",
                    "float": "error",
                    "bool": "bool",
                    "string": "error"
                }
            },
              ######################### STRING #############################
        
            "string": {
                "*" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "/" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "+" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "string"
                },
                "-" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "<" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                ">" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                ">=" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "error"
                },
                "==" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "bool"
                },
                "<>" : {
                    "int": "error",
                    "float": "error",
                    "bool": "error",
                    "string": "bool"
                }
            }
        }
          
