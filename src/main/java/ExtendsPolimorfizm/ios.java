package ExtendsPolimorfizm;

import java.util.Objects;

public class ios {
    String name;
    int version;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ios ios = (ios) o;
        return version == ios.version && Objects.equals(name, ios.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version);
    }

    public ios(String MyName, int MyVersion){
        name = MyName;
        version = MyVersion;
    }
}
