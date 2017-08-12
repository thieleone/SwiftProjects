def checkifpalindrome(a):
	for i in range(0,len(a)):
		if a[i]!=a[len(a)-1-i]:
			return False
	return True

print(checkifpalindrome("legovogel"))
print(checkifpalindrome("notapalindrome"))