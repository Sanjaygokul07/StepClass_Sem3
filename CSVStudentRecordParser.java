public class CSVStudentRecordParser {

    // Method to parse a CSV line into a formatted student record
    static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + fields[0] + " | Roll No: " + fields[1] + " | Dept: " + fields[2]);
    }

    public static void main(String[] args) {
        parseStudentRecord("SANJAY GOKUL,RA2511032010018,CSE");
        parseStudentRecord("SANJAY GOKUL,CSE");
    }
}