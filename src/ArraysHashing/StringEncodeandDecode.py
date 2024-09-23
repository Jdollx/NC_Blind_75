# String Encode and Decode
# Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
# Medium - 9/23/2024

class Solution:

    # need to concatenate input into one string
    # then put it back how it was

    def encode(self, strs: List[str]) -> str:
        delimiter = ','
        # join strings based on ,
        return delimiter.join(strs)

    def decode(self, s: str) -> List[str]:
        delimiter = ','
        # split strings based on , 
        return s.split(delimiter)
