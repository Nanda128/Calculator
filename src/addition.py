def add(*args : int) -> int:
    s : int = 0
    for a in args:
        s += a
    return s 
