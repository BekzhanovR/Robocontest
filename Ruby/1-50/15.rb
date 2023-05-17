MOD = 10**9 + 7

def binpow(a, n)
  return 1 if n == 0
  if n % 2 == 0
    x = binpow(a, n / 2)
    return (1 * x * x) % MOD
  end
  return (1 * a * binpow(a, n - 1)) % MOD
end

n, k = gets.chomp.split.map(&:to_i)
a = binpow(k, n) - 1
b = k - 1
result = (1 * a * binpow(b, MOD - 2)) % MOD
puts result
