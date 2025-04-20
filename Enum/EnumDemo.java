//In Java, an enum (short for "enumeration") is a special data type that represents a fixed set of constants.
// Enums are used to define a collection of predefined, unchangeable values, making the code more readable and type-safe.
// Enums directly implements map interface
// Enum Map is an array of size same as enum 
//[TUESDAY,-,-,-,-,-,-]
// no hashing 
// ordinal/index is used 
// faster than hashmap
// memory efficient
import java.util.EnumMap;
import java.util.Map;

enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public class EnumDemo {
        public static void main(String[] args) {
            Day today = Day.MONDAY;
           Map<Day, String> dayMap = new EnumMap<>(Day.class);
            dayMap.put(Day.MONDAY, "Start of the week");
            dayMap.put(Day.TUESDAY, "Gym");
            System.out.println(Day.TUESDAY.ordinal());
        }
    }







    
        //     // Print the enum value
        //     System.out.println("Today is: " + today);
    
        //     // Iterate over all enum values
        //     for (Day day : Day.values()) {
        //         System.out.println(day);
        //     }
    
        //     // Use switch-case with enums
        //     switch (today) {
        //         case MONDAY:
        //             System.out.println("Start of the work week!");
        //             break;
        //         case FRIDAY:
        //             System.out.println("End of the work week!");
        //             break;
        //         default:
        //             System.out.println("It's a regular day.");
        //     }
        // }
 
        
    
    

