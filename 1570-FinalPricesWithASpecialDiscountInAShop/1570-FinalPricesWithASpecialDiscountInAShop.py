# Last updated: 6/8/2025, 11:08:53 pm
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        st = []
        for i in range (len(prices)):
            while st and (prices[st[-1]]>=prices[i]):
                prices[st.pop()] -= prices[i]
            st.append(i)
        return prices
        