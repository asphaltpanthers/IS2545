To compile:
javac -cp junit-4.12.jar;mockito-all-1.10.19.jar *.java

To execute tests:
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;mockito-all-1.10.19.jar;. org.junit.runner.JUnitCore AssertFailExample
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;mockito-all-1.10.19.jar;. org.junit.runner.JUnitCore LinkedListTest