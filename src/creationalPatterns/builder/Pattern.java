package creationalPatterns.builder;

// client side code


class studentReceiver {
    private final Student student = new Student();

    public studentReceiver() {
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.setStudentId(1).setStudentName("inightjar").setStudentAddress("sadat city");
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.setStudentId(2).setStudentName("hacker").setStudentAddress("all the world");
            }
        });
        firstThread.start();
        secondThread.start();
    }

    public Student getStudent() {
        return student;
    }
}


// driver class
public class Pattern {
    public static void main(String[] args) {
        studentReceiver receiver = new studentReceiver();
        System.out.println(receiver.getStudent());
    }
}
