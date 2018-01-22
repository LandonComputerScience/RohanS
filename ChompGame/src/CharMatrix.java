/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  public final char SPACE = ' ';
  private char[][] grid;

  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    this.fillRect(0, 0, rows - 1, cols - 1, ' ');
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    this.grid = new char[rows][cols];
    this.fillRect(0, 0, rows - 1, cols - 1, fill);
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return this.grid.length;
  }

  /**
   * Returns the number of colsumns in grid
   */
  public int numCols()
  {
    return this.grid[0].length;
  }

  /**
   * Returns the character at rows, cols location
   */
  public char charAt(int rows, int cols)
  {
    return this.grid[rows][cols];
  }

  /**
   * Sets the character at rows, cols location to ch
   */
  public void setCharAt(int rows, int cols, char ch)
  {
    this.grid[rows][cols] = ch;
  }

  /**
   * Returns true if the character at rows, cols is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int rows, int cols)
  {
    return this.charAt(rows, cols) == ' ';
  }

  public void fillRect(int rows0, int cols0, int rows1, int cols1, char fill)
  {
    for(int r = rows0; r <= rows1; ++r) {
      for(int c = cols0; c <= cols1; ++c) {
        this.setCharAt(r, c, fill);
      }
    }
  }

  public void clearRect(int row0, int col0, int row1, int col1)
    {
    this.fillRect(row0, col0, row1, col1, ' ');
    }

  public int countInRow(int row)
    {
    int num = 0;

    for(int g = 0; g < this.numCols(); ++g) {
      if (!this.isEmpty(row, g)) {
        ++num;
      }
      }
    return num;
      }

  public int countIncols(int cols)
  {
    int num = 0;

    for(int u = 0; u < this.numRows(); ++u) {
      if (!this.isEmpty(u, cols)) {
        
        ++num;
      }
      }

    return num;
    }
   }

