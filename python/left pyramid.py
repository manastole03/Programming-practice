# To create left half star pyramid (*)

def pattern(n):
    k = 2 * n - 2
    for i in range(0, n):

        k = k - 1
        for j in range(0, i + 1):
            print("*", end=" ")
        print("\r")

rows=int(input('enter the number of rows : '))
pattern(rows)
