/***********************************************************************
 * Module:  Reply.java
 * Author:  xilin
 * Purpose: Defines the Class Reply
 ***********************************************************************/

import java.util.*;

/** @pdOid 66d2a080-1dcf-4c51-833d-137848746561 */
public class Reply {
   /** @pdOid 0f830166-de4e-43af-980e-9e655985e507 */
   public java.lang.String id;
   /** @pdOid 22e0902b-cac4-45cb-9773-09512ab71e88 */
   public java.util.Date replyTime;
   /** @pdOid d6f50cf9-dada-4e7a-956f-c8589df092fd */
   public java.lang.String replyContent;
   
   /** @pdRoleInfo migr=no name=Reply assc=Reference_3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reply> replyB;
   /** @pdRoleInfo migr=no name=Topic assc=Reference_2 mult=0..1 side=A */
   public Topic topic;
   /** @pdRoleInfo migr=no name=Reply assc=Reference_3 mult=0..1 side=A */
   public Reply replyA;
   /** @pdRoleInfo migr=no name=User assc=Reference_6 mult=0..1 side=A */
   public User user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reply> getReplyB() {
      if (replyB == null)
         replyB = new java.util.HashSet<Reply>();
      return replyB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReplyB() {
      if (replyB == null)
         replyB = new java.util.HashSet<Reply>();
      return replyB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReplyB */
   public void setReplyB(java.util.Collection<Reply> newReplyB) {
      removeAllReplyB();
      for (java.util.Iterator iter = newReplyB.iterator(); iter.hasNext();)
         addReplyB((Reply)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReply */
   public void addReplyB(Reply newReply) {
      if (newReply == null)
         return;
      if (this.replyB == null)
         this.replyB = new java.util.HashSet<Reply>();
      if (!this.replyB.contains(newReply))
      {
         this.replyB.add(newReply);
         newReply.setReplyA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldReply */
   public void removeReplyB(Reply oldReply) {
      if (oldReply == null)
         return;
      if (this.replyB != null)
         if (this.replyB.contains(oldReply))
         {
            this.replyB.remove(oldReply);
            oldReply.setReplyA((Reply)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReplyB() {
      if (replyB != null)
      {
         Reply oldReply;
         for (java.util.Iterator iter = getIteratorReplyB(); iter.hasNext();)
         {
            oldReply = (Reply)iter.next();
            iter.remove();
            oldReply.setReplyA((Reply)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Topic getTopic() {
      return topic;
   }
   
   /** @pdGenerated default parent setter
     * @param newTopic */
   public void setTopic(Topic newTopic) {
      if (this.topic == null || !this.topic.equals(newTopic))
      {
         if (this.topic != null)
         {
            Topic oldTopic = this.topic;
            this.topic = null;
            oldTopic.removeReply(this);
         }
         if (newTopic != null)
         {
            this.topic = newTopic;
            this.topic.addReply(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Reply getReplyA() {
      return replyA;
   }
   
   /** @pdGenerated default parent setter
     * @param newReply */
   public void setReplyA(Reply newReply) {
      if (this.replyA == null || !this.replyA.equals(newReply))
      {
         if (this.replyA != null)
         {
            Reply oldReply = this.replyA;
            this.replyA = null;
            oldReply.removeReplyB(this);
         }
         if (newReply != null)
         {
            this.replyA = newReply;
            this.replyA.addReplyB(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public User getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            oldUser.removeReply(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addReply(this);
         }
      }
   }

}