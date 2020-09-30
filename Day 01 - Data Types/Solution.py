i = 4
d = 4.0
s = 'HackerRank '

# Declare second integer, double, and String variables.
# Read and save an integer, double, and String to your variables.
in_i = int(input())
in_d = float(input())
in_s = input()

# Print the sum of both integer variables on a new line.
sum = in_i + i
print('%d\r' %sum)

# Print the sum of the double variables on a new line.
sum_d = in_d + d
print('%.1f\r' %sum_d)

# Concatenate and print the String variables on a new line
# The 's' variable above should be printed first.
new_s= s + in_s
print('%s\r' %new_s)