## GIT
*******



#### 822. How can we see n most recent commits in GIT?

We can use git log command to see the latest commits. To see the
three most recent commits we use following command:
`git log -3`

#### 823. How can we know if a branch is already merged into master in GIT?

We can use following commands for this purpose:

`git branch --merged master` : This prints the branches merged into
master.

`git branch --merged lists` : This prints the branches merged into
HEAD (i.e. tip of current branch)

`git branch --no-merged` : This prints the branches that have not been
merged

By default this applies only to local branches.
We can use -a flag to show both local and remote branches.
Or we can use -r flag to show only the remote branches.

#### 824. What is the purpose of git stash drop?

In case we do not need a specific stash, we use git stash drop
command to remove it from the list of stashes.

By default, this command removes to latest added stash

To remove a specific stash we specify as argument in the git stash
drop <stashname> command.

#### 825. What is the HEAD in GIT?

A HEAD is a reference to the currently checked out commit. It is a symbolic reference to the branch that we have checked out. At any given time, one head is selected as the ‘current head’ This head is also known as HEAD (always in uppercase).


#### 826. What is the most popular branching strategy in GIT?

There are many ways to do branching in GIT. One of the popular
ways is to maintain two branches:

**master**: This branch is used for production. In this branch HEAD is
always in production ready state.

**develop**: This branch is used for development. In this branch we
store the latest code developed in project. This is work in progress
code.

Once the code is ready for deployment to production, it is merged
into master branch from develop branch.

#### 827. What is SubGit?

SubGit is software tool used for migrating SVN to Git. It is very
easy to use. By using this we can create a writable Git mirror of a
Subversion repository.

It creates a bi-directional mirror that can be used for pushing to Git
as well as committing to Subversion.

SubGit also takes care of synchronization between Git and
Subversion.

#### 828. What is the use of git instaweb?


Git-instaweb is a script by which we can browse a git repository in
a web browser.

It sets up the gitweb and a web-server that makes the working
repository available online.

#### 829.What are git hooks?

Git hooks are scripts that can run automatically on the occurrence of
an event in a Git repository. These are used for automation of
workflow in GIT.

Git hooks also help in customizing the internal behavior of GIT.
These are generally used for enforcing a GIT commit policy.


#### 830. What is GIT?

GIT is a mature **D**istributed **V**ersion **C**ontrol **S**ystem (DVCS). It is
used for **S**ource **C**ode **M**anagement (SCM).

It is open source software. It was developed by Linus Torvalds, the creator of Linux operating system.

GIT works well with a large number of IDEs (**I**ntegrated **D**evelopment **E**nvironments) like- Eclipse, InteliJ etc. GIT can be used to handle small and large projects.


#### 831. What is a repository in GIT?

A repository in GIT is the place in which we store our software
work.

It contains a sub-directory called .git. There is only one .git
directory in the root of the project.

In .git, GIT stores all the metadata for the repository. The contents
of .git directory are of internal use to GIT.

#### 832. What are the main benefits of GIT?

There are following main benefits of GIT:

Distributed System: GIT is a **D**istributed **V**ersion **C**ontrol
**S**ystem (DVCS). So you can keep your private work in version control but completely hidden from others. You can work offline as well.

1. **Flexible Workflow**: GIT allows you to create your own workflow. You can use the process that is suitable for your project. You can go for centralized or master-slave or any other workflow.

2. **Fast**: GIT is very fast when compared to other version control systems.

3. **Data Integrity**: Since GIT uses SHA1, data is not easier to corrupt.

4. **Free**: It is free for personal use. So many amateurs use it for their initial projects. It also works very well with large size project.

5. **Collaboration**: GIT is very easy to use for projects in which collaboration is required. Many popular open source software across the globe use GIT.

#### 833. What are the disadvantages of GIT?

GIT has very few disadvantages. These are the scenarios when GIT is difficult to use. Some of these are:

**Binary Files**: If we have a lot binary files (non-text) in our project, then GIT becomes very slow. E.g. Projects with a lot of images or Word documents.

**Steep Learning Curve**: It takes some time for a newcomer to learn GIT. Some of the GIT commands are non-intuitive to a fresher.

**Slow remote speed**: Sometimes the use of remote repositories in slow due to network latency. Still GIT is better than other VCS in speed.


