# To get the calendar of the specific month and year from the user input

import calendar

y = int(input("Input the year (YYYY) : "))
m = int(input('Input the month (MM) : '))

print(calendar.month(y,m))
