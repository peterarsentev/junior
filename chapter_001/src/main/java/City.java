import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * //TODO add comments.
 +You have to develop and perform unit testing of the thread-safety Java Class Library
 that works with a graph that presents model of streets and buildings. Streets and buildings
 have a relation many-to-many. Buildings can have more than one address in accordance with streets on which they are located.
 +
 +The following functions must be realised:
 +- CRUD;
 +- street search by part of street's name
 +- search of a building by part of street's name and range of building's numbers
 +
 +Executable unit test is a must.
 */

public class City {
    private final ConcurrentHashMap<Integer, Build> builds = new ConcurrentHashMap<>();

    public void create(final Build build) {
        this.builds.put(build.getId(), build);
    }

    public void update(final Build build) {
        this.builds.put(build.getId(), build);
    }

    public Build read(final int id) {
        return this.builds.get(id);
    }

    public void delete(final int id) {
        this.builds.remove(id);
    }

    interface  Predict {
        boolean is(Address address);
    }

    private <T> List<Build> searchByPredict(final Predict predict) {
        List<Build> result = new ArrayList<>();
        for (Build build : this.builds.values()) {
            for (Address address : build.getAddresses()) {
                if (predict.is(address)) {
                    result.add(build);
                }
            }
        }
        return result;
    }

    public List<Build> searchByName(String name) {
        return this.searchByPredict(
                (address) -> address.getStreet().getName().contains(name)
        );
    }

    public List<Build> searchByRange(String name, int begin, int end) {
        return this.searchByPredict(
                (address) -> address.getNumber() > begin &&
                        address.getNumber() < end &&
                        address.getStreet().getName().contains(name)
        );
    }

    /**
     * //TODO add comments.
     *
     * @author Petr Arsentev (parsentev@yandex.ru)
     * @version $Id$
     * @since 0.1
     */
    public static class Address {
        private final Street street;
        private final int number;

        public Address(Street street, int number) {
            this.street = street;
            this.number = number;
        }

        public Street getStreet() {
            return street;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Address address = (Address) o;

            if (number != address.number) return false;
            return street != null ? street.equals(address.street) : address.street == null;
        }

        @Override
        public int hashCode() {
            int result = street != null ? street.hashCode() : 0;
            result = 31 * result + number;
            return result;
        }
    }

    /**
     * //TODO add comments.
     *
     * @author Petr Arsentev (parsentev@yandex.ru)
     * @version $Id$
     * @since 0.1
     */
    public static class Build {
        private final int id;
        private final List<Address> addresses;

        public Build(int id, final List<Address> addresses) {
            this.id = id;
            this.addresses = addresses;
        }

        public int getId() {
            return id;
        }

        public List<Address> getAddresses() {
            return addresses;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Build build = (Build) o;

            return id == build.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    /**
     * //TODO add comments.
     *
     * @author Petr Arsentev (parsentev@yandex.ru)
     * @version $Id$
     * @since 0.1
     */
    public static class Street {
        private final String name;

        public Street(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Street street = (Street) o;

            return name != null ? name.equals(street.name) : street.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}
