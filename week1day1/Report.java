package week1day1;

public class Report {

	public static void main(String[] args) {
		
		Student stu= new Student();
		String studentName = stu.studentName;
		String collegeName = stu.collegeName;
		int rollNo = stu.rollNo;
		int markScored = stu.markScored;
		float cgpa = stu.cgpa;
		System.out.println("studentName="+studentName);
		System.out.println("collegeName="+collegeName);
		System.out.println("rollNo="+rollNo);
		System.out.println("markScored="+markScored);
		System.out.println("cgpa="+cgpa);
	}

}
