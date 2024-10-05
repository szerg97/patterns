## Problem

You build an application where there are nodes and stuff, the whole
software is already in production, so you don't want to risk it to have
a potential bug source when you add new code to the project. Your new
task is to create a component that exports the data in XML format. Later,
it can happen that the customer will need a new export format, other
than XML.

## Solution

The Visitor pattern suggests that you place the new behavior into a 
separate class called visitor, instead of trying to integrate it into 
existing classes. The original object that had to perform the behavior 
is now passed to one of the visitor’s methods as an argument, providing
the method access to all necessary data contained within the object.