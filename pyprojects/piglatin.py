def piglatin(pigl):
	pigl+="-"
	pigl+=pigl[0]
	pigl+="ay"
	pigl=pigl[1:]
	return pigl
print(piglatin("Computer"))
