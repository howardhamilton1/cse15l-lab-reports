# Lab Report 3
---
## Part 1 - Bugs

**Buggy Code:**
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```


**Failure-inducing input:**

```
@Test
  public void testReversedNotEmpty(){
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }
```

**Input that doesn't induce a failure:**
```
@Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```

**Symptom:**

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/2e79dddc-9585-48c7-8346-164c271d24e4)


**The bug:**

*Before Code:*
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```
*After Code:*
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
```

*Explanation:*
At first, the reversed() method would create a new array where every element contained only the default value: 0. Then, the for loop would put each 0 value into the array arr. After that, the method would return arr, which would be filled with only 0. The fix makes it so that the new array has its elements replaced with arr's elements in reverse order. Then, when newArray is returned, its contents are arr's contents reversed.

---

## Part 2 - Researching Commands
**Command: find**

1. -size

This flag finds files and directories in Linux based on their size occupied in the memory.

Source: [https://beebom.com/find-command-linux/](https://beebom.com/find-command-linux/)

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/c058a324-0e7f-4b05-94dc-b697b8b17ff3)


In this case, the find command searches through the technical directory for files and directories that have a size equal to 100 bits. This is useful for searching for files based on how much content they contain.

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/c7b438af-2083-4574-b1ea-11666c9868fc)

In this case, the find command searches through files (not directories) and returns those with a size less than 1 MB. This means that the command allows you to search for files that have a size above or below what you are looking for, which is useful for searching for files that are very large or small.

2. -iname

This option is similar to -name because it is used to specify the name of the file or folder, although it is not case sensitive.

Source: [https://beebom.com/find-command-linux/](https://beebom.com/find-command-linux/)

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/2bcf88ca-c28a-4a1c-95e0-926f818050d3)

In this case, the find command searches through the technical directory for a file or directory named "media", and in this example it finds the "Media" directory because -iname is not case sensitive. This is useful because, if you're uncertain if a file or directory contains an uppercase or lowercase letter, you can use -iname to search for it without being case sensitive.

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/8494fecc-7ec3-4bc1-8aec-b55583fddcb9)

In this case, the find command searches for a file or directory that starts with "go", and several end up being found in this example. This is useful because, if you don't remember the exact name of a file or directory, then you can still search for them without it being case sensitive.

3. -maxdepth

With this option, you can limit the depth of searches. You're able to choose number of directories you want find to descend into after the starting point.

Source: [https://www.redhat.com/sysadmin/linux-find-command](https://www.redhat.com/sysadmin/linux-find-command)

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/5adaa237-5dbc-49af-ad28-f207571b5b42)

In this case, the find command searches for a file within 1 directory of the technical directory, which means that it searches only the technical directory for a file. This is useful because it allows you to limit your search for files or directories, rather than searching through all of them that are inside the technical directory.

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/6d01e19e-ab51-4c78-8cd4-7fc16fbab04f)

In this case, the find command searches for directories that are within 2 directories of the technical directory, which is limited to the technical directory itself, directories inside technical, and directories inside of those directories. This is useful because it allows you to limit your searches to be at a certain point, which makes for more efficient searching.

4. -empty

This flag is used to search for files and directories that are empty.

Source: [https://www.freecodecamp.org/news/how-to-search-files-effectively-in-linux/](https://www.freecodecamp.org/news/how-to-search-files-effectively-in-linux/)

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/a19fbcde-3b71-4c58-85e8-0ccad215f84e)

In this case, the find command searches for files and directories in the technical directory that are empty, or have no contents, and it finds one. This is useful because it allows you to search for empty files or directories that you may want to modify or delete.

*Ex:*

![image](https://github.com/howardhamilton1/cse15l-lab-reports/assets/141745300/6a29b316-c777-44d8-a955-b1f39c438fdc)

In this case, the find command searches for directories in the technical directory that are empty, and nothing is printed out because it could not find any. This is useful because it allows you to easily search for either files or directories that have no contents, which is much more efficient than searching manually.
