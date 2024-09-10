package HomeWork3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int sizeComparison = Integer.compare(stream1.getStudentGroups().size(), stream2.getStudentGroups().size());
        if (sizeComparison != 0) {
            return sizeComparison;
        }
        return 0;
    }
}
