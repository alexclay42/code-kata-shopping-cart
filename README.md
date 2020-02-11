# CODE-KATA-Shopping-Cart

## Solution
This is a Java solution, written in Java 11.

I approached the problem sequentially, first adding in functionality to loop through and sum A values and to add the
discount, then making sure that was working as needed before continuing onto adding in B. I initially had some trouble
equating the values as the value read from the cart was a char and I was attempting to equate this to a string. I solved
this by creating a string of all the possible shopping cart values, and accessing each value through charAt().

I wrote and tested the code using IntelliJ IDEA.


It took around 20 minutes to code, some of which was spent refreshing my memory of the Java syntax.

## Workflow
- Treat this like a real assignment, but only spend up to two hours on it - it doesn't matter how far you get
- Fork the project to your personal Github account (click on the fork button in the top right corner)
- Clone the forked version of this repository
- Include a `README`
- Push your work up to your fork
- Submit a link to your forked repository

## Instructions
You should implement a supermarket checkout which:
- always accepts a string of items and gives back the total price
- discounts any offers from the total price

Use the following pricing information:

| Item  | Price | Offer     |
| :---: | :---: | :---:     |
| A     | 50    | 3 for 130 |
| B     | 30    | 2 for 37  |
| C     | 20    | N/A       |
| D     | 10    | N/A       |

For example:
- `'DABA'` gives `140`
- `'BBBB'` gives `74`
