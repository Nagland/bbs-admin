/***********************************************************************
 * Module:  Forum.java
 * Author:  xilin
 * Purpose: Defines the Class Forum
 ***********************************************************************/

import java.util.*;

/** @pdOid e0e2a1b2-b058-4dc9-a337-99ceefa68e42 */
public class Forum {
   /** @pdOid afd5e810-4f3f-40c0-a017-9bd7aff435da */
   public int id;
   /** @pdOid 0fb853bf-ce88-403a-8e49-dad8b69658fd */
   public java.lang.String name;
   /** @pdOid 6f2c3e78-bad9-4299-acc8-d1cf5bb1060b */
   public java.lang.String description;
   
   /** @pdRoleInfo migr=no name=SubForum assc=Reference_4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<SubForum> subForum;
   
   
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
         newSubForum.setForum(this);      
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
            oldSubForum.setForum((Forum)null);
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
            oldSubForum.setForum((Forum)null);
         }
      }
   }

}