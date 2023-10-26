def solution(n):
    answer = ''
    a = 1
    while a != n+1:
        if a % 2 == 1:
            answer += "수"
            a += 1
        else:
            answer += "박"
            a += 1
    return answer