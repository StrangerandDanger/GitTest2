
public class EratosthenesPrimeSieve
{
  int MAX;

  public EratosthenesPrimeSieve(int MAX)
  {
    this.MAX = MAX;
  }
  boolean[] primes = new boolean[MAX];
  public void PrimeSieve(String[] args)
  {
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
//counts and prints the total of prime numbers
  public void PrimeCounter()
  {
    int count = 0;
    for (int i = 2; i < MAX; i++)
    {
      if (primes[i - 1]) {
        System.out.println(i);
        count++;
      }
      System.out.printf("There were %d primes up to %d", count, MAX);
    }
  }
}