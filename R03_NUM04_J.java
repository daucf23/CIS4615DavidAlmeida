//NUM04-J. Do not use floating-point numbers if precise computation is required


double dollar = 1.00;
double dime = 0.10;
int number = 7;
System.out.println(
  "A dollar less " + number + " dimes is $" + (dollar - number * dime) 
);



int dollar = 100;
int dime = 10;
int number = 7;
System.out.println(
  "A dollar less " + number + " dimes is $0." + (dollar - number * dime)
);