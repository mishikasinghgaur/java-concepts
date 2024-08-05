package basics;

public class HashCodeAndEquals {
        private String name;
        private int age;

        public HashCodeAndEquals(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            // A simple hash code based on the person's age
            return age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true; // If it's the same object, they are equal.
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false; // If the other object is null or of a different class, they are not equal.
            }
            HashCodeAndEquals otherPerson = (HashCodeAndEquals) obj; // Cast the object to a Person.

            // Compare the name and age to determine equality.
            return age == otherPerson.age && name.equals(otherPerson.name);
        }

        public static void main(String[] args) {
            HashCodeAndEquals person1 = new HashCodeAndEquals("Alice", 25);
            HashCodeAndEquals person2 = new HashCodeAndEquals("Bob", 30);
            HashCodeAndEquals person3 = new HashCodeAndEquals("Alice", 25);

            // Using hashCode and equals
            System.out.println("person1.hashCode(): " + person1.hashCode());
            System.out.println("person2.hashCode(): " + person2.hashCode());
            System.out.println("person3.hashCode(): " + person3.hashCode());

            System.out.println("person1.equals(person2): " + person1.equals(person2));
            System.out.println("person1.equals(person3): " + person1.equals(person3));
        }
    }

