# Lab Report 5

## Part 1 – Debugging Scenario

1. ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/38882040-2824-4dd6-a1d9-1dbebb151bbc)

2. ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/e67a9409-622a-4cee-860a-f497f9fb2c34)

3. Terminal Output:

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/b625646f-034d-4fea-b10f-bedda062e59c)

Description: In the reverse() method, it created a new Array called "newList" that is meant to hold the values of the original list in reverse order. Then, the code would return newList. However, in the for loop that assigns these values to newList, the code was actually assigning the values of newList to the original list, without changing the values of newList. This meant that, when the method returned newList, it was returning it unchanged, with default elements (those elements all being 0).

4. Information Needed:

* The file & directory structure needed:
  - Buggy Code: /c/Users/hslha/OneDrive/Documents/GitHub/ListCopier.java
  - Bash Script: /c/Users/hslha/OneDrive/Documents/GitHub/test.sh
* The contents of each file before fixing the bug:
  - Buggy Code:

 ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/cc8ea15e-6806-4043-9f8a-a79c9bbbe657)
 
 - Bash Script:

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/f9d0bfc4-ec12-4bba-af0c-daf6b77cb1bf)

* The full command line (or lines) you ran to trigger the bug:
  - ```bash test.sh```

* A description of what to edit to fix the bug:
  - To fix the bug, the "original[i] = newList[index];" line in the code should be changed to be "newList[i] = original[index];"


## Part 2 – Reflection

**Something that I learned from my lab experience in the second half of this quarter that I didn't know before was how to use vim. I had heard of it before this class, but I didn't know anything about how it worked. It was very interesting to learn all of the commands, as well as finding out just how practical using vim could be, since I thought it'd be pointless when I was first learning about it. Although it's not the most optimal text editor, I found it to be quite intriguing to use.**
