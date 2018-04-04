import java.util.List;

public interface MapDao {

	void createMap(String name,String category);
	void createCategory(String category);
	void deleteMap(Map map);
	void deleteCategory(String category);
	
	void modifyCategory(String mapName,String category);
	void modifyName(String oldName,String newName);
	
	Map searchByName (String name);
	
	List<Map> searchByCategory(String category);
	List<Map> getMaps();
	
	
}
