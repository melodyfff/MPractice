package hash;

/**
 * ��дhashCode��equals
 * @author vov
 *
 */
public class Point2 {
	  private int x;
	  private int y;

	 public Point2(int x, int y)
	  {
	   super();
	   this.x = x;
	   this.y = y;
	  }
	 
	 /* ��дhashCode
	 * @see java.lang.Object#hashCode()
	 */
	@Override 
	  public int hashCode()
	 {
	   final int prime = 31;
	   int result = 1;
	   result = prime * result + x;
	   result = prime * result + y;
	   return result;
	  }

	
	/* ��дequals
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	  public boolean equals(Object obj)
	 {
	   if (this == obj) return true;
	   if (obj == null) return false;
	   if (getClass() != obj.getClass()) return false;
	   Point2 other = (Point2) obj;
	   if (x != other.x) return false;
	   if (y != other.y) return false;
	   return true;
	  }
	
	  public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}



}
