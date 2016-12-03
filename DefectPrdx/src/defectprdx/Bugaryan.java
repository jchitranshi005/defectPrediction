package defectprdx;

import edu.nyu.cs.javagit.api.DotGit;
import edu.nyu.cs.javagit.api.JavaGitConfiguration;
import edu.nyu.cs.javagit.api.JavaGitException;
import edu.nyu.cs.javagit.api.WorkingTree;
import edu.nyu.cs.javagit.api.commands.GitLogResponse;
import edu.nyu.cs.javagit.api.commands.GitLogResponse.Commit;
import edu.nyu.cs.javagit.api.commands.GitStatus;
import edu.nyu.cs.javagit.api.commands.GitStatusOptions;
import edu.nyu.cs.javagit.api.commands.GitStatusResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Bugaryan {

    private static File repositoryDirectory;
    private static DotGit dotGit;

    public static void main(String s[]) throws JavaGitException, IOException {
        System.out.println("Git version : " + JavaGitConfiguration.getGitVersion());
//        repositoryDirectory = new File("/home/aryan000/Desktop/retrofit");
        repositoryDirectory = new File("/home/dell/dagger");

        System.out.println("Git Repository Location : " + repositoryDirectory.getAbsolutePath());

        //get the instance of the dotGit Object
        dotGit = DotGit.getInstance(repositoryDirectory);

//        System.out.println("checking what i have got ");
//        GitLogResponse.CommitFile com ;
//        com = (GitLogResponse.CommitFile) dotGit.getLog();
//        
//        System.out.println(com);
        WorkingTree wt = dotGit.getWorkingTree();
        File workingTreePath = wt.getPath();
        GitStatus gitStatus = new GitStatus();
        GitStatusResponse status = gitStatus.status(workingTreePath);

        System.out.println("status is : " + status);

        // File anotherFileDir = new File("/home/aryan000/Desktop/retrofit/test.txt");
        GitStatusOptions options = new GitStatusOptions();
        options.setOptOnly(true);
        status = gitStatus.status(workingTreePath);

        System.out.println("status is : " + status); 
        System.out.println("----- Print log to see our commit -----");
        for (GitLogResponse.Commit c : dotGit.getLog()) {
            System.out.println("commit id is : " + c.getSha());
            System.out.println(" commit message is : " + c.getMessage());
            
            System.out.println(" author of the commit is : " + c.getAuthor());
            System.out.println(" date modified is : " + c.getDateString());
            System.out.println(" number of files changed is : " + c.getFiles());
            List<GitLogResponse.CommitFile> store = c.getFiles();
            if (store != null) {
                System.out.println("the number of files changed is : " + store.size());
            }
            System.out.println("list of files changed is : " + c.getFilesChanged());

            System.out.println("total number of additions : " + c.getLinesDeleted());
            System.out.println("total number of merger : " + c.getMergeDetails());

        }

//        for(GitLogResponse.CommitFile c : dotGit.getLog())
    }
}
