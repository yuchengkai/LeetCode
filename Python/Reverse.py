class Solution:
    # @return an integer
    def reverse(self, x):
        if x<0:
            return -self.reverse(-x)
        r=''
        while x>0:
            r=r+chr(x%10+48)
            x/=10
        if r=='':
            return 0
        r=int(r)
        if r>2147483647:
            return 0
        return r
s=Solution()
print s.reverse(123)