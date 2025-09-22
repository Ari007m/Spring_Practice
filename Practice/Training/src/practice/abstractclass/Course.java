package practice.abstractclass;

public abstract class Course {
    abstract void deliveredContent();
    void enrolledStudents(String name){
        System.out.println("Student " + name +" enrolled succesfully");
    }

    Course(){
        System.out.println("Course created");
    }
}
class VideoCourse extends Course{
    @Override
    void deliveredContent() {
        System.out.println("The Pre-recorded video lesson");
    }
}
class TextCourse extends Course{
    @Override
    void deliveredContent() {
        System.out.println("The Pdf based learning material");
    }
}
class LiveCourse extends Course{
    @Override
    void deliveredContent() {
        System.out.println("Delivering live Zoom Sessions");
    }

    public static void main(String[] args) {
        VideoCourse v =new VideoCourse();
        v.enrolledStudents("Ari");
        v.deliveredContent();
        System.out.println();

        TextCourse t =new TextCourse();
        t.enrolledStudents("Elango");
        t.deliveredContent();
        System.out.println();

        LiveCourse l =new LiveCourse();
        l.enrolledStudents("Bob");
        l.deliveredContent();
    }
}