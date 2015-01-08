Tiffany Chen
tiffanychen10@gmail.com
Submission for Entry Level Developer

THOUGHTWORKS SALES TAX - JAVA
==============================================

PROBLEM
==============================================

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.

When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total cost of the items, and the total amounts of sales taxes paid.  The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax.

Write an application that prints out the receipt details for these shopping baskets...

INPUT:

Input 1:
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

Input 2:
1 imported box of chocolates at 10.00
1 imported bottle of perfume at 47.50

Input 3:
1 imported bottle of perfume at 27.99
1 bottle of perfume at 18.99
1 packet of headache pills at 9.75
1 box of imported chocolates at 11.25

OUTPUT

Output 1:
1 book : 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.50
Total: 29.83

Output 2:
1 imported box of chocolates: 10.50
1 imported bottle of perfume: 54.65
Sales Taxes: 7.65
Total: 65.15

Output 3:
1 imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 9.75
1 imported box of chocolates: 11.85
Sales Taxes: 6.70
Total: 74.68


USAGE
==============================================
SalesTaxJava takes a text file as input and outputs a formatted receipt. To run the program in terminal, navigate to the "SalesTaxJava" top directory and then to the "src" directory. (You MUST be in the "src" directory)

First, compile!
$javac SalesTaxJava.java

Then, run the program!
$java SalesTaxJava

The program will then prompt you for the name of the file that you would like to use as input. Enter the filename of the file that contains the input data with the extension. Like this:

Filename (with the extension please!): example.txt


USING YOUR OWN DATA
==============================================
To use your own data, add your text file directly to the "SalesTaxJava" directory. Your data must be in a text file and must be organized in the following format:

# [quantity] [name of item] at [price]

#Example:
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

Then, follow the same instructions for usage.


USING EXAMPLE INPUT DATA
==============================================
Example input data is located in the "SalesTaxJava" directory. When prompted in the program, type in the full filename.

Filename (with the extension please!): example1.txt OR
Filename (with the extension please!): example2.txt OR
Filename (with the extension please!): example3.txt

(There are only 3, and then you gotta make your own.)

ADDING EXEMPTIONS
==============================================
You can add exemptions to the basic sales tax by editing "exemptions.txt" in the "SalesTaxJava" directory.  Add the appropriate keywords. One keyword per line, and use the singular to cover singular and plural forms of the keyword.

For example, the keyword "chocolate" will flag both "chocolate bar" and "box of chocolates" for tax exemption.


ASSUMPTIONS
==============================================
This program assumes that input data will be formatted correctly and saved in the correct directory. It also assumes the program will be run in terminal.


DEPENDENCIES
==============================================
Java >= 1.7
