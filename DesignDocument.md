# Design Document


#### Coding rules:
	
**Functions & Variables should have descriptive names**

**Tab indents should be used**

**Constant variables are always declared in capital letters**

	public static final int MAX = 20;

**Curly braces** should come after a declaration of a function or a loop and not in the same line(example below):

	void Function()
  {
    for(int i = 0;i < 1; i++)
    {
      ...
    }
  }

**Camel Casing** should be used when declaring variables and functions(example below):
  
  int camelCasing = 0;
  if(checkForWinner != camelCasing)
  {
    return true;
  }
