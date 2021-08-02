# Bank-AccountApplication

Bank Application 

Scenario - You are a backend developer and need to create an application to handle new customer bank account request .

What this application do ? 

Read a .CSV file of names , social security number, account type and initial deposit .

Use a proper data structure to hold all these accounts .

Both savings and checking account share following properties - 

Deposit ()
Withdraw()
Transfer ()
ShowInfo()
 
11 digit account number ( generated with the following process  1 or 2 depending on savings and checking ,last two digits of SSN , unique 5 digit number and random 3 digit number ) 

Saving account are given a safety deposit box , identified by a 3 digit number and accessed with a 4 digit code .

Checking account holder are assigned a debit card with 12 digit number and 4 digit PIN .

Both accounts will use an interface that determines the base interest rate 

Saving account will use .25  points. Less than the base rate 

Checking account will use 15% of the base rate 

The show info method should reveal relevant account info
