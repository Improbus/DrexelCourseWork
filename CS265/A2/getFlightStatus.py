#!/usr/bin/python

import urllib
import sets

URL = 'http://www.phl.org/cgi-bin/fidsarrival.pl'

sock = urllib.urlopen( URL )
doc = sock.readlines()
sock.close()

AmericanFlights = []
ContinentalFlights = []
DeltaFlights = []
NorthwestFlights = []
SouthwestFlights = []
UnknownFlights = []
UsairFlights = []
FlightDictionary = {}
FlightNumberDictionary = {}



for i in range( 11 , int(len(doc)-1) ):
	getAirline = doc[i].split("  ",1)
	getFlightNumber = doc[i].split()
	if getAirline[0] == "AMERICAN" :
		AmericanFlights.append(getAirline[1])
		FlightDictionary["AMERICAN"]=AmericanFlights
	if getAirline[0] == "CONTINENTAL" :
		ContinentalFlights.append(getAirline[1])
		FlightDictionary["CONTINENTAL"]=ContinentalFlights
	if getAirline[0] == "DELTA" :
		DeltaFlights.append(getAirline[1])
		FlightDictionary["DELTA"]=DeltaFlights
	if getAirline[0] == "NORTHWEST" :
		NorthwestFlights.append(getAirline[1])
		FlightDictionary["NORTHWEST"]=NorthwestFlights
	if getAirline[0] == "SOUTHWEST" :
		SouthwestFlights.append(getAirline[1])
		FlightDictionary["SOUTHWEST"]=SouthwestFlights
	if getAirline[0] == "UNKNOWN" :
		UnknownFlights.append(getAirline[1])
		FlightDictionary["UNKNOWN"]=UnknownFlights
	if getAirline[0] == "USAIR" :
		UsairFlights.append(getAirline[1])
		FlightDictionary["USAIR"]=UsairFlights
	FlightNumberDictionary[getFlightNumber[1]]= doc[i]
 
def StartMenu():
	print "1" + " " + "Lookup Flight By Company"
	print "2" + " " + "Lookup Flight By Number"
	print "3" + " " + "Exit the Program"
	StartMenuChoice = raw_input("Please Make A Numeric Menu Selection:   ")
	if StartMenuChoice == "1":
		menu()
	if StartMenuChoice == "2":
		flightnumber = raw_input("Please Enter the Flight Number:  ")
		print  FlightNumberDictionary[flightnumber]
		StartMenu()
	if StartMenuChoice == "3":
		return 0

def menu():

	MenuNames = FlightDictionary.keys()

	for i in range(0, len(MenuNames)):
		print str(i) + " " + MenuNames[i]
	
	menuchoice = raw_input("Please Enter the Number of the Flight Company You Wish to See:     " )

	if menuchoice == "0" :
		for i in range(0, len(UsairFlights) ):
			print UsairFlights[i]
		StartMenu()
	if menuchoice == "1" :
		for i in range(0, len(UnknownFlights) ):
			print UnknownFlights[i]
		StartMenu()
	if menuchoice == "2" :
		for i in range(0, len(ContinentalFlights) ):
			print ContinentalFlights[i]
		StartMenu()
	if menuchoice == "3" :
		for i in range(0, len(AmericanFlights) ):
			print AmericanFlights[i]
		StartMenu()
	if menuchoice == "4" :
		for i in range(0, len(NorthwestFlights) ):
			print Northwest[i]
		StartMenu()
	if menuchoice == "5" :
		for i in range(0, len(DeltaFlights) ):
			print DeltaFlights[i]
		StartMenu()
	if menuchoice == "6" :
		for i in range(0, len(SouthWest) ):
			print SouthWest[i]
		StartMenu()

StartMenu()
