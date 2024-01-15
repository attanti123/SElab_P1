# NITCONF  RMS

It is a system which helps program committee to decide whether  to accept paper for a conference based on reviews given by reviewers. It gives us a categorized review based on different aspects of a paper. 


## Register/Login Page
The new reviewer should **register** into web application. Already registered reviewers can **login** using their login credentials. 



## Home Page
Home page contains papers assigned to the reviewer and respective status and deadline. If reviewer has any clarifications required for assigned papers, they can contact the author for further clarifications using comment section and notify author through mail. 

We have two sections :
 - Need to review
    >The reviewer can view/download the paper. There is also a link to review form page.
 - Already reviewed.
	 >The reviewer can view/download the paper. There is also a link to view or edit the review.

On top right corner there is option, edit profile, total papers accepted, logout option.

## Review form page

This contains five sections  :
- Details of paper.
	> Author information, paper Id and Description.
- Categorized review of paper.
	> Evaluating the paper based on different aspects.
- Detailed comment section.
	> This feedback given here is public.
- Confidential comment section.
	> Here reviewer gives confidential feedback to program committee, based on which the program committee decides to accept or reject.
- Status of the Paper.
	> This section shows the current status of the paper decided by reviewer.
	  Accept, Reject, or In Review.

## FLOW-CHART

```mermaid
graph LR
A[Login] --> B(HomePage)
A --Not a user ?--> C(Register)
B --To Review--> D(Review Form Page)
B --View/Edit Review--> D(Review Form Page)
C --Login--> A
B --Edit Profile-->E(Customize Profile)
```


## UML Use Case Model
![Use Case Model](Untitled.jpg)