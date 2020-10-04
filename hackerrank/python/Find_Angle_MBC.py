"""
ABC is a right angled triangle.
∠ABC = 90 degree.
Point M is the midpoint of hypotenuse AC.
You are given the lengths AB and BC. 
Your task is to find ∠MBC in degrees.
Input Format
The first line contains the length of side AB.
The second line contains the length of side BC.
Output Format
Output ∠MBC in degrees. 
Note: Round the angle to the nearest integer.
Sample Input
10
10
Sample Output
45°
"""

import math

ab = int(input())
bc = int(input())

h = math.sqrt(ab**2 + bc**2)
h = h / 2.0
adj = bc / 2.0
print(str(int(round(math.degrees(math.acos(adj/h))))) + "°")