# Lab Report 4

---

## Step 4: Log into ieng6

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/90e56207-98a5-44c7-a55a-3012adfc639f)


Keys pressed: s, s, h, < spacebar >, c, s, 1, 5, l, f, a, 2, 3, l, g, @, i, e, n, g, 6, ., u, c, s, d, ., e, d, u, < enter >

The "ssh" command lets you access a remote computer or virtual machine securely over a network connection. With this, I used the command to login to my ieng6 account on Github.

## Step 5: Clone your fork of the repository from your Github account (using the SSH URL)

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/d2a4a100-3c6e-4581-b2e1-3307b160783c)


Keys pressed: g, i, t, < spacebar >, c, l, o, n, e, < spacebar >, g, i, t, @, g, i, t, h, u, b, ., c, o, m, :, h, o, w, a, r, d, h, a, m, i, l, t, o, n, 1, /, l, a, b, 7, ., g, i, t

After forking the lab7 repository from Github, I used the "git clone" command, which clones the repository to my ieng6 terminal that I opened. I used the git clone command with the SSH key that I found on my fork of the repository.

## Step 6: Run the tests, demonstrating that they fail

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/581cd960-dd03-4e8d-a7a3-801d6318a4fc)

Keys pressed: b, a, s, h, < spacebar >, t, e, s, t, ., s, h

The test.sh file compiles both ListExamples.java and ListExamplesTests.java, then it runs the tests in ListExamplesTests.java. I used the "bash" command to read and execute the commands in test.sh, and it returned the results for the tests in ListExamplesTests.java. It shows that, though two tests were run, one of them failed due to the test timing out.

## Step 7: Edit the code file to fix the failing test

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/87feed95-2165-483e-af9c-f03fce2b7ae1)


Keys pressed: 4, 3, j, 6, l, d, w, i, i, n, d, e, x, 2, < space >, < esc >, :, w, q, !, < enter >

To edit the code, I typed the command "vim ListExamples.java", which opens vim and allows me to make edits to the file. Once in vim, I typed "43j" in order to move the cursor down 43 times. Then, I typed "6l" to move the cursor to the right 6 times. This placed the cursor on the "i" of the word "index1". The test in ListExamplesTests.java failed because this particular "index1" is meant to be "index2". To change this code, I first typed "dw", which deletes the entire word. Then, I typed "i", which puts vim in insert mode. Insert mode allows you to insert text into the file, so while in insert mode I typed "index2 < space >" to add the word index2 to the code appropriately. I then pressed the < esc > key, which brought vim out of insert mode and back into normal mode. After that, I typed ":wq! < enter >", which saves the changes I made and then subsequently exits vim.

## Step 8: Run the tests, demonstrating that they now succeed

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/d14d3808-5941-41f8-93fd-4b26f42106c1)

Keys pressed: b, a, s, h, < spacebar >, t, e, s, t, ., s, h

I used the same "bash test.sh" command from earlier to rerun the tests, and because of the change I made to the ListExamples.java file, both tests now succeed without any errors.

## Step 9: Commit and push the resulting change to your Github account (you can pick any commit message!)

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/542140e3-f533-4041-92be-c740a45e173e)

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/4e1b5aec-7cc4-4d00-8b48-f894d414a717)


Keys pressed: g, i, t, < spacebar >, a, d, d, < spacebar >, L, i, s, t, E, x, a, m, p, l, e, s, ., j, a, v, a, < enter >, g, i, t, < spacebar >, c, o, m, m, i, t, < spacebar >, -, m, < spacebar >, ", a, d, d, e, d, < spacebar >, c, h, a, n, g, e, s, ", < enter >, g, i, t, < spacebar >, p, u, s, h

To commit and push the change I made to ListExamples.java to my Github account, I first used the command "git add ListExamples.java", which added the changes I made to ListExamples to the staging area. This means that, when I commit the changes, it will recognize the changes I made to ListExamples. After this, I ran the command "git commit -m "added changes"", which commits (saves) the changes I made to the ListExamples.java file, as well as returning "added changes" as a commit message. Finally, I ran the "git push" command, which uploads my local repository content to the Github repository. This pushes the changes I made to the ListExamples.java file to my Github account.
