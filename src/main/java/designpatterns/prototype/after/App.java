package designpatterns.prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("demi");
        repository.setName("java-starter");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차: JVM 바로 알기");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // clone() --> Object 내부 메서드
        // (default) Shallow copy : 기존 Reference(repository)를 똑같이 가리킨다.
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        System.out.println(clone.getRepository() == githubIssue.getRepository());
        repository.setName("kim");
        System.out.println(clone.getUrl());
    }

}
