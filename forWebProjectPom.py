#!/usr/bin/python3
# -*- coding=UTF-8 -*-
import os
import sys

def addDependencyForPom(path,fname):
    if os.path.isfile(path+"/"+fname):
        f  = open(path+"/"+fname)
        content = f.read()
        f.close()
        lines = content.split('\n')
        for line in lines:
            str.strip(line)
        print(lines)
        # pos = lines.index('</dependencies>')
        # if pos != -1:
            # print(pos)
print(sys.argv)
print(len(sys.argv))
if len(sys.argv) > 2:
    addDependencyForPom(sys.argv[1],sys.argv[2])
else:
    print("example:python3 forWebProjectPom.py project pom.xml")

    


