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
        $GeneratorImpl_0primesJield1061271703 $generator = new $GeneratorImpl_0primesJield1061271703();
        $generator.$Primes-705066724 = this;
        return $generator.stream();
    }
    
    private final class $GeneratorImpl_0primesJield1061271703 {
        private LinkedList<Integer> primes;
        private int current;
        private java.util.Iterator<Integer> iterator;
        private int i;
        private Primes $Primes-705066724;
        
        private Stream<Integer> stream() {
            return jield.runtime.BaseGenerator.startingAt(this::<>$primesJield_575475682_0).stream();
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_0(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            primes = new LinkedList<>();
            primes.add(2);
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_2($_contParam), 2);
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_1(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$_contParam.apply(jield.runtime.GeneratorState.empty()));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_2(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            current = 1;
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_4($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_3(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_1($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_4(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            current += 2;
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_7($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_5(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            if (true) {
                return jield.runtime.Bounce.cont(()->$primesJield_575475682_4($_contParam));
            }
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_3($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_6(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            primes.add(current);
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_15($_contParam), current);
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_7(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            iterator = jield.runtime.CPSUtil.iterator(primes);
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_8($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_8(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            if (iterator.hasNext()) {
                i = iterator.next();
                return jield.runtime.Bounce.cont(()->$primesJield_575475682_9($_contParam));
            }
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_6($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_9(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            if (current % i == 0) {
                return jield.runtime.Bounce.cont(()->$primesJield_575475682_11($_contParam));
            }
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_10($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_10(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_8($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_11(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_5($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_12(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_10($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_13(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_10($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_14(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_8($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_15(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_5($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_16(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_5($_contParam));
        }
        
        private jield.runtime.Bounce<Integer> $primesJield_575475682_17(jield.runtime.GeneratorState<java.lang.Integer> $_contParam) {
            return jield.runtime.Bounce.cont(()->$primesJield_575475682_1($_contParam));
        }
    }
}