#### 834. What are the main differences between GIT and SVN?

The main differences between GIT and SVN are:

1. **Decentralized**: GIT is decentralized. You have a local copy that is a repository in which you can commit. In SVN you have to always connect to a central repository for check-in.
2. **Complex to learn**: GIT is a bit difficult to learn for some developers. It has more concepts and commands to learn. SVN is much easier to learn.
3. **Unable to handle Binary files**: GIT becomes slow when it deals with large binary files that change frequently. SVN can handle large binary files easily.
4. **Internal directory**: GIT creates only .git directory. SVN creates .svn directory in each folder.
5. **User Interface**: GIT does not have good UI. But SVN has good user interfaces.

#### 835. How will you start GIT for your project?

We use git init command in an existing project directory to start version control for our project.

After this we can use git add and git commit commands to add files to our GIT repository.

#### 836. What is git clone in GIT?

In GIT, we use git clone command to create a copy of an existing GIT repository in our local.This is the most popular way to create a copy of the repository among developers.

It is similar to svn checkout. But in this case the working copy is a full-fledged repository.

#### 837. How will you create a repository in GIT?

To create a new repository in GIT, first we create a directory for the
project. Then we run `git init` command.

Now, GIT creates `.git` directory in our project directory. This is
how our new GIT repository is created.

#### 838. What are the different ways to start work in GIT?

We can start work in GIT in following ways:

1. **New Project**: To create a new repository we use `git init` command.
2. **Existing Project**: To work on an existing repository we use `git clone` command.

#### 839. GIT is written in which language?

Most of the GIT distributions are written in C language with Bourne
shell. Some of the commands are written in Perl language.

#### 840. What does `git pull` command in GIT do internally?

In GIT, `git pull` internally does a git fetch first and then does a git
merge.

So pull is a combination of two commands: `fetch` and `merge`.
We use `git pull` command to bring our local branch up to date with
its remote version.

#### 841. What does ‘git push’ command in GIT do internally?

In GIT, git push command does following two commands:

1. `fetch`: First GIT, copies all the extra commits from server into local repo and moves origin/master branch pointer to the end of commit chain.
2. `merge`: Then it merges the origin/master branch into the master branch. Now the master branch pointer moves to the newly created commit. But the origin/master pointer remains there.

#### 842. What is git stash?

In GIT, sometimes we do not want to commit our code but we do not want to lose also the unfinished code. In this case we use git stash command to record the current state of the working directory and index in a stash. This stores the unfinished work in a stash, and cleans the current branch from uncommitted changes. Now we can work on a clean working directory.

Later we can use the stash and apply those changes back to our working directory.

At times we are in the middle of some work and do not want to lose the unfinished work, we use git stash command.

#### 843. What is the meaning of ‘stage’ in GIT?

In GIT, stage is a step before commit. To stage means that the files
are ready for commit.

Let say, you are working on two features in GIT. One of the features
is finished and the other is not yet ready. You want to commit and
leave for home in the evening. But you can commit since both of
them are not fully ready. In this case you can just stage the feature
that is ready and commit that part. Second feature will remain as
work in progress.

#### 844. What is the purpose of git config command?

We can set the configuration options for GIT installation by using git
config command.

#### 845. How can we see the configuration settings of GIT installation?

We can use `git config --list` command to print all the GIT configuration settings in GIT installation.

#### 846. How will you write a message with commit command in GIT?

We call following command for commit with a message:
`$/> git commit –m <message>`


#### 847. What is stored inside a commit object in GIT?

GIT commit object contains following information:

**SHA1 name**: A 40 character string to identify a commit Files: List of files that represent the state of a project at a specific point of time
**Reference**: Any reference to parent commit objects


#### 848. How many heads can you create in a GIT repository?

There can be any number of heads in a repository.
By default there is one head known as HEAD in each repository in GIT.

#### 849. Why do we create branches in GIT?

If we are simultaneously working on multiple tasks, projects, defects or features, we need multiple branches. In GIT we can create a separate branch for each separate purpose.

Let say we are working on a feature, we create a feature branch for that. In between we get a defect to work on then we create another branch for defect and work on it. Once the defect work is done, we merge that branch and come back to work on feature branch again. So working on multiple tasks is the main reason for using multiple branches.


#### 850. What are the different kinds of branches that can be created in GIT?

