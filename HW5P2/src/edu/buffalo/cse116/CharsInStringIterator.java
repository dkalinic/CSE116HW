package edu.buffalo.cse116;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class that can be used to iterate through each character in a {@code String}.
 *
 * @author Matthew Hertz
 */
public class CharsInStringIterator implements Iterator<Character> {
  /** Set of characters to be returned by this Iterator. */
  private String characterSource;

  /** Index in the String which will be returned by the Iterator. */
  private int cursor;

  /**
   * Create a new Iterator which can be used to go through the characters in this String.
   *
   * @param str Source of characters over which we will be iterating.
   */
  public CharsInStringIterator(String str) {
    cursor = 0;
    characterSource = str;
  }

  /** Return true if there is another character for the instance to return. */
  public boolean hasNext() {

	  return false;
  }

  /** Returns the next character in the String. */
  public Character next() throws NoSuchElementException {
	
	  return null;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}