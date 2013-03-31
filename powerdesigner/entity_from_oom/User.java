/***********************************************************************
 * Module:  User.java
 * Author:  xilin
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid a51348b4-562d-4825-b68b-82a795f518c4 */
public class User {
   /** @pdOid 4e8d16e7-c130-4d96-a2e5-60834fddf9d8 */
   public java.lang.String id;
   /** @pdOid 6e81444c-0fdc-4d3b-885c-419e24f2b67e */
   public java.lang.String userName;
   /** @pdOid 8bb00cf9-7af1-49da-a806-93bb2e5b4d07 */
   public java.lang.String nickName;
   /** @pdOid 3f424b7f-f529-4ef7-899a-33d3787645c2 */
   public java.lang.String password;
   /** @pdOid 592ad691-4e1f-48b9-9236-874a2878445d */
   public java.lang.String email;
   
   /** @pdRoleInfo migr=no name=Topic assc=Reference_1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Topic> topic;
   /** @pdRoleInfo migr=no name=Reply assc=Reference_6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reply> reply;
   /** @pdRoleInfo migr=no name=SubForum assc=Reference_7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<SubForum> subForum;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Topic> getTopic() {
      if (topic == null)
         topic = new java.util.HashSet<Topic>();
      return topic;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTopic() {
      if (topic == null)
         topic = new java.util.HashSet<Topic>();
      return topic.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTopic */
   public void setTopic(java.util.Collection<Topic> newTopic) {
      removeAllTopic();
      for (java.util.Iterator iter = newTopic.iterator(); iter.hasNext();)
         addTopic((Topic)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTopic */
   public void addTopic(Topic newTopic) {
      if (newTopic == null)
         return;
      if (this.topic == null)
         this.topic = new java.util.HashSet<Topic>();
      if (!this.topic.contains(newTopic))
      {
         this.topic.add(newTopic);
         newTopic.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTopic */
   public void removeTopic(Topic oldTopic) {
      if (oldTopic == null)
         return;
      if (this.topic != null)
         if (this.topic.contains(oldTopic))
         {
            this.topic.remove(oldTopic);
            oldTopic.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTopic() {
      if (topic != null)
      {
         Topic oldTopic;
         for (java.util.Iterator iter = getIteratorTopic(); iter.hasNext();)
         {
            oldTopic = (Topic)iter.next();
            iter.remove();
            oldTopic.setUser((User)null);
         }
      }
   }
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
         newReply.setUser(this);      
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
            oldReply.setUser((User)null);
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
            oldReply.setUser((User)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<SubForum> getSubForum() {
      if (subForum == null)
         subForum = new java.util.HashSet<SubForum>();
      return subForum;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSubForum() {
      if (subForum == null)
         subForum = new java.util.HashSet<SubForum>();
      return subForum.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSubForum */
   public void setSubForum(java.util.Collection<SubForum> newSubForum) {
      removeAllSubForum();
      for (java.util.Iterator iter = newSubForum.iterator(); iter.hasNext();)
         addSubForum((SubForum)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSubForum */
   public void addSubForum(SubForum newSubForum) {
      if (newSubForum == null)
         return;
      if (this.subForum == null)
         this.subForum = new java.util.HashSet<SubForum>();
      if (!this.subForum.contains(newSubForum))
      {
         this.subForum.add(newSubForum);
         newSubForum.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSubForum */
   public void removeSubForum(SubForum oldSubForum) {
      if (oldSubForum == null)
         return;
      if (this.subForum != null)
         if (this.subForum.contains(oldSubForum))
         {
            this.subForum.remove(oldSubForum);
            oldSubForum.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSubForum() {
      if (subForum != null)
      {
         SubForum oldSubForum;
         for (java.util.Iterator iter = getIteratorSubForum(); iter.hasNext();)
         {
            oldSubForum = (SubForum)iter.next();
            iter.remove();
            oldSubForum.setUser((User)null);
         }
      }
   }

}