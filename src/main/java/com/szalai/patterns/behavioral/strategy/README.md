## Problem

One day you decide to have a Duck. After a while, your customers
want you to build a quack that can fly, but cannot quack. After that day,
they find out that they want a duck that still can fly but cannot quack.
Then they want to have different variants of quacks and flying methods
to be available. (Navigation example)

## Solution

Let's have as many interfaces as many behaviors categories the customer
wants (2). Implement these interfaces in different Behavior Impl classes.
In the root object (duck) make the behaviors changeable (setters),
so that it can change later.
