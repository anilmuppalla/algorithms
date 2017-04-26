
import org.junit.*;

public class UnionFindTest {

  private UnionFind unionFind;

  @Before
  public void setup() {
    UnionFind unionFind = new UnionFind(4);
    this.unionFind = unionFind;
  }

  @Test
  public void testUnion() {
    int[] id = unionFind.union(1, 2);
    int[] expected = {0, 2, 2, 3};
    Assert.assertArrayEquals("Union Test", expected, id);
  }

  @Test
  public void testConnectedFalse() {
    Assert.assertFalse(unionFind.connected(0, 3));
  }

  @Test
  public void testConnectedTrue() {
    unionFind.union(1, 2);
    Assert.assertTrue(unionFind.connected(1, 2));
  }

}
