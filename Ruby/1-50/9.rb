n = gets.chomp.to_i
s = gets.chomp.split.map(&:to_i)
s.each do |i|
  if s.count(i) == 1
    puts i
  end
end
