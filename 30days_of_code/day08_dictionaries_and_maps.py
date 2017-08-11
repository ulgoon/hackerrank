n = int(input())
info_dict = {}

for i in range(n):
    infos = input().split()
    info_dict[infos[0]] = infos[1]
                
for i in range(n):
    info_query = input()
                                
    if not info_query in info_dict:
        print("Not found")
    else:
        print("%s=%s" % (info_query, info_dict[info_query]))
