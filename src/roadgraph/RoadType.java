package roadgraph;

import java.util.HashMap;
import java.util.HashSet;

import util.GraphLoader;

public class RoadType {
	
	public static final String SECONDARY = "secondary";
	public static final String UNCLASSIFIED = "unclassified";
	public static final String RESIDENTIAL = "residential";
	public static final String TERTIARY = "tertiary";
	public static final String LIVING_STREET = "living_street";
	public static final String MOTORWAY_LINK = "motorway_link";
	public static final String SECONDARY_LINK = "secondary_link";
	public static final String MOTORWAY = "motorway";
	public static final String PRIMARY = "primary";
	public static final HashMap<String, Double> SpeedMap = new HashMap<String, Double>();
	
	static {
		SpeedMap.put(SECONDARY, 60.0);
		SpeedMap.put(UNCLASSIFIED, 50.0);
		SpeedMap.put(RESIDENTIAL, 20.0);
		SpeedMap.put(TERTIARY, 25.0);
		SpeedMap.put(LIVING_STREET, 20.0);
		SpeedMap.put(MOTORWAY_LINK, 22.0);
		SpeedMap.put(SECONDARY_LINK, 30.0);
		SpeedMap.put(MOTORWAY, 27.0);
		SpeedMap.put(PRIMARY, 80.0);
		
		/*
		SpeedMap.put(SECONDARY, 1.0);
		SpeedMap.put(UNCLASSIFIED, 1.0);
		SpeedMap.put(RESIDENTIAL, 1.0);
		SpeedMap.put(TERTIARY, 1.0);
		SpeedMap.put(LIVING_STREET, 1.0);
		SpeedMap.put(MOTORWAY_LINK, 1.0);
		SpeedMap.put(SECONDARY_LINK, 1.0);
		SpeedMap.put(MOTORWAY, 1.0);
		SpeedMap.put(PRIMARY, 1.0);
		*/
		
		
	}
	//final static String 
	public static void showRoadTypes(){
		
		HashSet<String> roadtypes = new HashSet<String>();
		
		MapGraph theMap = new MapGraph();
		System.out.print("DONE. \nLoading the map...\n");
		GraphLoader.loadRoadMap("data/maps/utc.map", theMap);
		for(MapEdge edge : theMap.getEdges()){
			roadtypes.add(edge.getRoadType());
		}
		System.out.println(roadtypes);
		
		GraphLoader.loadRoadMap("data/maps/hollywood_large.map", theMap);
		
		for(MapEdge edge : theMap.getEdges()){
			roadtypes.add(edge.getRoadType());
		}
		System.out.println(roadtypes);
	}
	
	public static void main(String[] args){
		showRoadTypes();
	}
}
