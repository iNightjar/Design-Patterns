package creationalPatterns.builder;

// server side code
final class studnetModified {
    // final instance of feilds
    private final int id;
    private final String name;
    private final String address;

    public studnetModified(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    // static class builder
    public static class Builder {
        private int id;
        private String name;
        private String address;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {
        }

        // setter methods
        public Builder setStudentId(int id) {
            this.id = id;
            return this;
        }

        public Builder setStudentName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStudentAddress(String address) {
            this.address = address;
            return this;
        }

        // bulding method to deal with outher  class
        // to return outer instance
        public studnetModified build() {
            return new studnetModified(this);
        }
    }

    @Override
    public String toString() {
        return "id = " + this.id + ", name = " + this.name + ", address = " + this.address;
    }

}

// client side code
class  studentReceiverModified{
    // volatile student instance to ensure visibility
    // of shared references to immutable objects

    public volatile studnetModified student;

    public studentReceiverModified() {
        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student = studnetModified.Builder.newInstance()
                        .setStudentId(1)
                        .setStudentName("hacker")
                        .setStudentAddress("Terminal")
                        .build();
            }
        });
        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student = studnetModified.Builder.newInstance()
                        .setStudentId(2)
                        .setStudentName("Defender")
                        .setStudentAddress("Same Terminal")
                        .build();
            }
        });
        firstThread.start();
        secondThread.start();
    }

    public studnetModified getStudnetAfterModification() {
        return student;
    }

}

public class BuilderPattern {
    public static void main(String[] args) {
        studentReceiverModified firstObject = new studentReceiverModified();
        System.out.println(firstObject.getStudnetAfterModification());
    }
}