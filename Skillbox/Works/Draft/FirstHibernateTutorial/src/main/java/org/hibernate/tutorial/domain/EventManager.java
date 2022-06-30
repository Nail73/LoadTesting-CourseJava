package org.hibernate.tutorial;

import org.hibernate.Session;
import java.util.*;
import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.domain.Person;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

  public static void main(String[] args) {
    EventManager mgr = new EventManager();
    if (args[0].equals("store")) {
      mgr.createAndStoreEvent("My Event", new Date());
    } else if (args[0].equals("list")) {
      List events = mgr.listEvents();
      for (int i = 0; i < events.size(); i++) {
        Event theEvent = (Event) events.get(i);
        System.out.println(
            "Event: " + theEvent.getTitle() + " Time: " + theEvent.getDate()
        );
      }
    }
    HibernateUtil.getSessionFactory().close();
  }

  private List listEvents() {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    session.beginTransaction();
    List result = session.createQuery("from Event").list();
    session.getTransaction().commit();
    return result;
  }

  private void createAndStoreEvent(String title, Date theDate) {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    session.beginTransaction();
    Event theEvent = new Event();
    theEvent.setTitle(title);
    theEvent.setDate(theDate);
    session.save(theEvent);
    session.getTransaction().commit();
  }

  private void addPersonToEvent(Long personId, Long eventId) {
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    session.beginTransaction();

    Person aPerson = (Person) session
        .createQuery("select p from Person p left join fetch p.events where p.id = :pid")
        .setParameter("pid", personId)
        .uniqueResult();
    Event anEvent = (Event) session.load(Event.class, eventId);
    session.getTransaction().commit();
    aPerson.getEvents().add(anEvent);
    Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
    session2.beginTransaction();
    session2.update(aPerson);

    session2.getTransaction().commit();
  }

}