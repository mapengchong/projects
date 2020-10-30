package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		Course course1 = new Course(); 
		Course course2 = new Course();
		
		course1.setCourseName(JOptionPane.showInputDialog("Enter the name of the Course:")); 
		course1.setNumCourseCredit(Integer.parseInt(JOptionPane .showInputDialog("Enter the Credits of the Course:"))); 
		course1.setCostPerCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter the Cost Per Credit:")));
		course1.printTuitionDetails();
		
		course2.setCourseName((JOptionPane.showInputDialog("Enter the name of the Course:"))); 
		course2.setNumCourseCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter the Credits of the Course:"))); 
		course2.setCostPerCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter the Cost Per Credit:")));
		course2.printTuitionDetails();

		// compare the two courses tuition 
		if (course1.getTotalTuition() == course2.getTotalTuition()) { JOptionPane.showMessageDialog( null,
				"Both Courses have the same Tuition value\n"
				+ course1.getCourseName() + "= $ " + course1.getTotalTuition() + "\n" + course2.getCourseName()
				+ "= $ " + course2.getTotalTuition());
		} 
		
		else if (course1.getTotalTuition() > course2.getTotalTuition()) {
		
		JOptionPane.showMessageDialog( null,
				"Its seems that the tuition for the first course is greater than second \n"
				+ course1.getCourseName() + "= $ " + course1.getTotalTuition() + "\n" + course2.getCourseName()
				+ "= $ " + course2.getTotalTuition() + "\nThe differcen between the two is = $ "
				+ (course1.getTotalTuition() - course2.getTotalTuition()));
		} 
		
		else {
		JOptionPane.showMessageDialog(null,
				"The Tuition for the Second course is greater than First \n"
				+ course1.getCourseName() + "= $ " + course1.getTotalTuition() + "\n" + course2.getCourseName()
				+ "= $ " + course2.getTotalTuition() + "\nThe differcen between the two courses is = $ "
				+ (course2.getTotalTuition() - course1.getTotalTuition()));

			}
		}
	}