We can create different kinds of branches for following purposes in GIT:

1. **Feature branches**: These are used for developing a feature.
2. **Release branches**: These are used for releasing code to production.
3. **Hotfix branches**: These are used for releasing a hotfix to production for a defect or emergency fix.

#### 851.How will you create a new branch in GIT?

We use following command to create a new branch in GIT:
`$/> git checkout –b <branchname>`

#### 852. How will you add a new feature to the main branch?

We do the development work on a feature branch that is created from master branch. Once the development work is ready we use git merge command to merge it into master branch.

#### 853. What is a pull request in GIT?

A pull request in GIT is the list of changes that have been pushed to GIT repository. Generally these changes are pushed in a feature branch or hotfix branch. After pushing these changes we create a pull request that contains the changes between master and our feature branch. This pull request is sent to reviewers for reviewing the code and then merging it into develop or release branch.

#### 854. What is merge conflict in GIT?

A merge conflict in GIT is the result of merging two commits. Sometimes the commit to be merged and current commit have changes in same location. In this scenario, GIT is not able to decide which change is more important. Due to this GIT reports a merge conflict. It means merge is not successful. We may have to manually check and resolve the merge conflict.

#### 855. How can we resolve a merge conflict in GIT?

When GIT reports merge conflict in a file, it marks the lines as follows:
E.g.
```
the business days in this week are
<<<<<<< HEAD
five
=======
six
>>>>>>> branch-feature
```
To resolve the merge conflict in a file, we edit the file and fix the conflicting change. In above example we can either keep five or six. After editing the file we run `git add` command followed by `git commit` command. Since GIT is aware that it was merge conflict, it links this change to the correct commit.


#### 856. What command will you use to delete a branch?

After the successful merge of feature branch in main branch, we do
not need the feature branch.
To delete an unwanted branch we use following command:

`git branch –d <branchname>`

#### 857. What command will you use to delete a branch that has unmerged changes?

To forcibly delete an unwanted branch with unmerged changes, we
use following command:

`git branch –D <branchname>`

#### 858. What is the alternative command to merging in GIT?

Another alternative of merging in GIT is rebasing. It is done by git
rebase command.

#### 859. What is Rebasing in GIT?

Rebasing is the process of moving a branch to a new base commit.
It is like rewriting the history of a branch.

In Rebasing, we move a branch from one commit to another. By this
we can maintain linear project history.

Once the commits are pushed to a public repository, it is not a good
practice to use Rebasing.


#### 860. What is the ‘Golden Rule of Rebasing’ in GIT?

The golden rule of Rebasing is that we should never use git rebase
on public branches. If other people are using the same branch then
they may get confused by looking at the changes in Master branch
after GIT rebasing.

Therefore, it is not recommended to do rebasing on a public branch
that is also used by other collaborators.

#### 861. Why do we use Interactive Rebasing in place of Auto Rebasing?

By using Interactive rebasing we can alter the commits before
moving them to a new branch.

This is more powerful than an automated rebase. It gives us
complete control over the branch’s commit history.

Generally, we use Interactive Rebasing to clean up the messy
history of commits just before merging a feature branch into master.

#### 862. What is the command for Rebasing in Git?

Git command for rebasing is:

`git rebase <new-commit>`

#### 863. What is the main difference between git clone and git remote?

The main difference between git clone and git remote is that git
clone is used to create a new local repository whereas git remote is
used in an existing repository.

git remote adds a new reference to existing remote repository for
tracking further changes.

git clone creates a new local repository by copying another
repository from a URL.

#### 864. What is GIT version control?

GIT version control helps us in managing the changes to source
code over time by a software team. It keeps track of all the changes
in a special kind of database. If we make a mistake, we can go back
in time and see previous changes to fix the mistake.

GIT version control helps the team in collaborating on developing a
software and work efficiently. Every one can merge the changes
with confidence that everything is tracked and remains intact in GIT
version control. Any bug introduced by a change can be discovered
and reverted back by going back to a working version.

#### 865. What GUI do you use for working on GIT?

There are many GUI for GIT that we can use. Some of these are:

1. GitHub Desktop
2. GITX-dev
3. Gitbox
4. Git-cola
5. SourceTree
6. Git Extensions
7. SmartGit
8. GitUp

#### 866. What is the use of git diff command in GIT?

