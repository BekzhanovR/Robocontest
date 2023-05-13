s = 0
n = 0

z = gets.chomp.to_i

if z == 0
  s = -1
else
  if z < 0
    n = -z
  else
    n = z
  end

  i = 1

  while i * i <= n do
    if n % i == 0
      s += 1

      if i * i != n
        s += 1
      end
    end

    i += 1
  end

  if s % 2 == 1 && z > 0
    s += 1
  end
end

puts s
