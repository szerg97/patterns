## Problem

You have your application which has evolved in time, but it lacks
of some sequential functionality where ordering matters.
For example, an auth handler, so you implement it. After that you realize, 
that you also lack of caching and later validation as well. 
So you end up with modifying your code a lot.

## Solution

Instead of having a trouble implementing these things in their own time,
encapsulate their functionalities in different Handlers.
A handler has a reference to the next handler, which then has a
reference to the next and so on... Ensures the order between the functions.