In GIT, git diff command is used to display the differences between
2 versions, or between working directory and an index, or between
index and most recent commit.

It can also display changes between two blob objects, or between
two files on disk in GIT.

It helps in finding the changes that can be used for code review for a
feature or bug fix.

#### 867. What is git rerere?

In GIT, rerere is a hidden feature. The full form of rerere is “reuse
recorded resolution”.

By using rerere, GIT remembers how we’ve resolved a hunk
conflict. The next time GIT sees the same conflict, it can
automatically resolve it for us.

#### 868. What are the three most popular version of git diff command?

Three most popular git diff commands are as follows:

`git diff`: It displays the differences between working directory and
the index.

`git diff –cached`: It displays the differences between the index and
the most recent commit.

`git diff HEAD`: It displays the differences between working
directory and the most recent commit

#### 869. What is the use of git status command?

In GIT, git status command mainly shows the status of working tree.
It shows following items:

1. The paths that have differences between the index file and
the current HEAD commit.
2. The paths that have differences between the working tree
and the index file
3. The paths in the working tree that are not tracked by GIT.
Among the above three items, first item is the one that we commit by
using git commit command. Item two and three can be committed
only after running git add command.

#### 870. What is the main difference between `git diff` and `git status`?

In GIT,` git diff` shows the differences between different commits or
between the working directory and index.
Whereas, `git status` command just shows the current status of
working tree.

#### 871. What is the use of git rm command in GIT?

In GIT, git rm command is used for removing a file from the
working tree and the index.
We use `git rm –r` to recursively remove all files from a leading
directory.


#### 872. What is the command to apply a stash?

Sometimes we want to save our unfinished work. For this purpose
we use git stash command. Once we want to come back and
continue working from the last place where we left, we use git stash
apply command to bring back the unfinished work.

So the command to apply a stash is:

`git stash apply`

Or we can use

`git stash apply <stashname>`

#### 873. Why do we use `git log` command?

We use git log command to search for specific commits in project
history.

We can search git history by author, date or content. It can even list
the commits that were done x days before or after a specific date.

#### 874. Why do we need `git add` command in GIT?

GIT gives us a very good feature of staging our changes before
commit. To stage the changes we use `git add` command. This adds
our changes from working directory to the index.

When we are working on multiple tasks and we want to just commit
the finished tasks, we first add finished changes to staging area and
then commit it. At this time `git add` command is very helpful.

#### 875. Why do we use `git reset` command?

We use `git reset` command to reset current HEAD to a specific state.
By default it reverses the action of git add command.

So we use `git reset` command to undo the changes of git add
command.

#### 876. What does a commit object contain?

Whenever we do a commit in GIT by using git commit command, GIT creates a new commit object. This commit objects is saved to GIT repository.

The commit object contains following information:

1. **HASH**: The SHA1 hash of the Git tree that refers to the state ofindex at commit time.
2. **Commit Author**: The name of person/process doing the commit and date/time.
3. **Comment**: Some text messages that contains the reason for the commit .

#### 877. How can we convert git log messages to a different format?

We can use pretty option in git log command for this.

`git log – pretty`

This option converts the output format from default to other formats.
There are pre-built formats available for our use.

`git log –pretty=oneline`

E.g. `git log --pretty=format:"%h - %an, %ar : %s"`

`ba72a6c - Dave Adams, 3 years ago : changed the version number`

#### 878. What are the programming languages in which git hooks can be written?

Git hooks are generally written in shell and PERL scripts. But these
can be written in any other language as long as it has an executable.
Git hooks can also be written in Python script.

#### 879. What is a commit message in GIT?

A commit message is a comment that we add to a commit. We can
provide meaningful information about the reason for commit by
using a commit message.

In most of the organizations, it is mandatory to put a commit
message along with each commit.

Often, commit messages contain JIRA ticket, bug id, defect id etc.
for a project.

#### 880. How GIT protects the code in a repository?

GIT is made very secure since it contains the source code of an
organization. All the objects in a GIT repository are encrypted with
a hashing algorithm called SHA1.

This algorithm is quite strong and fast. It protects source code and
other contents of repository against the possible malicious attacks.
This algorithm also maintains the integrity of GIT repository by
protecting the change history against accidental changes.

#### 881. How GIT provides flexibility in version control?

