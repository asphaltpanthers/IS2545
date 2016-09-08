# IS2545 - Software Quality Assurance
Fall Semester 2016

* DUE: 15 Sept 2016

## Deliverable 1

For this assignment, your group will determine a test plan for the simple game Coffee Maker Quest, based on the requirements listed.  There are several known defects in the software; you will need to find and report on at least three.  Additionally, a traceability matrix showing the mapping of test cases to requirements is required.

Time will be given in class to group yourself into groups. There may be 1-3 members in a group. One member of each group should email me the names of the members of your group and which LeanTesting project will contain your final project.

There should be at least as many test cases as requirements, although I would normally expect several test cases per requirement.  As a bare minimum for a passing grade, the number of test cases is at least 2x the number of requirements.  If the number of test cases is more than 4x the number of requirements, you are probably overtesting.  Approximately 3x is a good number to shoot for, although more importantly, ensure that you are testing a good variety of base, edge, and corner cases.

Each requirement should have AT LEAST one test case associated with it, and each test should have EXACTLY ONE requirement associated with it.  This can easily be checked via a traceability matrix.

Test cases should mention all necessary preconditions, execution steps, and postconditions.  

It is NOT necessary to make multiple test plans inside a test suite; it is enough for there to be one test plan.

I expect you to test several edge cases or corner cases as part of the test plan.  Do not test only base cases or the happy path.  Remember that users will not always be gentle to the program!

It is expected that you actually execute the test plan in order to find the defects.  There are AT LEAST three.  Full credit will be given only to those who properly find and describe at least three.  While you are not expected to find all of the defects, a reasonable test plan should definitely find at least three.  This is an (intentionally) target-rich environment.

## Format
Please hand in the paper to me with a cover page with:
* The name of the project under test
* The names of the people in the group
* The title "IS 2545 - DELIVERABLE 1: Test Plan and Traceability Matrix"

There should be a short introduction (a few paragraphs) in which you should note any concerns or difficulties you may have had or anticipate with the testing process.  You should also note why you considered certain test cases, how you thought of edge cases, etc.

ON A SEPARATE PAGE, a traceability matrix should be provided mapping the test cases with their associated requirements.  Remember that all requirements should map to AT LEAST ONE test case, and all test cases should map to EXACTLY ONE requirement.

An example traceability matrix:  
Requirement | Test Case  
FUN-ITERATION | Case #1  
FUN-UNKOWN-COMMAND | Case #2,3  
etc.

The rest of the deliverable will be graded online. At the end of class Sept 15, I will remove access to LeanTesting.

Required test case fields:  
	Title  
	Preconditions  
	Expected result  
	Steps to execute  
	
Required bug fields:  
	Title  
	Severity  
	Description  
	Expected Results  
	Steps to reproduce (The actual result should be the last step.)  

## Grading
* Introduction: 10% of grade
* Test Plan: 40% of grade
* Traceability Matrix: 20% of grade
* Defects Found and Described: 30% of grade

## Coffee Maker Quest
Coffee Maker Quest is a simple game.  The goal is get coffee, sugar, and cream, and then drink it so that you can stay up and study.  In order to do so, you need to visit several rooms in a house and look around.  Once you have obtained all the necessary elements, you win.  If you decide to drink before getting all of the necessary elements, you lose.

You can run it downloading the coffeemaker.jar file and running:
```bash
java -jar coffeemaker.jar
```

The requirements are listed in the file requirements.txt.

Please feel free to email me at diser@pitt.edu or come to office hours to discuss any problems you have. 
 
