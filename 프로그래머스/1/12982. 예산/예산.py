def solution(d, budget):
    d.sort()
    n = 0
    for i in range(len(d)):
        if budget >= d[i]:
            budget -= d[i]
            n += 1
        else:
            break
    return n