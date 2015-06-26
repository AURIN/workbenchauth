package au.aurin.org.io;

public class DatasetAttribute {

  private String name;

  private String type;

  public DatasetAttribute(final String name, final String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(final String type) {
    this.type = type;
  }

}
