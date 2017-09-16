import java.util.*;





//StudentGroup class
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private ArrayList<Student> std;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
        public void conArraytoArlist()
         {
          std=new ArrayList<Student>(Arrays.asList(this.students));
         }
        
		public void conArlisttoArray()
         {
          this.students= new Student[std.size()];
          this.students=std.toArray(this.students);
         }
	    
		
		public StudentGroup(int length) {
		this.students = new Student[length];
	    }

}
