def texteditor(file):
	print(file)
	fi=open(file,'r+')
	print(fi.read())
	fi.close()
texteditor('testfile')
