public class Application {

  public static void main(String[] args) {
    if("Female".equals(Student.ONE.getGender())) {
      System.out.println(Student.ONE.getName());
    }

    if("Female".equals(Student.TWO.getGender())) {
      System.out.println(Student.TWO.getName());
    }

    if("Female".equals(Student.THREE.getGender())) {
      System.out.println(Student.THREE.getName());
    }

    if("Female".equals(Student.FOUR.getGender())) {
      System.out.println(Student.FOUR.getName());
    }
  }
}
