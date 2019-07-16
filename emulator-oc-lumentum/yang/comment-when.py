from __future__ import print_function
import sys
import os

filename = sys.argv[1]
content = []
with open(filename, 'r') as f:
	content = f.readlines()
	start_count = False
	count = 0
	for i in range(len(content)):
		if "when \"" in content[i]:
			content[i] = "/* " + content[i]
			print(str(i) + ": " + content[i])
			start_count = True
		if start_count:
			if "{" in content[i]:
				count = count + 1
			if "}" in content[i]:
				count = count - 1
			if count == 0:
				content[i] = content[i].strip() + " */\n"
				count = 0
				start_count = False
				print(str(i) + ": " + content[i])
# write to file
with open(filename, 'w') as f:
	for i in range(len(content)):
		f.write(content[i])
