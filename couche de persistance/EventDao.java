import java.util.List;


public interface EventDao {
	
	void createEvent(Map map, Event event);
	void deleteEvent(Event event);
	
	List<Event> eventsByMap(Map map);
	List<Event> eventsByCategory(String category);
	
	List<Event> allEvents();
	


}
