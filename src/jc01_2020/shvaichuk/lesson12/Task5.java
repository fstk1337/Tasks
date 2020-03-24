package jc01_2020.shvaichuk.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Zhulik", 10);
		Cat cat2 = new Cat("Zefir", 7);
		System.out.println(cat1.hasMoreLives(cat2).getName());
	}

	static class Cat implements CatComparator {
		private String name;
		private int livesRemain;

		public Cat(String name, int livesRemain) {
			this.name = name;
			this.livesRemain = livesRemain;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getLivesRemain() {
			return livesRemain;
		}

		@Override
		public Cat hasMoreLives(Cat anotherCat) {
			if (anotherCat.getLivesRemain() > getLivesRemain()) {
				return anotherCat;
			}
			return this;
		}
	}

	public interface CatComparator {
		Cat hasMoreLives(Cat anotherCat);
	}
}
