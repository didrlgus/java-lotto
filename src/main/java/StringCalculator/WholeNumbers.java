package StringCalculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WholeNumbers {
    private final List<WholeNumber> numbers;

    public WholeNumbers(List<Integer> numbers) {
        List<WholeNumber> nums = new ArrayList<>();
        numbers.forEach(number -> nums.add(new WholeNumber(number)));
        this.numbers = nums;
    }

    public List<WholeNumber> getValue(){
        return numbers;
    }
}
