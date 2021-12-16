package standard.classes;

import java.util.Objects;

public class ObjectsApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    execute(new Data("John Doe (Acme Inc.)"));
  }

  public static class Data {
    private String data;

    public Data(String data) {
      setData(data);
    }

    public String getData() {
      return data;
    }

    public void setData(String data) {
      this.data = data;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((data == null) ? 0 : data.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Data other = (Data) obj;
      if (data == null) {
        if (other.data != null)
          return false;
      } else if (!data.equals(other.data))
        return false;
      return true;
    }

    @Override
    public String toString() {
      return "Data{" + "data='" + data + "'" + "}";
    }

  }

  public static void execute(Data data) {
    // ? common way
    if (data != null) {
      System.out.println(data.toString());
      System.out.println(data.hashCode());
    }

    System.out.println(""); // ? Newline

    // ? using Objects
    System.out.println(Objects.toString(data));
    System.out.println(Objects.hashCode(data));
  }
}