GIT is very flexible version control system. It supports non-linear
development workflows. It supports flows that are compatible with
external protocols and existing systems.

GIT also supports both branching and tagging that promotes multiple
kinds of workflows in version control.

#### 882. How can we change a commit message in GIT?

If a commit has not been pushed to GitHub, we can use `git commit --
ammend` command to change the commit message.
When we push the commit, a new message appears on GitHub.



#### 883. Why is it advisable to create an additional commit instead of amending an existing commit?

Git amend internally creates a new commit and replaces the old
commit. If commits have already been pushed to central repository,
it should not be used to modify the previous commits.
It should be generally used for only amending the git comment.


#### 884. What is a bare repository in GIT?


A repository created with git init –bare command is a bare
repository in GIT.

The bare repository does not contain any working or checked out
copy of source files. A bare repository stores git revision history in
the root folder of repository instead of in a .git subfolder.
It is mainly used for sharing and collaborating with other
developers.

We can create a bare repository in which all developers can push
their code.

There is no working tree in bare repository, since no one directly
edits files in a bare repository.

#### 885. How do we put a local repository on GitHub server?

A repository created with git init –bare command is a bare
repository in GIT.

The bare repository does not contain any working or checked out
copy of source files. A bare repository stores git revision history in
the root folder of repository instead of in a .git subfolder.
It is mainly used for sharing and collaborating with other
developers.

We can create a bare repository in which all developers can push
their code.

There is no working tree in bare repository, since no one directly
edits files in a bare repository.

#### 886. How will you delete a branch in GIT?

We use `git branch –d <branchname>` command to delete a branch in
GIT.
In case a local branch is not fully merged, but we want to delete it
by force, then we use `git branch –D <branchname>` command.

#### 887. How can we set up a Git repository to run code sanity checks and UAT tests just before a commit?

We can use git hooks for this kind of purpose. We can write the code
sanity checks in script. This script can be called by pre-commit
hook of the repository.

If this hook passes, then only commit will be successful.

#### 888. How can we revert a commit that was pushed earlier and is public now?

We can use `git revert` command for this purpose.
Internally, `git revert` command creates a new commit with patches
that reverse the changes done in previous commits.
The other option is to checkout a previous commit version and then
commit it as a new commit.

#### 889. In GIT, how will you compress last n commits into a single commit?

Tom compress last n commits a single commit, we use git rebase
command. This command compresses multiple commits and creates
a new commit. It overwrites the history of commits.
It should be done carefully, since it can lead to unexpected results.


#### 890. How will you switch from one branch to a new branch in GIT?

In GIT, we can use `git checkout <new branchname>` command to
switch to a new branch

#### 891. How can we clean unwanted files from our working directory in GIT?

GIT provides git clean command to recursively clean the working
tree. It removes the files that are not under version control in GIT.
If we use git clean –x, then ignored files are also removed.

#### 892. What is the purpose of `git tag` command?

We use `git tag` command to add, delete, list or verify a tag object in
GIT.

Tag objects created with options –a, -s, -u are also known as
annotated tags.

Annotated tags are generally used for release.

#### 893. What is cherry-pick in GIT?

A git cherry-pick is a very useful feature in GIT. By using this
command we can selectively apply the changes done by existing
commits.

In case we want to selectively release a feature, we can remove the
unwanted files and apply only selected commits.

#### 894. What is `shortlog` in GIT?

A `shortlog` in GIT is a command that summarizes the git log output.
The output of git shortlog is in a format suitable for release
announcements.

#### 895. How can you find the names of files that were changed in a specific commit?

Every commit in GIT has a hash code. This hash code uniquely
represents the GIT commit object.
We can use `git diff-tree` command to list the name of files that were
changed in a commit.
The command will be as follows:

`git diff-tree -r <hash of commit>`

By using -r flag, we just get the list of individual files.

#### 896. How can we attach an automated script to run on the event of a new commit by push command?

In GIT we can use a hook to run an automated script on a specific
event. We can choose between pre-receive, update or post-receive
hook and attach our script on any of these hooks.

GIT will automatically run the script on the event of any of these
hooks.

#### 897. What is the difference between pre-receive, update and post-receive hooks in GIT?

Pre-receive hook is invoked when a commit is pushed to a
destination repository. Any script attached to this hook is executed
before updating any reference. This is mainly used to enforce
development best practices and policies.

