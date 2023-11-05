# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
s = set()
for i in range(n):
    k = str(input())
    s.add(k)
print(len(s))
