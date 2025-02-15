import javax.swing.JOptionPane;

class Main
{
	public static void main(String[] args) {
	    System.out.println("Number of arguments: " + args.length);
	    String heading = "Lorem Ipsum";  // Default value
//	    String title = "Insert title here";  // Default value
	    String title = null;  // Default value

	    try {
	        if (args.length == 0) {
	            System.out.println("No args provided.");
	        } else {
	            // Check for a valid heading (args[0])
	            if (!(args[0].isEmpty() || args[0].isBlank())) {
	                heading = args[0]; // Set heading from args[0] if it's valid
	            }

	            // Check for a valid title (args[1]), but ensure it exists first
	            if (args.length > 1 && !(args[1].isEmpty() || args[1].isBlank())) {
	                title = args[1]; // Set title from args[1] if it's valid
	            }
	        }
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Error: " + e.toString());
	    }

	    JOptionPane.showMessageDialog(null, heading, title, JOptionPane.INFORMATION_MESSAGE);
	}
    
    /*
    static boolean isNull(Object str) {
    	return str == null;
    }
    // well I like C#s convenient functions
    static boolean isNullorEmpty(String str) {
    	return (isNull(str) || str.trim().length() >= 0);
    }
    */
}