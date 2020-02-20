class TypeConvertor
{
	
	public Long binaryToLong(String binaryNum)
	{
		
		Long longValue = Long.parseLong(binaryNum, 2);
		return longValue;

	}
	public Integer stringToInteger(String binaryNum)
	{
		Integer intValue = Integer.parseInt(binaryNum, 2);
		
		return intValue;

	}
 	public static void main(String args[])
	{
		TypeConvertor tc=new TypeConvertor();
		 Long l=tc.binaryToLong("1010");
		System.out.println(l);
		Integer i=tc.stringToInteger("1010");
		System.out.println(i);

	}
}
	