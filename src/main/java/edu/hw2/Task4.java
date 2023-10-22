package edu.hw2;

public class Task4 {
    private Task4() {
    }

    static CallingInfo callingInfo() {
        try {
            throw new Exception();
        } catch (Throwable e) {
            StackTraceElement[] stackTrace = e.getStackTrace();

            return new CallingInfo(stackTrace[1].getClassName(), stackTrace[1].getMethodName());
        }
    }

    public static record CallingInfo(String className, String methodName) {
    }

}
