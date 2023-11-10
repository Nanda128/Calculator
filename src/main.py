print(
"""
Welcome To Da Epic Calculatrice

Made With Looove by Nanda and Samir 
"""
)

import addition
import subtraction

class Operand:
    def __init__(self, arg_count : int, handler):
        self.argc = arg_count
        self.handler = handler

handlers = {
        "add" : Operand(2, addition.add),
        "sub" : Operand(2, subtraction.sub),
        }



while True:
    operation = input("What would you like to do? [add, sub, mul, div] > ")
    chosen = handlers[operation]
    if chosen is not None:
        break
    else:
        print("Invalid Option")
        continue


inputs = []
for i in range(chosen.argc):
    inputs.append(int(input(f"Operand {i+1} > ")))

result = chosen.handler(*inputs)
print(f"Result > {result}")

