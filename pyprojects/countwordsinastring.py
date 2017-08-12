def countwordsinastring(a):
	counter=1
	for i in a:
		if i==" ":
			counter+=1
	return counter

print(countwordsinastring("Das ist ein String mit sieben Woertern."))