Update hook is similar to pre-receive hook. It is triggered just
before any updates are done. This hook is invoked once for every
commit that is pushed to a destination repository.

Post-receive hook is invoked after the updates have been done and
accepted by a destination repository. This is mainly used to
configure deployment scripts. It can also invoke Continuous
Integration (CI) systems and send notification emails to relevant
parties of a repository.

#### 898. Do we have to store Scripts for GIT hooks within same repository?

A Hook is local to a GIT repository. But the script attached to a hook can be created either inside the hooks directory or it can be stored in a separate repository. But we have to link the script to a hook in our local repository.

In this way we can maintain versions of a script in a separate repository, but use them in our repository where hooks are stored. Also when we store scripts in a separate common repository, we can reuse same scripts for different purposes in multiple repositories.

#### 899. How can we determine the commit that is the source of a bug in GIT?

In GIT we can use git bisect command to find the commit that has
introduced a bug in the system.

GIT bisect command internally uses binary search algorithm to find
the commit that introduced a bug.

We first tell a bad commit that contains the bug and a good commit
that was present before the bug was introduced.

Then git bisect picks a commit between those two endpoints and
asks us whether the selected commit is good or bad.

It continues to narrow down the range until it discovers the exact
commit responsible for introducing the bug.

#### 900. How can we see differences between two commits in GIT?

We can use git diff command to see the differences between two
commits. The syntax for a simple `git diff` command to compare two
commits is:

`git diff <commit#1> <commit#2>`



#### 901. What are the different ways to identify a commit in GIT?

Each commit object in GIT has a unique hash. This hash is a 40
characters checksum hash. It is based on SHA1 hashing algorithm.
We can use a hash to uniquely identify a GIT commit.

Git also provides support for creating an alias for a commit. This
alias is known as refs. Every tag in GIT is a ref. These refs can also
be used to identify a commit. Some of the special tags in GIT are
HEAD, FETCH_HEAD and MERGE_HEAD.

#### 902. When we run `git branch <branchname>`, how does GIT know the SHA-1 of the last commit?

GIT uses the reference named HEAD for this purpose. The HEAD file in GIT is a symbolic reference to the current branch we are working on.

A symbolic reference is not a normal reference that contains a SHA- 1 value. A symbolic reference contains a pointer to another reference.

When we open head file we see:
`$ cat .git/HEAD`

ref: refs/heads/master

If we run git checkout branchA, Git updates the file to look like this:
`$ cat .git/HEAD`

ref: refs/heads/branchA

#### 903. What are the different types of Tags you can create in GIT?

In GIT, we can create two types of Tags.
Lightweight Tag: A lightweight tag is a reference that never moves.
We can make a lightweight tag by running a command similar to
following:

`$
git
update-ref
dad0dab538c970e37ea1e769cbbde608743bc96d
refs/tags/v1.0
`

**Annotated Tag**: An annotated tag is more complex object in GIT.
When we create an annotated tag, GIT creates a tag object and
writes a reference to point to it rather than directly to the commit.
We can create an annotated tag as follows:

`$ git tag -a v1.1 1d410eabc13591cb07496601ebc7c059dd55bfe9 -
m 'test tag'
`
#### 904. How can we rename a remote repository?

We can use command git remote rename for changing the name of a
remote repository. This changes the short name associated with a
remote repository in your local. Command would look as follows:

`git remote rename repoOldName repoNewName`

#### 905. Some people use git checkout and some use git co for checkout. How is that possible?

We can create aliases in GIT for commands by modifying the git
configuration.

In case of calling git co instead of git checkout we can run following
command:

`git config --global alias.co` checkout So the people using git co have made the alias for git checkout in their own environment.

#### 906. How can we see the last commit on each of our branch in GIT?

When we run git branch command, it lists all the branches in our
local repository. To see the latest commit associated with each
branch, we use option –v.
Exact command for this is as follows:

`git branch –v`

It lists branches as:

```
issue75 83b576c fix issue
* master 7b96605 Merge branch 'issue75'
testing 972ac34 add dave to the developer list
```

#### 907. Is origin a special branch in GIT?


No, origin is not a special branch in GIT.
Branch origin is similar to branch master. It does not have any
special meaning in GIT.

