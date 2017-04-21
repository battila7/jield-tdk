package jield.examples;

import java.util.LinkedList;
import java.util.stream.Stream;
import jield.annotation.Generator;

public class Primes {
    
    public Primes() {
        super();
    }
    
    public static void main(String[] args) {
        Primes p = new Primes();
        int i = p.primesJield().limit(10000).reduce(0, (a,b)->a + b);
        System.out.println(i);
    }
    
    private Stream<Integer> primesJield() {
        $GeneratorImpl_0primesJield-1468744572 $generator = new $GeneratorImpl_0primesJield-1468744572();
        $generator.primes-994652462 = this;
        return $generator.stream();
    }
    
    private final class $GeneratorImpl_0primesJield-1468744572 {
        private LinkedList<Integer> primes;
        private int current;
        private Iterator<Integer> iterator;
        private int i;
        private Primes primes-994652462;
        
        private Stream<Integer> stream() {
            return BaseGenerator.startingAt(this::<>primes_0).stream();
        }
        
        private Bounce<Integer> primes_0(GeneratorState<Integer> contParam) {
            return Bounce.cont(()->contParam.apply(GeneratorState.empty()));
        }

        private Bounce<Integer> primes_1(GeneratorState<Integer> contParam) {
            primes = new LinkedList<>();
            primes.add(2);
            return Bounce.cont(()->primes_2(contParam), 2);
        }
        
        private Bounce<Integer> primes_2(GeneratorState<Integer> contParam) {
            current = 1;
            return Bounce.cont(()->primes_3(contParam));
        }
        
        private Bounce<Integer> primes_3(GeneratorState<Integer> contParam) {
            current += 2;
            return Bounce.cont(()->primes_6(contParam));
        }
        
        private Bounce<Integer> primes_4(GeneratorState<Integer> contParam) {
            if (true) {
                return Bounce.cont(()->primes_3(contParam));
            }
            return Bounce.cont(()->primes_0(contParam));
        }
        
        private Bounce<Integer> primes_5(GeneratorState<Integer> contParam) {
            primes.add(current);
            return Bounce.cont(()->primes_4(contParam), current);
        }
        
        private Bounce<Integer> primes_6(GeneratorState<Integer> contParam) {
            iterator = CPSUtil.iterator(primes);
            return Bounce.cont(()->primes_7(contParam));
        }
        
        private Bounce<Integer> primes_7(GeneratorState<Integer> contParam) {
            if (iterator.hasNext()) {
                i = iterator.next();
                return Bounce.cont(()->primes_8(contParam));
            }
            return Bounce.cont(()->primes_5(contParam));
        }
        
        private Bounce<Integer> primes_8(GeneratorState<Integer> contParam) {
            if (current % i == 0) {
                return Bounce.cont(()->primes_4(contParam));
            }
            return Bounce.cont(()->primes_7(contParam));
        }
    }
}
