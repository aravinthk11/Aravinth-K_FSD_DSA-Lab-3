package bracketBalancer;

import java.util.Stack;

public class CheckBracket {
	
String expression;
	
	public CheckBracket(String expression) {
	
		this.expression = expression;
	}

	void check()
	{
		int length = expression.length();
		int i;
		
		Stack<Character> stack = new Stack<>();
		
		if (length % 2 != 0) 
		{
			System.out.println("Invalid Expression - Odd number of brackets");
			return;
		}
		
		else
		{
			
			for (i=0; i<length; i++)
			{	
			
				Character visitedChar = expression.charAt(i);
				
				if ((visitedChar != '(') && (visitedChar != ')') && (visitedChar != '[') && (visitedChar != ']') && (visitedChar != '{') && 
						(visitedChar != '}') && (visitedChar != '<') && (visitedChar != '>'))
				{	
					
					System.out.println("Invalid Expression - Input is not valid");
					return;
				}
				
				else
				
				{
					if (getopenbracket(visitedChar) == true)
					{
						stack.push(visitedChar);
					}
					
					else if (getclosebracket(visitedChar) == true)
					{
						Character popped = stack.pop();
						
						Character openbracket = checkopenbracket(visitedChar);
						
						if (openbracket == popped)
						{
							continue;
						}
						else
						{
							System.out.println("Non Matching Bracket");
							break;
						}
					}
				}
						
			}
			
			if (stack.isEmpty()) {
				
				System.out.println("The entered String has Balanced Brackets");
			}else {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}
	}
	
		boolean getopenbracket(Character checkChar)
		
		{
			if (checkChar == '(' || checkChar == '{' || checkChar == '[' || checkChar == '<')
			
			return true;
			
			else
				
			return false;
		}
		
		boolean getclosebracket(Character checkChar)
		
		{
			if (checkChar == ')' || checkChar == '}' || checkChar == ']' || checkChar == '>')
			
			return true;
			
			else
				
			return false;
		}
		
		Character checkopenbracket(Character closedBracketChar) {
			
			
			if (closedBracketChar == '>') {
				return '<';			
			}else if (closedBracketChar == '}') {
				return '{';			
			}else if (closedBracketChar == ']') {
				return '[';
			}else if (closedBracketChar == ')') {
				return '('; 
			}
			return ' ';
		}
		
		
}
