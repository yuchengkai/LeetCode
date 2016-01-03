class Solution:
	# @return an integer
	def lengthOfLongestSubstring(self, s):
		l=len(s)
		if l<2:
			return l
		i=0
		r=1
		while i<l-1:
			j=i+1
			a={}
			a[s[i]]=i
			while j<l and s[j] not in a:
				a[s[j]]=j
				j+=1
			r=max(r,j-i)
			if j==l:
				break
			i=a[s[j]]+1
		return r
s=Solution()
print s.lengthOfLongestSubstring('abcabcbb')