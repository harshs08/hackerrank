def fibonachi_upto(n)
  return 0 if n == 0
  return 1 if n == 1
  return 1 if n == 2
  prev2 = 1
  prev1 = 1

  a = [0, 1, 1]
  i = 3

  while prev1 <= n do
    tmp = prev1 + prev2
    a << tmp if tmp <= n
    prev2 = prev1
    prev1 = tmp
    i += 1
  end

  return a
end


fibos = fibonachi_upto(10000000000)

test_cases = $stdin.gets.to_i

test_cases.times do
  value = $stdin.gets.to_i
  if fibos.include?(value)
    puts 'IsFibo'
  else
    puts 'IsNotFibo'
  end
end