n = gets.chomp.to_i
a = Array.new(n + 1) { |i| i }
a[1] = 0
i = 2

while i <= n
  if a[i] != 0
    j = i + i
    while j <= n
      a[j] = 0
      j = j + i
    end
  end
  i += 1
end

a.reject! { |num| num == 0 }
ism = ["Bobur", "Ali"]

if n == 1
  puts "Ali"
else
  puts ism[a.length % 2]
end