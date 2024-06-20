package iterator2;


public class StringContainer<T> implements Container<T>{
	//String[] strArray = {"Hello", "Iterator", "Pattern"};
	private T[] lst;
	@Override
	public Iterator<T> getIterator() {
		// Iterator interface 를 구현한 객체를 return
		return new IteratorImpl();
	}
	
	 public void setArray(T[] array) {
	        this.lst = array;
	}
	private class IteratorImpl implements Iterator<T>{

		int index;	// default 0
		@Override
		public boolean hasNext() {
			if (index < lst.length) return true;
			return false;
		}

		@Override
		public T next() {
			if (this.hasNext()) return lst[index++];
			return null;
		}
		
	}
}
