class CharacterString
{
public static void main(String args[])
	{
		String s="Java learning";
		int count=0;

System.out.println("Length of String : "+s.length());
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Count of characters : "+count);
	}
}