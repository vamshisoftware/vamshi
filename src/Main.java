public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"vamshi",1996-05-04,99.0);
                Student s2=new Student(2,"vamshee",1999-05-04,97.0);
                Student s3=new Student(3,"vam",1996-03-04,98.0);
                Student s4=new Student(,"dvam",1997-03-04,98.0);
                StudentGroup stdgrp=new StudentGroup();
                Student[] stsarray= new Student[]{s1,s2,s3};
                stdgrp.setStudents(stsarray);
		stdgrp.setStudent(s4,0);
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
