print(
"""
Welcome To Da Epic Calculatrice

Made With Looove by Nanda and Samir 
"""
)

class Operand:
    def __init__(self, args : list[str], handler):
        self.args = args
        self.handler = handler

handlers = {
        "add" : Operand(["Lhs", "Rhs"], lambda x, y: x + y),
        "sub" : Operand(["Lhs", "Rhs"], lambda x, y: x - y),
        "mul" : Operand(["Lhs", "Rhs"], lambda x, y: x * y),
        "div" : Operand(["Numerator", "Denominator"], lambda x, y: x / y)
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
for arg in chosen.args:
    inputs.append(int(input(f"{arg} > ")))

result = chosen.handler(*inputs)
print(f"Result > {result}")

