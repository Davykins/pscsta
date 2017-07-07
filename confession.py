input = f.open("confession.txt")
lines = input.readlines()
print lines
for i in range(1, int(lines[0])+1):
    currentprob = lines[i].strip().split()
    wins - {}
    loses = {}
    if currentprob[0] not in wins.keys():
        wins[currentprob[0]]=1
        if currentprob[1] not in loses.keys():
            loses