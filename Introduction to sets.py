def average(array):
    # your code goes here
    s = sum(set(array))
    l = len(set(array))
    return s/l

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
