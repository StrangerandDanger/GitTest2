
public class EratosthenesPrimeSieve
{
  int MAX;

  public EratosthenesPrimeSieve(int MAX)
  {
    this.MAX = MAX;
  }

  public void PrimeSieve(String[] args)
  {
    boolean[] primes = new boolean[MAX];
    for (int i=0; i<primes.length; i++)
    {
      primes[i] = true;
    }

    for (int i=2; i<Math.sqrt(MAX)+1; i++) {
      if (primes[i-1]) {
        for (int j=(int) Math.pow(i,2); j<=MAX; j+=i) {
          primes[j - 1] = false;
        }
      }
    }

  }
}