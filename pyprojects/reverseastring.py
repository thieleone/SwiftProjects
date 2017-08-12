def reverseastring(inputstring):
	print(inputstring)
	reversestring=""
	for x in range(len(inputstring)-1,-1,-1):
		reversestring+=inputstring[x]
	print(reversestring)
reverseastring("TeSt")
