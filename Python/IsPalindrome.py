class Solution:
	# @return a boolean
	def isPalindrome(self, x):
		if x<0:
			return False
		l=0
		i=1
		while i<=x:
			i*=10
			l+=1
		i=l/2
		while i>0:
			if (x/10**(i-1))%10!=(x/10**(l-i))%10:
				return False
			i-=1
		return True
s=Solution()
print s.isPalindrome(121)