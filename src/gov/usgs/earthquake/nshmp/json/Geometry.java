package gov.usgs.earthquake.nshmp.json;

/**
 * Interface for the different GeoJson {@code Geometry} types.
 * <br>
 * Current {@code Geometry} types defined:
 *    <ul>
 *      <li> {@link Point} </li>
 *      <li> {@link Polygon} </li>
 *    </ul>
 * <br>
 * 
 * A GeoJson {@code Geometry} contains two members:
 *    <ul>
 *      <li> type: a {@link GeoJsonType} </li>
 *      <li> coordinates: different types of array configurations </li>
 *    </ul>
 * The "type" member must be one of the {@code GeoJsonType}s.
 * <br>
 * 
 * The "coordinates" member is some type of array. The interface defines the 
 *    coordinates as a generic {@code Object}. To obtain the more specific type of
 *    array it is required to cast to the more specific {@code Geometry} type.
 * <br><br>
 * 
 * Example:
 * <pre>
 * {@code
 * Properties properties = Properties.builder()
 *    .title("test")
 *    .id("id")
 *    .build();
 * Feature feature = Feature.createPoint(40, -120, properties);
 * Point point = (Point) feature.geometry;
 * double[] coords = point.getCoordinates();
 * }
 * </pre>
 * 
 * @author Brandon Clayton
 */
public interface Geometry {
 
  /** 
   * Return a generic {@code Object} representing the coordinates
   *    of the {@code Geometry}.
   * <br>
   * 
   * It is best to cast to a specific {@code Geometry} type to obtain the 
   *    coordinates:
   *    <ul>
   *      <li> {@link Point} </li>
   *      <li> {@link Polygon} </li>
   *    </ul>
   * <br><br>
   * 
   * Example:
   * <pre>
   * {@code
   * Properties properties = Properties.builder()
   *    .title("test")
   *    .id("id")
   *    .build();
   * Feature feature = Feature.createPoint(40, -120, properties);
   * Point point = (Point) feature.geometry;
   * double[] coords = point.getCoordinates();
   * }
   * </pre>
   */
  public Object getCoordinates();
 
  /**
   * Return the {@code String} representing the {@link GeoJsonType} {@code Geometry}.
   * @return The {@code String} of the {@code GeoJsonType}.
   */
  public String getType();

  /**
   * Return a {@code String} in JSON format.
   */
  public String toJsonString();

}
