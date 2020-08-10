# Write a python program to add two matrices of the 3x3 size. 


def read(r,c,mat):
    for i in range(r):
        a=[]
        for j in range(c):
            a.append(int(input()))
        mat.append(a)

def dis(r,c,mat):
    for i in range(r):
        for j in range(c):
            print(mat[i][j],end=' ')
        print()

def add(r,c,mat1,mat2):
    res=[]
    for i in range(r):
        a=[]
        for j in range(c):
            a.append(mat1[i][j]+mat2[i][j])
        res.append(a)
    print('addition of matrix is : ')
    dis(r,c,res)

def main():

    mat1=[]
    mat2=[]

    print('enter the elements of 1st matrix ')
    read(3,3,mat1)

    print('enter the elements of 2nd matrix ')
    read(3,3,mat2)

    print('1st matrix is : ')
    dis(3,3,mat1)

    print('2nd matrix is : ')
    dis(3,3,mat2)

    add(3,3,mat1,mat2)

if __name__=='__main__':
    main()
