package designpatterns.prototype.example;

import designpatterns.prototype.after.GithubIssue;
import designpatterns.prototype.after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("demi");
        repository.setName("Back to the basic");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype Design Pattern");

        // Clone -- 비추천. 프로퍼티 하나하나 다 맵핑해야.
        GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssue.getId());
        githubIssueData.setRepositoryName(githubIssue.getRepository().getName());
        System.out.println(githubIssueData);

        // TODO ModelMapper (Lib 필요) -- Reflection 사용하여 맵핑
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData clone = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(clone);
    }

}
