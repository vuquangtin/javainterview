## AWS

*************


#### 922. What do you know about AWS Region?

An AWS Region is a completely independent entity in a geographical area. There are two more Availability Zones in an AWS Region.

Within a region, Availability Zones are connected through low- latency links.

Since each AWS Region is isolated from another Region, it provides very high fault tolerance and stability. For launching an EC2 instance, we have to select an AMI within the same region.


#### 923. What are the important components of IAM?

The important components of IAM are as follows:

1. **IAM User**: An IAM User is a person or service that will interact with AWS. User can sign into AWS Management Console for performing tasks in AWS.

2. **IAM Group**: An IAM Group is a collection of IAM users. We can specify permission to an IAM Group. This helps in managing large number of IAM users. We can simply add or remove an IAM User to an IAM Group to manage the permissions.

3. **IAM Role**: An IAM Role is an identity to which we give permissions. A Role does not have any credentials (password or access keys). We can temporarily give an IAM Role to an IAM User to perform certain tasks in AWS.

4. **IAM Permission**: In IAM we can create two types of Permissions. Identity based and Resource based. We can create a Permission to access or perform an action on an AWS Resource and assign it to a User, Role or Group. We can also create Permissions on resources like S3 bucket, Glacier vault etc and specify who has access to the resource.

5. **IAM Policy**: An IAM Policy is a document in which we list permissions to specify Actions, Resources and Effects. This document is in JSON format. We can attach a Policy to an IAM User or Group.

#### 924. What are the important points about AWS IAM?

ome of the important points about AWS IAM are as follows:

1. A new User in IAM does not have any permission. AWS IAM assigns an Access Key and a Secret Access Key to a new User.

2. An Access Key cannot be used to login to AWS Console.

3. We use Access Key to access AWS via an APIs or Command Line interface.

4. IAM is a universal application. It is common across all the regions in AWS.

5. When we first setup our AWS account, we get a root account that has complete Admin access.

#### 925. What are the important features of Amazon S3?

Some of the important features of Amazon S3 are as follows:
1. Amazon S3 provides unlimited storage for files.
2. File size in Amazon S3 can vary from 0 Bytes to 5 Terabytes.
3. We have store files in Buckets in Amazon S3.
4. In Amazon S3, names of buckets have to be unique globally.
5. Amazon S3 is Object Based storage.

#### 926. What is the scale of durability in Amazon S3?

Amazon S3 supports durability at the scale of 99.999999999% of time. This is
9 nines after decimal.

#### 927. What are the Consistency levels supported by Amazon S3?

Amazon S3 supports Read after Write consistency when we create a new object by PUT. It means as soon as we Write a new object, we can access it.

Amazon S3 supports Eventual Consistency when we overwrite an existing object by PUT. Eventual Consistency means that the effect of overwrite will not be immediate but will happen after some time.

For deletion of an object, Amazon S3 supports Eventual Consistency after DELETE.
#### 928. What are the different tiers in Amazon S3 storage?

Different Storage tiers in Amazon S3 are as follows:

1. **S3 Standard**: In this tier, S3 supports durable storage of files that become immediately available. This is used for frequently used files.

2. **S3 Standard -Infrequent Access (IA)**: In this tier, S3 provides durable storage that is immediately available. But in this tier files are infrequently accessed.

3. **S3 Reduced Redundancy Storage (RRS)**: In this tier, S3 provides the option to customers to store data at lower levels of redundancy. In this case data is copied to multiple locations but not on as many
locations as standard S3.

#### 929. How will you upload a file greater than 100 megabytes in Amazon S3?

Amazon S3 supports storing objects or files up to 5 terabytes. To upload a file
greater than 100 megabytes, we have to use Multipart upload utility from AWS.
By using Multipart upload we can upload a large file in multiple parts.

Each part will be independently uploaded. It doesn’t matter in what order each
part is uploaded. It even supports uploading these parts in parallel to decrease
overall time. Once all the parts are uploaded, this utility makes these as one
single object or file from which the parts were created.

#### 930. What happens to an Object when we delete it from Amazon S3?

Amazon S3 provides DELETE API to delete an object.

If the bucket in which the object exists is version controlled, then we can
specify the version of the object that we want to delete. The other versions of
the Object still exist within the bucket.

If we do not specify the version, and just pass the key name, Amazon S3 will
delete the object and return the version id. And the object will not appear on
the bucket.

In case the bucket is Multi-factor authentication (MFA) enabled, then the
DELETE request will fail if we do not specify a MFA token.

#### 931.What is the use of Amazon Glacier?


Amazon Glacier is an extremely low cost cloud based storage service
provided by Amazon.

We mainly use Amazon Glacier for long-term backup purpose.
Amazon Glacier can be used for storing data archives for months, years or
even decades.

It can also be used for long term immutable storage based on regulatory and
archiving requirements. It provides Vault Lock support for this purpose. In this
option, we write once but can read many times same data.
One use case is for storing certificates that can be issued only once and only
the original person keeps the main copy.

#### 932. Can we disable versioning on a version-enabled bucket in Amazon S3?


No, we cannot disable versioning on a version-enabled bucket in Amazon S3.
We can just suspend the versioning on a bucket in S3.

Once we suspend versioning, Amazon S3 will stop creating new versions of
the object. It just stores the object with null version ID.

On overwriting an existing object, it just replaces the object with null version
ID. So any existing versions of the object still remain in the bucket. But there
will be no more new versions of the same object except for the null version ID
object.

#### 933. What are the use cases of Cross Region Replication Amazon S3?


