package net.api.swing;

import java.util.Arrays;


public class Lotto {
	int[] lotto = new int[6];

	public int[] getLotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = getRandomNumber();
		}
		sort(lotto);
		return lotto;
	}

	private int getRandomNumber() {
		return (int) ((Math.random() * 45) + 1);
	}

	public void setLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					;
					i--;
				   continue ;
				}
			}
		 Arrays.sort(lotto);
		}
	}

	public void sort(int[] array) {
		int q = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					q = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = q;
				}

			}

		}

	}

	public void setLotto() {

	}

}