Master is the default name for a starting branch when we run git init
command.

Origin is the default name for a remote when we run git clone
command. If we run git clone -o myOrigin instead, then we will
have myOrigin/master as our default remote branch.

#### 908. How can we configure GIT to not ask for password every time?

When we use HTTPS URL to push, the GIT server asks for
username and password for authentication. It prompts us on the
terminal for this information.

If we don’t want to type username/password with every single time
push, we can set up a “credential cache”.

It is kept in memory for a few minutes. We can set it by running:
git config --global credential.helper cache

#### 909. What are the four major protocols used by GIT for data transfer?

GIT uses following major protocols for data transfer:

1. Local
2. HTTP
3. Secure Shell (SSH)
4. Git


#### 910.What is GIT protocol?

Git protocol is a mechanism for transferring data in GIT. It is a special daemon. It comes pre-packaged with GIT. It listens on a dedicated port 9418. It provides services similar to SSH protocol. But Git protocol does not support any authentication.

So on plus side, this is a very fast network transfer protocol. But it lacks authentication

#### 911. How can we work on a project where we do not have push access?

In case of projects where we do not have push access, we can just
fork the repository. By running git fork command, GIT will create a
personal copy of the repository in our namespace. Once our work is
done, we can create a pull request to merge our changes on the real
project.

#### 912. What is git grep?

GIT is shipped along with a grep command that allows us to search
for a string or regular expression in any committed tree or the
working directory.

By default, it works on the files in your current working directory.

#### 913. How can your reorder commits in GIT?

We can use git rebase command to reorder commits in GIT. It can
work interactively and you can also select the ordering of commits.

#### 914. How will you split a commit into multiple commits?

To split a commit, we have to use git rebase command in interactive mode. Once we reach the commit that needs to be split, we reset that commit and take the changes that have been reset. Now we can create multiple commits out of that.

#### 915. What is filter-branch in GIT?


In GIT, filter-branch is another option to rewrite history. It can scrub
the entire history. When we have large number of commits, we can
use this tool.

It gives many options like removing the commit related changes to a
specific file from history.

You can even set you name and email in the commit history by using
filter-branch

#### 916. What are the three main trees maintained by GIT?

GIT maintains following three trees:
1. **HEAD**: This is the last commit snapshot.
2. **Index**: This is the proposed next commit snapshot.
3. **Working Directory**: This is the sandbox for doing changes.


#### 917. What are the three main steps of working GIT?

GIT has following three main steps in a simple workflow:

1. Checkout the project from HEAD to Working Directory.
2. Stage the files from Working Directory to Index.
3. Commit the changes from Index to HEAD.


#### 918. What are ours and theirs merge options in GIT?

In GIT, we get two simple options for resolving merge conflicts: ours and theirs

These options tell the GIT which side to favor in merge conflicts.

In ours, we run a command like git merge -Xours branchA

As the name suggests, in ours, the changes in our branch are favored over the other branch during a merge conflict.


#### 919. How can we ignore merge conflicts due to Whitespace?



#### 920. What is git blame?

In GIT, git blame is a very good option to find the person who
changed a specific line. When we call git blame on a file, it
displays the commit and name of a person responsible for making
change in that line.

Following is a sample:

```
$ git blame -L 12,19 HelloWorld.java
^1822fe2 (Dave Adams 2016-03-15 10:31:28 -0700 12) public
class HelloWorld {
^1822fe2 (Dave Adams 2016-03-15 10:31:28 -0700 13)
^1822fe2 (Dave Adams 2016-03-15 10:31:28 -0700 14) public
static void main(String[] args) {
af6560e4 (Dave Adams 2016-03-17 21:52:20 -0700 16) // Prints
"Hello, World" to the terminal window.
a9eaf55d (Dave Adams 2016-04-06 10:15:08 -0700 17)
System.out.println("Hello, World");
af6560e4 (Dave Adams 2016-03-17 21:52:20 -0700 18) }
af6560e4 (Dave Adams 2016-03-17 21:52:20 -0700 19) }
```

#### 921. What is a submodule in GIT?

In GIT, we can create sub modules inside a repository by using git
submodule command.

By using submodule command, we can keep a Git repository as a
subdirectory of another Git repository.

It allows us to keep our commits to submodule separate from the
commits to main Git repository.