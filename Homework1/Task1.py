
# Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

def div_zero(a, b):
    return a // b


def str_to_int(text):
    return int(text)


def file_not_found(filename):
    with open(filename, "r") as f:
        return f.read()