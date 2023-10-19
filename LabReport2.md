# Part 1
**StringServer Code:**
![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/95481af3-b9d0-4377-a3a6-81082ac5a93c)
For my StringServer code I used the NumberServer code from Week 2's lab work as a guideline for how my code should look and work.

**Screenshot 1**

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/32b71510-1809-4c45-973e-8acaffc3ee4e)
For this screenshot, the int variable num starts off as 0 and the String variable messages starts off as "". After I typed "/add-message?s=Hi" to the end of the url, the  method handleRequest(URI url) was called. The website's url was the argument for the method, and because I added "/add-message?s=Hi" to the end, the method ran the else if (url.getPath().contains("/add-message")) statement. It then created the String[] variable parameters, and by using the getQuery() method (which gets the query segment of the url), it assigned an array with two elements (one being the string before the "=" and the other being the string afterwards) to be the value of paramenters. From there, since the first part of the parameters array was "s", it ran the "if (parameters[0].equals("s"))" statement. This statement incremented the num variable by 1, and it added " num + ". " + parameters[1] + "\n" " to the messages variable. Since num is now 1, and parameters[1] is the string after the "=" in the query ("Hi"), the messages variable is now "1. Hi\n", and because of the "\n" at the end, anything added to the variable afterwards will begin on a new line. After that statement, it returned messages, which displays the messages variable on the website, as the image above shows.


**Screenshot 2**
![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/11dbbc4b-c535-4e40-8bb2-a58252e73423)
For this screenshot, because this was ran after the previous screenshot, the int variable num starts off as 1 and the String variable messages starts off as "1. Hi\n". After I typed "/add-message?s=Hello" to the end of the url, the  method handleRequest(URI url) was called, and it ran pretty much the same as how the previous screenshot did. This time, however, after the "if (parameters[0].equals("s"))" statement runs, the num variable is incremented by 1 again, and it adds " num + ". " + parameters[1] + "\n" " to the messages variable once again. Since num is now 2, and parameters[1] is the string after the "=" in the query ("Hello"), the messages variable is now "1. Hi\n2. Hello\n". Because of the "\n" strings in the messages variable, "1. Hi" and "2. Hello" will display on different lines, and anything added to messages afterwards will begin on a new line. After that statement, it returned messages, which displays the messages variable on the website, as the image above shows.

---
# Part 2
1. ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/91d4824c-4820-4fa3-83d0-b50bced46d0c)

    id_rsa is the private key, and the path is C:\Users\hslha\.ssh\id_rsa
2. ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/e0219ed8-b026-4f59-b17d-41cee5fe2075)

    id_rsa.pub is the public key, and the path is /home/linux/ieng6/cs15lfa23/cs15lfa23lg/.ssh/id_rsa.pub
3. ![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/b2094abd-a9ce-4a78-a947-d1dee4c63ead)

   I'm not sure why all of those quota statements are there, but I'm able to log into ieng6 without being asked for a password.


---
# Part 3
Something I learned from lab in week 3 is the mkdir command, which I did not know beforehand. I learned that its primary use is to make new directories. Furthermore, after running man mkdir, I learned other features of the command. For example, mkdir can be used to create multiple new directories with one line, and this is done by adding spaces between the names of the new directories when using mkdir (E.g. "mkdir dir1 dir2 dir3" creates three new directories with their respective names).
