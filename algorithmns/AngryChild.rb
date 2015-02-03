  n = gets.to_i
  k = gets.to_i
  candy = []
  n.times do |i|
    candy[i] = gets.to_i
  end

  candy.sort!

  # sliding widow
  j = k
  i = 0
  lowest_dif = Float::INFINITY

  while j <= candy.length do
    dif = candy[j - 1] - candy[i]
    lowest_dif = dif if dif < lowest_dif

    break if lowest_dif == 0

    j += 1
    i += 1
  end

  puts lowest_dif