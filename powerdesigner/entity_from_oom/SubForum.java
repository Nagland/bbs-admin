/***********************************************************************
 * Module:  SubForum.java
 * Author:  xilin
 * Purpose: Defines the Class SubForum
 ***********************************************************************/

import java.util.*;

/** @pdOid 18f89e83-f98e-4217-89ba-bb9f33a29abb */
public class SubForum {
   /** @pdOid 831d64d1-9bab-404e-a604-53700bfd4796 */
   public int id;
   /** @pdOid f503eab9-0d4d-47dd-8fa6-fbc46683fe9c */
   public java.lang.String name;
   /** @pdOid 3100d9cb-2f49-48a7-9a1b-d3464eb76890 */
   public java.lang.String description;
   
   /** @pdRoleInfo migr=no name=Topic assc=Reference_5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Topic> topic;
   /** @pdRoleInfo migr=no name=Forum assc=Reference_4 mult=0..1 side=A */
   public Forum forum;
   /** @pdRoleInfo migr=no name=User assc=Reference_7 mult=0..1 side=A */
   public User user;
   
   
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
         newTopic.setSubForum(this);      
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
            oldTopic.setSubForum((SubForum)null);
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
            oldTopic.setSubForum((SubForum)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Forum getForum() {
      return forum;
   }
   
   /** @pdGenerated default parent setter
     * @param newForum */
   public void setForum(Forum newForum) {
      if (this.forum == null || !this.forum.equals(newForum))
      {
         if (this.forum != null)
         {
            Forum oldForum = this.forum;
            this.forum = null;
            oldForum.removeSubForum(this);
         }
         if (newForum != null)
         {
            this.forum = newForum;
            this.forum.addSubForum(this);
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
            oldUser.removeSubForum(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addSubForum(this);
         }
      }
   }

}