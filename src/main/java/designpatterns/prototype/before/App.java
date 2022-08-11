package designpatterns.prototype.before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("lee");
        repository.setName("java-starter");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차: JVM 바로 알기");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // GithubIssue clone = githubIssue.clone();

        // TODO clone != githubIssue
        // TODO clone.equals(githubIssue) => true
        // 레퍼런스는 다르지만 내용은 같다.
    }

}
