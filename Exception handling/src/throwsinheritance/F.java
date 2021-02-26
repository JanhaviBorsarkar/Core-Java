package throwsinheritance;
// checked exception
public class F extends E
{
	public F() throws IOException
	{
		
	}
	
	/*public F() throws Exception
	 * {
	 *    // right 
	 * }
	 */
	
	/*public F() throws FileNotFoundException
	 * {
	 * 		// wrong as FileNotFoundException is a child of IOException
	 * }
	 */
}
