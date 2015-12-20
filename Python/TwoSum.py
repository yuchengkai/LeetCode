class Solution:
    # @return a tuple, (index1, index2)
    def twoSum(self, num, target):
        map={}
        l=len(num)
        for i in range(l):
            map[num[i]]=i
        for i in range(l):
            j=target-num[i]
            if map.has_key(j):
                if i!=map[j]:
                    if map[j]>i:
                        return (i+1,map[j]+1)
                    else:
                        return (map[j]+1,i+1)
s=Solution()
print s.twoSum([2,7,11,15],9)