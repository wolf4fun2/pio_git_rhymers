package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    //! Correction based on https://gist.github.com/kowallus/af13f7e430fbf1a7c9a293b9e57e66bc

    private static int EMPTY_RHYMER_INDICATOR = -1;
    private static final int IS_EMPTY = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    /**
     * @param in Adding element to numbers array
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++EMPTY_RHYMER_INDICATOR] = in;
    }

    /**
     * @return boolean Checking if index of array has a default value
     */
    public boolean callCheck() {
        return EMPTY_RHYMER_INDICATOR == IS_EMPTY;
    }

    /**
     * @return boolean Checking if array of numbers is full
     */
    public boolean isFull() {
        return EMPTY_RHYMER_INDICATOR == CAPACITY - 1;
    }

    /**
     * @return int On succes returns the last element of array, DEFAULT_VALUE is
     *         returned otherwise
     */
    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[EMPTY_RHYMER_INDICATOR];
    }

    /**
     * @return int On succes returns last element and decrements index of array
     *         numbers, DEFAULT_VALUE is returned otherwise
     */
    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[EMPTY_RHYMER_INDICATOR--];
    }

}