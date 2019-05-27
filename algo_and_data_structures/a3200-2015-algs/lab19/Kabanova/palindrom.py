import sys


def find_char(array, char):
    for i in range(len(array) - 1, -1, -1):
        if array[i] == char:
            index = i
            return True, index
    return False, 0


def max_palindrom(string):
    if len(string) < 2:
        return string
    else:
        char = string[0]
        (char_exist, index) = find_char(string[1:], char)
        if char_exist:
            palindrom = [char] + max_palindrom(string[1:index + 1]) + [char]
        else:
            palindrom = []
        rest_palindrom = max_palindrom(string[1:])
    if len(palindrom) > len(rest_palindrom):
        return palindrom
    else:
        return rest_palindrom

if __name__ == "__main__":
    string = sys.stdin.readline()
    array_string = [str(k) for k in list(string)]
    sys.stdout.write("".join(max_palindrom(array_string)))

