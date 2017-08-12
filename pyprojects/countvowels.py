def countvowels(a):
	vowcounter=[0,0,0,0,0,0]
	for i in a:
		if(i=="a" or i=="A"):
			vowcounter[0]+=1
		elif(i=="e" or i=="E"):
			vowcounter[1]+=1
		elif(i=="i" or i=="I"):
			vowcounter[2]+=1
		elif(i=="o" or i=="O"):
			vowcounter[3]+=1
		elif(i=="u" or i=="U"):
			vowcounter[4]+=1
		else:
			vowcounter[5]+=1
	print("Der String enthielt "+str(vowcounter[0])+" mal den Vokal a.")
	print("Der String enthielt "+str(vowcounter[1])+" mal den Vokal e.")
	print("Der String enthielt "+str(vowcounter[2])+" mal den Vokal i.")
	print("Der String enthielt "+str(vowcounter[3])+" mal den Vokal o.")
	print("Der String enthielt "+str(vowcounter[4])+" mal den Vokal u.")
	print("Der String enthielt "+str(vowcounter[5])+" andere Zeichen.")

countvowels("Dasistein T E s T.")