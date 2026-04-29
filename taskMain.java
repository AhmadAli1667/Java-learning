import java.util.*;

// custom exception for bad coordinates
class InvalidCoordinateException extends Exception {
    public InvalidCoordinateException(String msg) {
        super(msg);
    }
}

// custom exceptions for processor
class EmptyListException extends Exception {
    public EmptyListException(String msg) {
        super(msg);
    }
}

class SinglePointException extends Exception {
    public SinglePointException(String msg) {
        super(msg);
    }
}

// Part A: immutable point class
final class ImmutablePoint {
    private final double x;
    private final double y;

    // private constructor so only factory can call
    private ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // factory method with validation
    public static ImmutablePoint of(double x, double y) throws InvalidCoordinateException {
        if (Double.isNaN(x) || Double.isNaN(y) || Double.isInfinite(x) || Double.isInfinite(y)) {
            throw new InvalidCoordinateException("Coordinates must be finite numbers");
        }
        return new ImmutablePoint(x, y);
    }

    // getters
    public double getX() { return x; }
    public double getY() { return y; }

    // distance formula
    public double distanceTo(ImmutablePoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Part B: processor class
class PointProcessor {
    public List<ImmutablePoint> processPoints(List<ImmutablePoint> points)
            throws EmptyListException, SinglePointException {
        if (points == null || points.isEmpty()) {
            throw new EmptyListException("List is empty");
        }
        if (points.size() == 1) {
            throw new SinglePointException("Only one point present");
        }

        double maxDist = -1;
        ImmutablePoint p1 = null, p2 = null;

        // brute force check all pairs
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double dist = points.get(i).distanceTo(points.get(j));
                if (dist > maxDist) {
                    maxDist = dist;
                    p1 = points.get(i);
                    p2 = points.get(j);
                }
            }
        }
        return Arrays.asList(p1, p2);
    }
}

// demo
public class taskMain {
    public static void main(String[] args) {
        try {
            // normal points
            ImmutablePoint a = ImmutablePoint.of(0, 0);
            ImmutablePoint b = ImmutablePoint.of(3, 4);
            ImmutablePoint c = ImmutablePoint.of(-5, 2);
            ImmutablePoint d = ImmutablePoint.of(10, -7);

            List<ImmutablePoint> points = Arrays.asList(a, b, c, d);
            PointProcessor processor = new PointProcessor();

            // successful run
            List<ImmutablePoint> pair = processor.processPoints(points);
            System.out.println("Farthest pair: " + pair.get(0) + " and " + pair.get(1));

            // empty list case
            try {
                processor.processPoints(new ArrayList<>());
            } catch (EmptyListException | SinglePointException e) {
                System.out.println("Caught: " + e.getMessage());
            }

            // single point case
            try {
                processor.processPoints(Collections.singletonList(a));
            } catch (EmptyListException | SinglePointException e) {
                System.out.println("Caught: " + e.getMessage());
            }

            // invalid coordinate case
            try {
                ImmutablePoint bad = ImmutablePoint.of(Double.NaN, 5);
            } catch (InvalidCoordinateException e) {
                System.out.println("Caught: " + e.getMessage());
            }

        } catch (InvalidCoordinateException e) {
            System.out.println("Failed to create point: " + e.getMessage());
        }
    }
}
