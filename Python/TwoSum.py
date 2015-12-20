class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map={}
        l=len(nums)
        for i in range(l):
            map[nums[i]]=i
        for i in range(l):
            j=target-nums[i]
            if map.has_key(j):
                if i!=map[j]:
                    if map[j]>i:
                        return (i+1,map[j]+1)
                    else:
                        return (map[j]+1,i+1)
s=Solution()
print s.twoSum([2,7,11,15],9)