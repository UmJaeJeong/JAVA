package sec01_stack_queue.example01_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//coin�� �����ϴ� Stack�÷����� ������.
		Stack<Coin> coinBox = new Stack<>();
		//coinBox���� �������� ������.(���� ����)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(150));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(500));
		
		while(!coinBox.empty()) {
			//���� �ʰ� �� ������ �ϳ��� ����.
			//��°���� ���Լ����� �� ����� ���� �� �ִ�.
			Coin coin = coinBox.pop();
			System.out.println("������ ���� :"+coin.getValue());
		}

	}

}