We can use Cross Region Replication Amazon S3 to make copies of an object across buckets in different AWS Regions. This copying takes place automatically and in an asynchronous mode. We have to add replication configuration on our source bucket in S3 to make use of Cross Region Replication. It will create exact replicas of the objects from source bucket to destination buckets in different regions.

Some of the main use cases of Cross Region Replication are as follows:

1. **Compliance**: Some times there are laws/regulatory requirements that ask for storing data at farther geographic locations. This kind of compliance can be achieved by using AWS Regions that are spread across the world.

2. **Failover**: At times, we want to minimize the probability of system failure due to complete blackout in a region. We can use Cross- Region Replication in such a scenario. 
3. **Latency**: In case we are serving multiple geographies, it makes sense to replicate objects in the geographical Regions that are closer to end customer. This helps in reducing the latency.

#### 934. Can we do Cross Region replication in Amazon S3 without enabling versioning on a bucket?

No, we have to enable versioning on a bucket to perform Cross Region
Replication.


#### 935. What are the different types of actions in Object Lifecycle Management in Amazon S3?

There are mainly two types of Object Lifecycle Management actions in Amazon S3.

1. **Transition Actions**: These actions define the state when an Object transitions from one storage class to another storage class. E.g. a new object may transition to STANDARD_IA (infrequent access) class after 60 days of creation. And it can transition to GLACIER after 180 days of creation.
2. **Expiration Actions**: These actions specify what happens when an Object expires. We can ask S3 to delete an object completely on expiration.

#### 936. How do we get higher performance in our application by using Amazon CloudFront?

If our application is content rich and used across multiple locations, we can use Amazon CloudFront to increase its performance. Some of the techniques used by Amazon CloudFront are as follows:

1. **Caching**: Amazon CloudFront caches the copies of our application’s content at locations closer to our viewers. By this caching our users get our content very fast. Also due to caching the load on our main server decreases.

2. **Edge / Regional Locations**: CloudFront uses a global network of Edge and Regional edge locations to cache our content. These locations cater to almost all of the geographical areas across the world.

3. **Persistent Connections**: In certain cases, CloudFront keeps persistent connections with the main server to fetch the content quickly.

4. **Other Optimization**: Amazon CloudFront also uses other optimization techniques like TCP initial congestion window etc to deliver high performance experience.


#### 937. What is the mechanism behind Regional Edge Cache in Amazon CloudFront?

A Regional Edge Cache location lies between the main webserver and the global edge location. When the popularity of an object/content decreases, the global edge location may take it out from the cache.

But Regional Edge location maintains a larger cache. Due to this the object/content can stay for long time in Regional Edge location. Due to this CloudFront does not have to go back to main webserver. When it does not find any object in Global Edge location it just looks for in Regional Edge location.

This improves the performance for serving content to our users in Amazon CloudFront.

#### 938. What are the benefits of Streaming content?

We can get following benefits by Streaming content:

1. **Control**: We can provide more control to our users for what they want to watch. In a video streaming, users can select the locations in video where they want to start watching from.
2. **Content**: With streaming our entire content does not stay at a user’s device. Users gets only the part they are watching. Once the session is over, content is removed from the user’s device.
3. **Cost**: With streaming there is no need to download all the content to a user’s device. A user can start viewing content as soon as some part is available for viewing. This saves costs since we do not have to download a large media file before starting each viewing session.

#### 939. What is Lambda @Edge in AWS?

In AWS, we can use Lambda@Edge utility to solve the problem of low network latency for end users.

In Lambda@Edge there is no need to provision or manage servers. We can just upload our Node.js code to AWS Lambda and create functions that will be triggered on CloudFront requests.

When a request for content is received by CloudFront edge location, the Lambda code is ready to execute.

This is a very good option for scaling up the operations in CloudFront without managing servers.

#### 940. What are the different types of events triggered by Amazon CloudFront?

Different types of events triggered by Amazon CloudFront are as follows:

1. **Viewer Request**: When an end user or a client program makes an HTTP/HTTPS request to CloudFront, this event is triggered at the Edge Location closer to the end user.

2. **Viewer Response**: When a CloudFront server is ready to respond to a request, this event is triggered.

3. **Origin Request**: When CloudFront server does not have the requested object in its cache, the request is forwarded to Origin server. At this time this event is triggered.

4. **Origin Response**: When CloudFront server at an Edge location receives the response from Origin server, this event is triggered.


#### 941. What is Geo Targeting in Amazon CloudFront?

In Amazon CloudFront we can detect the country from where end users are requesting our content. This information can be passed to our Origin server by Amazon CloudFront. It is sent in a new HTTP header.

Based on different countries we can generate different content for different versions of the same content. These versions can be cached at different Edge Locations that are closer to the end users of that country.

In this way we are able to target our end users based on their geographic locations.

#### 942. What are the main features of Amazon CloudFront?

Some of the main features of Amazon CloudFront are as follows:

1. Device Detection
2. Protocol Detection
3. Geo Targeting
4. Cache Behavior
5. Cross Origin Resource Sharing
6. Multiple Origin Servers
7. HTTP Cookies
8. Query String Parameters
9. Custom SSL

#### 943. What are the security mechanisms available in Amazon S3?

Amazon S3 is a very secure storage service. Some of the main security mechanisms available in Amazon S3 are as follows:

1. Access: When we create a bucket or an object, only the owner get the access to the bucket and objects.
2. Authentication: Amazon S3 also support user authentication to control who has access to a specific object or bucket.
3. Access Control List: We can create Access Control Lists (ACL) to provide selective permissions to users and groups.
4. HTTPS: Amazon S3 also supports HTTPS protocol to securely upload and download data from cloud.
5. Encryption: We can also use Server Side Encryption (SSE) in Amazon S3 to encrypt data.


