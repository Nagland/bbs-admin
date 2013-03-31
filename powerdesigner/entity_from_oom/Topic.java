/***********************************************************************
 * Module:  Topic.java
 * Author:  xilin
 * Purpose: Defines the Class Topic
 ***********************************************************************/

import java.util.*;

/** @pdOid 90c83502-ca5f-427f-a36a-3a8ebcaf361b */
public class Topic {
   /** @pdOid 718a2702-17b0-41be-b476-c2146b2617e9 */
   public java.lang.String id;
   /** @pdOid 97915f47-7084-442f-b95b-79682e9a7646 */
   public java.util.Date postTime;
   /** @pdOid eafc984a-e55b-46ed-8d02-7bc10c3c7712 */
   public java.util.Date lastreplyTime;
   /** @pdOid 06eb9ab4-b39b-4ed5-9cff-bebf8b2648c9 */
   public java.lang.String topicContent;
   
   /** @pdRoleInfo migr=no name=Reply assc=Reference_2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reply> reply;
   /** @pdRoleInfo migr=no name=User assc=Reference_1 mult=0..1 side=A */
   public User user;
   /** @pdRoleInfo migr=no name=SubForum assc=Reference_5 mult=0..1 side=A */
   public SubForum subForum;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reply> getReply() {
      if (reply == null)
         reply = new java.util.HashSet<Reply>();
      return reply;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReply() {
      if (reply == null)
         reply = new java.util.HashSet<Reply>();
      return reply.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReply */
   public void setReply(java.util.Collection<Reply> newReply) {
      removeAllReply();
      for (java.util.Iterator iter = newReply.iterator(); iter.hasNext();)
         addReply((Reply)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReply */
   public void addReply(Reply newReply) {
      if (newReply == null)
         return;
      if (this.reply == null)
         this.reply = new java.util.HashSet<Reply>();
      if (!this.reply.contains(newReply))
      {
         this.reply.add(newReply);
         newReply.setTopic(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldReply */
   public void removeReply(Reply oldReply) {
      if (oldReply == null)
         return;
      if (this.reply != null)
         if (this.reply.contains(oldReply))
         {
            this.reply.remove(oldReply);
            oldReply.setTopic((Topic)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReply() {
      if (reply != null)
      {
         Reply oldReply;
         for (java.util.Iterator iter = getIteratorReply(); iter.hasNext();)
         {
            oldReply = (Reply)iter.next();
            iter.remove();
            oldReply.setTopic((Topic)null);
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
            oldUser.removeTopic(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addTopic(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public SubForum getSubForum() {
      return subForum;
   }
   
   /** @pdGenerated default parent setter
     * @param newSubForum */
   public void setSubForum(SubForum newSubForum) {
      if (this.subForum == null || !this.subForum.equals(newSubForum))
      {
         if (this.subForum != null)
         {
            SubForum oldSubForum = this.subForum;
            this.subForum = null;
            oldSubForum.removeTopic(this);
         }
         if (newSubForum != null)
         {
            this.subForum = newSubForum;
            this.subForum.addTopic(this);
         }
      }
   }

}