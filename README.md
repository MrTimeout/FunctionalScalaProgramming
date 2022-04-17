# What is functional programming

## Fundamentals

Functional programming is based on _only pure functions_, or in other words, functions that have _no side effects_.

_Referencial transparency_ (RT) is a property of expressions in general and not just functions. That means that if we just
replace the expression by the final value, it won't change anything in the meaning of the program. Example: 2 + 3 could be replaced by 5.

We say that a function is _pure_ if its body is _RT_

The _substitution model_ is what we were talking before.

_Higher-order_ functions take other functions as arguments, and may themselves return functions as their output.
