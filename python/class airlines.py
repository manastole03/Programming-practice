#Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a flight number, and a seat assignment. 
#A seat assignment has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.


class airline_ticket:
    def ticket(self,name,arrival,departure,flight_no,seat_no):
        self.name=name
        self.arrival=arrival
        self.departure=departure
        self.flight_no=flight_no
        self.seat_no=seat_no
        print('name of traveller: '+name+'\narrival: '+arrival+'\nfilght number of traveller: '+flight_no+'\ndeparture: '+departure+'\nseat number',seat_no)

obj1=airline_ticket()
n=input('enter the name of the traveller: ')
d=input('enter the departure: ')
f=input('enter the flight number: ')
a=input('enter arrival: ')
s=input('enter the seat number (XXXX): ')

obj1.ticket(n,a,d,f,s)
